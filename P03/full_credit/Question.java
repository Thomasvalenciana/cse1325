import java.util.ArrayList;

public  class Question

{
	
	private static int  nextQuestionNumber =  1 ;
	private final int questionNumber= nextQuestionNumber++;
	private String question;
    private ArrayList<String>answers;    
  
    private int rightAnswer;

 public Question( String question, ArrayList<String>answers, int rightAnswer)
 {
	 this.question= question;
	 this.answers = new ArrayList<String>();
	 this.rightAnswer= rightAnswer;

	 
	 if(rightAnswer<1 || rightAnswer>5) 
	 { 
	   throw new IllegalArgumentException("Invalid choice, must select one of the following answers");
	   	 
     }

 } 
 
	  public boolean checkAnswer(int answer)
     {
	    if (answer == rightAnswer)
	    {
			 return true;
		 
        } 
	    else
	    {
		    return false;
	    }
  
  
  
     }
     @Override
     public String toString()
     {
	      return  questionNumber + "." + question + answers ;
     }
      
	 
 
    
}




	

