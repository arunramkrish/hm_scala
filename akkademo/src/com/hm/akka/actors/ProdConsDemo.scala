package com.hm.akka.actors

import akka.actor.Actor
import akka.actor.Props
import scala.io.StdIn
import akka.actor.ActorRef

/**
 * Continuously reads input from stdin and sends it to consumer until user keys in "shutdown" as the input string
 */
class Producer extends Actor {
  override def preStart(): Unit = {
    self ! "readInput"
  }

  def receive = {
    case "readInput" => {
      //read text from user
      var msg = StdIn.readLine()
      
      // create the consumer actor first time. rest of the time lookup for the child actor with that name
      var cons: ActorRef = null
      if (context.child("consumer") != None)
        cons = context.child("consumer").get
      else
        cons = context.actorOf(Props[Consumer], "consumer")

      // tell consumer to consume the message
      cons ! msg
      
      //continue to read if user has not entered shutdown
      if (msg != "shutdown")
        self ! "readInput"
      else
        self ! "shutdown"
    }
    case "shutdown" => context.stop(self)
    case x: String  => println("this actor cant handle this command " + x)
    case _          => println("dont understand this message. Supports only string with values readInput and shutdown")
  }
}

class Consumer extends Actor {
  def receive = {
    case x: String => {
      println("Received message:" + x)
    }
    case _ => println("dont understand this message")
  }
}