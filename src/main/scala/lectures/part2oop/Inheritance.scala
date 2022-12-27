package lectures.part2oop

object Inheritance extends App {

   sealed class Animal {
    val creatureType = "wild"

    def eat = {
      println("eating...")
    }
  }

  class Cat extends Animal {

    def crunch = {
      eat
      println("crunching...")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructor
  class Person(name: String, age: Int = 0) {

  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Adult2(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //    override val creatureType: String = "domestic"
    override def eat: Unit = {
      super.eat
      println("Inside dog : eating...")
    }
  }

  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  //type substitution (in broader sense it is polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // stop overriding
  // 1 - use final on method
  // 2 - use final on entire class
  // 3 (New) - seal the class = extend in THIS file but prevents extension in other files. For example if
  // we know only Dog and Cat are the only Animal then use seal with Animal class and exten Dog and cat
  // within same class
}
