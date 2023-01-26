 
   public class MyPet
 { 
      
      
	  public static void main(String[] args)
	  {
	  
	Pet[] pets = new Pet [4];
	
	          pets[0] =  new Pet("Pony",8,Type.Horse);
	          pets[1] = new Pet ("Sonic",3,Type.Hedgehog);
	          pets[2] = new Pet ("Snake",10,Type.Snake);
	          pets[3] = new Pet ("Bunny", 5, Type.Bunny);
	
	  
	  for(Pet p : pets)
	  {
	  
	     System.out.println(p);
	  
	  }
   
      }
 }
