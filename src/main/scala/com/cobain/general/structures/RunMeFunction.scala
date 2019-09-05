package com.cobain.general.structures

object RunMeFunction {

  def main(args: Array[String]): Unit = {
    val obj : ClassFunctionParam = new ClassFunctionParam
    obj.functionParam( obj.incrementBy( 200 ) )
  }

}