package BattleShip;

import java.util.Random;

public class board {
	public static void main(String[] args) {
	
	for (int h = 0; h <= 20; h++) {
		System.out.print("|" + h + "|" + "\t");
	} // horizontal grid marker

	System.out.println("\n");
	char ch = 'A';
	for (char i = 'A'; ch <= 'T'; ch++) {
		for (int j = 0; j <= 20; j++) {

			if (j == 0) {
				System.out.print("|" + ch + "|" + "\t");
			} else if (ch == 'T' && i == j) {
				System.out.println("|X|\t");
			} else {
				System.out.print("|_|" + "\t");
			}
		}
		System.out.println("\r");
	}
	}
	
    

public static final int ROWS      = 20;      // number of rows
public static final int COLUMNS   = 20;      // number of columns
public static final int NUMBER_OF_TARGETS = 24; // number of targets in the grid

public String[][] grid;                // the grid itself, a 2-D array of String
public Random random;                  // random number generator

//Constructor
public board()
{
    grid = new String[ROWS][COLUMNS];
    random = new Random();
}

//method
public void loadTargetGrid()
{
	
	
	int randRow, randColumn;
	do {
	  randRow = random.nextInt(ROWS);
	  randColumn = random.nextInt(COLUMNS);
	} while (grid[randRow][randColumn] != null);
	grid[randRow][randColumn] = "X";
}
}
