package BattleShip;

public class initBoard {

	public static void initBoard(int[][] board){
        for(int row=0 ; row < 20 ; row++ )
            for(int column=0 ; column <20 ; column++ )
                board[row][column]=-1;
    }
    
}
