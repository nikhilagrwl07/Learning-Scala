package lectures.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  val nikhil = new Person("Nikhil", 33)
  // 1.  all class parameters are promoted to class fields
  println(nikhil.name)

  // 2. sensible toString
  // println(instance) == println(instance.toString)
  println(nikhil.toString)

  // 3. equals and hashCode are provided out of box
  val nikhil2 = new Person("Nikhil", 33)
  println(nikhil == nikhil2)

  // 4. CCs have handy copy method
  val nikhil3 = nikhil.copy(age = 35)
  println(nikhil3)

  // 5. CCs have companion objects
  val thePerson = Person
  val stuti = Person("Stuti", 30) // calls .apply() method
  //no need to use new for instantiating case class

  // 6. CCs are serializable
  // Akka

  // 7. CCs have extractor patterns = CCs can be used in PATTERN MATCHING

  // case object similar to case class with only difference of not having companion objects unlike case class
  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }
}
