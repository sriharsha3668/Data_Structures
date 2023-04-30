package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class menubars {
    public static void main(String[] args) {
        Mybars bars = new Mybars();

    }
}

class Mybars extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;
    JMenuItem loaditem;
    JMenuItem saveitem;
    JMenuItem exititem;

    ImageIcon loadicon;
    ImageIcon saveicon;
    ImageIcon exiticon;

    Mybars(){
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        helpmenu = new JMenu("Help");
        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(helpmenu);


        loaditem = new JMenuItem("Load");
        saveitem = new JMenuItem("Save");
        exititem = new JMenuItem("Exit");
        loaditem.addActionListener(this);
        saveitem.addActionListener(this);
        exititem.addActionListener(this);

        filemenu.add(loaditem);
        filemenu.add(saveitem);
        filemenu.add(exititem);

        loadicon = new ImageIcon("file.png");
        saveicon = new ImageIcon("save.png");
        exiticon = new ImageIcon("exit.png");

        loaditem.setIcon(loadicon);
        saveitem.setIcon(saveicon);
        exititem.setIcon(exiticon);


        filemenu.setMnemonic(KeyEvent.VK_F);
        editmenu.setMnemonic(KeyEvent.VK_E);
        helpmenu.setMnemonic(KeyEvent.VK_H);


        loaditem.setMnemonic(KeyEvent.VK_L);
        saveitem.setMnemonic(KeyEvent.VK_S);
        exititem.setMnemonic(KeyEvent.VK_E);




      this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loaditem){
            System.out.println("File has been Loaded!!");

        }
        if(e.getSource() == saveitem){
            System.out.println("File has been Saved!!");

        }

        if(e.getSource() == exititem){
            System.exit(0);

        }
    }
}
