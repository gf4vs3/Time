//import the following class

import java.util.Scanner;

//define class

public class TimeConversion  

{

 //define main function

 public static void main(String[] args)  

 {

   //create the object of the scanner class

   Scanner s = new Scanner(System.in);

   //print message

   System.out.println("Enter the minutes: ");

   //get input in the variable

   int t=s.nextInt();

   //initialize in the variable

   int hr=t/60;

   //initialize in the variable    

   int min=t%60;

   //declare the string type variable

   String result;

   //initialize in the variable

   result=""+hr;

   //check that the variable is less than 10

   if(min<10)

     //then, initialize this

     result=result +":0"+min;

   //otherwise

   else

     //initialize this

     result=result +":"+min;

   //print the result

   System.out.println(result);

 }

}