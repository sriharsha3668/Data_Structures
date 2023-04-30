package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CheckerBoard extends JFrame

{
    JFrame frame=new JFrame();
    public CheckerBoard()
    {
        frame.setSize(500, 500);
        frame.setTitle("Original Checker Box");
//MessageLabel=new JLabel("Press button to add colors.");
        frame.setLayout(new GridLayout(8, 8));
        for (int i=0; i<8; i++)
        {
            for (int j=0; j<8; j++)
            {
                switch ((i+j)%2)
                {
                    case 0:
                        addButton("white");
                        break;
                    case 1:
                        addButton("black");
                        break;
                    default:
                        break;
                }
            }
        }
    }

// addButton() is used to customize what the ActionListener object
    private void addButton(String color)
    {
        JButton button=new JButton();
        switch (color)
        {
            case "white":
                button.setBackground(Color.WHITE);
                break;
            case "black":
                button.setBackground(Color.BLACK);
                break;
            default:
                break;
        }
        button.setOpaque(true);
        button.setBorderPainted(false);
        Command listener=new Command(color);
        button.addActionListener(listener);
        frame.add(button);
    }
//The Command object has its constructor read in that color and display it verbatim at the command line.
    private class Command implements ActionListener
    {
        private String color;
        public Command(String c)
        {
            color=c;
        }
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Pressed "+ color + " button.");
        }
    }
    public void run()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        CheckerBoard box=new CheckerBoard();
        box.run();
    }

}
