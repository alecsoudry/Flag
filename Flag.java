/* Author: Alec Soudry
 * Date: 4/25/22
 * The primary purpose of this file is to create the Ukrainian flag through the usage of panels and buttons. This is done through the creation of the
 * "Flag" class and subsequent blue and yellow panels being declared. Following this we specify the grid dimensions, and assign colors to both the 
 * panels and their corresponding buttons. Then initializing the button for making the whole window gray as well as adding in the listener. Finally
 * creating the action method with an if/else sequence to set the background to the color of the button clicked.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Flag extends JFrame implements ActionListener {
	
      public static final int WIDTH = 300;
      
      public static final int HEIGHT = 200;
      
      private JPanel bluePanel;  
      
      private JPanel yellowPanel;
      
      public static void main(String[] args) {
    	  
    	  Flag gui = new Flag();
    	  
          gui.setVisible(true);
      }
      public Flag() {
    	  
            super("Panel Demonstration");
            
            setSize(WIDTH, HEIGHT);
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            setLayout(new BorderLayout());
            
            JPanel biggerPanel = new JPanel();
            
            biggerPanel.setLayout(new GridLayout(2, 1));
            
            bluePanel = new JPanel();
            
            bluePanel.setBackground(Color.LIGHT_GRAY);

            biggerPanel.add(bluePanel);
            
            yellowPanel = new JPanel();

            yellowPanel.setBackground(Color.LIGHT_GRAY);

            biggerPanel.add(yellowPanel);

            add(biggerPanel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel();

            buttonPanel.setBackground(Color.LIGHT_GRAY);

            buttonPanel.setLayout(new FlowLayout());

            JButton yellowButton = new JButton("Yellow");

            yellowButton.setBackground(Color.YELLOW);

            yellowButton.addActionListener(this);

            buttonPanel.add(yellowButton);

            JButton blueButton = new JButton("Blue");

            blueButton.setBackground(Color.BLUE);

            blueButton.addActionListener(this);

            buttonPanel.add(blueButton);

            JButton grayButton = new JButton("Gray");

            grayButton.setBackground(Color.GRAY);

            grayButton.addActionListener(this);

            buttonPanel.add(grayButton);

            add(buttonPanel, BorderLayout.SOUTH);
      }
      public void actionPerformed(ActionEvent e) {

            String buttonString = e.getActionCommand();

            if (buttonString.equals("Blue"))

                bluePanel.setBackground(Color.BLUE);

            else if (buttonString.equals("Yellow"))

            yellowPanel.setBackground(Color.YELLOW);

            else if (buttonString.equals("Gray")) {

                  yellowPanel.setBackground(Color.LIGHT_GRAY);

                  bluePanel.setBackground(Color.LIGHT_GRAY);
            }
            else
                  System.out.println("Error");
      }
}


