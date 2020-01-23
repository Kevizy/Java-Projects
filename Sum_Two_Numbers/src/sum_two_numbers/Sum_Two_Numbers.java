package sum_two_numbers;

import javax.swing.JOptionPane; 

public class Sum_Two_Numbers {

    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Enter first number: "); 
        String sn = JOptionPane.showInputDialog("Enter second number: ");
        
        int num1 = Integer.parseInt(fn); 
        int num2 = Integer.parseInt(sn); 
        int sum = num1 + num2; 
        int product = num1 * num2; 
        
        JOptionPane.showMessageDialog(null, "The sum is: "+sum, "Sum of Two Numbers", JOptionPane.PLAIN_MESSAGE); 
        JOptionPane.showMessageDialog(null, "The product is: "+product, "Sum of Two Numbers", JOptionPane.PLAIN_MESSAGE); 
    }
    
}
