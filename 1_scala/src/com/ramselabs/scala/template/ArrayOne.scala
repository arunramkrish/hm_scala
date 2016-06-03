package com.ramselabs.scala.template

import com.ramselabs.scala.ArrayOne

class ArrayOne(val name:String) {
  var address = ""
  def this(name:String, address:String) {
    this(name)
    println("overloaded constructor called")
    this.address = address
  }
  
  def mainObj(args:Array[String]) : Unit = {
    println("inside object main")
  }
  
  print(ArrayOne.getMessage() + " invoked")
}
