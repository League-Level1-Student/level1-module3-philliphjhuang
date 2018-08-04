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
	String ans = "0";

	public void makeCalculator() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		panel.setSize(600,400);
		frame.add(panel);
		frame.setSize(600, 400);
		frame.setTitle("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new GridBagLayout());
		
		add.addMouseListener(this);
		sub.addMouseListener(this);
		mul.addMouseListener(this);
		div.addMouseListener(this);
		
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
		label.setText(ans);
		panel.add(label, constraints);
		
		

	}

	public static void main(String[] args) {
		new Calculator().makeCalculator();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		double num11 = Double.parseDouble(num1.getText());
		double num22 = Double.parseDouble(num2.getText());
		
		
        // TODO Auto-generated method stub
        if (e.getSource() == add) {
       num=add(num11,num22);
       } else if(e.getSource()==sub) {
    	   num=sub(num11,num22);
       } else if(e.getSource()==mul) {
    	   num=mul(num11,num22);
       } else if(e.getSource()==div) {
    	   num=div(num11,num22);
       }
        ans = Double.toString(num);
        label.setText(ans);
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
		 
		 
	}
	 public double add(double d1, double d2) {
	 return d1+d2;
}
	 public double sub(double d1, double d2) {
     return d1-d2;
}
	 public double mul(double d1, double d2) {
	return d1*d2;
}
	 public double div(double d1, double d2) {
	return d1/d2;
}
}