package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxes {
    public static void main(String[] args) {
        MyBoxes box = new MyBoxes();
    }
}

class MyBoxes extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyBoxes(){

        String[] animals = {"Cat","Dog","tiger"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
//        comboBox.setEditable(true);
//        comboBox.insertItemAt("Horse",3);
//        comboBox.addItem("Lion");
//        comboBox.removeItem("Cat");
//        comboBox.removeItemAt(2);
//        comboBox.setSelectedItem("Dog");
//        comboBox.setSelectedIndex(2);
//        comboBox.removeAllItems();
        System.out.println(comboBox.getItemCount());


        this.add(comboBox);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem() + " " + comboBox.getSelectedIndex());
        }
    }
}
