import javax.swing.*;

public class AnimationFrame extends JFrame {
    
    Animation panel;

    public AnimationFrame() {
        panel = new Animation();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setSize(500, 500);
        this.setIconImage(new ImageIcon("tqIcon.png").getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}