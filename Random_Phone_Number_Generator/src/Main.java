// This program generates a random phone number from 0-9 using the (000)-000-0000 format 

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// declare new random object
		Random rand = new Random(); 

		// create variables and generate random numbers
		char dash = '-'; 
		int firstDigit = rand.nextInt(10); 
		int secondDigit = rand.nextInt(10); 
		int thirdDigit = rand.nextInt(10); 
		int fourthDigit = rand.nextInt(10); 
		int fifthDigit = rand.nextInt(10); 
		int sixthDigit = rand.nextInt(10); 
		int seventhDigit = rand.nextInt(10); 
		int eighthDigit = rand.nextInt(10); 
		int ninthDigit = rand.nextInt(10); 
		int tenthDigit = rand.nextInt(10); 

		// Displays the random phone number to console 
		System.out.println("Phone Number: ");
		// Area code
		System.out.print("(");
		System.out.print(firstDigit);
		System.out.print(secondDigit);
		System.out.print(thirdDigit);
		System.out.print(")");
		// End of area code
		
		System.out.print(dash);
		System.out.print(fourthDigit);
		System.out.print(fifthDigit);
		System.out.print(sixthDigit);
		System.out.print(dash);
		System.out.print(seventhDigit);
		System.out.print(eighthDigit);
		System.out.print(ninthDigit);
		System.out.print(tenthDigit);

	}

}
