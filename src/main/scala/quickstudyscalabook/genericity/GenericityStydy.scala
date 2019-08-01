package quickstudyscalabook.genericity

import com.sun.media.jfxmedia.events.NewFrameEvent

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

class PairOfMe[T <:Comparable[T]](val first:T,val second:T){
  def smaller=if (first.compareTo(second) <0) first else second
  def replaceFirst(newFirst:T)=new PairOfMe[T](newFirst,second)

//  def repalceFirstSe[R >:T](newFrist:R)=new PairOfMe[R](newFrist,second)

//  def replaceFirstTh[R >:T](newFrist:R)=new PairOfMe[R](newFrist,second)

}

// 视图界定 ==》 类型约束
class PairOfTow[T](val first:T,val second:T)(implicit ev:T => Comparable[T]){
  def samller= if (first.compareTo(second) <0) first else second
}

// 上线文界定
class PairOfThred[T:Ordering](val first:T,val second:T){

  def smaller(implicit ord:Ordering[T])=
    if (ord.compare(first,second) <0)first else second

  // ClassTag 界定


  import scala.reflect._

  def makePair[T:ClassTag](first:T,second:T) ={
    val r=new Array[T](2)
    r(0)=first
    r(1)=second
    r
  }

}

// 多重界定





object GenericityStydy {

  def main(args: Array[String]): Unit = {

    // 上下文界定

    val pairOfThred =new PairOfThred(2,3)

    println(pairOfThred.smaller)
    val array=pairOfThred.makePair(3,5)

    println(array.mkString(","))

    val pairOfThed1=new PairOfThred("12","2")

    println(pairOfThed1.smaller)

    /*val pairOfTow=new PairOfTow(2,43)

    println(pairOfTow.samller)

    val p=new Pair(42,"String")

    val p2=new Pair[Any,Any](42,"String")

    println(p.first + " \t" + p.second)


    val result=getMiddle(Array(1,2,3,4))

    println(result)

    val f=getMiddle[String] _

    println(f(Array("3","4")))

    val pair=new PairOfMe[String]("fred","pide")

    println(pair.smaller)*/

    // 试图界定

  }

  // 泛型方法，函数
  def getMiddle[T](a:Array[T])={
    a(a.length/2)
  }


}
