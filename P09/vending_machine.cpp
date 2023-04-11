#include "vending_machine.h"
#include <iostream>



 
void vending_machine::add(std::string name, int _price)
{


   item addi(name, _price);
   items.push_back(addi);
}

void vending_machine::buy(int index)
{
     std::cout<< "####  Buying "<< items[index].to_string();
} 



std::string vending_machine::menu()
{
  printf("\n=========================\n");
  printf("Welcome to UTA Vending");
  printf("\n==========================\n");
  
  
  std:: string menu;
  
  
  for(int i=0; i<items.size(); i++)
  {
  
      menu+= std::to_string(i) + ")" +items[i].to_string()+"\n";
   
  }
  return menu;
}

