#include<iostream>
#include<string>
#include<vector>
#include"item.h"
#include"vending_machine.h"

int main()

{
     
   int item1 =0;
   
   vending_machine vending;
   vending.add("Oreos", 189);
   vending.add("Snickers", 175);
   vending.add("Red Bull" , 255);
   std::cout<<vending.menu()<<std::endl;
   
   vending.buy(item1);
   return 0;

}

