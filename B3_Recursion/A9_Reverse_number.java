package B3_Recursion;

public class A9_Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev(1234);
		System.out.println();
		System.out.println(rev1(1234));
	}
	
	static void rev(int n) {
		
		//base condition
		if ( n <= 0 ) {
			return;
		}
		
		int a = n % 10;
		System.out.print(a);
		rev(n/10);
		
	}
	static int sum = 0;
	static int rev1(int n) {
		
		//base condition
		if ( n <= 0 ) {
			return sum;
		}
		
		int rem = n % 10;
		sum = sum * 10 + rem ;
		return rev1(n/10);
		
	}

}
