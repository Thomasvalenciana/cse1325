


public class Taxed extends Product
{
  
    private static double tax= 0.0;
     
     
    public Taxed(String name, double cost)
  {
     super(name , cost);
  }
	
	public static void setTaxRate (double salesTaxRate)
	{
	    
	    tax= salesTaxRate;
	}
	
	@Override 
	public double price()
	{
		return cost *(1+tax);
	}
	
	
}


