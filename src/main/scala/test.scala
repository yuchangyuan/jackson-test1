package me.ycy.jackson.test1

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

import java.io.File

class MyObj(val a: String, var b: String) {
  override def toString = s"{a: ${a}, b: ${b}}"
}

object Test {
  def main(args: Array[String]) = {
    val mapper = new ObjectMapper()
    mapper.registerModule(DefaultScalaModule)

    val obj = new MyObj("abc", "efg")
    val str = mapper.writeValueAsString(obj)
    println(s"str = ${str}")
    val obj1 = mapper.readValue(str, classOf[MyObj])
    println("obj = " + obj1.toString)
  }
}
