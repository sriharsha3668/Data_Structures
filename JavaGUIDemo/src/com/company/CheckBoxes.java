package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxes {
    public static void main(String[] args) {
        Mywish wish = new Mywish();

    }
}

class Mywish extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JButton button;
    ImageIcon Xicon;
    ImageIcon Checkicon;

    Mywish(){
        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));

        button = new JButton();
        button.setText("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        Xicon = new ImageIcon("X.png");
        Checkicon = new ImageIcon("Checkmark.png");

        checkBox.setIcon(Xicon);
        checkBox.setSelectedIcon(Checkicon);



        this.add(button);
        this.add(checkBox);
        this.setLayout(new FlowLayout());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }

    }
}
