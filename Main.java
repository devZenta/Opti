import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Interface with Start Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create the button
        JButton startButton = new JButton("Start");

        // Add action listener to the button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start button clicked!");
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(startButton);

        // Set the frame visibility
        frame.setVisible(true);
    }
}