package A5_Array_and_ArrayList;

import java.util.Arrays;

public class A1_Array_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array -> collection of similiar data type elements.
		
		//Syntax
		int [] arr = new int[5];
		// or
		int [] arr2 = {1,2,3};
		
		int [] row; // array is declared; array is defined in the stack.
		row = new int[5]; // initialization ; object is created in the memory heap.
		
		//shortcut to print a array
		System.out.println(Arrays.toString(arr2));
		//above method converts the array into a string and prints that string +
		
	}

}
