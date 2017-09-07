package src.main

object Factorial {

  def main(args: Array[String]) {
    for (i <- 1 to 10)
      println( "Factorial of " + i + ": = " + Factorial(i) )
  }

  def Factorial(x: Int):Int =
{

  def Fact(x:Int,acc:Int):Int =
{
  if(x <= 1) acc

  else
      Fact(x-1,x*acc)

}
  Fact(x,1)

}

}

