import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
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
	button1.setText("Joke");
	button2.setText("Punchline");
	panel.add(button1);
	panel.add(button2);
		
	
	
		
	}
	
	
	
}
