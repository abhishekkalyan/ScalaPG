package com.cobain.general.structures

class ClassFunctionParam extends AbsClassFunctionParam {

  type T = Int

  def incrementBy ( x : Int ) : Boolean = {
    x < 100
  }

  def functionParam(function: Int => Boolean): Unit = {
    println( function )
  }

}
