package BlackJack;
import java.util.Random;

public class Cards {

	static int[] cards;

	public static void initCards(){
		for(int i = 0; i<cards.length;i++){
			cards[i] = i;
		}//end for
	}//endmethod initCard

	public static void printCards() {
		for(int i = 0; i<cards.length;i++){
			int value = cards[i]%13;
			if (value == 0){
				System.out.print(" Ace ");
			} else if (value == 10) {
				System.out.print(" Jack ");
			} else if (value == 11) {
				System.out.print(" Queen ");
			} else if (value == 12) {
				System.out.print(" King ");
			} else {
				System.out.printf("%5s ",(value+1));
				}//endif
			int suit = cards[i]/13;
			if(suit==0) {
				System.out.print("Spades ");
			} else if (suit==1) {
				System.out.print("Hearts ");
			} else if (suit==2) {
				System.out.print("Diamonds ");
			} else if (suit==3) {
				System.out.print("Clubs ");
			}//end if
			System.out.println();
			}//end for
	}
	public static void shuffleCards() {
		Random r = new Random();
		for(int i=0;i<cards.length;i++) {
			int randomIndex = r.nextInt(52);  // random value from 0..51
			int tmp = cards[i];
			cards[i] = cards[randomIndex];		
			cards[randomIndex] = tmp;
		} // endfor...
	} 

	public static void main(String[] args) {
		cards = new int[52];
		initCards();
		shuffleCards();
		printCards();
			
	}//end main
}//endclass