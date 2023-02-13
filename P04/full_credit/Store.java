
import java.util.ArrayList;
import java.util.Scanner;

public class Store
{
	private static ArrayList<Product>products =new ArrayList<>();	
    private  static ArrayList<Product> shoppingCart= new ArrayList<>();
	
	public static void main(String[] args)
	
	{
	Taxed.setTaxRate(0.0875);
	Scanner scan = new Scanner(System.in);
	
	  System.out.println(" =====================================");
	  System.out.println("    Welcome to the Store");
	  System.out.println(" =====================================");
	          
		
		products.add(new Taxfree("1) milk",     2.10));
		products.add(new Taxfree("1) eggs",     1.10));
		products.add(new Taxfree("2) bread",    2.78));
		products.add(new Taxed("3) candy",      1.10));
		products.add(new Taxed("4) beer",      11.10));
		products.add(new Taxed("5) flowers",   9.78));
	
		
		
	for(Product p: products )
	{
	
	    System.out.println(p);
	    
		}
		
		int option =scan.nextInt();
		
		
		//if(option )
		
		
		
		
		
		
		
		
		

	
		
	
	
	
   
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
