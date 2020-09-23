/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 31, 2020
Time: 9:30am
*/ 

import java.util.Scanner;

public class Puppy
{
   int puppyAge;

/******************Defined Classes **************************/
   public Puppy(String name) 
   {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) 
   {
      puppyAge = age;
   }

   public int getAge( ) 
   {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }
/**********************************************************/

   public static void main(String []args)
   {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}
