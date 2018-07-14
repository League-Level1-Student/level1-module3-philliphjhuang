import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	
	
	
	
public void makeCalculator() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(400, 150);
	frame.setTitle("Simple Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
}

public static void main(String[] args) {
new Calculator().makeCalculator();
}
}