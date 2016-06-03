package com.hm.scala.matchdemo

class Employee(val name: String, val age: Int, val address: String)

case class InvalidNameException(msg: String) extends Exception

object MatchDemo extends App {
  def validateEmployee(emp: Employee): Any = {
    return if (emp.name == "") {
      throw new InvalidNameException("EmptyName")
    } else if (emp.age == 0) {
      return "ZeroAge"
    } else {
      return emp.age
    }
  }

  var emp = new Employee("", 9, "fsdgr")
  try {
    validateEmployee(emp) match {
      case true                    => println("successful validation")
      case i: Int                  => println("some value " + i)
      case ex                      => println("Exception occurred " + ex)
    }

  } catch {
    case e: InvalidNameException => println("caught invalid name ex")
  }

}