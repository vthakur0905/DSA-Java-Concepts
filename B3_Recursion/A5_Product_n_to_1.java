package B3_Recursion;

public class A5_Product_n_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(product(5 , 1));
	}
	static int product(int n , int ans) {
		
		
		// base condition
		if (n == 0) {
			return ans ;
		}
		
		ans = ans*n;
		return product(n-1 , ans);
		
	}

}
