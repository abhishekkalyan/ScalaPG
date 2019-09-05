package com.cobain.general.inheritance

object RunMe {

  def test ( x : Int => Unit ): Unit = {
    println(x)
  }

  def main(args: Array[String]): Unit = {
    val obj = new CMultiInh
    /* def foreach(f: T => Unit): Unit */
    obj foreach println

  }
}
