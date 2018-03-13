package ca.unbc.cpsc.team_breve;

public class Tester {
	public static void main (String[]args) {
		Player player=new Player(10000);
		Colour colour=Colour.Black;
		boolean t=colour.isBlack();
		System.out.println(t);
		GameOverStatus gse=GameOverStatus.WIN;
		boolean p=gse.isWin();
		System.out.println(p);
	    Board board=new Board();
	    System.out.println(board.getPeg(0,0).getLocation().getRow());
	    
		
		
		
		
	}

}
