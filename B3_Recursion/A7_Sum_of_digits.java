package B3_Recursion;

public class A7_Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(1234 , 0));
		System.out.println(sum1(1234));
		
	}
	
	static int sum(int n , int ans) {
		
		// base condition
		if ( n <= 0 ) {
			return ans;
		}
		
		int rem = n % 10;
		ans = ans + rem ;
		return sum( n / 10 , ans);
	}
	
	//SECOND WAY
	static int sum1(int n ) {
		
		// base condition
		if ( n == 0 ) {
			return 0;
		}
		
		
		return (n%10) + sum1(n/10);
	}

}
