package A4_Methods;

import java.util.Arrays;

public class A5_VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// when you dont know how many inputs you will give then we use VarArgs.		
		// VarArgs -> variable length arguments.
		// example -> static void fun(int ...x) :-> it will take a array of integers as input.
		// example -> static void fun(string ...x) :-> it will take a array of string as input.
		
		fun(2,3,5,5,6,3,3,2,42,23);
		System.out.println();
		
		System.out.println("empty array");
		fun();
		System.out.println();
		
		System.out.println("Mixed input -> VarArgs + fixed");
		multiple(5 , 6, "VAibhav", "thakur");
	}
	
	static void fun (int ...x) {
		System.out.println(Arrays.toString(x));
	}
	
	//MIXED ARGUMENTS:	
	static void multiple(int x , int v ,String ...y) {
		System.out.println(x);
		System.out.println(v);
		System.out.println(Arrays.toString(y));
	}

}
