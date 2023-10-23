package A6_Linear_Search;

public class A1_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 23, 42, 56, 73, 82 };
		int c = search(arr, 713);
		System.out.println(c);
	}

	static int search(int[] arr, int f) {
		// TODO Auto-generated method stub
		
		for (int i = 0 ; i < arr.length -1 ; i++) {
			if (arr[i] == f) {
				return i ;
			}
		}
		return -1;
	}

}
