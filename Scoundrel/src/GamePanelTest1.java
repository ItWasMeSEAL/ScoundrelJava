import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.color.ICC_ColorSpace;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanelTest1 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Scoundrel V0.0");
        myFrame.getContentPane().setBackground(Color.BLACK);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new GridBagLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        myFrame.setSize(screenSize.width, screenSize.height);
        myFrame.setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("SCOUNDREL");
        titleLabel.setForeground(Color.white);

        JLabel mainText = new JLabel("<html><body>Welcome to Scoundrel!<br>===================");
        mainText.setForeground(Color.white);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLACK);
        JButton b1 = new JButton("Start game");

        JButton b2 = new JButton("Rules");

        JButton b3 = new JButton("Quit");
        b3.addActionListener(e -> System.exit(0));

        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy = 0;
        gbc.weighty = 0;
        myFrame.add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.weighty = 1;
        myFrame.add(mainText, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0;
        myFrame.add(panel1, gbc);

        myFrame.setVisible(true);
    }
}
