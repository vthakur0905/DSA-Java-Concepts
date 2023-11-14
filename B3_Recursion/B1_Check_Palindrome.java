package B3_Recursion;

public class B1_Check_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check(1251));
	}
	
	static int sum = 0;
	static int rev1(int n) {
		
		//base condition
		if ( n <= 0 ) {
			return sum;
		}
		
		int rem = n % 10;
		sum = sum * 10 + rem ;
		return rev1(n/10);
		
	}
	static boolean check(int n) {
		
		return n == rev1(n);
		
		
	}

}
