package A2_Conditionals_and_loops;
import java.util.*;

public class A2_largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		if (a > b) {
//			System.out.println(a);
//		}
//		else if (c > b) {
//			System.out.println(c);
//		}
//		else {
//			System.out.println(b);
//		}
		
		// another method to find largest number
		int max = a ;
		
		if (b > max) {
			max = b ;
		}
		if (c > max) {
			max = c ;
		}
		System.out.println(max);
		
		// using math.max function to find the largest number
		
		System.out.println(Math.max(85, 87));
		
		// to use the above function with three numbers
		
		System.out.println(Math.max(56, Math.max(8, 3)));
		
	}
	

}
