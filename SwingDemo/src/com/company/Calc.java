package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    public static void main(String[] args) {
        AddSub obj = new AddSub();
    }


}

class AddSub extends JFrame implements ActionListener {

    JTextField t1,t2;
    JLabel l;
    JButton b1,b2;
    public AddSub()
    {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("OK");
        b2 = new JButton("SUB");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value = 0;
        if(ae.getSource() == b1)
        {
             value = num1+num2;
        }
        else
            value = num1-num2;
        l.setText(value + " ");


    }
}