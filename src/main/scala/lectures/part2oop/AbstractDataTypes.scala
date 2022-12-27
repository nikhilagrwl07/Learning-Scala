package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract class
  abstract class Animal {
    val creatureType: String = "wild"

    def eat: Unit
  }

  class Dog extends Animal {

    override val creatureType: String = "Canine"

    def eat = print("crunch crunch")

  }

  // traits = behaviour
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh Meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {

    override val creatureType : String = "Crocodile"

    override def eat: Unit = {
      println(s"Hello I am ${creatureType} and I am eating..")
    }

    override def eat(animal: Animal): Unit = {
      println(s"Hello I am ${creatureType} and I am eating ${animal.creatureType}")
    }
  }

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile.eat(dog)

  // difference between traits and abstract class
  // 1. multiple traits can be inherited by same class
  // 2. traits = behavior, abstract class = "thing"



}
