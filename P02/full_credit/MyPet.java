 
   public class MyPet
 { 
      
      
	  public static void main(String[] args)
	  {
	  
	Pet[] pets = new Pet [4];
	
	          pets[0] =  new Pet("Pony",8,Type.Horse);
	          pets[1] = new Pet ("Sonic",3,Type.Hedgehog);
	          pets[2] = new Pet ("Orochimaru",10,Type.Snake);
	          pets[3] = new Pet ("Benito", 5, Type.Bunny);
	
	  
	  for(Pet p : pets)
	  {
	  
	     System.out.println(p);
	  
	  }
   
      }
 }
