package A6_Linear_Search;

import java.util.Arrays;

public class A6_Max_In_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr = {
				{1211 , 54 , 85 },
				{22 , 55 , 88 , 58 },
				{71 , 81 , 51},
				{18 , 12 }
		};
		
		int ans = max(arr);
		System.out.println(ans);
		
		
		
	}

	static int max(int[][] arr) {
		// TODO Auto-generated method stub
		int max = arr[0][0] ;
		
		int i = 0 ;
		int j = 0 ;
		
		for (i = 0 ; i < arr.length ; i++) {
			for (j = 0 ; j < arr[i].length ; j++) {
				if ( arr[i][j] > max) {
					max = arr[i][j];
					
				}
			}
		}
		return max;
		
		
//		return new int[] {-1 ,-1};
	}
	
	

}
