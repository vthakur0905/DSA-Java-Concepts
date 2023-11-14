package B4_Recursion_Array;

import java.util.ArrayList;

public class A3_FInd_multiple_occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 21, 4, 65, 61, 3, 65 };
		ArrayList<Integer> myList = new ArrayList<>();
		System.out.println(search(arr, 0, 65, myList));
	}
	
	static ArrayList search (int [] arr , int index , int target, ArrayList<Integer> list ){
		
		// base condition
		if (index == arr.length) {
			return list;
		}
		
		if (arr[index] == target) {
			list.add(index);
		}
		return search(arr, index +1 , target ,list);
		
	}

}
