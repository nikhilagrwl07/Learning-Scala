package lectures.part2oop

object Objects extends App{

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY (SOMETHING LIKE STATIC IN JAVA)
  // SCALA OBJECTS ARE SINGLETON INSTANCES
  object Person {
    // static or class level functionality
    val N_EYES = 2
    def canFly : Boolean = false

    // factory method
    def apply(mother: Person, father: Person) : Person = new Person("Nikhil")
  }

  // instance  or object level functionality
  class Person (name: String) {

    def apply() = s"${name} is my name"
  }

  // object and class when resides within same file with same scope and name
  // then it's called COMPANION

  val mary = Person
  val john = Person
  println(mary == john) // both pointing to same object

  println(mary.N_EYES)
  println(john.canFly)

  val minakshi = new Person("Minakshi")
  val anil = new Person("Anil")

  println(minakshi == anil)
  val nikhil = Person(minakshi, anil)
  println(nikhil())
}
