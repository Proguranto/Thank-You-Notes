import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonChoices extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public ButtonChoices() {
        button1 = new JButton();
        ImageIcon icon1 = new ImageIcon(new ImageIcon("eric.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        setUpButton(button1, "Eric", 20, 20, 150, 80, icon1);

        button2 = new JButton();
        ImageIcon icon2 = new ImageIcon(new ImageIcon("chandan.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        setUpButton(button2, "Chandan", 310, 20, 150, 80, icon2);

        button3 = new JButton();
        ImageIcon icon3 = new ImageIcon(new ImageIcon("randair.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        setUpButton(button3, "RanDair", 160, 180, 150, 80, icon3);

        button4 = new JButton();
        ImageIcon icon4 = new ImageIcon(new ImageIcon("megan.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        setUpButton(button4, "Megan", 20, 340, 150, 80, icon4);

        button5 = new JButton();
        ImageIcon icon5 = new ImageIcon(new ImageIcon("soham.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT));
        setUpButton(button5, "Soham", 310, 340, 150, 80, icon5);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.getContentPane().setBackground(new Color(28, 28, 28));
        this.setIconImage(new ImageIcon("tqIcon.png").getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void setUpButton(JButton button, String name, int x, int y, int width, int height, ImageIcon icon) {
        button.setBounds(x, y, width, height);
        button.addActionListener(this);
        button.setText(name);
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("MV Boli", Font.BOLD, 13));
        button.setIconTextGap(10);
        button.setBackground(new Color(40, 40, 40));
        button.setForeground(new Color(179, 179, 179));
        button.setBorder(BorderFactory.createEtchedBorder());
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            button1.setEnabled(false);
            new tqNotes("eric");
            this.setVisible(false);
            this.dispose();
        } else if (e.getSource() == button2) {
            button1.setEnabled(false);
            new tqNotes("chandan");
            this.setVisible(false);
            this.dispose();
        } else if (e.getSource() == button3) {
            button1.setEnabled(false);
            new tqNotes("randair");
            this.setVisible(false);
            this.dispose();
        } else if (e.getSource() == button4) {
            button1.setEnabled(false);
            new tqNotes("megan");
            this.setVisible(false);
            this.dispose();
        } else if (e.getSource() == button5) {
            button1.setEnabled(false);
            new tqNotes("soham");
            this.setVisible(false);
            this.dispose();
        }
    }

}