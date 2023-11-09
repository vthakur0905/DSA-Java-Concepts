package B1_Sorting_Algorithms;

import java.util.Arrays;

public class A1_bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,4,3,2,1};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubble(int [] arr ) {
		
		boolean swapped;
		
		// run pass for n-1 times :
		for ( int pass = 0; pass <= arr.length - 1 ; pass++) {
			swapped = false;
			// returning the max item at last 
			for (int i = 1 ; i < arr.length - pass ; i++) {
				// swap if it is needed
				if (arr[i] < arr[i-1]) {
					//swap
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					swapped = true ;
				}
			}
			if (swapped == false) {
				break ;
			}
			
		}
	}

}
