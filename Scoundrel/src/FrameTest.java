import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.color.ICC_ColorSpace;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.lang.System.exit;

public class FrameTest {
    public static void main(String[] argv) throws Exception {

        JFrame myJFrame = new JFrame("Game");

        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJFrame.setLayout(new GridBagLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        myJFrame.setSize(screenSize.width, screenSize.height);
        myJFrame.setLocationRelativeTo(null);

        JLabel label1 = new JLabel("Test");
        JLabel titleLabel = new JLabel("SCOUNDREL");
        JLabel testLabel = new JLabel("Test2");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy = 0;
        gbc.weighty = 0;
        myJFrame.add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.weighty= 1.0;
        myJFrame.add(label1, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0;
        myJFrame.add(testLabel, gbc);

        myJFrame.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e){
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    label1.setText("Up Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_DOWN) {
                    label1.setText("Down Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_LEFT) {
                    label1.setText("Left Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_RIGHT) {
                    label1.setText("Right Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_Q) {
                    exit(0);
                }
                else if (keyCode == KeyEvent.VK_T){
                    label1.setText("<html><body>Welcome to Scoundrel!<br>==============================<br>Press 1 to start, or press 2 to view the rules.</body></html>");
                }

            }
        });

        myJFrame.setVisible(true);
    }
}
