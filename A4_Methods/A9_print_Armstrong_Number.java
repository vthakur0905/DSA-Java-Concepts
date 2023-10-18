package A4_Methods;

public class A9_print_Armstrong_Number {
	
	public static void main(String[] args) {
		System.out.println("hello");
		for (int i = 100 ; i < 1000 ; i++) {
			if (isArmstrong(i)) {
				System.out.println(i + " ");
			}
		}
		System.out.println("bye");
		
//		System.out.println(isArmstrong(153));
	}
	
	static boolean isArmstrong (int n) {
		
		int sum = 0;
		int original = n;
		if (original < 0) {
			return false;
		}
		
		while ( n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + rem*rem*rem ;
		}
		
		return sum == original;
	}
}
