package com.company;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,250,250);
        redpanel.setLayout(null);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250,0,250,250);
        bluepanel.setLayout(null);


        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(null);

        JLabel label = new JLabel("Hi!");
        ImageIcon icon = new ImageIcon("thumbsup.png");
        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.BOTTOM);
//        label.setHorizontalAlignment(JLabel.RIGHT);
       label.setBounds(100,100,95,95);


        frame.setSize(750,750);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        greenpanel.add(label);

    }

}
