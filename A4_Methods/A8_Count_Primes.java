package A4_Methods;

public class A8_Count_Primes {
	
	//Given an integer n, return the number of prime numbers that are strictly less than n.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(9);
	}
	
	static void prime(int n) {
		
		if( n < 2) {
			System.out.println(0);
		}
		
		
		for (int i = 2 ; i <=n ; i++) {
			
			for (int j = 2 ; j <= i ; j++ ) {
				
				if ( i%j == 0) {
					System.out.println(i);
				}
				
			}
		}
		
		
		
		
	}

}
