package com.company;

import javax.swing.*;

public class JoptionPane {
    public static void main(String[] args) {
//       JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
//       JOptionPane.showMessageDialog(null,"Fuck off","title",JOptionPane.INFORMATION_MESSAGE);
//       JOptionPane.showMessageDialog(null,"Why are you so dumb?","title",JOptionPane.QUESTION_MESSAGE);
//       JOptionPane.showMessageDialog(null,"Jokes over!! you are dead!!","title",JOptionPane.WARNING_MESSAGE);
//       JOptionPane.showMessageDialog(null,"Error! your brain is missing","title",JOptionPane.ERROR_MESSAGE);

//        int i;
//        i = JOptionPane.showConfirmDialog(null,"You are a piece of shit!!","title",JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(i);
//
//        String name = JOptionPane.showInputDialog("What's your disgusting name?");
//        System.out.println("get out " + name);

        String[] responses = {"You're Correct!","Thank you!","I'll take it as a Compliment"};
        ImageIcon icon = new ImageIcon("doyouevencode.jpeg");
       int j =  JOptionPane.showOptionDialog(null,
                "You're of no use",
                "None of your business!",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,icon,responses,0);
        System.out.println(j);



    }
}
