/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 21, 2020
Time: 9:30am
*/ 

import java.util.Scanner;//Needed for the scanner class

public class HM_ServiceQuote
{ 
   private double partsCharges;//Access specifier for partsCharges
   private double laborCharges;//Access specifier for laborCharges
   
   public HM_ServiceQuote()
   {
      partsCharges = 0;
      laborCharges = 0;
   }
   
   //Assigning the parts charges to the variable c
   public void setPartsCharges(double c)
   {
      partsCharges = c;
   }
   
   //Assigning the labor charges to the variable c
   public void setLaborCharges(double c)
   {
      laborCharges = c; 
   }
   
   //The value gets returned
   public double getPartsCharges()
   {
      return partsCharges;  
   }
   
   //The value gets returned
   public double getLaborCharges()
   {
      return laborCharges;   
   }
   
   //The value gets returned
   public double getSalesTax()
   {
      double tax = partsCharges + laborCharges;
      double taxOne = tax * 0.08;
      return taxOne;  
   }
   
   //The value gets returned
   public double getTotalCharges()
   {
      return partsCharges + laborCharges + getSalesTax();  
   }
   
}  
   
