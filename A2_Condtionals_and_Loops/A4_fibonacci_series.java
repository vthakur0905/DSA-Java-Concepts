package A2_Conditionals_and_loops;

public class A4_fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 5;
		int a = 0;
		int b = 1;
		System.out.println(0);
		
		for (int i = 1 ; i < 5 ; i++) {
			int c = a + b ;
			System.out.println(c);
			a = b;
			b = c;
			
		}
	}

}
