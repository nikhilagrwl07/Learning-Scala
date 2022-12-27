package lectures.part2oop

object Generics extends App {

  // generic class
  class MyList[+A] {
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
     A = Cat
     B = Dog = Animal
    */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList {
     def empty[A] : MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Dog extends Animal
  class Cat extends Animal

  //1. yes, List[Cat] extend List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList : CovariantList[Animal] = new CovariantList[Cat]
//  animalList.add(new Dog) ??? HARD question => we return a list of animal

  // 2. No = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  class ContravarianceList[-A]
  val listOfCats : ContravarianceList[Cat] = new ContravarianceList[Animal]

  // bounded types
  // upper bounded types by animal
  class Cage[A <: Animal](animal: A)

  val cage = new Cage(new Dog)

  class Car
  //  val newCage = new Cage(new Car)

}
