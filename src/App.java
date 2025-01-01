import java.awt.Button;
import java.awt.Frame;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
        
        
        
        Frame f = new Frame();

        // Button 1 created
        // OK button
        Button b1 = new Button("Ege DOMBAYCI");
        b1.setBounds(100, 50, 300, 100);
        f.add(b1);

        // Button 2 created
        // Submit button
        Button b2 = new Button("233 405 102");
        b2.setBounds(100, 150, 300, 100);
        f.add(b2);
      
        // Button 3 created
        // Cancel button
        Button b3 = new Button("Flappy Bird Oyun Projesi");
        b3.setBounds(100, 250, 300, 100);
        f.add(b3);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        
        
        
        
    }
}

