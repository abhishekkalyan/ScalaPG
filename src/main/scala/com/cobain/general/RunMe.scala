package com.cobain.general

object RunMe {

  def main(args: Array[String]): Unit = {
    var checkFeature = new CheckFeature(y=2000)

    println(checkFeature.callMe())

    checkFeature.par = 50;

    println( checkFeature.par )

    checkFeature.loopMeOver()

  }

}
