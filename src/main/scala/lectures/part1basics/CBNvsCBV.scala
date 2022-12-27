package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(currentTime: Long): Unit = {
    println("Call by value = " + currentTime)
    println("Call by value = " + currentTime)
  }

  def callByName(currentTime: => Long): Unit = {
    println("Call by name = " + currentTime)
    println("Call by name = " + currentTime)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34)
  printFirst(34, infinite())

}
