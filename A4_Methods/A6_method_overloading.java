package A4_Methods;

public class A6_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// method overloading :
		// It means that method with same name can exist but with different arguments.
		
		fun("vaibhav");
		fun(76);
		
	}
	static void fun(int a) {
		System.out.println(a);
	}
	static void fun(String b) {
		System.out.println(b);
	}

}
