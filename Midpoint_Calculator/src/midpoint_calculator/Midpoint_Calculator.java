/*
 * This program uses the midpoint formula to display the distance between 
 */
package midpoint_calculator;

import java.util.Scanner;

public class Midpoint_Calculator {

    public static void main(String[] args) {
        // Receives keyboard input
        Scanner scan = new Scanner(System.in); 
        
        // Asks user for x1 and y1
        System.out.println("Enter x1 and y1: ");
        double x1 = scan.nextDouble(); 
        double y1 = scan.nextDouble(); 
        
        // Asks user for x2 and y2
        System.out.println("Enter x2 and y2: ");
        double x2 = scan.nextDouble(); 
        double y2 = scan.nextDouble();
        
        // retrieves the result from method 
        double finalResult = Distance(x1, x2, y1, y2);
        
        // displays the result 
        System.out.println("Distance between coordinates: " + finalResult);
    }
    
    // Method to calculate the distance of coordinates 
    private static double Distance(double x1, double x2, double y1, double y2) {
        double temp1 = Math.pow((x2 - x1), 2);
        double temp2 = Math.pow((y2 - y1), 2);
        double result = Math.sqrt(temp1 + temp2); 
        
        return result; 
    }
}
