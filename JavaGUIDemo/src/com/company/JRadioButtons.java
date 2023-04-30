package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtons {
    public static void main(String[] args) {
        MyOrder order = new MyOrder();
    }
}

class MyOrder extends JFrame implements ActionListener {
    JRadioButton pizzabutton;
    JRadioButton hamburgerbutton;
    JRadioButton hotdogbutton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;


    MyOrder(){

        pizzabutton = new JRadioButton("Pizza");
        pizzabutton.setFocusable(false);
        hamburgerbutton = new JRadioButton("Hamburger");
        hamburgerbutton.setFocusable(false);
        hotdogbutton = new JRadioButton("Hotdog");
        hotdogbutton.setFocusable(false);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzabutton);
        group.add(hamburgerbutton);
        group.add(hotdogbutton);

        pizzabutton.addActionListener(this);
        hamburgerbutton.addActionListener(this);
        hotdogbutton.addActionListener(this);

        pizzaIcon = new ImageIcon("Pizza.png");
        pizzabutton.setIcon(pizzaIcon);
        hamburgerIcon = new ImageIcon("Hamburger.png");
        hamburgerbutton.setIcon(hamburgerIcon);
        hotdogIcon = new ImageIcon("Hotdog.png");
        hotdogbutton.setIcon(hotdogIcon);




        this.add(pizzabutton);
        this.add(hamburgerbutton);
        this.add(hotdogbutton);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
        this.setTitle("Welcome to our Restaurant!!");
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == pizzabutton){
            System.out.println("You've Ordered Pizza!");
        }
        else if(e.getSource() == hamburgerbutton){
            System.out.println("You've Ordered Hamburger!");
        }
        else if (e.getSource() == hotdogbutton){
            System.out.println("You've Ordered HotDog!");
        }
    }
}