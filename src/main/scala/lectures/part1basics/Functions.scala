package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  //  def aFunction(name: String, number: Int): String = {
  //    name + " " + number
  //  }
  //
  //  println(aFunction("Nikhil", 3))
  //
  //  // DON"T USE LOOPS in SCALA INSTEAD USE RECURSIVE METHODS
  //
  //  def concatenateNameTimes(name: String, times: Int): String = {
  //
  //    if (times == 1)
  //      name
  //    else
  //      name + concatenateNameTimes(name, times - 1)
  //  }
  //
  //  println(concatenateNameTimes("Nikhil", 3))
  //
  //  def aFunctionsWithSideEffects(aString: String) : Unit = println(aString)

  // auxiliary functions inside a code block function

  def greeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(greeting("Nikhil", 32))

  def factorial(n: Int): Int = {

    if (n == 1) n
    else n * (factorial(n - 1))
  }

  println(factorial(5))


  def fibonnaci(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else fibonnaci(n - 1) + fibonnaci(n - 2)
  }

  println(fibonnaci(5))


  def prime(n: Int): Boolean = {

    @tailrec
    def isPrimeUtil(t: Int): Boolean = {
      if (t == 1) true
      else {
        n % t != 0 && isPrimeUtil(t - 1)
      }
    }

    isPrimeUtil(n / 2)
  }

  println(prime(23))
  println(prime(7))
  println(prime(6))
}
