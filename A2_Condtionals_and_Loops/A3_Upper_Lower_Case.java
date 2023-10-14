package A2_Conditionals_and_loops;

import java.util.Scanner;

public class A3_Upper_Lower_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		char ch = sc.next().trim().charAt(0);
		System.out.println(ch);
		
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower case");
		}
		else {
			System.out.println("Uppercase");
		}
		
				
	}

}
