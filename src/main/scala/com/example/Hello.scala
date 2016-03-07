package com.example
import cronish._
import scalendar.Scalendar

object Hello {
  def main(args: Array[String]): Unit = {
    // Cron(second, minute, hour, day, month, year)
    val cron = Cron("0", "0", "*", "*", "*", "*", "*") // every hour
    val now = Scalendar.now
    println((cron.nextFrom(now))) // returns milliseconds to next cron
    println((cron.nextFrom(now) / 1000) % 60) // returns seconds to next cron
    println((cron.nextFrom(now) / (1000*60) % 60))
  }
}
