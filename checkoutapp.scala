package src.main
import scala.math.BigDecimal.RoundingMode

object Main
{

  def main(args:Array[String])
  {
    val items = Array("orange", "orange","orange","apple")
    println("[ " + items.mkString(", ") + " ] => £" + ShoppingCart.Checkoutwithoffers(items))


  }


}

object ShoppingCart
{

  private val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25), ("banana", 0.20))

  def Checkoutwithoffers(items: Array[String]): Double =
  {
    val noofapples = items.count(p => p.equalsIgnoreCase("apple"))
    val nooforanges = items.count(p=>p.equalsIgnoreCase("orange"))
    val noofBanana = items.count(p=>p.equalsIgnoreCase("banana"))

    val total = Offers.offer("apple")(noofapples) + Offers.offer("banana")(noofBanana) + Offers.offer("orange")(nooforanges)
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

  def getPrice(item:String):Double =
  {
    priceList.getOrElse(item, 0.0).toDouble


  }
}

object Offers
{
  def buyonegetone(numberofitems:Int,costofone:Double):Double = ((numberofitems/2) + (numberofitems %2)) * costofone
  def buytwogetthree(numberofitems:Int,costofone:Double):Double = (2 * (numberofitems/3) + (numberofitems %3))* costofone

  def offer(item:String):Int => Double = {
    val price: Double = ShoppingCart.getPrice(item)

    item toLowerCase() match {

      case "apple" => (numberofitems:Int) => buyonegetone(numberofitems,price)
      case "banana" => (numberOfItems:Int) => buyonegetone(numberOfItems, price)
      case "orange" => (numberOfItems:Int) => buytwogetthree(numberOfItems, price)
    }

  }

}






