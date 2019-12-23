/*
 * Displays a square of characters
 */
package square_of_asterisks;

import java.util.Scanner;

public class Square_Of_Asterisks {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       
       int side = 0; 
       char character = ' '; 
       
       do {
        System.out.println("Enter number of sides: ");
        side = scan.nextInt(); 
        if (side > 0) {
            System.out.println("Enter character: ");
            character = scan.next().charAt(0);
            SquareOfAsterisk(side, character);
        }
       } while (side > 0);
       
       
    } // End main 
    
    public static void SquareOfAsterisk(int side, char character) {
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) {
                System.out.print(character);
            }
            System.out.println();
        }
    } // End method 
}
