package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    public static void main(String[] args) {
        new MyFrame();

    }
}

class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    public MyFrame()
    {

        label = new JLabel();
        ImageIcon icon1 = new ImageIcon("face.png");
        label.setIcon(icon1);
        label.setBounds(250,250,800,650);
        label.setVisible(false);

        button = new JButton();
        ImageIcon icon = new ImageIcon("point.png");
        button.setIcon(icon);

        button.setText("Click Me!");
        button.setBounds(50,50,350,200);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setBackground(Color.LIGHT_GRAY);
        button.setFont(new Font("MV Boli",Font.BOLD,25));
        button.setForeground(Color.CYAN);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);


        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(button);
        add(label);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button)
        {
//            System.out.println("poo");
//            button.setEnabled(false);
            label.setVisible(true);

        }
    }
}

