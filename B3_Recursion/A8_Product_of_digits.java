package B3_Recursion;

public class A8_Product_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(product(512));
	}
	
	static int product (int n) {
		
		// base condition
		if (n == 0) {
			return 1;
		}
		
		return (n%10) * product(n/10);
	}

}
