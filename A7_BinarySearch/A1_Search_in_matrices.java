package A9_Binary_Search_IN_2D_arrays;

public class A1_Search_in_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr = {
				{10 , 20 , 30 , 40},
				{15 , 25 , 35 , 45},
				{28 , 29 , 37 , 49},
				{33 , 34 , 38 , 50}
		};
		
		search( arr, 34);
	}

	static int[] search(int[][] arr, int target) {
		// TODO Auto-generated method stub
		
		int r = 0 ; //for row
		int c = arr.length ; // for coloumn
		
		while (r < arr.length && c>= 0) {
			
			if (arr[r][c] == target) {
				return new int[] {r,c};
			}
			else if (arr[r][c] < target) {
				r++;
			}
			else if (arr[r][c] > target) {
				c--;
			}
		}
		return new int[] {-1,-1};
		
	}


}
