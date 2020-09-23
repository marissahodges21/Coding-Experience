/* Group 2 (Amanda Jones, Marissa Hodges, Johnay Withers, Hadassah Smith)
   Lab Date: April 2, 2020
   Lab Time: 9:30 AM */

//Part B - Driver Program 

import java.util.Scanner; //Needed for the scanner class
import java.io.*; //Needed for inputs and outputs

public class Group2_Lab2
{
   public static void main (String [] args)
   {
      //Creat a scanner object for keyboard input
      Scanner keyboard= new Scanner(System.in);
 
      //User enters first course data (course name and score)
      System.out.println("Enter your course name and its score (between 0 and 4.0)");
      String mathname= keyboard.nextLine();
      double mathscore=keyboard.nextDouble();
      keyboard.nextLine();
      
      //User enters second course data
      System.out.println("Enter your course name and its score (between 0 and 4.0)");
      String historyname= keyboard.nextLine();
      double historyscore=keyboard.nextDouble();
      keyboard.nextLine();
      
      //User enters third course data
      System.out.println("Enter your course name and its score (between 0 and 4.0)");
      String programmingname= keyboard.nextLine();
      double programmingscore=keyboard.nextDouble();
      keyboard.nextLine();
      
      //User enters fourth course data 
      System.out.println("Enter your course name and its score (between 0 and 4.0)");
      String physicsname= keyboard.nextLine();
      double physicsscore=keyboard.nextDouble();
      keyboard.nextLine();
   
      //User enters fifth course data
      System.out.println("Enter your course name and its score (between 0 and 4.0)");
      String chemname= keyboard.nextLine();
      double chemscore=keyboard.nextDouble();
   
      //Constructors
      Group2_TestScore math = new Group2_TestScore();
      Group2_TestScore history = new Group2_TestScore();
      Group2_TestScore programming = new Group2_TestScore();   
      Group2_TestScore physics = new Group2_TestScore();
      Group2_TestScore chem = new Group2_TestScore();

      
      math.setCourseName(mathname);
      math.setCourseScore(mathscore);  
     
      history.setCourseName(historyname);
      history.setCourseScore(historyscore);
      
      programming.setCourseName(programmingname);
      programming.setCourseScore(programmingscore);
      
      physics.setCourseName(physicsname);
      physics.setCourseScore(physicsscore);
      
      chem.setCourseName(chemname);
      chem.setCourseScore(chemscore);
      
      //Allows the program to print out the course name and score entered by the user
      System.out.println(math.getCourseName() + " " + math.getCourseScore());
   
      System.out.println(history.getCourseName() + " " + history.getCourseScore());
     
      System.out.println(programming.getCourseName() + " " + programming.getCourseScore());
       
      System.out.println(physics.getCourseName() + " " + physics.getCourseScore());
         
      System.out.println(chem.getCourseName() + " " + chem.getCourseScore());
           
           
       // Graded total and average for the semester of the user
       double total, average;
       total= math.getCourseScore() + history.getCourseScore() + programming.getCourseScore() + physics.getCourseScore() + chem.getCourseScore();

       average = total/5.0; 
       System.out.println("The student's average for the current semester is " + average);
           
   }
}