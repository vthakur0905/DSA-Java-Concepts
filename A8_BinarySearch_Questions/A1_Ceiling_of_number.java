package A8_Binary_Search_Question_Imp;

public class A1_Ceiling_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");

		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		
		System.out.println(ceiling(arr , 8  ));
		
		System.out.println("bye");
 
	}

	static int ceiling(int[] arr, int target) {
		// TODO Auto-generated method stub
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {

            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }
        return arr[start];
		
		
		
	}

}
