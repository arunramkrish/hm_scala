package com.hm.scala
//import scala.collection.mutable.Set;

object SetDemo {
  def main(args : Array[String]) {
    var mySet = Set("1", "a2", "a3", "a", "b")
    var myIntSet = Set(1,2,3,4)
    
        def myFilterLogic(s:String):Boolean = {
      println(s)
      return (s.length() >= 2)
     }
    
    var obj = new ScalaClass1("msg1", "contac")
    
    var obj2 = new ScalaClass1()
    
    //obj.memberVariable1
    
    mySet = mySet.filter(myFilterLogic)
    
    println(mySet.exists((s) => {
      !s.equalsIgnoreCase("a1");
    }))
    
    println("myIntset search " + myIntSet.exists( (r) => (r != 3)))
        
    println(mySet.size)
    
    var myArray = Array("a1", "a2")
    //myArray.
    
  }
  
}