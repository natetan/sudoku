
public class Sudoku {
    private int[][] board;
    private int size;
    
    public Sudoku() {
   	 this(9);
    }
    
    public Sudoku(int size) {
   	 this.size = size;
   	 if (!this.isPerfectSquare()) {
   		 throw new IllegalArgumentException("That's not a perfect square!");
   	 }
   	 this.board = new int[this.size][this.size];
    }
    
    public void play() {
   	 
    }
    
    private boolean isGameOver() {
   	 for (int x = 0; x < this.size; x++) {
   		 for (int y = 0; y < this.size; y++) {
   			 if (this.board[x][y] == 0) {
   				 return false;
   			 }
   		 }
   	 }
   	 return true;
    }
    
    private boolean isPerfectSquare() {
   	 int sqrt = (int) Math.sqrt(this.size);
   	 return Math.pow(sqrt, 2) == this.size;
    }
}


