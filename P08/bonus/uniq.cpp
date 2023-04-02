#include <iostream>
#include<string>

int main(int argc, char*argv[])
{
  std::string previous;
  
  for (int k =1; k < argc; k++)
  {
    std::string current= argv[k];
	if(current !=previous)
    {
	  std::cout << current<< " ";
     previous=current;
	 
	}	
  }
  std::cout<<std::endl;
 

};
