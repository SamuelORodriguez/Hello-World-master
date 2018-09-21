package BattleShip;

import java.util.Scanner;

public class shoot {
	  public static void shoot(int[] shoot){
          Scanner input = new Scanner(System.in);
          
          System.out.print("Row: ");
          shoot[0] = input.nextInt();
          shoot[0]--;
          
          System.out.print("Column: ");
          shoot[1] = input.nextInt();
          shoot[1]--;
          
      }
      
}
