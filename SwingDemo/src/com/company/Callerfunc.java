package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Callerfunc {
    public static void main(String[] args) {
        Harsha obj = new Harsha();
    }
}

class Harsha extends JFrame implements ActionListener{
    JProgressBar p;
    int i = 0;
    public Harsha()
    {
        JButton b = new JButton("ADD Form");
        p = new JProgressBar(0,20);
        Timer t = new Timer(250,this);
        add(b);
        add(p);
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
            new AddSub();
            dispose();
        }
        i++;
        p.setValue(i);


    }
}
