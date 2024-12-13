import javax.swing.*;
import java.awt.*;
class fire {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Button Window");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        
        JButton button = new JButton("Click Me!");

        
        frame.add(button);

        
        frame.setVisible(true);
    }
}

