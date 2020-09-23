/* Group 2 (Amanda Jones, Marissa Hodges, Johnay Withers, Hadassah Smith)
   Lab Date: April 2, 2020
   Lab Time: 9:30 AM */

//Part A - Test Score Class

public class Group2_TestScore
{
   private String courseName; //Access specifier for courseName
   private double courseScore; //Access specifier for courseScore
   
   public Group2_TestScore()
   {
   courseName = null;
   courseScore = 0;
   }

   //Assigning the course name to the variable newName
   public void setCourseName (String newName)
   {
   courseName = newName;
   }
   
   //Assigning the course score to the variable newS
   public void setCourseScore (double newS)
   {
    courseScore = newS; 
   }
   
   //The value gets returned
   public String getCourseName()
   {
   return courseName;  
   }
   
   //The value gets returned
   public double getCourseScore ()
   {
    return courseScore;   
   }
   
}