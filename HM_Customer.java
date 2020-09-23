/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 21, 2020
Time: 9:30am
*/ 

import java.util.Scanner;//Needed for the scanner class

public class HM_Customer 
{  
   private String name;//Access specifier for name
   private String address;//Access specifier for address
   private String phone;//Access specifier for phone
    
   public HM_Customer()
   {
      name = null;
      address = null;
      phone = null;
   }
   
   //Assigning the name to the variable n
   public void setName(String n)
   {
      name = n;
   }
   
   //Assigning the address to the variable a
   public void setAddress(String a)
   {
      address = a; 
   }
   
   //Assigning the phone number to the variable p
   public void setPhone(String p)
   {
      phone = p;
   }
   
   //The answer gets returned
   public String getName()
   {
      return name;  
   }
   
   //The answer gets returned
   public String getAddress()
   {
      return address;   
   }
   
   //The answer gets returned
   public String getPhone()
   {
      return phone;  
   }
   
}
   



   
  




  
