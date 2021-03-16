package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise {
public static void main(String[] args) {
	JFrame a = new JFrame();
	JPanel b = new JPanel();
	JButton c = new JButton();
	JButton d = new JButton();

	a.setVisible(true);
	b.setVisible(true);
	c.setVisible(true);
	d.setVisible(true);
	a.setTitle("Nasty Surprise");
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	a.add(b);
	b.add(c);
	b.add(d);
	a.setSize(600, 600);
	c.setLabel("trick");
	d.setLabel("treat");
a.pack();
}
}
