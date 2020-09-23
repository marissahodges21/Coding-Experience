/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 21, 2020
Time: 9:30am
*/ 

import java.util.Scanner;//Needed for the scanner class

public class HodgesM_Lab5 
{ 
   public static void main(String args[])
   {  
      //Create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //User enters customer's data
      System.out.println("Enter the Customer's Name: ");
      String uName = keyboard.nextLine();
      
      System.out.println("Enter the Customer's Address: ");
      String uAddress = keyboard.nextLine();
      
      System.out.println("Enter the Customer's Phone: ");
      String uPhone = keyboard.nextLine();
      
      //User enters car data
      System.out.println("Enter the Car Make: ");
      String uMake = keyboard.nextLine();
      
      System.out.println("Enter the Car Model: ");
      String uModel = keyboard.nextLine();
 
      System.out.println("Enter the Car Year: ");
      int uYear = keyboard.nextInt();
      
      //User enters service quote data
      System.out.println("Enter the Parts Charges: ");
      double uPartsCharges = keyboard.nextDouble();
      
      System.out.println("Enter the Labor Charges: ");
      double uLaborCharges = keyboard.nextDouble();
      System.out.println();
      
      //Service estimate printed 
      System.out.println("Joe's Automotive Shop");
      System.out.println("Service Estimate");
      System.out.println();
      
      //Object
      HM_Customer customer = new HM_Customer();
      
      //Used to help print estimate 
      customer.setName(uName);
      customer.setAddress(uAddress);
      customer.setPhone(uPhone);
      
      System.out.println("Customer Name " + customer.getName() + " ");
      System.out.println("Customer Address " + customer.getAddress() + " ");
      System.out.println("Customer Phone " + customer.getPhone() + " ");
      System.out.println();

      //Object
      HM_Car car = new HM_Car();
      
      //Used to help print estimate
      car.setMake(uMake);
      car.setModel(uModel);
      car.setYear(uYear);
      
      System.out.println("Car Make " + car.getMake() + " ");
      System.out.println("Car Model " + car.getModel() + " ");
      System.out.println("Car Year " + car.getYear() + " ");
      System.out.println();
      
      //Object
      HM_ServiceQuote quote = new HM_ServiceQuote();
      
      //Used to help print estimate
      quote.setPartsCharges(uPartsCharges);
      quote.setLaborCharges(uLaborCharges);
      
      System.out.println("Parts Charges " + quote.getPartsCharges() + " ");
      System.out.println("Labor Charges " + quote.getLaborCharges() + " ");
      System.out.println("Sales tax " + quote.getSalesTax() + " ");
      System.out.println("Total Charges " + quote.getTotalCharges() + " ");
      System.out.println();
      
      System.out.println("Lab 5 Program was created by Marissa Hodges, 00427139, April 21,2020.");
      System.out.println();
   }
      
}


      
  

  
