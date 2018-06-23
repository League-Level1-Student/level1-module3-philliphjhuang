import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise extends MouseAdapter {

	public static void main(String[] args) throws Exception {
		new NastySurprise().getGoing();
	}

	private void getGoing() throws MalformedURLException {
	
		JFrame x = new JFrame();

		x.setVisible(true);

		x.setSize(500, 500);

		x.setTitle("YASUO");

		JPanel y = new JPanel();

		JButton b = new JButton();
		
		b.setSize(100, 10);
		
		x.add(y);
	
		
		x.pack();

	}

	public void mouseClicked(MouseEvent e) {

		if (e.getID() == MouseEvent.MOUSE_CLICKED) {
			System.out.println("mouse clicked");
		}

		JLabel drumClicked = (JLabel) e.getSource();
		
		
		
		if (drumClicked == drumLabelWithImage) {
		
		} else if(drumClicked == drum2LabelWithImage) {
			
		}

	}
}