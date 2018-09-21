package BattleShip;

public class changeboard {
	public static void changeboard(int[] shoot, int[][] ships, int[][] board){
        if(hit(shoot,ships))
            board[shoot[0]][shoot[1]]=1;
        else
            board[shoot[0]][shoot[1]]=0;
    }

	private static boolean hit(int[] shoot, int[][] ships) {
		// TODO Auto-generated method stub
		return false;
	}


}


