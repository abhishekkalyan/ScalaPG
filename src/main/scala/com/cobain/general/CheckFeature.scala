package com.cobain.general

class CheckFeature (val x : Int = 1, var y : Int = 2) extends ICheckFeature {

  override val oo: Int = 33
/*  private var _x = 3

  def __x = _x

  def __x_= (newValue : Int) : Unit = {
    if ( newValue < 50 ) println( "Can't assign value less than 50" )
    else _x = newValue
  }*/

  override def callMe () : String = {
    "Hello "+ x + " " + y + " val from Trait " + oo
  }

  val looper = ("abhishek", "kalyan", "me")

  def loopMeOver () : Unit = {
    for (_looper <- looper.productIterator) {
      println("from looper : " + _looper)
    }
  }

}
