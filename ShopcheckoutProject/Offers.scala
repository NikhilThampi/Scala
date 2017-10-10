package project.ShoppingCart

object Offers {


   def buyonegetone (numberofitems:Int,costofone:Double):Double = ((numberofitems/2) + (numberofitems%2)) * costofone

   def buytwogetthree (numberofitems:Int,costofone:Double):Double = (2*(numberofitems/3) + (numberofitems%3))* costofone

  //Calculates offer per item

   def calculateoffer (item:String):Int=>Double = {
     val priceofone: Double = Checkout.getprice(item)

     item toLowerCase() match {

       case "apple" => (numberofitems: Int) => buyonegetone(numberofitems, priceofone)
       case "orange" => (numberofitems: Int) => buyonegetone(numberofitems, priceofone)
       case "banana" => (numberofitems: Int) => buytwogetthree(numberofitems, priceofone)
     }
   }

}
