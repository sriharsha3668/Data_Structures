package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class Frames {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();

        frame.setResizable(true);
        frame.setTitle("Welcome to my Interface");
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        ImageIcon imageIcon = new ImageIcon("thunder.jpeg");
        frame.setIconImage(imageIcon.getImage());
        frame.getContentPane().setBackground(new Color(160,145,100)); //method chaining


    }
}
