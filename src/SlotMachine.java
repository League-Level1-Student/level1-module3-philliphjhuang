import java.awt.GridBagLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("");
	JLabel label3 = new JLabel("");
	JButton spin = new JButton();
	Random r = new Random();
	int y = r.nextInt(3);
	
public void setUp() {
	frame.setVisible(true);
	frame.add(panel);
	frame.setTitle("Slot Machine");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setLayout(new GridBagLayout());
	
	
}
void reel() {
	
}
public static void main(String[] args) {
	new SlotMachine().setUp();
}




}