import java.util.ArrayList;
import java.util.Scanner;

public class Quiz 
{
 private ArrayList<Question>questions ; 
 ArrayList<String> options1= new ArrayList<String>();
 ArrayList<String> options2= new ArrayList<String>();
  
   public Quiz()
   {
   	   
	   loadQuiz();
	   
	   }
	  
  
  private void loadQuiz()
  {  
  
      ArrayList<String> options1= new ArrayList<String>();
  		
  		options2.add("DC");
  		options2.add("Austin");
	      
	   //String question1 = "Pizza  burg";
	  // options1.add(question1);
	   questions = new ArrayList<Question>();
	   Question q1= new Question("what is your favorite food",options1,1);
       questions.add(q1);
       questions.add(new Question("what is the capitol of Austin",options2,2));
    
  }
   
  public double takeQuiz()
  {  
  
       
	   double correct=0;
	   Scanner scan = new Scanner(System.in);
	   for( Question q:questions )
	   {
	   		System.out.println(q);
	   	
	   		int proposedAnswer =scan.nextInt();
	   		
	   		if(q.checkAnswer(proposedAnswer))
	   		{
	   			 correct++;
	   		}
	   		
	   }
	   
	  
	   return correct/2;
	   
	   
            
  
  }
  
  
  
     
   
}
