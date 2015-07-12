import java.util.Scanner;


public class SudokuGame {

    public static void main(String[] args) {
   	 Scanner console = new Scanner(System.in);
   	 giveIntro();
   	 play(console);
    }

    public static void giveIntro() {
   	 System.out.println("This program plays Sudoku with the user. If you aren't");
   	 System.out.println("familiar with the rules, please brush up on them and come");
   	 System.out.println("back later. The default size of our grid is 9 x 9 but the user");
   	 System.out.println("can choose a different size.");
   	 System.out.println();
    }

    public static void play(Scanner console) {
   	 Sudoku game = new Sudoku();
   	 System.out.print("Do you want to choose the size of the grid? (y/n)? ");
   	 String response = console.next().toLowerCase();
   	 if (response.startsWith("y")) {
   		 System.out.print("Please enter the size of the Sudoku grid (must be a perfect square): ");
   		 int size = console.nextInt();
   		 game = new Sudoku(size);
   	 }
    }

}


