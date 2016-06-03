package com.hm.scala {

  import scala.collection.mutable.ArrayBuffer

  object QueueDemo extends App {
    val intQueue = new BasicQueueWithTraits[Int]
    intQueue.put(5)
    intQueue.put(7)
    println(intQueue.get())
  }

  abstract class MyQueue[T] {
    def get(): T
    def put(t: T)
  }

  class BasicQueueWithTraits[T] extends BasicQueue[T] with IncrTrait[T] {

  }

  class BasicQueue[T] extends MyQueue[T] {
    val data = new ArrayBuffer[T]()
    def get() = data(0)
    def put(t: T) = data += t
  }

  trait IncrTrait[T] extends MyQueue[T] {
    override abstract def put(t: T) = {
      println(t);
      super.put(t)
    }
  }
}