/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 27, 2020
Time: 9:30am
*/ 

import java.util.Scanner;

public class SquareDisplay
{
   public static void main (String[]args)
   {
     Scanner keyboard = new Scanner(System.in);
     
     int userInteger;//the integer the user chooses 
     
     System.out.println("Please enter a positive number not greater than 15");
     userInteger = keyboard.nextInt();//collect user integer 
     
     while( userInteger < 1 || userInteger > 15)
     {
      System.out.println("Please reenter a positive number not greater than 15 (1 to 15 please)" );
      userInteger = keyboard.nextInt();//if integer is not 1 to 15
     }
     
     //square display determined by the integer 
     for (int row = 1; row <= userInteger; row++)
     {
         for (int column = 1; column <= userInteger; column++)
         {
            System.out.print("X");
         }
         
         System.out.println();
         
     }
     
   }
 }

