package A2_Conditionals_and_loops;
import java.util.*;

public class A6_Count_Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("enter the num to find");
		int a = sc.nextInt();
		int count = 0;
		
		for (int i = 0 ; n > 0 ; i++) {
			if ( a == (n % 10)) {
				count++;
			}
			n = n / 10;
//			i++;
		}
		System.out.println(count);
	}

}
