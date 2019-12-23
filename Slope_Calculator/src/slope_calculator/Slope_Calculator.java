/*
 * This program calculates the slope 
 */
package slope_calculator;

import java.util.Scanner;

public class Slope_Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        // Asks user to input x1 and y1
        System.out.println("Enter x1: "); 
        double x1 = scan.nextDouble(); 
        
        System.out.println("Enter y1: "); 
        double y1 = scan.nextDouble(); 
        
        // Asks user to input x2 and y2
        System.out.println("Enter x2: ");
        double x2 = scan.nextDouble(); 
        
        System.out.println("Enter y2: ");
        double y2 = scan.nextDouble(); 
        
        // Receives the result from the slope method 
        double finalResult = Slope(x1, x2, y1, y2);
        
        // Displays the result 
        System.out.println("The slope is: " + finalResult);
        
        // Checks if slope is positive, negative, no slope or undefined 
        if (finalResult > 0) {
            System.out.println("The slope is positive.");
        } else if (finalResult < 0 ) {
            System.out.println("The slope is negative.");
        } else if (finalResult == 0) {
            System.out.println("There is no slope.");
        } else {
            System.out.println("Undefined slope.");
        }
         
    }
    
    // Method to calculate all points 
    private static double Slope(double x1, double x2, double y1, double y2) {
        double rise = y2 - y1;
        double run = x2 - x1; 
        double result = rise / run; 
        
        return result; 
    }
    
}
