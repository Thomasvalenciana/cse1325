
import java.util.ArrayList;
import java.util.Scanner;


public class Quizzer

{
   
public static void main(String[] args)
{
 
try{

   

	  {
	    
	    
	   Quiz quiz = new Quiz();
	   
	   
	   double r = quiz.takeQuiz();
	  System.out.print(r*100);
	   
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
