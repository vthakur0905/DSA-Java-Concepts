package B3_Recursion;

public class A6_Sum_of_N_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5 , 0));
	}
	static int sum (int n , int ans) {
		
		// base condition
		if ( n == 0) {
			return ans;
		}
		ans = ans + n;
		return sum(n-1 , ans);
	}

}
