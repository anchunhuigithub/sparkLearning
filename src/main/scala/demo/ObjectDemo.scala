package demo

object ObjectDemo{


  /*
  * scala 没有静态方法，可以通过object实现
  * scala 没有static 的静态方法，所有使用static声明变量是正确
  *
  * */


  def static1:Unit={
    println("I am a static method")
  }
//  声明静态变量
  var count:Int=0
  def crc={
    count +=1
    print("count is :"+count)
  }

}

object ObjectTest extends App {

  ObjectDemo.static1
  ObjectDemo.crc
}

object Object2{
  def main(args: Array[String]): Unit = {
    ObjectDemo.static1
    ObjectDemo.crc
  }
}