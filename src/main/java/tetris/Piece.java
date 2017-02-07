package tetris;

public class Piece {

	private char[][] shape;
	private int n;

	public Piece(String shape) {
		int i = 0 ;
		int j = 0;
		int k = 0;
		this.n = shape.indexOf('\n');
		char[][] piece = new char[n][n];
		while(shape.length() > i) {
			char curr = shape.charAt(i);
			//System.out.println(curr + ", i:" + i + ", j:" + j + ", k:" + k);
			if(curr != '\n') {
				piece[j][k] = curr;
				k++;
			} else {
				j++;
				k = 0;
			}
			i++;
		}
		this.shape = piece;
	}
	
	public Piece(char[][] shape) {
		this.shape = shape;
		this.n = shape.length;
	}
	
	public Piece rotateRight() {
		char[][] newPieceCharArray = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				newPieceCharArray[j][(n-1) - i] = shape[i][j];
			}
		}
		return new Piece(newPieceCharArray);
	}
	
	public Piece rotateLeft() {
		char[][] newPieceCharArray = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				newPieceCharArray[i][j] = shape[j][i];
			}
		}
		return new Piece(newPieceCharArray);
	}
	
	public String toString() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		s.append(shape[i][j]);
        	}
        	s.append("\n");
        }
        return s.toString();
    }

}
