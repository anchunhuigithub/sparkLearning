package work

import org.apache.spark.sql.{SQLContext}
import org.apache.spark.{SparkConf, SparkContext}


// 获取得到所有的address 地址，通过扫描gzip文件 transactions 扫描所有的format transaction文件的
// blockhash | t_digiccy | t_from  | t_number | t_status | t_symbol | t_to | t_tx_hash | t_type | t_value | t_time | yearAndMonthAndday
// 0xa86a640a287699348a78f75714107f1c0b58cbeec091eb53ae75a2c3b5a0cc29|
// eth|
// 0xea674fdde714fd979de3edf0f56aa9716b898ec8|
// 5102112|
// 1|
// eth|
// 0x4f3e5da08352070c3f73345f1f4a2074dee2c52a|
// 0x6693e099d4f002ad343e5629476aad63eca88459228c00bf4f3834c9493cb16d|
// 1|
// 150211761086184812|
// 1518776568000|
// 20180216
case class Format_transactoin(blockHash: String, t_digiccy: String, t_from: String, t_number: Int, t_status: Int, t_symbol: String, t_to: String, t_tx_hash: String, t_type: Int, t_value: String, t_time: String, yearAndMOnth: String)

case class From_To(t_from: String, t_to: String)

object AllAddress {

  def main(args: Array[String]): Unit = {


    val sparkConfig = new SparkConf().setMaster("local[*]").setAppName("GetALlAddress")
    val sc =new SparkContext(sparkConfig)

    val source = sc.textFile("/mnt/chaindata/eth/t_format_transaction/*",8)
    val count=source.count()
    println("result count is ===>>>>>>>>>>>>>>>"+count)
//    source.map{
//      line => ('A',1)
//    }.reduceByKey(_+_).repartition(1)
//      .saveAsTextFile("/home/an/result/line_count")


    source.map{x =>
      val from  =  x.split("\\|")(2)
      val to = x.split("\\|")(6)
      val result = from + '\n' + to
      result

    }.saveAsTextFile("/home/an/result/address_count")
//    val sparkSql=new SQLContext(sparkContext)
//    import sparkSql.implicits._
//// /home/an/workspace
//    val df = sparkSql.sparkContext.textFile("/home/an/workspace/*").map {
//      _.split("|")
//    }.map { line => (line(2), line(6)) }.map(line => From_To(line._1, line._2)).toDF("T_FROM", "T_TO")
//    df.registerTempTable("mytable")
////concat('a','b')
//    val dataFram=sparkSql.sql("select * from ((select T_FROM from mytable) unionall (select T_TO from mytable))")
//    dataFram.write.mode("append").parquet("/home/an/result/1.txt")
  }
}
