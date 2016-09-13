package tetris;

public class Block {

	private char shape;

	public Block(char shape) {
        this.shape = shape;
    }

	public char getShape() {
		return this.shape;
	}
	
	public void setShape(char shape) {
		this.shape = shape;
	}
}
