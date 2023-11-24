package B7_OOPs_1;

public class A4_Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a = 5; // created as a primitive datatype.
		int b = 15; // created as a primitive datatype.
		
		Integer c = 45 ; // created as a object.  
		
//		when you create a primitive data type you dont get many operations to perform.
//		but when you create a Integer you get many more operations.
		System.out.println(a + " "  + b);
		swap(a,b);
		System.out.println(a + " "  + b);
		
	}
	
	static void swap (int a  , int b){
		int temp = a ; 
		a  = b ;
		b = temp;
		
	}

}
