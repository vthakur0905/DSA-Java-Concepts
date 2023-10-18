package A4_Methods;

public class A4_Shadowing {
	
	static int x = 90 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 45 ;
		System.out.println("inside main function :");
		System.out.println(x);
		
		fun();
	}

	static void fun() {
		// TODO Auto-generated method stub
		System.out.println("outside main function: ");
		System.out.println(x);
	}
	
	

}
