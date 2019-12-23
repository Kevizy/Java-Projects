
package mad_libs;

import static java.lang.System.in;
import java.util.Scanner;

public class Mad_Libs {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       
       System.out.println("Please enter a time of day (morning, afternoon, or night): "); 
       String timeDay = scan.nextLine();
       
       System.out.println("Please enter a cold place: ");
       String place = scan.nextLine(); 
       
       System.out.println("Please enter light or dark: ");
       String lightDark = scan.nextLine(); 
       
       System.out.println("Please enter light or heavy: ");
       String lightHeavy = scan.nextLine(); 
       
       System.out.println("Please enter a warm place: "); 
       String warmPlace = scan.nextLine(); 
       
       System.out.println("\nIt was a cold and freezing " + timeDay + "."); 
       System.out.println("Out here in " + place + ".");
       System.out.println("The " + lightDark + " clouds formed in the sky."); 
       System.out.println("And " + lightHeavy + " snow started to fall.");
       System.out.println("It is time fo me to take a vacation at/in " + warmPlace + "."); 
    }

    
}
