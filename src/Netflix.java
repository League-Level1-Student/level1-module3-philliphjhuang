
public class Netflix {
public static void main(String[] args) {
	Movie hp = new Movie("Harry Potter",1);
	System.out.println(hp.getTicketPrice());
	Movie lotr = new Movie("Lord of the Rings",2);
	System.out.println(lotr.getTicketPrice());
	Movie bm = new Movie("Batman",3);
	System.out.println(bm.getTicketPrice());
	Movie jw = new Movie("Jurassic World",4);
	System.out.println(jw.getTicketPrice());
	Movie sb = new Movie("Spongebob Squarepants",5);
	System.out.println(sb.getTicketPrice());
	
	hp.getRating();
	lotr.getRating();
	bm.getRating();
	jw.getRating();
	sb.getRating();
	
	hp.getTitle();
	lotr.getTitle();
	bm.getTitle();
	jw.getTitle();
	sb.getTitle();
	
	
	NetflixQueue NQ = new NetflixQueue();
	NQ.addMovie(hp);
	NQ.addMovie(lotr);
	NQ.addMovie(bm);
	NQ.addMovie(jw);
	NQ.addMovie(sb);
	
	NQ.printMovies();
	
	NQ.getBestMovie();
	
	System.out.println("The best movie is Spongebob Squarepants.");
	System.out.println("The second best movie is Jurassic World.");
}	
}