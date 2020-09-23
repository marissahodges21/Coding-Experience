/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: March 31, 2020
Time: 9:30am
*/ 

import java.io.*;

public class EmployeeTest 
{
   public static void main(String args[]) 
   {
      /* Create two objects using constructor found in Employee.java */
      Employee empOne = new Employee("James Smith");
      Employee empTwo = new Employee("Mary Anne");

      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      empTwo.printEmployee();
   }
}