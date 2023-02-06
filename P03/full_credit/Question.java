import java.util.ArrayList;

public  class Question

{
	
	private static int  nextQuestionNumber =  1 ;
	private final int questionNumber= 1;
	private String question;//=" what is the best food?";
    private ArrayList<String>answers; //= new ArraList<String>();   
   // private  String answers;
    private int rightAnswer;

 public Question( String question, ArrayList<String>answers, int rightAnswer)
 {
	 this.question= question;
	 this.answers = new ArrayList<String>();
	 this.rightAnswer= rightAnswer;

	 //public static int answer (int rightAnswer, ArrayList<String>answers)
	 //{
	 if(rightAnswer<1 || rightAnswer<4) 
	 { 
	     throw new IllegalArgumentException("You must select one of the following answers");
	   	 
     }

 } 
 
	  public boolean checkAnswer(int answer)
     {
	     if (answer == rightAnswer)
	     {
			 return true;
		 
     } 
     
	 else{
		 return false;
	 }
 
  
  
  }
    @Override
    public String toString()
      {
	   return questionNumber + question + answers ;
      }
      
	 
 
    
}




	//= "1.asian,2.mexican,3.indian,4.white";
       //  var myArrayList = new ArrayList<String>();
        
      //  myArrayList.add(answers);

