package quickstudyscala.arraystudy

import scala.collection.mutable.ArrayBuffer

/**
  * @user AN
  * @time 2019/7/22 21:55
  * @version 1.0
  */
object ArrayStudy {

  def main(args: Array[String]): Unit = {

    // 定长数组
    val array1 = new Array[Int](10)

    // 边长数组
    val array2 = new ArrayBuffer[Int]()

    // array 直接指定数组元素

    val array = Array[Any](1, 2,3)

    //    opArray(array)

//    traversalArray(array)
//    traversalUdStep(array)
//    traversalDir(array)
    arrayTrans(array)

  }


  // 数组转换
  def arrayTrans(a:Array[Any]): Unit ={

//      for(i <- a) yield 2 * i

      println(a.mkString(","))
  }


  // for 循环遍历数组 until
  def traversalArray(a: Array[Any]): Unit = {

    for (i <- 0 until a.length) {
      println(s"${i} : ${a(i)} : ${a(i).getClass}")
    }

  }

  // 自定义步长
  def traversalUdStep(a: Array[Any]): Unit = {

    for (i <- 0 until a.length by 2) {
      println(s"${i} : ${a(i)} : ${a(i).getClass}")

    }

  }

  // 从后向前循环
  def traversalDir(a: Array[Any]): Unit = {

    val str=(0 until a.length by -1).mkString(",")
    println(str)

  }

  // 数组操作
  def opArray(a: Array[Any]): Unit = {

    println(a.mkString(","))
    // 定长数组转为边长数组
    val b = a.toBuffer
    // 添加元素
    b += 3
    println(b.mkString(","))

    // 添加多个元素
    b += (4, 5)
    println(b.mkString(","))

    // 追加集合
    b ++= Array(6, 7)
    println(b.mkString(","))

    // 移除后5个元素
    b.trimEnd(5)
    println(b.mkString(","))

    //

  }

}
