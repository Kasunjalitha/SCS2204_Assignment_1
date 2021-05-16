//Assignment   : 1 (SCS2204)
//Index Number : 19000642

object Assignment_1 extends App{
  
  def convertIntoFahrenheit(x: Double)= x*1.8 + 32;

  def calculateVolume(r: Double)= (4/3)*math.Pi*math.pow(r, 3);

  def calculateTotalWholesale(n: Int) = {
    val coverCost: Double = 24.95;
    val priceAfterDiscount = coverCost*0.6;
    val totalWholesale = 
      if(n <= 50) ((coverCost*n) - n*(priceAfterDiscount + 3))
      else ((coverCost*n) - 50*(priceAfterDiscount + 3) - (n-50)*(priceAfterDiscount + 0.75))
    totalWholesale;
  }


  println(convertIntoFahrenheit(35));
  println(calculateVolume(5));
  println("Rs. " + calculateTotalWholesale(60));
}

