package com.company;

import javax.swing.*;
import java.awt.*;

public class JprogressBar {
    public static void main(String[] args) {
        Myprogress myprogress = new Myprogress();
    }
}
 class Myprogress{
    JFrame frame;
    JProgressBar progressBar;

    Myprogress(){
        frame = new JFrame("Progress Bar");
        progressBar = new JProgressBar();
        progressBar.setBounds(0,0,400,50);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);
        progressBar.setFont(new Font("MV Boli",Font.PLAIN,25));
        progressBar.setForeground(Color.RED);
        progressBar.setBackground(Color.BLACK);

        frame.add(progressBar);


        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();

    }
    public void fill(){
        int counter = 0;
        while(counter <= 100){
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            counter += 1;
        }
        progressBar.setString("I Love You! :)");
    }
 }
