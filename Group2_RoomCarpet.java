/* Group 2 (Amanda Jones, Marissa Hodges, Johnay Withers, Hadassah Smith)
   Lab Date: April 2, 2020
   Lab Time: 9:30 AM */

import java.text.DecimalFormat; //Needed for the cost to be in the right format

public class Group2_RoomCarpet
{
   private Group2_RoomDimension size; //Access specifier for size
   private double carpetCost; //Access specifier for cost
   
   
      public Group2_RoomCarpet(Group2_RoomDimension dim, double cost)
      {
         size = dim; //Entire room dimension
         carpetCost = cost;
         
      }
      
      //Constructors
      public double getTotalCost()
      {
         return size.getArea() * carpetCost;
      }
      
      //Print out of the dimensions and cost
      public String toString()
      {
         DecimalFormat dollar = new DecimalFormat("#,###,##0.00");
         
         String str = "Room dimension: \n" + size + "\nCarpet cost: $" + dollar.format(getTotalCost());
         
         return str;
      }
      
   
}