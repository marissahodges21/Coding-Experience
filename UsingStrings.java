/*
Name: Marissa Hodges
ID#: 00427139
Major: 5 year MBA
Date: April 14, 2020
Time: 9:30am
*/ 

public class UsingStrings
{  
   public static void main(String args[])
   {  
	   //creating a string by java string literal 
	   String str = "Beginnersbook"; 
   
	   char arrch[]={'h','e','l','l','o'}; 
	   //converting char array arrch[] to string str2
	   String str2 = new String(arrch); 
		
	   //creating another java string str3 by using new keyword 
	   String str3 = new String("Java String Example"); 
		
	   //Displaying all the three strings
	   System.out.println(str);  
	   System.out.println(str2);  
	   System.out.println(str3);  
   
      /******* Different methods used with Strings **********/
      
      //Display the full length of a string
      String str4 = "01234567";
      System.out.println( str4.length() ); // returns "8"
      
      //Display a particular character in string using its position
      str4 = "airplane";
      System.out.println( str4.charAt(2) ); // output is 'r' which is the 3rd position
   
      //joining two strings to create another
      str = "library";
      System.out.println( str + " card"); // output is "library card"
      
      str3 = "United";
      str3 += " States";  // change the value inside of str3 permanently
      System.out.println( str3 ); // output is "United States"
      
      // convert the cases of a string
      str = "A New Java Book";
      System.out.println( str.toLowerCase() ); // output is "a new java book"
      
      str4 = "A New Java Book";
      System.out.println(str4.toUpperCase() ); // output is"A NEW JAVA BOOK"
      
      // Find out if the string being looked for is the same as the String given
      str3 = "Exit"; 
      System.out.println( str3.equalsIgnoreCase("EXIT")); // is "true" 
      System.out.println( str3.equalsIgnoreCase("tixe")); // is "false"
      System.out.println( str3.equalsIgnoreCase("exit")); // is "true" 
      
      //Display only a part of the string
      str3 = "0123456789"; // the value of each char is the same as its index!
      System.out.println( str3.charAt(5) ); // output is "5"
      System.out.println( str3.substring(5) ); // output is "56789"
      System.out.println( str3.substring(5, 8)); // output is "567"
      
      // find if the string contains a substring that is asked for
      str = "Java is a programming language";
      System.out.println(str.contains("Amit")); // This will print false
      System.out.println(str.contains("Java")); // This will print true
      
      // Display a string that has all spaces before and after it removed
      str3 = " hi ";
      System.out.println( str3 + "x" ); // result is" hi x"
      System.out.println(str3.trim() + "x"); // result is "hix"
            
      //Replace a string with another string
      str4 = "oxoxoxox";
      System.out.println( str4.replace('x', 'X') ); // output is  "oXoXoXoX"
      
      // Formatting a string
      double floatVar = 34.68;
      int intVar = 23;
      System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", floatVar, intVar, str);
      System.out.println(); 
                 
      // formatting the float to 2 decimal places            
      System.out.printf("The value of the float variable is " +
                  "%.2f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", floatVar, intVar, str);

      
      System.out.println();
      System.out.println();        
      String fs;
      fs = String.format("The value of the float variable is " +
                   "%.2f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", floatVar, intVar, str);
      System.out.println(fs);
   }
}