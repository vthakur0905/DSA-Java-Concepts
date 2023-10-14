package A1_Basics;

import java.util.Scanner;

public class A3_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
//		System.out.println("enter the input: ");
//		int rollno = sc.nextInt();
//		System.out.println("your roll number is : " + rollno);
		
		String intro = sc.next(); // only takes the first word
		System.out.println(intro);
		String intro2 = sc.nextLine(); // takes the whole line
		System.out.println(intro2);

		
		}

}
