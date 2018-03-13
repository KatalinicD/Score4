package ca.unbc.cpsc.team_breve;

import java.util.Random;

public class Referee {
     private int id;
     
     public Referee(int identification) {
    	 id=identification;
     }
     public void start() {
    	    Random rand=new Random();
    	    int x=rand.nextInt(1001);
    	    int y=rand.nextInt(1001);
    	    Player player=new Player(x);
    	    Player opponent=new Player(y);
    	    Board board=new Board();
     }
}
