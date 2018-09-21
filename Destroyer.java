package BattleShip;

public class Destroyer {

	public static void main(String[] args) {
		char[] destroyer = new char[1];
		for (char j = 0; j <= 3; j++) {
			destroyer[0] = 'D';

			System.out.println(destroyer[0]);
		}
		System.out.println();
		char[] destroyer2 = new char[1];
		for (char j = 0; j <= 3; j++) {
			destroyer[0] = 'D';

			System.out.println(destroyer[0]);

		}
		System.out.println();
		char[] destroyer3 = new char[1];
		for (char j = 0; j <= 3; j++) {
			destroyer[0] = 'D';

			System.out.println(destroyer[0]);
		}
		if (destroyer.equals(destroyer)) {
			System.out.println("Hit");}
			else 
				System.out.println("Miss");
		if (destroyer2.equals(destroyer2)) {
			System.out.println("Hit");}
			else 
				System.out.println("Miss");
		if (destroyer3.equals(destroyer3)) {
			System.out.println("Hit");}
			else 
				System.out.println("Miss");
	}
}