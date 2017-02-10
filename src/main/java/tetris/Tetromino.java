package tetris;

public final class Tetromino  {
	
	public static final Tetromino T_SHAPE = new Tetromino("" +
            ".T.\n" +
            "TTT\n" +
            "...\n");
	
	public static final Tetromino I_SHAPE = new Tetromino("" +
            ".....\n" +
            ".....\n" +
            "IIII.\n" +
            ".....\n" +
            ".....\n");
	
	public static final Tetromino O_SHAPE = new Tetromino("" +
                    ".OO\n" +
                    ".OO\n" +
                    "...\n");
	
	private final Piece shape;
	
	private Tetromino(String shapeType) {
		shape = new Piece(shapeType);
	}
	
	private Tetromino(Piece piece) {
		shape = piece;
	}

	public Tetromino rotateRight() {
		return new Tetromino(shape.rotateRight());
	}

	public Tetromino rotateLeft() {
		return new Tetromino(shape.rotateLeft());
	}
	
	public String toString() {
		return shape.toString();
	}
	
}