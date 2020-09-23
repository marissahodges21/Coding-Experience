/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 19, 2020
Time: 9:30am
*/ 

import java.util.Scanner;

public class Loops
{
   public static void main (String[]args)
   {
     Scanner keyboard = new Scanner(System.in);
    
    //post-incrementation 
    for(int i=0; i < 10; i++)
    {
      System.out.print(i+1 + " ");
    }
    
    System.out.println();
    
    //pre-incrementation
    for(int i=0; i < 10; ++i)
    { 
      System.out.print(i+1 + " ");
    }
    
    System.out.println();
    
    //incrementation with values greater then 1
    for(int i=0; i < 50; i+=5)
    { 
      System.out.print(i + " ");
    }
    
    System.out.println();
    
    int i = 0;
    while (i < 50)
    {
      int value = i % 5;
       if(value == 0)
       {
         System.out.print(i + " ");
       }
       i++;
    }
    
    }
 }
     
