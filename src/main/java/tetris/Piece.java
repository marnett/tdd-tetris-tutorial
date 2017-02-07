package tetris;

public class Piece {

	private String shape;
	private char[][] piece;
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
		this.piece = piece;
	}
	
	public String toString() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		s.append(piece[i][j]);
        	}
        	s.append("\n");
        }
        return s.toString();
    }

}
