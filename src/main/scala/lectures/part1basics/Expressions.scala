package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  //  Instructions (Do something) vs Expression (Value)

  val aCondition = 5
  val aConditionValue = if (aCondition == 5) 5 else 3
  println(aConditionValue)
  println(if (aCondition == 5) 5 else 3)

  // expression returning unit are side effects. unit means void in other languages
  // for example

  var aRandomVariable = 10
  val aWeiredValue = (aRandomVariable = 11) // expression returning unit which must be avoided at all times
  println(aWeiredValue)

  var whileLoopCounter = 1


  // NEVER write below while loop which is a expression in scala & returning unit
  val valueOfWhileLoopExpression = while (whileLoopCounter < 10) {
    println(whileLoopCounter)
    whileLoopCounter += 1
  }

  val valueOfPrintExpression = println(valueOfWhileLoopExpression)
  println(valueOfPrintExpression)

  // side effects : println(), while loop , reassigning --> all these have return type as unit which must be avoided

}
