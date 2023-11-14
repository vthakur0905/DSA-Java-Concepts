package B3_Recursion;

public class A10_count_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(10101010));
	}
	
	static int ans = 0;
	static int count(int n) {
		
		// base condition
		if (n <= 0) {
			return ans;
		}
		
		int rem = n % 10 ;
		if (rem == 0) {
			ans++;
		}
		return count(n/10);
	}
}
