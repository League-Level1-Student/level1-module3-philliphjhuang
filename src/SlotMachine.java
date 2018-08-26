import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("");
	JLabel label3 = new JLabel("");
	JButton spin = new JButton();
	Random r = new Random();
	String image1 = "image1.jpg";
	String image2 = "image2.jpg";
	String image3 = "image3.jpg";
	int wins = 0;
	
public void setUp() {
	frame.setVisible(true);
	frame.add(panel);
	frame.setTitle("Slot Machine");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	spin.addMouseListener(this);
	panel.setVisible(true);
	frame.setSize(1000,500);
	panel.setSize(1000,500);
	
	panel.add(spin);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	
}
void reel() {
	
}
public static void main(String[] args) {
	new SlotMachine().setUp();
}
@Override
public void mouseClicked(MouseEvent e) {
	panel.removeAll();
	panel.add(spin);
	spin.setText("Spin");
	// TODO Auto-generated method stub
	int x = r.nextInt(3);
	int y = r.nextInt(3);
	int z = r.nextInt(3);
	if(x==0) {
		label1=loadImageFromComputer(image1);
	} else if(x==1) {
		label1=loadImageFromComputer(image2);
	} else if(x==2) {
		label1=loadImageFromComputer(image3);
	}
	if(y==0) {
		label2=loadImageFromComputer(image1);
	} else if(y==1) {
		label2=loadImageFromComputer(image2);
	} else if(y==2) {
		label2=loadImageFromComputer(image3);
	}
	if(z==0) {
		label3=loadImageFromComputer(image1);
	} else if(z==1) {
		label3=loadImageFromComputer(image2);
	} else if(z==2) {
		label3=loadImageFromComputer(image3);
	}
	
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	frame.pack();
	
	if((x==y)&&(y==z)&&(x==z)) {
		System.out.println("You Win!");
		wins++;
		System.out.println("Wins: "+wins);
	}
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

public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}



}