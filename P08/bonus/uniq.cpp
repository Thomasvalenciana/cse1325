#include <iostream>
#include<string>

int main(int argc, char*argv[])
{
  std::string m1;
  for (int k =1; k < argc; k++)
  {
    std::string m2= argv[k];
	if(m2 !=m1)
    {
	    std::cout << m2<< " ";
        m1=m2;
	}	
  }
    std::cout<<std::endl;
    return 0;
};
