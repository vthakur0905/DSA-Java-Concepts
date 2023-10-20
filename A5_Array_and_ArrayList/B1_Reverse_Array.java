package A5_Array_and_ArrayList;

public class B1_Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	static void reverse(int [] arr) {
//		int i = 0 ;
		int s = 0 ;
		int e = arr.length - 1;
		
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			
			s++;
			e--;
			
		}
	}
	

}
 