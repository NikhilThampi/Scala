
//SINGLETON OBJECT
object singleton {

  private var m:Int = 122
  def display() {
    var o: singleton = new singleton
    println("value in singletonobject is"+o.d)
  }



}

//COMPANION CLASS

class singleton
{
  import  singleton._
private var d:Int = 222
  def show()
  {
    println("Values is "+m)
  }
}

object hello
{
  def main(args:Array[String])
  {
    var ob:singleton = new singleton
    ob.show()
    singleton.display()
  }
}
