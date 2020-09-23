/* Group 2 (Amanda Jones, Marissa Hodges, Johnay Withers, Hadassah Smith)
   Lab Date: April 2, 2020
   Lab Time: 9:30 AM */
   
//Westfield Carpet Company Carpet Calculator

public class Group2_RoomDimension
{
   private double length; //Access specifier for length
   private double width; //Access specifier for width
   
      //Constructors
      public Group2_RoomDimension()
      {
         length = 0;
         width = 0;
      }
      
      //Assigning the length to the variable len
      public void setLength (double len)
      {
         length = len;
      }
      
      //Assigning the width to the variable w
      public void setWidth (double w)
      {
         width = w;
      }
      
      //The value gets returned
      public double getLength ()
      {
         return length;
      }
      
      //The value gets returned
      public double getWidth()
      {
         return width;
      }
     //The value gets returned
      public double getArea()
      {
         return length * width;
      }
      
      //The value gets returned
      public String toString()
      {
         String str = "Length:" + length + " Width:" + width  + " Area:" + getArea();
         return str;
      }
   
   
}