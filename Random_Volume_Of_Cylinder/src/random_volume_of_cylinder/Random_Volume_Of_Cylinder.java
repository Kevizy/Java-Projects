/*
 * Kevin Izykowski
 * Program Name: Random Volume of Cylinder
 * Description: Generates random numbers for radius and height and calculates the area and volume of a cylinder 
 */
package random_volume_of_cylinder;

import java.util.Random;

public class Random_Volume_Of_Cylinder {

    public static void main(String[] args) {
        // Generate Random object
        Random rand = new Random();
        
        // Declare values 
        int r; 
        int h; 
        double vol; 
        double area; 
        
        // Generates random number for radius and height 
        r = rand.nextInt(10) + 1;
        h = rand.nextInt(10) + 1; 
        
        // Calculates the area and volume of a cylinder 
        vol = Math.PI * Math.pow(r, 2) * h; 
        area = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
        
        // Displays the result
        System.out.println("Radius: " + r);
        System.out.println("Height: " + h);
        System.out.println("Volume: " + vol); 
        System.out.println("Area: " + area);
    }
    
}
