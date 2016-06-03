package com.hm.scala

import java.util.TimerTask
import java.util.Timer
import com.hm.scala.Preferences.function2TimerTask

object TimerDemo {
  def main(args: Array[String]) {
    def timerTask() = println("Inside timer task")

    val timer = new Timer()
    timer.schedule(function2TimerTask(timerTask), 100, 10)

    Thread.sleep(5000)

    timer.cancel()
  }

}