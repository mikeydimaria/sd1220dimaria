/**
   * file: Lab3_51.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 3 
   * due date: February 21, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab3_51 abstract data type.
   */
public class Lab3_51 {

public static void main(String[] args) {


        // Creating variables to hold pos/neg/average/total
  int positive = 0;
  int negative = 0;
  int total = 0;
  double average = 0;
  System.out.print("Enter an integer, the input ends if it is 0: ");
  Scanner input = new Scanner(System.in);

  do (int buffer = -1; buffer != 0; ) {

  buffer = input.nextInt();
  }
    while (positive + negative == 0) {
    System.out.println("No numbers are entered except 0");
    System.exit(0);
    }
    average = total /(double)(positive + negative);
    System.out.println("The number of positives is " + positive);
    System.out.println("The number of negatives is " + negative);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
    }
}