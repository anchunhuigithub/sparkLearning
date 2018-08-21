package test

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf


case class Book(name: String, auth: String)


object Demo1 {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf()
    sparkConf.setAppName("demo1").setMaster("local[*]")
    val sparkContext = new SparkContext(sparkConf)
    //    测试word count代码
    //    val sourcePath = args(0) // 得到第一个参数
    //    val destPath = args(1) // 得到第二个参数
    //    wordCount(sparkContext, sourcePath, destPath) // 调用wordcount方法进行统计执行文件夹文件中的word

    //    key_value_test(sparkContext, sourcePath, destPath)
    //    var_val_compare()

    //    str_format_print()

    //    function_1("world")

    //    var result=""
    //    result = function_2("world")
    //    print(result)

    //    var result=0
    //    result=function_3(1, 3)
    //    print(result)

    //    var result=0
    //    result=function_4_1(1)(2)
    //    printf("result %d\n",result)

    //    var result=0
    //    val result=function_4_2(1)
    //    val resutl1=result(3)
    //    printf("result is %d\n",resutl1)
    //

    //    function_5("hehe","heiehei")


    //    val result = function_6("gogogog")
    //    println(result)

    //    val resutl =
    //      if_else(2)
    //    print(s"result: \t$resutl")

    //    loop_function("hello world")


  }


  // 循环的使用
  def loop_function(params: String = "null"): Unit = {

    print("循环1")
    var i = 0
    while (i < params.length) {
      printf(s"the char at the $i is: %s \n", params(i))
      i += 1
    }
    println("循环2")
    for (char <- params) {
      println(char)
    }

    println("循环3")
    for (num <- 1 to 10 if num % 2 == 0) {
      print(num)
    }

    println("循环4")
    params.foreach(println)
  }

  //   if else
  def if_else(params: Int): Int = {
    if (params > 0) 1 else 0
  }

  //  设置参数的默认值
  def function_6(name: String = "APachecn"): String = {
    "name:" + name
  }

  //  foreach
  def function_5(name: String*) = {
    name.foreach(x => println(x))
  }

  //颗粒化函数
  def function_4_2(x: Int) = (y: Int) => x + y


  //  此方法不是颗粒化函数
  def function_4_1(x: Int)(y: Int) = x + y


  //  方法三 ，匿名函数  指定参数个数和类型，自动更具返回结果判断返回类型
  def function_3 = (x: Int, y: Int) => x + y

  //  方法二 又返回结果
  def function_2(name: String): String = {
    //return 可以声调
    return ("hello" + name);
  }

  //   方法一，无返回结果
  def function_1(name: String): Unit = {
    println("hello:" + name)
  }


  //  测试输出和格式化
  def str_format_print(): Unit = {
    val name = "spark programmer"
    val age = 10
    val url = "www.wiki.com"
    val auth = "maketuwen"
    val book = new Book(name, auth)
    println("name: " + name, "age: " + age + "url: " + url + "auth:" + book.auth)
    printf("name=%s,age=%d,url=%s,auth=%s\n", name, age, url, auth)
    println(s"name=$name,age =$age,url=$url,auth=${book.auth}")
  }

  //  可变变量和不可变变量的比较
  def var_val_compare(): Unit = {

    var gender = "man"
    print(s"gender $gender \n")
    gender = "girl"
    print("gender ", gender)
    val sex = "man"
    print("sex is ", sex)
    //    sex="girl"  错误的语法
    print(sex)

  }


  // key value pairs transactions
  def key_value_test(sparkContext: SparkContext, sourcePath: String, destPath: String): Unit = {

    // 和word count的程序类似，只不过是把每一行封装为key，1为value的一个map而以
    val sourceData = sparkContext.textFile(sourcePath)
    val pairs = sourceData.map(line => (line, 1))
    val count = pairs.reduceByKey((a, b) => a + b)
    count.saveAsTextFile(destPath)
  }

  //   word count 测试案例
  def wordCount(sparkContext: SparkContext, sourcePath: String, destPath: String): Unit = {

    val textFile = sparkContext.textFile(sourcePath)
    val count = textFile.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
    count.saveAsTextFile(destPath)
  }

  //   使用saprk-submit命令进行提交
  //  参数的传递，传递两个参数


}
