/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 22, 2020
Time: 9:30am
*/ 

import java.util.Scanner;
import java.util.Random;

public class ExtraCredit
{
   public static void main (String[]args)
   {
     Scanner keyboard = new Scanner(System.in);
     
     //Part A - While loop - Rolling Dice
     System.out.println("Part A - While loop - Rolling Dice");
     System.out.println();
     System.out.println("Enter the sum you wish to roll. (2-12): ");//Get the users desired sum
          
     //Declare variables
     int dice1_MNH = 0;
     int dice2_MNH = 0;
     Random rand_MNH = new Random();
     int tries = 0;//will increase depending on how many tries it takes
     int diceSum = 0;
     int userSum = keyboard.nextInt();
     
     while (diceSum != userSum)//this will repeat until sum = 8
     {
         dice1_MNH = rand_MNH.nextInt(6) + 1;//returns 1,2,3,4,5 or 6
         dice2_MNH = rand_MNH.nextInt(6) + 1;//returns 1,2,3,4,5 or 6
         diceSum = dice1_MNH + dice2_MNH;
         System.out.println("Dice are " + dice1_MNH + " " + dice2_MNH + " (sum = " + diceSum + ")");
         tries++;//increase number of tries by 1
     }
     
     System.out.println();
     System.out.println(userSum + " Rolled");
     
   }
}
