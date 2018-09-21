package BattleShip;

public class showBoard {
	public static void showBoard(int[][] board){
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
}
