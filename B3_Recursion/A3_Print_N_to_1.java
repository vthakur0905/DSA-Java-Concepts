package B3_Recursion;

public class A3_Print_N_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}
	
	static void print(int n) {
		
		// base condition
		if (n <= 0) {
			return;
		}
		
		System.out.println(n);
		print(n-1);
	}

}
