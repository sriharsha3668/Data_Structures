package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow {
    public static void main(String[] args) {
        LaunchPage obj = new LaunchPage();


    }
}

class LaunchPage extends JFrame implements ActionListener {
    JButton button = new JButton();

    public LaunchPage(){
        button.setText("New Window");
        button.setBounds(100,160,200,40);
        button.setBackground(Color.gray);
        button.setFocusable(false);
        button.addActionListener(this);

       add(button);
       setTitle("New Window");

       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(420,420);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            new MyFrame();
            dispose();

        }
    }
}
