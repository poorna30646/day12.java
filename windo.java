import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fire{
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame1 = new JFrame("Button Window");
        frame1.setSize(200, 100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new FlowLayout());

        // Create a new button
        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new JFrame (window)
                JFrame frame2 = new JFrame("New Window");
                frame2.setSize(200, 100);
                frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame2.setLayout(new FlowLayout());

                // Add a label to the new window
                JLabel label = new JLabel("You clicked the button!");
                frame2.add(label);

                // Make the new window visible
                frame2.setVisible(true);
            }
        });

        // Add the button to the window
        frame1.add(button);

        // Make the window visible
        frame1.setVisible(true);
    }
}


