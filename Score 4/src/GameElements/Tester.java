package GameElements;

public class Tester {
	public static void main (String[]args) {
		Player player=new Player(10000);
		boolean f=player.isBlack();
		System.out.println(f);
		Colour colour=Colour.Black;
		boolean t=colour.isBlack();
		System.out.println(t);
	}

}
