package A5_Array_and_ArrayList;

import java.util.ArrayList;

public class A5_ArrayList_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>(10);
		//here 10 is doing nothing, it is just the initial capacity.
		
		list.add(67);
		list.add(627);
		list.add(671);
		list.add(673);
		list.add(167);
		list.add(697);
		list.add(627);
		
		//to print the list
		System.out.println(list);
		
		//to get the element at a particular index
		System.out.println(list.get(4));
		
		//to update the value at a particular index
		list.set(1, 85);
		System.out.println(list);
		
		//remove value from a particular index
		//list.remove(2);
		
		// to get a item at a particular index
		System.out.println(list.get(5));
		
	
		
		
	}

}
