/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 17, 2020
Time: 9:30am
*/ 

import java.util.Scanner;

public class Menu
{
   public static void main (String[]args)
   {
     Scanner keyboard = new Scanner(System.in);
     
     int choice=0; // what the user chooses from the menu
     int i = 0;  // the counter for the loop
     int num1, num2, sum=0, quotient=0, product=0, diff=0;
     
    do
    {
      System.out.println("****************************");
      System.out.println("*    1.   Addition         *");
      System.out.println("*    2.   Subtraction      *");
      System.out.println("*    3.   Multiplication   *");
      System.out.println("*    4.   Division         *");
      System.out.println("*    5.   Exit             *");
      System.out.println("****************************");
      System.out.println();  // create a newline to separate menu from message
      System.out.print("Enter the number for you choice from the menu:");
      choice = keyboard.nextInt();  // collect user value
      
      switch(choice)
      {
        case 1: System.out.print("Enter first number:");
                num1 = keyboard.nextInt();  // collect user value
                System.out.print("Enter second number:");
                num2 = keyboard.nextInt();  // collect user value
                
                sum = num1 + num2;
                System.out.println(num1 + " + " +num2+ " = "+sum);
                System.out.println("Press 5 to exit");
                choice = keyboard.nextInt();
                break;

        case 2: System.out.print("Enter first number:");
                num1 = keyboard.nextInt();  // collect user value
                System.out.print("Enter second number:");
                num2 = keyboard.nextInt();  // collect user value
                
                diff = num1 - num2;
                System.out.println(num1 + " - " +num2+ " = "+diff);
                break;

        case 3: System.out.print("Enter first number:");
                num1 = keyboard.nextInt();  // collect user value
                System.out.print("Enter second number:");
                num2 = keyboard.nextInt();  // collect user value
                
                product = num1 * num2;
                System.out.println(num1 + " * " +num2+ " = "+product);
                break;

        case 4: System.out.print("Enter first number:");
                num1 = keyboard.nextInt();  // collect user value
                System.out.print("Enter second number:");
                num2 = keyboard.nextInt();  // collect user value
                
                quotient = num1 / num2;
                System.out.println(num1 + " / " +num2+ " = "+quotient);
                break;

        case 5: System.out.println("Thank you using my program. Have a great day.");
                break;
        
        default: System.out.println("Wrong choice. Try again.");
                 break;
      }
 
    }
    while(choice < 5);
   
   }
}