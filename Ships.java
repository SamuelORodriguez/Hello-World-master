package BattleShip;

public class Ships {
	public static void main(String[] args) {

		int ships = 6;
		String shipsString;
		switch (ships) {
		case 1:
			shipsString = "battleShips";

			break;
		case 2:
			shipsString = "battleShips2";

			break;
		case 3:
			shipsString = "Destroyer";

			break;
		case 4:
			shipsString = "Destroyer2";

			break;
		case 5:
			shipsString = "Destroyer2";

			break;
		case 6:
			shipsString = "Cruiser";

			break;
		default: 
			shipsString = "NoneShip";
			break;
		}
		System.out.println(shipsString);
	}
}

class fleet{
	public Ships battleShips, battleShips2;
	public Ships Destroyer, Destroyer2, Destroyer3;
	public Ships Cruiser;
	
	public void fleet() {
		battleShips = new Ships();
		battleShips2 = new Ships();
		Destroyer = new Ships();
		Destroyer2 = new Ships();
		Destroyer3 = new Ships();
		Cruiser = new Ships();
		
		
	}

	public Ships getBattleShips() {
		return battleShips;
	}

	public void setBattleShips(Ships battleShips) {
		this.battleShips = battleShips;
	}

	public Ships getBattleShips2() {
		return battleShips2;
	}

	public void setBattleShips2(Ships battleShips2) {
		this.battleShips2 = battleShips2;
	}

	public Ships getDestroyer() {
		return Destroyer;
	}

	public void setDestroyer(Ships destroyer) {
		Destroyer = destroyer;
	}

	public Ships getDestroyer2() {
		return Destroyer2;
	}

	public void setDestroyer2(Ships destroyer2) {
		Destroyer2 = destroyer2;
	}

	public Ships getDestroyer3() {
		return Destroyer3;
	}

	public void setDestroyer3(Ships destroyer3) {
		Destroyer3 = destroyer3;
	}

	public Ships getCruiser() {
		return Cruiser;
	}

	public void setCruiser(Ships cruiser) {
		Cruiser = cruiser;
	}
}
