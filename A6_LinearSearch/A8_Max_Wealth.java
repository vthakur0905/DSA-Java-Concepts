package A6_Linear_Search;

import java.util.Arrays;

// https://leetcode.com/problems/richest-customer-wealth/

public class A8_Max_Wealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr = {
				{ 1, 2, 3 },
				{ 4, 5 },
				{ 3, 6, 8, 9 },
				{ 2, 3 }
		};
				
		System.out.println(maxwealth( arr ));
		
	}

	static int maxwealth(int[][] arr) {
		
		int l = arr.length ;
		int sum = 0;
		int s = 0;
		int [] wealth = new int [l] ;
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				s = arr[i][j];
				sum = sum + s;
				
			}
			wealth [i] = sum ;
			sum = 0;
			
		}
		
		return arraymax(wealth);
		
		
	}

	static int arraymax(int[] wealth) {
		// TODO Auto-generated method stub
		int max = 0;
		
		for (int i = 0 ; i  < wealth.length ; i++) {
			if (wealth[i] > max) {
				max = wealth[i] ;
			}
		}
		return max ;
	}

}
