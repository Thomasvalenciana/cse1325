public class Customer

{
	private String name;
	private String email;
	

 public Customer(String name, String email)
 {
	 this.name=name;
	 this.email= email;
	 
	 
	 
	 if(email.indexOf("@")< 0)
	 {
	   throw new IllegalArgumentException(" must contain @");
	 }
	   
	 if(email.indexOf(".")< 0)
	 {
	   throw new IllegalArgumentException(" must contain . after @");
	 }
	   
	// if(email(NULL== 0))
	// {
	//   throw new IllegalArgumentException("invalid no emptystring");
	// }
	   
	
	 
 }
 
 

  @Override
  public String toString()
  {
       
       return  email +" " + name;
  }
  
 // public boolen equals(Object o)
 // {
     
  
 // }
}
