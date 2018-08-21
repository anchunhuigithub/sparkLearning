package demo

import org.apache.hadoop.yarn.webapp.example.MyApp.MyController

// 特质 带有具体实现的接口
trait Logger1{
  def log(parms:String):Unit={
    println("hello:"+parms)
  }
}
class Test1 extends Logger1{
  def test:Unit={
    log("world")
  }
}
// 特质2 当中接口进行使用
trait Logger2{
// 声明了方法，但是不进行实现，抽象方法
  def log(params:String)
}
trait ConsoleLogger2 extends Logger2{
  def log(msg:String):Unit ={
    println("log :"+msg)
  }
}
class Test2 extends ConsoleLogger2 {
  def test:Unit={
    log("ConsoleLogger")
  }
}

// 特质 3
trait ConsoleLogger{
  def log(msg:String):Unit={
    println("save"+msg)
  }
}
trait MessageLogger extends ConsoleLogger{
  override def log(msg: String): Unit = {
    println("save money to bank:"+msg)
  }
}
abstract class Account{
  def save
}
class MyCount extends Account with ConsoleLogger{
  def save: Unit = {
    log("200000")
  }
}
object TraitDemo extends App{

  val t=new Test1
  t.test

  val t2=new Test2
  t2.test

  val m=new MyCount with MessageLogger
  m.save

}
