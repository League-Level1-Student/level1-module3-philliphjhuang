import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}

	public void makeButtons() {
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(200, 60);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.setText("Joke");
		button2.setText("Punchline");
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hi");
		if (event.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road? Because it wants to.");
		} else if (event.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "Omae Wa Mou Shindeiru");
		}
	}
}
