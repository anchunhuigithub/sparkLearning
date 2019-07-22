package main.scala.demo.mapAndFlatMap

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by AN on 2018/10/12.
  */
object WordCount {

  /**
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val sparkConf=new SparkConf().setAppName("wordcount").setMaster("local[*]")
    val sparkContext=new SparkContext(sparkConf)

    val rdd=sparkContext.textFile("C:\\Users\\AN\\Desktop\\testdata")
    rdd.flatMap(line=> line.split(" ")).map(x=>(x,1)).reduceByKey(_+_).sortBy(_._2,false).collect().foreach(println(_))

    sparkContext.stop()

  }



}
