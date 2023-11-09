package B1_Sorting_Algorithms;

import java.util.Arrays;

public class A4_cycle_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,6,4,3,2,1};
		cycle(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void cycle(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if( arr[i] != arr[correct]) {
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i] = temp;
			}
			else {
				i++;
			}
		}
	}

}
