import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {

	Date timeAtStart;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random r = new Random();
	int y = r.nextInt(24);

	int score = 0;
	int whack = 0;

	public void setUp() {
		timeAtStart = new Date();
		createButtons();
	}

	void createButtons() {
		frame = new JFrame();
		frame.setSize(285, 310);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		y = r.nextInt(24);
		
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addMouseListener(this);
			if (y == i) {
				button.setText("Mole!");
			}
			panel.add(button);
		}
		frame.setVisible(true);
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
		JButton b = (JButton) e.getSource();
		whack++;
		// TODO Auto-generated method stub
		if (b.getText().equals("Mole!")) {
			playSound("demacia.wav");
			score++;
			frame.dispose();

			createButtons();
			frame.repaint();

		} else {
			speak("You missed.");
		}

		if (whack == 10) {
			endGame(timeAtStart, score);
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

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
