package demo

object LIstAndTupleAndSet {


  def main(args: Array[String]): Unit = {

    //list 集合的使用
    val list = List(1, 2, 3, 4, 5)
    println(list)

    val newList = list.map((x: Int) => 2 * x)
    println(newList)

    //     x 代表的是对每一个元素
    //    map 操作 指代对每一个元素的操作
    val newList_2 = list.map(2 * _)
    println(newList_2)

    // 获取得到 list中的数据
    val list2 = List(List(1, 2, 3),List (4, 5))
    println("list2 "+list2)
    println("list2(1)"+list2(1))
    println("list2(1)(1)"+list2(1)(1))

    //set 集合的使用
    println("*"*30)
    val s=Set(2,18,10)
    println(s)
    //判断元素是否包含
    println(s(2))
    println(s(3))
    //
    println("_"*30)

    // tuple 元组的使用
    val hostport =("localhost","8080")

    println(hostport)
    println(hostport._1)
    println(hostport._2)
    println("__"*30)

  }
}
