package com.ramselabs.scala

import com.ramselabs.scala.template.ArrayOne

object ArrayOne {
  
  def main(args:Array[String]) {
    val arrayOne = new ArrayOne("my object", "my address")
    
    val data = new Array[String](2);
    data(0) = "A"
    data(1) = "B"
    
    println(arrayOne.name)
    
    for (i <- 0 to 1) 
      print(data(i))
      
  }
  
  def getMessage() = "my message";
}