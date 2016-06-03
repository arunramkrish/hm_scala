package com.hm.scala

class ScalaClass1 (msg:String, val contact:String) {
  private val memberVariable1 = "The var"
  
  def this() {
    this("", "")
  }
  def this(msg:String){
    this(msg, "contact")
  }
  
  def getMessage() = "my message"

  
  def getDefault() = msg + "default Message"
  
  def getValue() = getDefault().length()
  
  def equals(other : ScalaClass1) : Boolean = {
    return (this.msg.equals(other.contact));
  }
  
  var count:Int = 8;
  
}