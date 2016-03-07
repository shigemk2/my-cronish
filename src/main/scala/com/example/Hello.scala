package com.example
import cronish._
import dsl._

object Hello {
  def main(args: Array[String]): Unit = {
    println("Every day at midnight".crons == "0 0 * * *")
    println("Hello, world!")
  }
}
