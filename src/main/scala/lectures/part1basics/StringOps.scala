package lectures.part1basics

object StringOps extends App{

  val name = "Nikhil"
  val age = 32

  // scala specific string interpolators

  // S - interpolators
  val greeting = s"Hello, my name is $name and I am $age years old!"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age+1} years old!"

  println(anotherGreeting)

  // F - interpolators
  val speed = 1.263
  val info = f"$name%s can eat $speed%2.2f burgers per minute"
  println(info)

  // saw - interpolators
  println(raw"This is a \n newline")

  val escaped = "This is a \n newline"
  println(escaped)
}
