package demo

object MatchScalaDemo {

  def main(args: Array[String]): Unit = {
    val value=3
    //标准使用方法
    val result= value match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
    print("result is "+result)

    // 使用守卫
    val result2 = value match {
      case i if i ==1 => "one _1"
      case i if i ==2 => "tow _2"
      case _ => println("unknow type")
    }
    println("result of match is :"+result2)

    // 匹配类型
    def t(obj:Any)= obj match {
      case x :Int => println("Int")
      case x:String => println("String")
      case _ => println("unknow type")
    }
    t(1)
    t("3")
    t(2L)
  }

}
