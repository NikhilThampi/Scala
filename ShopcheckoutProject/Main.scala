package project.ShoppingCart

object Main {

  def main(args:Array[String]) =
  {
    val items = Array("orange","apple","banana","apple")

    //Prints the combined offer price for the items listed above

    println("["+items.mkString(",")+"]=>£"+Checkout.getofferprice(items))

  }
}
