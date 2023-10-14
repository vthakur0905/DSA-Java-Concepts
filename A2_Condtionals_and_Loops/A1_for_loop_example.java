package A2_Conditionals_and_loops;

import java.util.Scanner;

public class A1_for_loop_example {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for (int i = 1 ; i <= n ; i++) {
//			System.out.println(i);
//		}
//	}

//	same code with while loop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0 ;

		while (i <= n) {
			System.out.println(i);
			i++;
		}

	}

}
