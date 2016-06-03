package com.hm.scala

import scala.math.Ordered
import java.util.TreeSet

class RationalNumber(val num: Int, val denom: Int) extends Ordered[RationalNumber] {
  require(denom != 0)
  
  def compare(that:RationalNumber) = (this.num * that.denom) - (that.num * this.denom)
  
  var delimiter = "/"

  def +(other: RationalNumber): RationalNumber = {
    val resNum = (this.num * other.denom) +
      (other.num * this.denom)
    val resDenom = (this.denom * other.denom)
    
    return new RationalNumber(resNum, resDenom)

  }
  
  def * (other : RationalNumber) = 
    new RationalNumber(this.num * other.num, 
        this.denom * other.denom) 
  
  override def toString() = num + delimiter + denom;
}

object RationalNumber {
  def apply(n : Int,d:Int) : RationalNumber = {
    return new RationalNumber(n,d)
  }
  
  def main(args: Array[String]) {
    val r1 = RationalNumber(1, 3)
    val r2 = new RationalNumber(2, 3)
    val r3 = new RationalNumber(2, 4)
    
    val extracted = (r1 + r2) * r3
    
    println(extracted.num + 
        extracted.delimiter + extracted.denom)
   
//    println(r1 + 1)
    println (r1 + "2/3")
    
    println( r1 < r2)
    
    def mySet = new TreeSet[RationalNumber]()
    mySet.add(r1)
    mySet.add(r2)
    
    for (r <- mySet.toArray()) {
      println(r)
    }
    
  }
  
  def getMetuple(count : Int) = new Tuple2(4,3)
}