package task1;
/**********************************************
Workshop #10
Course: JAC444 - Summer 2020
Last Name: Daryan 
First Name: Chan
ID: 113973192
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 8/12/2020
**********************************************/

import java.util.Scanner;

public class TestingTime{
	
   public static void main(String args[]) {
	   
       Scanner input = new Scanner(System.in);
       int hours; 
       int minutes; 
       int seconds;
       long elapsedT;
       
       System.out.print("Enter time1 (hour, minute, and second): ");
       hours = input.nextInt();
       minutes = input.nextInt();
       seconds = input.nextInt();
       Time Time1 = new Time(hours, minutes, seconds);
       System.out.println(Time1);
       System.out.println("Elapsed seconds in time1: " + Time1.getSeconds());
       
       System.out.print("Enter time2 (elapsed time in seconds): ");
       elapsedT = input.nextLong();
       Time Time2 = new Time(elapsedT);
       System.out.println(Time1);
       System.out.println("Elapsed seconds in time2: " + Time2.getSeconds());

       System.out.println("time1.compareTo(time2)? " + Time1.compareTo(Time2));
       Time Time3 = Time1.clone();
       System.out.println("time3 created as a clone of time1 time1.compareTo(time3)? " + Time1.compareTo(Time3));
   }
   
}
