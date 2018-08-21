package work

import java.util.Comparator

import org.apache.spark.{SparkConf, SparkContext}

import scala.reflect.ClassTag

object TopAddress {

  def main(args: Array[String]): Unit = {

    val mysortBy = new Ordering[Tuple2[String, Int]] {
      override def compare(x: (String, Int), y: (String, Int)): Int = {

        val r = x._2.compare(y._2)
        val r2 = x._1.compare(y._1)
        if (r == 0) {
          r2
        } else
          -r
      }
    }


    // 得到交易数量最为频繁的地址
    val sparkConf = new SparkConf().setAppName("getTopFrequentlyAddress").setMaster("local[8]")
    val sc = new SparkContext(sparkConf)
    val source = sc.textFile("/mnt/chaindata/eth/t_format_transaction/*")
    val repart_file_2=source.flatMap { line =>
      val origin = line.split("\\|")
      Array(origin(2), origin(6))
    }.map(word => (word, 1)).reduceByKey(_ + _)
      .sortBy(x => x)(mysortBy, ClassTag.apply[Tuple2[String, Int]](classOf[Tuple2[String, Int]]))
      .repartition(1)
      .saveAsTextFile("/home/an/add_count_1")
  }

}
