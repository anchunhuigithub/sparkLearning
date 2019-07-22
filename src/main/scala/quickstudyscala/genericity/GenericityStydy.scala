package quickstudyscala.genericity

/**
  * @user AN
  * @time 2019/7/22 22:26
  * @version 1.0
  */

/**
  * 泛型的使用
  *    泛型类的使用: 类型参数使用 [] 括起来 放在类名称的后面
  *    反省方法的使用 : 使用[] 放在方法名称后
  *
  * @param first
  * @param second
  * @tparam T
  * @tparam S
  */

// 泛型类
class Pair[T,S](val first:T,val second:S)

object GenericityStydy {

  def main(args: Array[String]): Unit = {

    val p=new Pair(42,"String")

    val p2=new Pair[Any,Any](42,"String")

    println(p.first + " \t" + p.second)


    val result=getMiddle(Array(1,2,3,4))

    println(result)

    val f=getMiddle[String] _

    println(f(Array("3","4")))

  }

  // 泛型方法，函数
  def getMiddle[T](a:Array[T])={
    a(a.length/2)
  }


}
