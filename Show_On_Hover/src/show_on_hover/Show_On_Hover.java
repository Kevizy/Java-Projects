
package show_on_hover;

import javax.swing.JFrame;

public class Show_On_Hover {

    public static void main(String[] args) {
        HoverInfo msg = new HoverInfo(); 
        
        // Closes when x is pressed 
        msg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // Sets the size 
        msg.setSize(275,180);
        
        // So the viewer can see it 
        msg.setVisible(true);
        
    }
    
}
