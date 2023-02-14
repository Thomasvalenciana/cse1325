public abstract class Product{
	
	protected  double cost;
	
	protected  String name;
	


    public Product ( String name, double cost)
    {
	this.name=name;
	this.cost=cost;
	
	if(cost < 0 )
	{
	   throw new RuntimeException("cannot be negative");
	}
	
	
    }


 
	
	

 public abstract double price();
 
 @Override
 public String toString()
 {
   
   
  
  return String.format("%-8s($%.2f) \t\t $%.2f",name,cost,price());
  }
 
}


