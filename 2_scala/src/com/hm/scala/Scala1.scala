package com.hm.scala

object Scala1 {
  println("scala1")
  
  def main(args : Array[String]) {
    println("Hello scala")
    
    println(globalMessage())
    
    //primary constr with 2 params 
    var obj1 = new ScalaClass1("msg1", "contact1")
    
    //secondary / auxillary constr with 1 param
    val obj = new ScalaClass1("param1")
  
    println(obj.count)
    println("obj1" + obj1.toString());
    
    println("obj" + obj.toString());
    
    new RationalNumber(2,3).delimiter = ","
  }
  
}