package B4_Recursion_Array;

import java.util.ArrayList;

public class A4_return_list_without_passing_arraylist {

// return a list from recursive function without passing arraylist into arguments.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 21, 4, 65, 61, 3, 4 , 65 };
		ArrayList<Integer> myList = new ArrayList<>();
		 System.out.println(findAllIndex(arr, 65, 0));
	}

	static ArrayList findAllIndex(int[] arr, int target, int index) {

		ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
	}

}
