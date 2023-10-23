package A6_Linear_Search;

import java.util.Arrays;

public class A5_Search_In_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr = {
				{121 , 54 , 85 },
				{22 , 55 , 88 , 58 },
				{71 , 81 , 51},
				{18 , 12 }
		};
		
		int [] ans = search(arr , 11);
		
		System.out.println(Arrays.toString(ans));
		
	}

	static int[] search(int[][] arr, int t) {
		// TODO Auto-generated method stub
		if (arr.length == 0) {
			return new int[] { -1, -1 };
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == t) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] { -1, -1 };
	}

}
