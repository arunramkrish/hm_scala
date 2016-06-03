package com.hm.akka.actors

/**
 * Wrapper object to start the actor system
 */
object Main {
  def main(args: Array[String]): Unit = {
    akka.Main.main(Array(classOf[Producer].getName))
  }

}