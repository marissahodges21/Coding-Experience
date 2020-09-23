/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 22, 2020
Time: 9:30am
*/ 

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class HodgesM_Lab3
{
   public static void main (String[]args)
   {
     Scanner keyboard = new Scanner(System.in);
     
     //Part A - While loop - Rolling Dice
     System.out.println("Part A - While loop - Rolling Dice");
     System.out.println();
     
     //Declare variables
     int dice1_MNH = 0;
     int dice2_MNH = 0;
     Random rand_MNH = new Random();
     int tries = 0;//will increase depending on how many tries it takes
     int sum = 0;
     
     while (sum !=8)//this will repeat until sum = 8
     {
         dice1_MNH = rand_MNH.nextInt(6) + 1;//returns 1,2,3,4,5 or 6
         dice2_MNH = rand_MNH.nextInt(6) + 1;//returns 1,2,3,4,5 or 6
         sum = dice1_MNH + dice2_MNH;
         System.out.println("Dice are " + dice1_MNH + " " + dice2_MNH + " (sum = " + sum + ")");
         tries++;//increase number of tries by 1
     }
     
     System.out.println();
     System.out.println("Eight rolled");
     System.out.println();
     
     //Part B - For loop - Square, Cube, and Square Root
     System.out.println("Part B - For loop - Square, Cube, and Square Root");
     System.out.println();
     
     //Declare variables
     int square, cube, limit_MNH, maxValue; 
     int totalSquare_MNH=0, totalCube_MNH=0; 
     DecimalFormat formatter_MNH = new DecimalFormat("#,###,##0.000");
     double sqrt;
     double totalSqrt_MNH=0; 
                      
     System.out.println("Please enter an integer number: ");
     maxValue = keyboard.nextInt(); //max value
         
     //The titles of the table
     System.out.println("Number" + "\t" + "Square" + "\t" + "Cube" + "\t" + "Square Root");
          
     //Using the for-loop to display the sqare, cube and square root       
     for(limit_MNH=1; limit_MNH <= maxValue; limit_MNH++)
     {           
         //The equations for each variable
         square = limit_MNH * limit_MNH;
         cube = limit_MNH * limit_MNH * limit_MNH;
         sqrt = Math.sqrt(limit_MNH); 
     
     System.out.println("    " + limit_MNH + "\t     " + square + "\t    " + cube + "\t     " + formatter_MNH.format(sqrt));
     
     //PART C - For-Loop - Running Total
         //Finding the totals for each variable
         totalSquare_MNH += square;
         totalCube_MNH += cube;
         totalSqrt_MNH += sqrt;
            
     }
         //Displaying the answers for each variable
         System.out.println("\n" + "Part C - For loop - Running Total");
         System.out.println();
         System.out.println("Sum of Square = " + totalSquare_MNH);
         System.out.println("Sum of Cube = " + totalCube_MNH);
         System.out.println("Sum of Square Root = " + formatter_MNH.format(totalSqrt_MNH));  
         
     //PART D: Do-While: Guessing Number
     int MY_DIGIT=3; //My favorite digit
     int guessNum=0; 
     
     //Using the do-while to display messages based off of guessed digits  
     System.out.println("\n" + "Part D - Do-While: Guessing Number");  
     System.out.println();  
     System.out.println("Guess what my favorite digit is? (0-9): ");
   
      do
      {
           guessNum = keyboard.nextInt(); 
           
           //Using if statements to display the right messages
           if(guessNum == MY_DIGIT)
            {
               System.out.println("Good guess!"); //If the user guesses right
            } 
                   
            else if(guessNum != MY_DIGIT && guessNum <=10)
            {
               System.out.println("Incorrect, please try to guess again. (0-9): "); //If the user guesses incorrectly
            }
             
            do
            {
              //Part E - Using Loop to Validate Input
              if(guessNum != MY_DIGIT && (guessNum >= 10 || guessNum < 0)) 
               {
                  System.out.println("The number you entered is not in range, please reenter a number (0-9): "); //If the user guesses outside of its range
                  guessNum = keyboard.nextInt(); 
               }
            }
              while (guessNum > 9);           
                                         
    }    
      while(guessNum != 3); 

     
   }
}
 



     
