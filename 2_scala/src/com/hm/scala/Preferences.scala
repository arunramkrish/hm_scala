package com.hm.scala

import java.util.TimerTask

object Preferences {
    //val tuple: Tuple2[Int,String] = 1 -> "name"
    val tuple = 1 -> "name"
    
    implicit def function2TimerTask(f: () => Unit) = new TimerTask {
    def run() = f()
  }
    
  implicit def RationalToInt(r:RationalNumber) : Int = {
    return r.denom
  }

  implicit def i2r(i:Int) : RationalNumber = {
    return new RationalNumber(i, 1)
  }

  implicit def StringToRationalNumber(str:String) : RationalNumber = {
     
    return new RationalNumber(str(0).toInt - '0'.toInt, str(2).toInt - '0'.toInt)
  }


}