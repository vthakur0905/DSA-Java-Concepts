package A6_Linear_Search;

public class A3_Search_In_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Search for 3 in the given below array from range [1,4].

		int[] arr = { 18, 12, -7, 3, 14, 28 };
		
		System.out.println(search(arr ,14 , 1 , 4));

	}

	static boolean search(int [] arr ,int target, int s, int e) {
		// TODO Auto-generated method stub
		
		if (arr.length == 0) {
			return false ;
		}
		
		for (int i = s ; i <= e ; i++) {
			if(target == arr[i]) {
				return true;
			}
		}
		return false;
		
	}

}
