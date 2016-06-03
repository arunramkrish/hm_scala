package com.hm.scala

import java.util.Timer
import java.util.TimerTask

object ClosureDemo {
  def createMultiplier(factor : Int) = 
    (input : Int) => input * factor
  
  def createFunction(factor : Int):(Int) => Int = {
      val defaultFactor = 1
      def increment(input:Int): Int = {
        return input * factor * defaultFactor
      }
      
      def decrement(input:Int) : Int = {
        return input / factor
      }
      return increment
  }
  
  def main(args : Array[String]) {
     def incrBy2 = createMultiplier(2)
     def incrBy3 = createFunction(3)
     
     println(incrBy2(5))
     println(incrBy2(10))
     
     println(incrBy3(5))
     println(incrBy3(15))
     
//     var timer = new Timer()
//     timer.schedule(() => println("hello"))
  }
  
//  implicit def functionToTimerTask(fn : () => Unit) : TimerTask = {
//    return new TimerTask() {
//      
//    }
//  }
  
}