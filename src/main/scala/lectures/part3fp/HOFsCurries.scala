package lectures.part3fp

object HOFsCurries extends App {

  val superFunctions: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null

  //  // higher order functions (HOF)
  //
  //  // map, filter, flatMap in MyList
  def nTimes(f: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))
  }

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))


  // skipping something in middle. I will get back

  // curired functions
  val supperAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val add3 = supperAdder(3)
  println(add3(7))
  println(supperAdder(3)(7))
}
