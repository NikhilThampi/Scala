package src.main

object HigherOrderFunctions {

  def main(args: Array[String]) =
  {
    println("Sum of numbers between two numbers(3,6) using linear recursion ")
    println(sum(x => x,3,6) + "")
    println("Sum of cubes between two numbers(2,3) using linear recursion ")
    println(cubes(x => x*x*x,2,3) + "")
    println("Factorial of 5 using linear recursion ")
    println(Factorial(5) + "")
  }

    def sum(f:Int=>Int,a:Int,b:Int):Int =
    {
      def loop(a:Int,acc:Int):Int =
      {
        if(a>b) acc
        else loop(a+1,f(a) + acc)
      }
      loop(a,0)
    }

  def cubes(f:Int=>Int,a:Int,b:Int):Int=
  {
    def loop(a:Int,acc:Int):Int =
    {
     if(a >b ) acc
     else loop(a+1,f(a) + acc)
     }
    loop(a,0)
  }

  def Factorial(a:Int):Int =
  {
    def Fact(a:Int,acc:Int): Int =
    {
      if(a <=1) acc

      else Fact(a-1,a*acc)

    }
    Fact(a,1)
  }

}
