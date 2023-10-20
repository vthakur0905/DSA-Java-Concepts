package A5_Array_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class A2_2D_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HARD-CODED input
		int [] [] arr = {
				{1,2,3},
				{4,5},
				{7,8,9}
		};
		
//		System.out.println(arr[1][1]);
		
		System.out.println(arr.length); // gives the length of rows
		System.out.println(arr[1].length); // gives the length of row 1
		
//		input from user:
		
		
		
		int [] [] arr2 = new int[3][2];
		Scanner sc = new Scanner (System.in);
		
		System.out.println("start giving input");
		
		for (int row = 0 ; row < arr2.length ; row++) {
			for (int col = 0 ; col < arr2[row].length ; col++){
				arr2[row][col] = sc.nextInt();
			}
		}
		
		 
		
		for (int row = 0 ; row < arr2.length ; row++) {
			for (int col = 0 ; col < arr2[row].length ; col++){
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
