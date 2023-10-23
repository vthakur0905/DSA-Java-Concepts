package A6_Linear_Search;

public class A4_Find_Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 18, 12, -7, -13, 14, 28 };
		
		System.out.println(min(arr));
	}

	static int min(int[] arr) {
		// TODO Auto-generated method stub
		
		int min = 0 ;
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr [i] < min) {
				min = arr[i];
			}
		}
		return min ;
	}

}
