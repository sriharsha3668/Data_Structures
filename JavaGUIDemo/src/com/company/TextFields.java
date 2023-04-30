package com.company;

import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFields {
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}

class Frame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    public Frame(){
        textField = new JTextField();
        textField.setText("UserName");
        textField.setPreferredSize(new Dimension(170,40));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.YELLOW);
        textField.setFont(new Font("MV Boli",Font.PLAIN,35));
        button = new JButton();
        button.setText("Submit");
        button.setBounds(10,10,50,50);
        button.addActionListener(this);


        add(button);
        add(textField);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Hello " + textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }

    }
}
