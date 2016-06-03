package com.hm.scala

package com.hm.scala.fruits {

  abstract class Fruit(
      val name: String,
      val color: String) {
    override def toString() = name + ":" + color
  }
}

import com.hm.scala.fruits.Fruit

object Fruits extends App {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellowish")

  val menu = List(Apple, Orange, Pear)

  println(menu(0))
}
