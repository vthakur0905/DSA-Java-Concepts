package A2_Conditionals_and_loops;

import java.util.Scanner;

public class A5_Fibonacci_Nth_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		for (int i = 0; i < n ; i++) {
			c = a + b;
			a = b;
			b = c;
			i++;
		}
		System.out.println(c);
		
	}

}
