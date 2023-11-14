package B3_Recursion;

public class A4_print_1_to_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5 , 1);
	}
	
	static void print(int n , int i) {
		
		
		
		// base condition
		if (i > n) {
			return;
		}
		
		System.out.println(i);
		print( n , i+1);
		
	}
}
