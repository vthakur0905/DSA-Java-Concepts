package B3_Recursion;

public class A1_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}
	
	static void print(int n) {
		//base condition
		if (n > 5) {
			return;
		}
		
		System.out.println(n);
		print(n+1);
	}

}
