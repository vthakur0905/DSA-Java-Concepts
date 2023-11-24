package B7_OOPs_1;

public class A3_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 vaibhav = new Student1(12 , "Vaibhav Thakur", 98f) ;
		Contact1 vaibhav1 = new Contact1(12 , 88888, "Vaibhav Thakur") ;
		Student1 kunal = new Student1(13, "Kunal Kushwaha", 92f) ;
		
		System.out.println(vaibhav.rno);
		System.out.println(vaibhav.name);
		System.out.println(vaibhav.marks);
		
		System.out.println(kunal.rno);
		System.out.println(kunal.name);
		System.out.println(kunal.marks);
		
		System.out.println(vaibhav1.phone);
		
		Student1 one = new Student1() ;
		Student1 two = one ;
		
		one.name = "sp";
		System.out.println(two.name);
		
		
	}


public static class Contact1{
	int rno;
	int phone;
	String name;
	
	Contact1 (int rno, int phone, String name){
		this.rno = rno;
		this.phone = phone;
		this.name = name;
	}
}

public static class Student1 {
	int rno ;
	String name ;
	float marks ;
	
	
	Student1(){
		this.rno = 8;
		this.name = "vaibhav" ;
		this.marks = 88.5f ;
	}
	

	
//	--> PARAMETRIZED CONSTRUCTOR
	Student1 (int rno , String name, float marks){
		this.rno = rno ;
		this.name = name;
		this.marks = marks;
	}
	
//	--> this constuctor will take details from other function / constructor
	Student1 (Student other){
		this.name = other.name;
		this.rno = other.rno;
		this.marks = other.marks;
		
	}
	
	
}
	
}
