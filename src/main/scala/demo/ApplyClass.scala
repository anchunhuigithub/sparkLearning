package demo

import jdk.nashorn.internal.runtime.regexp.joni.ApplyCaseFoldArg

class ApplyClass private {
  def apply() = "class"

  var count: Int = 0

  def incr = {
    count = count + 1
    println("count is :"+count)
  }
}

object ApplyClass {
  var applyTest: ApplyClass = _

  def apply() = if (applyTest == null) {
    applyTest = new ApplyClass;
    applyTest
  } else applyTest
}

object TestApp extends App {
  // 直接类型+() 表示调用这个object的apply方法，
  val a1 = ApplyClass ()
  println(a1)
  println(a1.count)
  a1.incr
  println(a1.count)
  println("=============")

//  val a2=new ApplyClass
//  println(a2)
//  println(a2())
//  a2.incr
//  println(a2.count)
}

