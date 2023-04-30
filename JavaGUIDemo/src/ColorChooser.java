import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser {
    public static void main(String[] args) {
        color obj = new color();

    }
}

class color extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    color(){


        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button = new JButton();
        button.setText("Choose a color!");
        label = new JLabel("This is some Text!");


        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setBackground(Color.white);
        label.setOpaque(true);

        button.addActionListener(this);
        button.setFocusable(false);
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button)
        {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Let's explore the Color Magic",Color.BLACK);
            label.setForeground(color);
//            button.setEnabled(false);

        }
    }

}
