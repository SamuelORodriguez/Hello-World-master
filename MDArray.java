
public class MDArray {

	public static void main(String[] args) {
		int GCE [][]= {{1,3,5,7,9,},{2,4,6,8,10}};
		for (int column = 0; column < GCE.length; column++) {
			for (int row = 0; row < GCE[column].length; row++) {
				System.out.print(GCE[column][row]+ " ");
				
			}
			System.out.println();
		}

	}

}
