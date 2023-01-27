  public class MyPets
 { 
      
      
	  public static void main(String[] args)
	  {
	  
	Pet[] mascota = new Pet [4];
	
	          mascota[0] =  new Pet("Pony",8,Type.Horse);
	          mascota[1] = new Pet ("Sonic",3,Type.Hedgehog);
	          mascota[2] = new Pet ("Orochimaru",10,Type.Snake);
	          mascota[3] = new Pet ("Benito", 5, Type.Bunny);
	
	  
	  for(Pet p : mascota)
	  {
	  
	     System.out.println(p);
	  
	  }
   
      }
 }
