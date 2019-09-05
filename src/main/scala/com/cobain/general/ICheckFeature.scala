package com.cobain.general

trait ICheckFeature {

  val oo : Int

  private var _par = 0;

  def par = _par

  def par_= (input : Int) : Unit = {
    if ( input < 50 ) _par = 51
    else _par = input
  }

  def callMe : String

}
