package A4_Methods;

public class A7_IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 59;
		
		System.out.println(prime(n));
	}
	
	static boolean prime(int n) {
		
		if ( n <= 1) {
			return false;
		}
		
		int d = 2 ;
		while ( d < n) {
			if ( n % 2 == 0) {
				return false ;
			}
			d++;
		}
		return true;
	}

}
