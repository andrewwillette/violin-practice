package com.andrewwillette.violinpractice

import java.time.LocalDate
import java.time.temporal.ChronoUnit

object ViolinPractice extends App {
  def getKeyOfEpoch() : void = {
    var currentDate = LocalDate.now()
    var epochDate = LocalDate.ofEpochDay(0)
    println(epochDate)
    println(currentDate)
    var daysSinceEpoch = ChronoUnit.DAYS.between(epochDate, currentDate)
    println(s"Days between: $daysSinceEpoch")
    println(s"On epoch day $daysSinceEpoch, the key is ${MusicKeys.B}")

  }

  getKeyOfEpoch()
}

object DaysOfWeek extends Enumeration {
  type Day = Value

  val Monday = Value(1, "Monday")
  val Tuesday = Value(2, "Tuesday")
  val Wednesday = Value(3, "Wednesday")
  val Thursday = Value(4, "Thursday")
  val Friday = Value(5, "Friday")
  val Saturday = Value(6, "Saturday")
  val Sunday = Value(7, "Sunday")
}

object MusicKeys extends Enumeration {
  type Key = Value

  val C = Value(0, "C")
  val CSharp = Value(1, "CSharp")
  val D = Value(2, "D")
  val DSharp = Value(3, "DSharp")
  val E = Value(4, "E")
  val F = Value(5, "F")
  val FSharp = Value(6, "FSharp")
  val G = Value(7, "F")
  val GSharp = Value(8, "FSharp")
  val A = Value(9, "A")
  val ASharp = Value(10, "ASharp")
  val B = Value(11, "B")
}