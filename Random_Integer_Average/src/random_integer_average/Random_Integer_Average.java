/*
 * This program will generate three random integers and calculate the average 
 */
package random_integer_average;

import java.text.DecimalFormat;
import java.util.Random;


public class Random_Integer_Average {

    public static void main(String[] args) {
        DecimalFormat decimalOne = new DecimalFormat("0.0#"); 
        
        // Declare variables 
        int num1, num2, num3; 
        int sum, average; 
        
        // Create new random object 
        Random rand = new Random(); 
        
        // Generate random integers from 0 to 50 
        num1 = rand.nextInt(51); 
        num2 = rand.nextInt(51); 
        num3 = rand.nextInt(51); 
        
        // Calculates the sum and average 
        sum = num1 + num2 + num3; 
        average = sum / 3; 
        
        // Displays the average and sum 
        System.out.println("The random numbers are: " + num1 + " " +  num2 + " " + num3);
        System.out.println("The sum is: " + sum); 
        System.out.println("The average is: " + decimalOne.format(average));
    }
    
}
