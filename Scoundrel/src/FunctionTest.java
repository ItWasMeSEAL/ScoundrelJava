import javax.swing.*;
import java.awt.*;

public class FunctionTest {


    public static void main(String[] args) {

        JFrame myFrame = new JFrame("Scoundrel V0.0");
        myFrame.getContentPane().setBackground(Color.BLACK);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new GridBagLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        myFrame.setSize(screenSize.width, screenSize.height);
        myFrame.setLocationRelativeTo(null);

        myFrame.setVisible(true);
        titleScreen(myFrame);
    }

    public static void titleScreen(JFrame myFrame){

        JLabel titleLabel = new JLabel("SCOUNDREL");
        titleLabel.setForeground(Color.white);

        JLabel mainText = new JLabel("<html><body>Welcome to Scoundrel!<br>===================</body></html>");
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
    }

    public static void rulesScreen(JFrame myFrame){

        JLabel titleLabel = new JLabel("SCOUNDREL");
        titleLabel.setForeground(Color.white);

        int pageNum = 1;
        JLabel rulesText = new JLabel();

        switch(pageNum){
            case 1:
                titleLabel.setText("OVERVIEW");
                rulesText.setText("<html><body>Scoundrel is a single-player rogue-like dungeon-crawler, played with a standard deck of cards.<br>The object of the game is to progress through a dungeon by clearing rooms.</body></html>");
            case 2:
                titleLabel.setText("CARDS");
                rulesText.setText("<html><body>There are 3 types of cards in the dungeon. Because this is a computer game, the suits are unimportant, so from here on out the 'card game' aspect of Scoundrel will be ignored.</body></html>");
            case 3:
                titleLabel.setText("MONSTERS");
                rulesText.setText("<html><body>Monsters are the bulk of the cards you will encounter in the dungeon. They have a strength equal to their number, from 2 to 14.<br>They can either be fought by hand, or by using a weapon.<br>Fighting a monster will resolve the card, dealing damage to you equal to their strength, or less if you have a weapon (more will be explained on the combat page).</body></html>");
            case 4:
                titleLabel.setText("WEAPONS");
                rulesText.setText("<html><body>Weapons can be equipped. Only one weapon may be equipped at a time.</body></html>");
        }

    }
}
