/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 21, 2020
Time: 9:30am
*/ 

public class Temperature
{   
   private double ftemp;//Access specifier for fahrenheit temp
   
   //Assigning the temperature to the variable fahrenheit given
   public Temperature( double fahrenheitGiven )
   {
      ftemp = fahrenheitGiven;
   }
   //Assigning the fahrenheit to the variable fahrenheit given
   public void setFahrenheit( double fahrenheitGiven )
   {
      ftemp = fahrenheitGiven;
   }
   
   //The answer gets returned
   public double getFahrenheit()
   {
      return ftemp;
   }
   
   //The value gets returned
   public double celsius()
   {
      return ( ( double ) 5 / 9 ) * ( ftemp - 32 );
   }
   
   //The value gets returned
   public double kelvin()
   {
      return ( ( 5 / ( double )9 ) * ( ftemp - 32 ) ) + 273;
   }
      
}
      
      

