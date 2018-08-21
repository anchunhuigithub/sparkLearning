package demo


abstract class Person3 {
  def spark

  val name: String
  var age: Int
}

class Student3 extends Person3 {

  def spark: Unit = {
    println("spark")
  }

  val name = "AAA"
  var age = 20

}

object AbstractClassDemo extends App {

    val student3 = new Student3
    student3.spark
    println(student3.age + ":" + student3.name)

}

