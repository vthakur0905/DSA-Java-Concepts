package A6_Linear_Search;

import java.util.Arrays;

public class A2_Search_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "vaibhav" ;
		System.out.println(Arrays.toString(name.toCharArray()));
		char target = 'v' ;
		System.out.println(search(name , target));
	}

	static boolean search(String name, char target) {
		// TODO Auto-generated method stub
		
		if (name.length() == 0) {
			return false ;
		}
		
		for (int i = 0 ; i < name.length() ; i++) {
			if (target == name.charAt(i)) {
				System.out.println(i);
				return true ;
			}
		}
		return false ;
		
	}
	
	

}
