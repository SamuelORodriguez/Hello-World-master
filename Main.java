package com.srodriguez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 6;
//		while(count != 6) {
//			System.out.println("Count value is " + count);
//			count++;
//		}
//		
//		for(int i = 6; i !=6; i++){
//			System.out.println("Count value is " + count);
//		}
		count = 6;
		do {
			System.out.println("Count value was " + count);
			count++;
			if(count > 100) {
				break;
			}
		}while(count != 6);
//		count = 1;
//		while(true){
//			if(count ==6) {
//				break;
//			}
//			System.out.println("Count value is " + count);
//			count++;
//		}
//		for(int i = 1; i < 7; i++) {
//			System.out.println("Count value is " + count);
//		}
//		for (count = 1; count != 6; count++){
//			System.out.println("Count Value is " + count);
//		}
		int number = 4;
		int finishNumber = 20;
		int evenNumbersFound = 0;
		
		while(number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number " + number);
			
			
			evenNumbersFound++;
			if(evenNumbersFound >= 5) {
				break;
			}
			System.out.println("Even number " + number);
		}
		
		System.out.println("Total even numbers found = " + evenNumbersFound);
	}
	public static boolean isEvenNumber(int number) {
		if((number % 2) == 0) {
			return true;
		}else {
			return false;
		}
	}

}
