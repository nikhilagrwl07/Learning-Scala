package lectures.part2oop

import lectures.part2oop.Exercise.{Counter, Novel, Writer}

object OOBasics extends App {

//  val person = new Person("Nikhil", 32)
//  person.greet("Stuti")
//  person.greet()

// val author = new Writer("Charles", "Dickens", 1812)
// val imposter = new Writer("Charles", "Dickens", 1812)
// val novel = new Novel("Great Expectations", 1861, author)
//
// println(novel.authorAge())
// println(novel.isWrittenBy(author))
// println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.increment().print
  counter.increment().increment().increment().print
  counter.increment(10).print

}

class Person(name: String, val age: Int = 0) {
  val x = 2
  println(1 + 2)

  def greet(name: String): Unit = println(s"${this.name} says : Hi $name")

  // overloading
  def greet(): Unit = println(s"$name says : Hi $name")

//  def this(name: String) = this(name, 0)
  def this() = this("Nikhil Agrawal")
}