package A4_Methods;

public class A2_Swap_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(Swap(a , b));
		
		System.out.println(a);
		System.out.println(b);

	}

	static int[] Swap(int a, int b) {

		int temp = a;
		a = b;
		b = temp;
		
		int [] arr = {a , b};
		
		return arr;

	}
}
