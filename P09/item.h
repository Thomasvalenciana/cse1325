#ifndef _ITEM_H
#define  _ITEM_H

#include <stdexcept>
#include <string>



class item
{ 
  

public:
   item(std::string name, int _price);
   std::string to_string();
private:
 std::string name;
 int _price;


};
#endif
   

