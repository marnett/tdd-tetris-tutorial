package tetris;

public final class Tetromino  {
	
	public static final Tetromino T_SHAPE = new Tetromino();
	
	private final Piece T_Shape;
	
	private Tetromino() {
		T_Shape = new Piece("" +
	            ".T.\n" +
	            "TTT\n" +
	            "...\n");
	}
	
	private Tetromino(Piece piece) {
		T_Shape = piece;
	}

	public Tetromino rotateRight() {
		return new Tetromino(T_Shape.rotateRight());
	}

	public Tetromino rotateLeft() {
		return new Tetromino(T_Shape.rotateLeft());
	}
	
	public String toString() {
		return T_Shape.toString();
	}
	
}