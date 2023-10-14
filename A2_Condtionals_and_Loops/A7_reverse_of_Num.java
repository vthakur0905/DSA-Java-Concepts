package A2_Conditionals_and_loops;

import java.util.Scanner;

public class A7_reverse_of_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to reverse:");
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 0; n > 0; i++) {
			int rem = n % 10;
//			System.out.print(rem);
			n = n / 10;
			
			ans = ans * 10 + rem;
		}
		System.out.println(ans);
	}
}
