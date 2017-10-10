package project.ShoppingCart

import scala.math.BigDecimal.RoundingMode

object Checkout {

  private val pricelist: Map[String,Double] = Map(("apple", 0.60),("orange",0.25),("banana",0.20))

  //fetches the combined offer price

  def getofferprice(items:Array[String]):Double=
  {
    val noofapples = items.count(p=>p.equalsIgnoreCase("apple"))
    val nooforanges = items.count(p=>p.equalsIgnoreCase("orange"))
    val noofbanana = items.count(p=>p.equalsIgnoreCase("banana"))

    //combines the individual offer price

    val total = Offers.calculateoffer("apple")(noofapples) + Offers.calculateoffer("orange")(nooforanges) + Offers.calculateoffer("banana")(noofbanana)
    BigDecimal(total).setScale(2,RoundingMode.HALF_EVEN).toDouble

  }

  //fetches the cost per item

  def getprice(item:String):Double =
  {
   pricelist.getOrElse(item,0.0).toDouble
  }

}
