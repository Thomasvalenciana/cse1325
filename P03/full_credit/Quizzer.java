
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Quizzer

{
   
public static void main(String[] args)
{
 
try{

   

	  {
	    
	    
	   Quiz quiz = new Quiz();
	   
	   
	   double r = quiz.takeQuiz();
	   
	  System.out.println(r*100);
	  if( r==1)
	  {
	     System.out.print("  Great you made 100!");
	  }
	  else{
	  System.out.println("   It's okay you'll get it next time!");
	  }
    } 
    }
   catch(IllegalArgumentException e)
	{

   System.err.println("Invalid choice, must select one of the following answers");
   } 

}

}
 
   
   
   
   /** try
    {
   
      
   }
   catch(Exception e )
   {
   
   
   }
   
   
   */
