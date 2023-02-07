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
  		
  		
	   
	   questions = new ArrayList<Question>();
	   Question q1= new Question(" How much blood does an adults body approximately contain?\n 1) 1.5liters\n 2) 3.5Liter\n 3) 5.5Liters\n 4) 6.5Liters)",options1,1);
       questions.add(q1);
       
      
       
       
       ArrayList<String> options2= new ArrayList<String>();
       questions.add(new Question(" What year was Microsoft founded?\n 1) 1984\n 2) 1975 \n 3) 1965\n 4) 1957)",options2,2));
       
	      
    
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
