package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Caller {
    public static void main(String[] args) {
        X obj = new X();
    }
}

class X extends JFrame implements ActionListener{
    JProgressBar p;
    int i;
    public X(){
        JButton b = new JButton("ADD Form");
        p = new JProgressBar(0,20);
        add(b);
        add(p);
       Timer t = new Timer(250, this);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.start();

            }
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(i == 20)
        {
            new Addition();
            dispose();
        }
        i++;
        p.setValue(i);


    }
}
