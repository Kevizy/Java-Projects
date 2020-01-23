
package show_on_hover;

import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 

public class HoverInfo extends JFrame {
    private JLabel item1; 
    
    public HoverInfo() {
        super("Shows on hover"); 
        setLayout(new FlowLayout()); 
        
        item1 = new JLabel("This is a sentence"); 
        item1.setToolTipText("This will show up on hover");
        add(item1);
    }
}
