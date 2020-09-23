/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 21, 2020
Time: 9:30am
*/ 

import java.util.Scanner;//Needed for the scanner class

public class HodgesM_DistanceCon
{   
   public static void menu()
   {
      System.out.println("\n1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program\n");
   }
   
   //Conversion for kilometers   
   public static void showKilometers(double meters)
   {
      double kilometers;
      kilometers = meters * 0.001;
      System.out.printf("%.2f meters is %.1f kilometers", meters, kilometers);
   }
   
   //Conversion for inches   
   public static void showInches(double meters)
   {
      double inches;
      inches = meters * 39.37;
      System.out.printf("%.2f meters is %.1f inches", meters, inches);
   }
   
   //Conversion for feet   
   public static void showFeet(double meters)
   {
      double feet;
      feet = meters * 3.281;
      System.out.printf("%.2f meters is %.1f feet", meters, feet);
   }
   
   //Error message if user enters wrong data
   public static void showError(String errorMessage)
   {
      System.out.println("Error: " + errorMessage);
   }
      
      public static void main(String args[])
      {  
         //Create a scanner object for keyboard input
         Scanner keyboard = new Scanner(System.in);
     
         //Part A - Distance Conversion
         System.out.println("Part A - Distance Conversion");
         System.out.println();
         
         //Define variables
         double meters;
         int sentinel = 4;
         int userChoice;
         
         //User enters data
         System.out.println("Enter a distance in meters: ");
         meters = keyboard.nextDouble();
         
         //While loop
         while( meters < 0 )
         {
            System.out.println("Please enter a positive number for distance: ");
            meters = keyboard.nextDouble();
         }
         
         menu();
         
         System.out.println("Enter your choice: ");
         userChoice = keyboard.nextInt();
         
         //While if loop
         while( userChoice != sentinel )
         {
            if( userChoice == 1 )
            {
               showKilometers( meters );
            }
            
            else if ( userChoice == 2 )
            {
               showInches( meters );
            }
            
            else if ( userChoice == 3 )
            {
               showFeet( meters );
            }
            
            else
            {
               showError("Please choose a valid option");
            }
            
            menu();
            System.out.println("Enter your choice: ");
            userChoice = keyboard.nextInt();
            
         }
         
         System.out.println("Bye!");
       
      }
}

