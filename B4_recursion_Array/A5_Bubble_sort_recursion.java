package B4_Recursion_Array;

import java.util.Arrays;

public class A5_Bubble_sort_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };
		bubble(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	static void bubble(int[] arr, int r, int c) {

		if (r == 0) {
            return;
        }
        if (c < r) {

            if (arr[c] > arr[c+1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r, c+1);
        } else {
            bubble(arr, r-1, 0);
        } 
	}

}
