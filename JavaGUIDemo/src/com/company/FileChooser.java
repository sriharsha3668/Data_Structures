package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChooser {
    public static void main(String[] args) {
        Chooser chooser = new Chooser();
    }
}

class Chooser extends JFrame implements ActionListener {

    JButton button;
    Chooser(){
        button = new JButton();
        button.setText("Choose file!");
        button.addActionListener(this);
        button.setFocusable(false);


        this.add(button);

       this.setLayout(new FlowLayout());
       this.setVisible(true);
       this.pack();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:\\Users\\sriha\\Hello,World.java"));

//           int response = fileChooser.showOpenDialog(null);
           int response = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }


        }
    }
}
