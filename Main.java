package ca.unbc.cpsc.team_breve;

public class Main {
	public static void main(String [] args){
		AiPlayer ai = new AiPlayer(2345);
		ai.colour = Colour.Black;
		System.out.println(ai.id);
	}

}
