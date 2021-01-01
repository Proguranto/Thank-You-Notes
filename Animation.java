import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Animation extends JPanel implements ActionListener {

    private Timer timer;
    private JLabel label;
    private int counter;

    public Animation() {
        this.setSize(500, 500);
        this.setBackground(new Color(225, 229, 180));
        timer = new Timer(1000, this);
        timer.start();
        
        label = new JLabel();
        label.setText("Hello, welcome to my program!");
        label.setFont(new Font("MV Boli", Font.BOLD, 16));
        ImageIcon pika = new ImageIcon(new ImageIcon("Pikachu.png").getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));
        label.setIcon(pika);
        label.setBounds(0, 0, 500, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (counter > 13) {
            timer.stop();
            new ButtonChoices();
        } else if (counter > 11) {
            label.setText("Please Enjoy!!!");
            ImageIcon pikaEnjoy = new ImageIcon(new ImageIcon("pikaEnjoy.gif").getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));
            label.setIcon(pikaEnjoy);
        } else if (counter > 7) {
            label.setText("WE made some Thank You Notes to express our gratitute :)");
            label.setFont(new Font("MV Boli", Font.BOLD, 15));
            ImageIcon pikaDab = new ImageIcon(new ImageIcon("pikaDab.png").getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));
            label.setIcon(pikaDab);
        } else if (counter > 3) {
            label.setText("I made this program to thank you for all the work you have done!");
            label.setFont(new Font("MV Boli", Font.BOLD, 14));
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);
            ImageIcon pikaThanks = new ImageIcon(new ImageIcon("pikaThanks.png").getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));
            label.setIcon(pikaThanks);
        }
        this.add(label);
        this.revalidate();
        counter++;
    }  
}
