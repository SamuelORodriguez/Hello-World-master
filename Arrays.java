package Arrays;

import java.util.Random;
public class Arrays {

	public static void main(String[] args) {
		String firstnames[] = new String[9];
		String lastnames[] = new String[9];
		Random names = new Random();
		
		for (int index = 0 ; index<firstnames.length; index++){
			 
		firstnames[0] = "Anthony";
		firstnames[1] = "Austin";
		firstnames[2] = "Francis";
		firstnames[3] = "Jeremy";
		firstnames[4] = "Mezemir";
		firstnames[5] = "Sara";
		firstnames[6] = "Samuel";
		firstnames[7] = "Sungho";
		firstnames[8] = "Tyler";
		
		}
		
		for (int index = 0; index<lastnames.length; index++){
		lastnames[0] = "Allen";
		lastnames[1] = "Joyce";
		lastnames[2] = "Geigler";
		lastnames[3] = "Schnell";
		lastnames[4] = "Tesfaye";
		lastnames[5] = "Donlon";
		lastnames[6] = "Rodriguez";
		lastnames[7] = "Ahn";
		lastnames[8] = "Meiburg";
		
		System.out.println(firstnames[names.nextInt(9)] +" " + lastnames[names.nextInt(9)]);

	}
	}
}
