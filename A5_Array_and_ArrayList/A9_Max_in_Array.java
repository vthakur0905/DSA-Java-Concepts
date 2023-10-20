package A5_Array_and_ArrayList;

public class A9_Max_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 222, 31, 4, 5 };

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
//		int c = max(arr);
		System.out.println(max(arr));
		
	}

	static int max(int[] arr) {
		// TODO Auto-generated method stub
		
		int m = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
				
		}
		
		return m ;
	}

}
