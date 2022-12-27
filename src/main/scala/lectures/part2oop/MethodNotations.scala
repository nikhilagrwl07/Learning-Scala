package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  // making name as field using val
  class Person(val name: String, favoriteMovie: String, val age : Int = 0) {

    // likes
    def likes(movie: String): Boolean = this.name == movie

    def learns(language: String = "Scala"): String = s"${name} learns ${language}"

    // using infix notation
    def learnsScala = this learns "Scala"

    // hangout
    def hangout(person: Person): String = s"${name} hanging out with ${person.name}"

    def +(person: Person): String = s"${name} hanging out with ${person.name}"

    def +(nickName: String): Person = new Person(s"${name} (${nickName})" , favoriteMovie)

    def unary_! : String = s"${name}, what the heck"

    def unary_+ : Person =  new Person(name, favoriteMovie, age+1)

    def isAlive : Boolean = true

    // special method apply. Important point is method name
    def apply(): String = s"My name is ${name} and my favorite movie is ${favoriteMovie}"

    def apply(times : Int) : String = s"${name} watched ${favoriteMovie} ${times} times"
  }

  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))

  // This type of presentation is known as infix notation (syntactic sugar)
  println(mary likes "Inception")

  val tom = new Person("Tom", "Fight Club")
  println(mary hangout tom) // hangout acting on operator but actually is a method

  // ALL "OPERATORS" ARE METHODS
  println(mary + tom)
  println(mary.+ (tom))

  println(1 + 2)
  println(1.+ (2))

  // prefix notation
  val x = -1 // equivalent to 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation only works with methods without parameters
  println(mary.isAlive)
  println(mary isAlive)

  // special method apply
  println(mary.apply())
  println(mary())


  // overloading + method
  println((mary + "the rockstar")())

  println((+mary).age)

  println(mary.learns())
  println(mary learnsScala)

  // overloading special method apply
  println(mary.apply(2))
  println(mary apply 2)
  println(mary(2))
}
