package B3_Recursion;

public class A2_Fibo_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibo(4));
	}
	
	public static int fibo(int n) {
		// base case
				if (n == 0) {
					return 0;
				} else if (n == 1) {
					return 1;
				}
//				can also use this as base cond.
//				if(n < 2) {
//					return n ;
//				}

//				int c = fibo(n - 1);
//				int d = fibo(n - 2);
//				int e = c + d;
				return fibo(n-1) + fibo(n-2);
	}

}
