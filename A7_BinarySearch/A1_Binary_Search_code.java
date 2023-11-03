package A7_Binary_Search;

public class A1_Binary_Search_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find 34 in the below array.

		int[] arr = { 12, 23, 34, 45, 56, 67, 78, 89 };
		
		System.out.println(search(arr,89));

	}

	static int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int start = 0 ;
		int end = arr.length - 1;
		int mid = 0;
		
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
		return -1;
		
		
		
	}
	
	

}
