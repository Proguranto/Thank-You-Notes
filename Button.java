import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Button extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;
    private JLabel label2;

    public Button() {
        // setting up the button
        ImageIcon pikaClick = new ImageIcon(new ImageIcon("PikaClick.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_DEFAULT));
        button = new JButton();
        button.setBounds(120, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Press Here To Start");
        button.setFocusable(false);
        button.setIcon(pikaClick);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("MV Boli", Font.BOLD, 13));
        button.setIconTextGap(1);
        button.setBackground(new Color(40, 40, 40));
        button.setForeground(new Color(179, 179, 179));
        button.setBorder(BorderFactory.createEtchedBorder());

        label = new JLabel();
        ImageIcon confused = new ImageIcon(new ImageIcon("confused.gif").getImage().getScaledInstance(120, 200, java.awt.Image.SCALE_DEFAULT));
        label.setIcon(confused);
        label.setBounds(0, 230, 150, 190);

        label2 = new JLabel();
        ImageIcon pikaThink = new ImageIcon(new ImageIcon("PikaThink.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT));
        label2.setIcon(pikaThink);
        label2.setBounds(370, 150, 150, 190);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.getContentPane().setBackground(new Color(28, 28, 28));
        this.setIconImage(new ImageIcon("tqIcon.png").getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        this.add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            button.setEnabled(false);
            this.setVisible(false);
            this.dispose();
            new AnimationFrame();
        }
    }
    
}
