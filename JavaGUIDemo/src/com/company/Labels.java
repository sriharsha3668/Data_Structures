package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Bro Do you even code?");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        ImageIcon imageIcon = new ImageIcon("doyouevencode.jpeg");
        label.setIcon(imageIcon);
        ImageIcon imageIcon1 = new ImageIcon("thunder.jpeg");
        frame.setIconImage(imageIcon1.getImage());
        frame.setTitle("Do you Even Code?");

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FFFF));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(0);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,350,350);




//        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
    }
}
