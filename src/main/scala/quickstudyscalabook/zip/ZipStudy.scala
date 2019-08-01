package quickstudyscalabook.zip

/**
  * @user AN
  * @time 2019/7/31 21:35
  * @version 1.0
  */
object ZipStudy {

  def main(args: Array[String]): Unit = {

    val keyArray=Array(1,2,3)
    val valueArray=Array("1","2","3")

    val pairs=keyArray.zip(valueArray).toMap

    pairs.foreach{
      x=>
        println("key is "+x._1 +" value is "+x._2)
    }

    val keys=pairs.keySet
    for(key <- keys){
      println(s"key is ${key} \t vlaue is "+pairs.getOrElse(key,"default"))
    }

  }

  // 遍历map到map
  def tranMapToMap(map:Map[String,Double])={
    val result=for((k,v) <- map) yield (k, v * 0.9)
    result
  }

}
