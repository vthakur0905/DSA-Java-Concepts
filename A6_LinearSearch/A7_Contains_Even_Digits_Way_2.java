package A6_Linear_Search;

public class A7_Contains_Even_Digits_Way_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = { 12, 345, 2, 6, 7896 };
		
		System.out.println(evendigits(arr));
	}
	static int evendigits(int[] arr) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (even(arr[i]) == true) {
				count ++;
			}
		}
		return count;
	}
	static boolean even(int n) {

		int length = (int) (Math.log10(n) + 1);
		
		if (length % 2 == 0) {
			return true;
		}

		return false;
	}

}
