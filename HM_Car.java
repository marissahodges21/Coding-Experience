/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 21, 2020
Time: 9:30am
*/ 

import java.util.Scanner;//Needed for the scanner class

public class HM_Car
{ 
   private String make;//Access specifier for make
   private String model;//Access specifier for model
   private int year;//Access specifier for year
    
   public HM_Car()
   {
      make = null;
      model = null;
      year = 0;
   }
   
   //Assigning the make to the variable m
   public void setMake(String m)
   {
      make = m;
   }
   
   //Assigning the model to the variable m
   public void setModel(String m)
   {
      model = m; 
   }
   
   //Assigning the year to the variable y
   public void setYear(int y)
   {
      year = y;
   }
   
   //The answer gets returned
   public String getMake()
   {
      return make;  
   }
   
   //The answer gets returned
   public String getModel()
   {
      return model;   
   }
   
   //The answer gets returned
   public int getYear()
   {
      return year;  
   }
   
} 