package tetris;

public class Block {

	private char letter;

	public Block(char shape) {
        this.letter = shape;
    }

	public char getLetter() {
		return this.letter;
	}
	
	public void setLetter(char shape) {
		this.letter = shape;
	}
}
