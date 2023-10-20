package A5_Array_and_ArrayList;

public class A3_jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr = {
				{1,2,3,4},	
				{4,5},	
				{6,7,8}
		};
		//print the above array
		
		for(int row = 0 ; row < arr.length ; row++) {
			for(int col = 0 ; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
