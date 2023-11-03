package A7_Binary_Search;

public class A2_Order_Agnostic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println(binarysearch( arr , 4));
		
		
	}

	static int binarysearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start = 0 ;
		int end = arr.length - 1;
		int mid = 0;
		
		if (ascending(arr)) {
			while (arr.length > 0) {
								
				while (start <= end) {
					
					mid = (start + end)/2;
					
					if (arr[mid] == target) {
						return mid;
					}
					else if (target > arr[mid]) {
						start = mid + 1 ;
					}
					else if (target < arr[mid]) {
						end = mid - 1;
					}
									
				}
				
			}
		}
		else {
			while (arr.length > 0) {
				
				
				while (start <= end) {
					
					mid = (start + end)/2;
					
					if (arr[mid] == target) {
						return mid;
					}
					else if (target < arr[mid]) {
						start = mid + 1 ;
					}
					else if (target > arr[mid]) {
						end = mid - 1;
					}
									
				}
				
			}
		}
		return -1;
	}

	static boolean ascending(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0 ;
		if (arr [i] < arr[i+1]) {
			return true;
		}
		
		return false;
		
	}

}
