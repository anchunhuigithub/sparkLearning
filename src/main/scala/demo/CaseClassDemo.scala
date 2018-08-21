package demo



case class Book(name:String,auther:String)

object CaseClassDemo {


  def main(args: Array[String]): Unit = {
    val book=Book("java programmer","maktuwen")
    book match{
      case Book(name,auther)=> println("this is a book")
      case _ => println("unknow")
    }
  }

}
