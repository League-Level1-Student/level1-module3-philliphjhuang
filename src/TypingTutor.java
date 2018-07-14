import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	
	
	public static void  main(String[] args) {
		new TypingTutor().typingGame();
		
		
		
		
		
		
		
		
	
	}
	
	public void typingGame() {
		currentLetter = generateRandomLetter();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(400, 150);
		frame.setTitle("Type or Die");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		frame.addKeyListener(this);
				
		
		
	}
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()==currentLetter) {
			System.out.print("Correct.			");
			panel.setBackground(Color.GREEN);
		} else {
			System.out.print("Incorrect.		");
			panel.setBackground(Color.RED);
		}
		currentLetter=generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
		System.out.println("You typed: " + e.getKeyChar());
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
