package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


class MySlider implements ChangeListener {
    JFrame frame;
    JLabel label;
    JPanel panel;
    JSlider slider;
    MySlider(){
        frame = new JFrame("My Slider");
        panel = new JPanel();
        label = new JLabel();

        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));


        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        slider.setPaintLabels(true);

        label.setFont(new Font("MV Boli",Font.PLAIN,25));

//        label.setText("°C = " + slider.getValue());

        panel.add(slider);
        panel.add(label);
        frame.add(panel);



        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void stateChanged(ChangeEvent e){
        label.setText("°C = " + slider.getValue());

    }
}
