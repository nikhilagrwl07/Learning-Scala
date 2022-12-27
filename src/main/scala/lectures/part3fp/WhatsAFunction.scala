package lectures.part3fp

object WhatsAFunction extends App {

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  val stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3") + 4)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }

  // Function types ---> Function2[A , B , R] === (A,B) => R

  //  ALL SCALA FUNCTIONS ARE OBJECTS

  val concatString: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(s1: String, s2: String): String = s1.concat(s2)
  }

  println(concatString("Nikhil", "Agrawal"))

  val superAdder: Int => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
    override def apply(a: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(b: Int): Int = a + b
    }
  }

  val insideFunction = superAdder(2)
  println(insideFunction(3))
  println(superAdder(2)(3)) // curried function

}

trait MyFunction[A, B] {
  def apply(element: A): B
}