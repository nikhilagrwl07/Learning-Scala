package lectures.part2oop

import java.time.Year

object Exercise extends App {

  class Novel(name: String, releaseYear: Int, author: Writer) {

    def authorAge(): Int = Year.now.getValue - author.year

    def isWrittenBy(author: Writer) = this.author == author

    def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
  }

  class Writer(firstName: String, surName: String, val year: Int) {

    def fullName(): String = firstName + " " + surName
  }

  class Counter(val value: Int = 0)  {

    def currentCount(): Int = value

    def increment(): Counter = {
      println("Incrementing..")
      new Counter(value + 1) // immutability
    }

    def decrement(): Counter = {
      println("Decrementing..")
      new Counter(value - 1)
    }

    def increment(times: Int): Counter = {
      if (times <= 0) this
      else increment().increment(times - 1)
    }

    def decrement(times: Int): Counter = {
      if (times <= 0) this
      else decrement().decrement(times - 1)
    }

    def print = println(value)

  }

}
