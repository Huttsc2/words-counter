import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Window {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        ImageIcon logo = new ImageIcon("ork.png");
        JLabel label = new JLabel();
        label.setIcon(logo);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("Let`s rock");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(230, 233, 0));
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label.setIconTextGap(50);
        label.setBorder(border);

        JFrame frame = new JFrame();
        frame.setTitle("let`s go");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.add(label);
        ImageIcon image = new ImageIcon("ork.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.BLACK);
    }
}
