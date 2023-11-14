package B4_Recursion_Array;

public class A2_Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 21, 4, 5, 61, 3, 65 };
		System.out.println(search(arr, 0, 61));
		System.out.println(search1(arr, 0, 61));
	}

	static int search(int[] arr, int index, int target) {

		// base condition
		if (index == arr.length) {
			return -1;
		}

		if (arr[index] == target) {
			return index;
		} else {
			return search(arr, index + 1, target);
		}

	}
	// SECOND WAY
	static boolean search1(int[] arr, int index, int target) {

		// base condition
		if (index == arr.length) {
			return false;
		}
		
		return arr[index] == target || search1(arr , index + 1 , target);

		

	}


}
