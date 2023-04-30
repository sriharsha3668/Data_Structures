package com.company;

import javax.swing.*;
import java.awt.*;

public class Hello {
   public Hello(){

       JFrame frame = new JFrame();
       JLabel label = new JLabel();
       label.setText("Hello");
       label.setBounds(100,100,150,150);
       label.setFont(new Font("MV Boli",Font.BOLD,25));
       frame.setLayout(null);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,420);
       frame.add(label);

   }
}
