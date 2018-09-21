package BattleShip;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {

	public static void main(String[] args) {
		
		int[][] board = new int[20][20];
		int[][] Shipmaker = new int[6][2];
		int[] shoot = new int[2];
		int attempts = 0, shotHit = 0;

		initBoard(board);
		Ships initShips = new Ships();


		System.out.println();

		do {
			showBoard(board);
			shoot(shoot);
			attempts++;

			if (hit(shoot, Shipmaker)) {
				hint(shoot, Shipmaker, attempts);
				shotHit++;
			} else
				hint(shoot, Shipmaker, attempts);

			changeboard(shoot, Shipmaker, board);

		} while (shotHit != 24);

		System.out.println("\n\n\nBattleship Java game finished! You hit 6 ships in " + attempts + " attempts");
		showBoard(board);

	}

	  public static void initBoard(int[][] board){
	        for(int row=0 ; row < 20 ; row++ )
	            for(int column=0 ; column < 20 ; column++ )
	                board[row][column]=-1;
	    }
	    
	    public static void showBoard(int[][] board){
	        System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10 \t11 \t12 \t13 \t14 \t15 \t16 \t17 \t18 \t19 \t20");
	        System.out.println();
	        
	        for(int row=0 ; row < 20 ; row++ ){
	            System.out.print((row+1)+"");
	            for(int column=0 ; column < 20 ; column++ ){
	                if(board[row][column]==-1){
	                    System.out.print("\t"+"~");
	                }else if(board[row][column]==0){
	                    System.out.print("\t"+"*");
	                }else if(board[row][column]==1){
	                    System.out.print("\t"+"X");
	                }
	                
	            }
	            System.out.println();
	        }

	    }

	public static void initShips(int[][] Shipmaker) {
		Random random = new Random();

		for (int obship = 0; obship < 24; obship++) {
			Shipmaker[obship][0] = random.nextInt(20);
			Shipmaker[obship][1] = random.nextInt(20);

			// let's check if that shot was already tried
			// if it was, just finish the do...while when a new pair was
			// randomly selected
			for (int last = 0; last < obship; last++) {
				if ((Shipmaker[obship][0] == Shipmaker[last][0]) && (Shipmaker[obship][1] == Shipmaker[last][1]))
					do {
						Shipmaker[obship][0] = random.nextInt(20);
						Shipmaker[obship][1] = random.nextInt(20);
					} while ((Shipmaker[obship][0] == Shipmaker[last][0])
							&& (Shipmaker[obship][1] == Shipmaker[last][1]));
			}

		}
	}

	public static void shoot(int[] shoot) {
		Scanner input = new Scanner(System.in);

		System.out.print("Row: ");
		shoot[0] = input.nextInt();
		shoot[0]--;

		System.out.print("Column: ");
		shoot[1] = input.nextInt();
		shoot[1]--;

	}

	public static boolean hit(int[] shoot, int[][] Shipmaker) {

		for (int obship = 0; obship < Shipmaker.length; obship++) {
			if (shoot[0] == Shipmaker[obship][0] && shoot[1] == Shipmaker[obship][1]) {
				System.out.printf("You hit a ship located in (%d,%d)\n", shoot[0] + 1, shoot[1] + 1);
				return true;
			}
		}
		return false;
	}

	public static void hint(int[] shoot, int[][] Shipmaker, int attempt) {
		int row = 0, column = 0;

		for (int line = 0; line < Shipmaker.length; line++) {
			if (Shipmaker[line][0] == shoot[0])
				row++;
			if (Shipmaker[line][1] == shoot[1])
				column++;
		}

		System.out.printf("\nHint %d: \nRow %d -> %d ships\n" + "Column %d -> %d ships\n", attempt, shoot[0] + 1, row,
				shoot[1] + 1, column);
	}

	public static void changeboard(int[] shoot, int[][] Shipmaker, int[][] board) {
		if (hit(shoot, Shipmaker))
			board[shoot[0]][shoot[1]] = 1;
		else
			board[shoot[0]][shoot[1]] = 0;
	}

}
