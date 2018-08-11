import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random r = new Random();


	public void setUp() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(285, 310);
	frame.add(panel);
	
	frame.setTitle("Whack a Button for Fame and Glory");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	int y = r.nextInt(24);
	
	for(int i=0;i<24;i++) {
		JButton button = new JButton();
		button.addMouseListener(this);
		if(y==i) {
			button.setText("Mole!");
		}
		panel.add(button);
	}
	
	
	

	}
	public static void main(String[] args) {
		new WhackAMole().setUp();
	}
	
	public Random drawButtons(Random r) {
		r = new Random();
		return r;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()!=r) {
			
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
	
	
	
}
