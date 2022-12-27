package lectures.part2oop

object Exceptions extends App {

  //  val x: String = null
  //  println(x.length)

  // 1. noting can be substituted with any other type such as string in below scenario
  //  val npeValue : String = throw new NullPointerException

  // throwable classes extend the Throwable class
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch and exception
  def getInt(withExceptions: Boolean): Int = {
    if (withExceptions) throw new RuntimeException("No integer for you!!")
    else 42
  }

  //  val potentialFail = try {
  //    // code that might throw exception
  //    getInt(false)
  //  } catch {
  //    case e : RuntimeException => 43
  //  } finally {
  //    // code that execute irrespective exception throw or not
  //    // optional
  //    // does not influence the return type of this expression
  //    // use finally only for side effects
  //    println("finally!")
  //  }

  //  println(potentialFail)
  //
  //  // 3. how to define your own exceptions
  //  class MyException extends Exception
  //  val exception = new MyException
  //
  //  throw exception

  // OOM
  //  throw new OutOfMemoryError()
  //  val array: Array[Int] = Array.ofDim(Int.MaxValue)

  // SO
  //  throw new StackOverflowError()
  //  def infinite: Int = 1 + infinite
  //  val noLimit = infinite

  class OverflowException extends RuntimeException

  class UnderflowException extends RuntimeException

  object PocketCalculator {

    def add(x: Int, y: Int): Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) {
        throw new OverflowException
      }
      else if (x < 0 && y < 0 && result > 0) {
        throw new UnderflowException
      }
      else {
        result
      }
    }
  }
//  println(PocketCalculator.add(Int.MaxValue, 10))
  println(SPEED_OF_LIGHT)

}
