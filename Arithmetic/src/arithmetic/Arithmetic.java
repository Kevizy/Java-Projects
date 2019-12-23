/*
 * Kevin Izykowski
 * Program name: Arithmetic
 * Description: This program calculates the sum, product, difference, and quotient of two numbers entered by user.
 */
package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       
       int numberOne; 
       int numberTwo; 
       System.out.print("Please enter the first number: ");
       numberOne = scan.nextInt(); 
       
       System.out.print("Please enter the second number: ");
       numberTwo = scan.nextInt(); 
       
       int sum = numberOne + numberTwo;
       int dif = numberOne - numberTwo; 
       int prod = numberOne * numberTwo; 
       int quot = numberOne / numberTwo; 
       
       System.out.println(); 
       System.out.println("The sum of those numbers are: " + sum); 
       System.out.println("The difference of those numbers are: " + dif); 
       System.out.println("The product of those numbers are: " + prod); 
       System.out.println("The quotient of those numbers are: " + quot);
    }
    
}
