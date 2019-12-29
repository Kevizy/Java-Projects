/*
 * This program will ask a user to enter a number and check if even or odd 
 */
package check.pkgif.even.or.odd;

import java.util.Scanner;

public class CheckIfEvenOrOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
       // Declare variable 
       int temp; 
       
       // Ask user to enter a number 
       System.out.print("Enter number to check if even or odd: ");
       temp = scan.nextInt(); 
       
       // Check if even or odd 
       if (temp % 2 == 0) {
           System.out.println("The number is even."); 
       } else {
           System.out.println("The number is odd.");
       }
        
        
    }
    
}
