// Copyright (c) 2008-2015  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

public class Board {

    private final int rows;
    private final int columns;
    private boolean hasFalling = false;
    private char board[][];
    private int currRow;
    private int currCol;
   
    
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        
        board = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
            	board[row][col] = '.';
            }
        } 
    }
    

	public boolean hasFalling() {
		return hasFalling;
	}
	
	public void drop(Block block) {
		if(hasFalling) {
			throw new IllegalStateException("already falling");
		} else {
			hasFalling = true;
			currRow = 0;
			currCol = 1;
			board[currRow][currCol] = block.getShape();
		}
	}
	
	public void tick() {
		int prevRow = currRow;
		currRow = currRow+1;
		if (currRow < rows) {
			if (board[currRow][currCol] == '.') {
				board[currRow][currCol] = board[prevRow][currCol];
				board[prevRow][currCol] = '.';
			} else {
				hasFalling = false;
			}
		} else {
			hasFalling = false;
		}
	}

    public String toString() {
        String s = "";
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                s += board[row][col];
            }
            s += "\n";
        }
        return s;
    }
}
