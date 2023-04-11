#ifndef _VENDING_MACHINE_H
#define _VENDING_MACHINE_H

#include<string>
#include<vector>
#include"item.h"
#include<iostream>

class vending_machine
{
   
     
     public:
        void add(std::string _name, int _price);
        void buy(int index);
        std::string menu() ;
    private:
       std::vector<item> items;


};

#endif
