package demo

class Person {

  //  var 会生成 getter和setter 方法
  var name: String = _
  //  val 只会生成 getter 方法 ，age 作为常量，不可便
  val age = 10
  //  私有化 变量 private 只能在class 内部使用
  private[this] val gender = "male"
}

// 主构造其直接写在类型后面的括号里面
class Person2(var name: String, val age: Int) {
  println("this is the primary constructor")

  var gender: String = _
  val school: String = "niujin"

  /*
  * 1附属构造器 名称为 this
  * 2每一个附属构造其必须首先调用已经存在的子构造器，和附属构造器
  *
  * */
  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }
}

// 继承  重写父类方法 override def ， 重写字段 override val /override var
class Student(name: String, age: Int, val major: String) extends Person2(name, age) {
  println("this is the subClass major is :" + major)
  override val school: String = "BZZ"

  override def toString: String = "override toString"
}


object Demo1 {
  def main(args: Array[String]): Unit = {

    val p = new Person
    p.name = "Jack"
    println(p.name + ":" + p.age)
    val p2 = new Person2("jack", 20);
    println (p2.name + ":" + p2.age)
    val p3=new Person2("jack",20,"male")
    println(p3.name+":"+p3.age+":"+p3.gender)
    val s=new Student("jack",20,"male")
    //  注意加载顺序 先加载夫类后加载字类
    println(s.name+":"+s.age+":"+s.major+":"+s.school)
  }

}