
public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = { 8, 4, 3, 9, 2, 7};
		// This is a bubble sort.
		int a, b, t;
		int size = 6;
		
				for ( a=1; a < size; a++)
					for(b=size-1;b >= a; b--) {
						if(nums[b-1] > nums[b]) { // if out of order
							//exchange elements 
							t= nums[b-1];
							nums[b-1] = nums[b];
							nums[b] = t;
							
							System.out.println("Sorted array is: ");
							for (int i = 0; i < size; i++) {
								System.out.print(" " + nums[i]);
								System.out.println();
							}
							
							
						}
					}

	}

}
