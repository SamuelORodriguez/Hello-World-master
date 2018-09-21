package BattleShip;

public class hit {
	public static boolean hit(int[] shoot, int[][] Shipmaker){
        
        for(int obship=0 ; obship<Shipmaker.length ; obship++){
            if( shoot[0]==Shipmaker[obship][0] && shoot[1]==Shipmaker[obship][1]){
                System.out.printf("You hit a ship located in (%d,%d)\n",shoot[0]+1,shoot[1]+1);
                return true;
            }
        }
        return false;
    }
}
