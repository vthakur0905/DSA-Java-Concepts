package A5_Array_and_ArrayList;
import java.util.Scanner;

public class A4_Jagged_Array_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("JAGGED ARRAY PROGRAM");
		
		System.out.println("enter the number of rows");
		int n = sc.nextInt();
		int [] [] arr = new int [n] [];
		
		for (int row = 0 ; row < n ; row++) {
			
			System.out.println("enter the number of coloumn for row " + (row + 1));
			int c = sc.nextInt();
			arr[row] = new int [c] ;
			
			System.out.println("enter the elements for the same : ");
			for(int col = 0 ; col < c ; col++) {
				arr[row][col] = sc.nextInt();
				}
		}
		
		for (int row = 0 ; row < arr.length ; row++) {
			for (int col = 0 ; col < arr[row].length ; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
