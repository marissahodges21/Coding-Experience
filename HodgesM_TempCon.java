/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 21, 2020
Time: 9:30am
*/ 

import java.util.Scanner;//Needed for the scanner class

public class HodgesM_TempCon
{   
   public static void main(String args[])
   {  
      //Create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Part B - Temperature Conversion
      System.out.println("Part B - Temperature Conversion");
      System.out.println();
      
      //Define variable
      double fahrenheit;
      
      //User enters temperature data
      System.out.println("Please enter a fahrenheit Temperature");
      fahrenheit = keyboard.nextDouble();
      
      //Constructor
      Temperature temp1 = new Temperature( fahrenheit );
      
      //Temperature is coverted
      System.out.printf("Fahrenheit temperature: %.2f\nCelcius temperature: %.2f\nKelvin temperature: %.2f" ,
      temp1.getFahrenheit(), temp1.celsius(), temp1.kelvin() );
      
   }
}
     

