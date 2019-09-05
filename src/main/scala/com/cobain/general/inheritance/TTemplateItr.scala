package com.cobain.general.inheritance

trait TTemplateItr extends TemplateItr {

/*  def callMe(f: T => Unit): Unit = f (hasNext)*/
  def foreach(f: T => Unit): Unit = /*while (hasNext)*/ f(hasNext)

}