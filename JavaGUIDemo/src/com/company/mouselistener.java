package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouselistener {
    public static void main(String[] args) {
        Mymouse mouse = new Mymouse();
    }
}
class Mymouse extends JFrame  implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon pain;
    ImageIcon dizzy;
    ImageIcon nervous;
    Mymouse(){

        label = new JLabel();

        label.setBounds(0,0,100,100);
        smile = new ImageIcon("smile.png");
        pain = new ImageIcon("pain.png");
        dizzy = new ImageIcon("dizzy.png");
        nervous = new ImageIcon("nervous.png");
        label.setIcon(smile);

        label.addMouseListener(this);

        this.add(label);

        this.setLayout(new FlowLayout());
        this.setSize(400,400);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You've Clicked the Mouse");
        label.setIcon(smile);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You've Pressed the Mouse");
        label.setIcon(nervous);

    } 

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You've Released the Mouse");
        label.setIcon(dizzy);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You've Entered the Mouse");
        label.setIcon(pain);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You've Exited the Mouse");
        label.setIcon(smile);

    }
}
