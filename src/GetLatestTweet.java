import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JButton search = new JButton();
	JLabel label = new JLabel("");
	
	
public void searchTweet() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	panel.setSize(600,400);
	frame.add(panel);
	frame.setSize(600, 400);
	frame.setTitle("The Amazing Tweet Reviewer");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	search.setText("Search the Twitterverse");
	search.addMouseListener(this);

	
	panel.setLayout(new GridBagLayout());
	GridBagConstraints constraints = new GridBagConstraints();
	
	constraints.gridx=0;
	constraints.gridy=0;
	constraints.gridwidth=2;
	panel.add(input, constraints);
	
	constraints.gridx=2;
	constraints.gridy=0;
	constraints.gridwidth=2;
	panel.add(search, constraints);
	
	constraints.gridx=0;
	constraints.gridy=3;
	constraints.gridwidth=4;
	constraints.gridheight=4;
	panel.add(label, constraints);
	
}
	

	public static void main(String[] args) {
		new GetLatestTweet().searchTweet();
		
	
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	        if (e.getSource()==search) {
	        	String tweet = getLatestTweet(input.getText());
	        	label.setText(tweet);
	        	frame.repaint();
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
	private String getLatestTweet(String searchingFor) {

	      Twitter twitter = new TwitterFactory().getInstance();

	      AccessToken accessToken = new AccessToken(
	            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

	      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

	      twitter.setOAuthAccessToken(accessToken);

	      Query query = new Query(searchingFor);
	      try {
	            QueryResult result = twitter.search(query);
	            return result.getTweets().get(0).getText();
	      } catch (Exception e) {
	            System.err.print(e.getMessage());
	            return "What the heck is that?";
	      }
	     
	      
	}
	
	
	
	
	
	
}
