import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PanelTest {
    public static void main(String[] args){
        JFrame f = new JFrame("panel");
        JLabel l = new JLabel("panel label");
        JButton b = new JButton("button1");
        JButton b1 = new JButton("button2");
        JButton b2 = new JButton("button3");
        JPanel p = new JPanel();
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l);

        p.setBackground(Color.red);
        f.add(p);
        f.setSize(300,300);
        f.show();
    }
}
