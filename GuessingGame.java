/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 27, 2020
Time: 9:30am
*/ 

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
   public static void main (String[]args)
   {
     System.out.println("Welcome to the number guessing game.");
     System.out.println("Pick the maximum number: ");//This number will be the max number the user has to guess to

     Scanner inputnum = new Scanner(System.in);
     int maxnum;
     maxnum = inputnum.nextInt();
     
     Random randomNumbers = new Random();
     int num = randomNumbers.nextInt(maxnum);
     int tries = 0;//will increase depending on how many tries it takes 
     Scanner keyboard = new Scanner(System.in);
     int guess;
     boolean correct = false;
     
     
     while(correct == false)//this will repeat until correct == true
     {
     
         System.out.println("Guess the number between 1 and "+ maxnum +": ");
         guess = keyboard.nextInt();
         tries++;//increasing the number set in the variable tries by 1

         //compare guess to generated number 
         if(guess > num)
         {
            System.out.println("Too high, try again");
         }
         
         else if (guess < num)
         {
            System.out.println("Too low, try again");
         }
         
         else 
         {
            System.out.println("Yes, you guessed the number!");
            correct = true;//since number is correct, the loop will end
         }
     }
     
     System.exit(0);
      
   }
 }

