package thema5.arrays.zweidimensional.ttt;

public class TicTacToe {

	public static void main(String[] args) {

		char[][] ttt = new char[3][3];
		
		// Initialisierung des Spielfelds mit leeren Zeichen
		for(int i=0; i < ttt.length; i++) {
			for (int j = 0; j < ttt.length; j++) {
				ttt[i][j] = ' ';
			}
		}
		
		// Befüllung des Spielfelds 
		ttt[0][0] = 'X';
		ttt[0][1] = 'O';
		ttt[1][1] = 'X';
		ttt[2][2] = 'O';
		
		printTicTacToe(ttt);
	}
	
	
	public static void printTicTacToe(char[][] spielfeld) {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				System.out.print(spielfeld[i][j]);
				
				if (j < (spielfeld[i].length -1)) {
					System.out.print(" | ");
				}
			}
			
			System.out.println();
			if(i < spielfeld.length -1) {
				System.out.println("--------");
			}
		}
	}

}
