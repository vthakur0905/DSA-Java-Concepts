package B4_Recursion_Array;

import java.util.Arrays;

public class A6_Selection_sort_recursion {

	// In this code no recursion is used.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,6,3,2,1};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selection(int [] arr ) {
		
		for (int i = 0 ; i < arr.length ; i++) {
			int last = arr.length - i - 1;
			int maxindex = max(arr , 0 , last);
			swap (arr , maxindex , last);
		}
	}

	public static void swap(int[] arr, int maxindex, int last) {
		// TODO Auto-generated method stub
		int temp = arr[last];
		arr[last] = arr[maxindex];
		arr[maxindex] = temp;
	}

	public static int max(int[] arr, int start, int last) {
		// TODO Auto-generated method stub
		int max = start;
		for (int i = start; i <= last ; i++) {
			if(arr[start] < arr[i]) {
				max = i;
			}
		}
		
		return max;
	}

}
