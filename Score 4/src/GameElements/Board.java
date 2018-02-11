package GameElements;

public class Board {
	private int pegnumber;
	private int length=4;
	private int width=4;
	private Peg [][] board;
	
	public Board() {
		board=new Peg [length][width];
		for (int i=0; i<length; i++) {
			pegnumber=i*4;
			for (int j=0; j<width; j++) { 
				board [i][j]=new Peg(pegnumber+j+1);
			}
			}

	}
}
