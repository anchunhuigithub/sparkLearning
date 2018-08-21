package demo

object MkStringDemo {


  def formatArgs(args:Array[String]) =args.mkString("\n")

  def main(args: Array[String]): Unit = {
    //
    println(formatArgs(args))
    val res=formatArgs(Array("one","tow","three"))
    println(s"format resutl is $res")

    assert(res=="hello\nworld")
    assert(res=="one\ntow\nthree")

  }

}
