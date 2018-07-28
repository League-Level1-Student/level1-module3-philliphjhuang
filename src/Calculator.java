import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel("");
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField num1 = new JTextField(20);
	JTextField num2 = new JTextField(20);

	double num = 0;
	String numm="0";

	public void makeCalculator() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		panel.setSize(600,400);
		frame.add(panel);
		frame.setSize(600, 400);
		frame.setTitle("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints =new GridBagConstraints();
		
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.gridwidth=2;
		panel.add(num1, constraints);
		
		constraints.gridx=2;
		constraints.gridy=0;
		constraints.gridwidth=2;
		panel.add(num2, constraints);
		
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		panel.add(add, constraints);
		add.setText("+");
		
		constraints.gridx=1;
		constraints.gridy=1;
		panel.add(sub, constraints);
		sub.setText("-");
		
		constraints.gridx=2;
		constraints.gridy=1;
		panel.add(mul, constraints);
		mul.setText("×");
		
		constraints.gridx=3;
		constraints.gridy=1;
		panel.add(div, constraints);
		div.setText("÷");

		constraints.gridx=0;
		constraints.gridy=2;
		constraints.gridwidth=4;
		label.setText(numm);
		panel.add(label, constraints);
		
		

	}

	public static void main(String[] args) {
		new Calculator().makeCalculator();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 
		 numm = Double.toString(num);
			double num11 = Double.parseDouble(num1.getText());
			double num22 = Double.parseDouble(num2.getText());
			
	        // TODO Auto-generated method stub
	        if (e.getSource() == add) {
	        	numm.setText(Double.toString(num11 + num22));
	        } else  if (e.getSource() == sub) {
	        	label.setText(Double.toString(num11 - num22));
	        } else  if (e.getSource() == mul) {
	        	label.setText(Double.toString(num11 * num22));
	        } else  if (e.getSource() == div) {
	        	label.setText(Double.toString(num11 / num22));
	     }
	}
}