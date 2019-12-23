/*
 * Kevin Izykowski
 * Program name: Comparing Numbers
 * Description: Asks user to enter two numbers and checks the largest or smallest one
 */
package comparing_numbers;

import java.util.Scanner;

public class Comparing_Numbers {

    public static void main(String[] args) {
        // Create new scanner object for keyboard input 
        Scanner scan = new Scanner(System.in); 
        
        // Declare variables 
        int numberOne; 
        int numberTwo; 
        
        // Asks user to input numbers 
        System.out.print("Enter the first number: "); 
        numberOne = scan.nextInt(); 
        
        System.out.print("Enter the second number: "); 
        numberTwo = scan.nextInt(); 
        
        // Checks numbers and prints the result
        if (numberOne > numberTwo) {
            System.out.println(numberOne + " is the largest."); 
        }
        if (numberOne < numberTwo) {
            System.out.println(numberTwo + " is the largest.");
        }
        if (numberOne == numberTwo) {
            System.out.println("The numbers are equal.");
        }
    }
    
}
