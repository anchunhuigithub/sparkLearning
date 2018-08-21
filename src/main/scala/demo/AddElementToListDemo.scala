package demo


// :: 和 ::: 的使用 向list中添加元素的两种方式，第一种，在list的header添加元素，第二种在头部添加一个list

object AddElementToListDemo {

  def main(args: Array[String]): Unit = {

    var lista=List(2,3,4)
    var listb=1::lista
    lista.foreach(print)
    println()
    listb.foreach(print)
    println()
    var listc=List(1,2,3)
    var listd=listb:::listc
    listd.foreach(print)
    println()
    listc.foreach(print)
  }

}
