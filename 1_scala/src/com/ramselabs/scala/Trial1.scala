package com.ramselabs.scala

object Trial1 {
  println (1 + 2)
  def main(args : Array[String]) {
    println("Hello " + getMessage(5))
    var msg = getMessage(3)
//    msg.
  }
  
  
  def getMessage(count : Int) {
    if (count > 0) {
      getMessage(count -1)
    } else {
      
    
    return " say hi"
    }
  }
  
  main(Array("123"));
  /*
  def main (args : Array[String]) : Unit = {
    Console println "Hello"
  }*/
}