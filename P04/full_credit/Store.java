
import java.util.ArrayList;
import java.util.Scanner;


public class Store
{
	private static ArrayList<Product>products =new ArrayList<>();	
    private  static ArrayList<Product> shoppingCart= new ArrayList<>();
	
	public static void main(String[] args)
	
	{
	try 
        {
	Taxed.setTaxRate(0.0825);
	Scanner scan = new Scanner(System.in);
	
	  System.out.println(" =====================================");
	  System.out.println("    Welcome to the Store");
	  System.out.println(" =====================================");
	          
		
		products.add(new Taxfree("0)milk",2.10));
		products.add(new Taxfree("1)eggs",1.10));
		products.add(new Taxfree("2)bread",2.78));
		products.add(new Taxed("3)candy",1.10));
		products.add(new Taxed("4)beer",11.10));
		products.add(new Taxed("5)flowers",9.78));
	
		
		
	for(Product p: products )
	{
	
	    System.out.println(p);
	    
		}
		
		System.out.println("\nBuy which product?");
		 
		
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer>shoppinglist =new ArrayList<Integer>();
		
		for(int counter=0; counter <100; counter++)
		{
		 int user =scanner.nextInt();
		 shoppinglist.add(user);
		 if(user==0)
		 { System.out.println("Current order");
		    System.out.println("-------------");
		  System.out.println(products.get(0));
		 }
		 else if(user==1)
		 {   System.out.println("Current order");
		    System.out.println("-------------");
		     System.out.println(products.get(1));
		 }
		 else if(user==2)
		 {   System.out.println("Current order");
		    System.out.println("-------------");
		     System.out.println(products.get(2));
		 }
		  else if(user==3)
		 {   System.out.println("Current order");
		    System.out.println("-------------");
		     System.out.println(products.get(3));
		 }
		 else if(user==4)
		 {   System.out.println("Current order");
		    System.out.println("-------------");
		     System.out.println(products.get(4));
		    
		 }
		 else if(user==5)
		 {
		    System.out.println("Current order");
		    System.out.println("-------------");
		     System.out.println(products.get(5));
		 }
		 else if(user==-1)
		 { 
		     System.out.println("thank you for shopping");
		     break;
		    
		 }
		 }
		 
            
            
		}
   catch(IllegalArgumentException e)
	{

   System.err.println("Must select one of the following answers");
   } 

}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

