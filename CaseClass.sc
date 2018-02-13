import java.awt

case class Book(title:String,pages:Int)

val b1 = Book("sherlock homes",200)
b1.title

val b2 = b1.copy(pages = 500)
b2.pages

b1.productArity
b1.productPrefix
b1.productElement(0)
b1.productElement(1)

b1.eq(b2)
b1.eq(Book("sherlock",200))
b1.equals(Book("sherlock",200))

b1 == b2
b1 == Book("Scala book", 150)




//Case class without companion object

case class Area(length:Int = 0,breadth:Int = 0)
{
  def Square = length * breadth
}
val r2 = Area(2,3)
r2.Square

//Case class and companion object
//Data can be seperated from logic

case class Rectangle(length:Int = 0,width:Int = 0)


object Rectangle
{
  def Square(rectangle:Rectangle) = rectangle.length * rectangle.width
}

val r1 = Rectangle(5,4)
Rectangle.Square(r1)

