package BattleShip;

public class Shipmaker {
	int shipSize;
	int shipDamage = 0;
	char shipType;
	String shipCoords[] = new String[6];
	char cOrientation;
	String name;

	Shipmaker newShip(char sType) {
		Shipmaker obShip = new Shipmaker();
		obShip.shipType = sType;
		switch (sType) {
		case 'b':
			obShip.name = "BattleShip";
			obShip.shipSize = 5;
			break;
		case 'c':
			obShip.name = "Cruiser";
			obShip.shipSize = 4;
			break;
		case 't':
			obShip.name = "Tugboat";
			obShip.shipSize = 2;
			break;
		}
		return obShip;

	}

	
}
