package com.hm.scala

import scala.collection.immutable.TreeMap

class Contact(val name:String, val address: String, val city: String) {
  override def toString() : String = {
    this.name + " " + this.address
  }
}

object MapDemo {
   def main(args : Array[String]) {
     val c1 = new Contact("c1", "a1", "BLR")
     val c2 = new Contact("c2", "a2", "BLR")
     val c3 = new Contact("c3", "a3", "CHN")
     
     //var contactsMap:Map[String,Contact] = Map[String, Contact]()
     var contactsMap:Map[String,Contact] = new TreeMap[String, Contact]()
     contactsMap += ("c1" -> c1)
     contactsMap += ("c2" -> c2)
     contactsMap += ("c3" -> c3)
    
     def groupingFn(key : String, value :Contact):String = value.city
     
    //var groupedMap : Map[String, Map[String, Contact]] = contactsMap.groupBy(groupingFn)
    
    
     println(contactsMap("c2"))
     
   }
}