package B4_Recursion_Array;

public class A1_Check_Array_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		System.out.println(sort(arr , 0));
	}
	
	static boolean sort(int [] arr , int i) {
		
		if (i == arr.length - 1) {
			return true;
		}
		
		return arr[i] < arr[i+1] && sort(arr , i+1);
	}

}
