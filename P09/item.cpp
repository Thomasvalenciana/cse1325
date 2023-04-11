#include <string>
#include <stdexcept>
#include<iomanip>
#include<sstream>
#include"item.h"


 item::item(std::string name, int _price) : name(name), _price(_price) 
  {
        if (_price < 0) 
        {
            throw std::runtime_error("Invalid price: price cannot be negative");
        }
  }

  std::string item::to_string()
    {
    
      std::ostringstream pstream;
      
      pstream<<std::fixed<< std::setprecision(2) << ((double)_price/100);
      return name + " " +"("+ "$" + pstream.str()+")";
    }

