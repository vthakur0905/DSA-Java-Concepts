package B1_Sorting_Algorithms;

import java.util.Arrays;

public class A2_Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {5,6,3,2,1};
		selection(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void selection(int [] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			int last = arr.length - i -1 ;
			int maxindex = max(arr , 0, last);
			swap(arr , maxindex , last);
		}
		
	}
	static int max(int [] arr , int start , int end) {
		
		int max = start;
		for (int i = start ; i <= end ; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
	static void swap(int [] arr , int first , int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
