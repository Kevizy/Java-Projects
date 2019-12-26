/*
 * This program will count the amount of quarters, nickels, and dimes and display the amount in a dollar format 
 */
package count_the_coins;

import java.util.Scanner;

public class Count_The_Coins {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Declare variables 
        int quarters; 
        int dimes; 
        int nickels; 
        int pennies; 
        
        double dollars; 
        
        // Ask for user input 
        System.out.print("Enter Quarters: ");
        quarters = scan.nextInt(); 
        
        System.out.print("Enter Dimes: ");
        dimes = scan.nextInt(); 
        
        System.out.print("Enter Nickels: ");
        nickels = scan.nextInt(); 
        
        System.out.print("Enter pennies: ");
        pennies = scan.nextInt(); 
        
        // Converts amount of coins entered 
        dollars = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) * (0.01 * pennies);
        
        // Displays the amount 
        System.out.println(); 
        System.out.print("The total in dollars is $"); 
        System.out.printf("%1.2f", dollars); 
        System.out.println(); 
        
    }
    
}
