package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistener {
    public static void main(String[] args) {
        MyKey key = new MyKey();
    }
}

class MyKey extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon Icon;
    MyKey(){

        label = new JLabel();
        Icon = new ImageIcon("rocket.png");

        this.getContentPane().setBackground(Color.black);
        label.setBounds(0,0,65,65);

        label.setIcon(Icon);
        label.setOpaque(true);





        this.addKeyListener(this);

        this.add(label);

        this.setSize(420,420);
        this.setLayout(null);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void keyTyped(KeyEvent e){

        switch (e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 'd':
                label.setLocation(label.getX()+10,label.getY());
                break;
            case 's':
                label.setLocation(label.getX(),label.getY()+10);

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39:
                label.setLocation(label.getX()+10,label.getY());
                break;
            case 40:
                label.setLocation(label.getX(),label.getY()+10);

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("KeyChar released is: " + e.getKeyChar());
        System.out.println("KeyCode released is: " + e.getKeyCode());


    }
}