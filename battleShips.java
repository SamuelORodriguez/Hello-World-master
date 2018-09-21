package BattleShip;

public class battleShips {

	public static void main(String[] args) {
		char[] battleShips = new char[1];
		for (char i = 0; i <= 4; i++) {
			battleShips[0] = 'B';

			System.out.println(battleShips[0]);
			
			
		}
		System.out.println();
		char[] battleShips2 = new char[1];
		for (char i = 0; i <= 4; i++) {
			battleShips2[0] = 'B';

			System.out.println(battleShips2[0]);
		}
if (battleShips.equals(battleShips)) {
	System.out.println("Hit");}
	else 
		System.out.println("Miss");

	if (battleShips2.equals(battleShips2)) {
		System.out.println("Hit");}
		else 
			System.out.println("Miss");
}
}

