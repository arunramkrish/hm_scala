package com.hm.scala.actors

import scala.actors.Actor

object Actor1 extends Actor {
  var obj = "shared"
  
  def act() {
    for (i <- 1 to 5) {
      println("I am in actor1" + obj)
      obj = "actor1" + i
      Thread.sleep(1000)
    }
  }
  private val actor3 = Actor.actor({
    for (i <- 1 to 5) {
      println("I am in actor3" + obj)
      obj = "actor3" + i
      Thread.sleep(1000)
    }
  })

  def main(args: Array[String]) {
    Actor1.start()
    Actor2.start()
    //    actor3.start() //done have to start explicitly
    Actor2 ! "Any message"
    Actor2 ! "Any message2"
    
    Actor2 ! new Message("login", "{userId:'123', password:'1234'}", "")
  }
}
class Message(val msgType:String, val msgHdr:Any, val msgBody:Any)

object Actor2 extends Actor {
  def act() {
    for (i <- 1 to 5) {
      receive {
        case msg:Message => println("received Message of type " + msg.msgType + msg.msgHdr)
        case msg:String =>
          println("received message: " + msg)
      }

      println("I am in actor2")
      Thread.sleep(1000)
    }
  }

}
