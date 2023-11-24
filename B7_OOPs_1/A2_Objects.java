package B7_OOPs_1;

import java.util.Arrays;

public class A2_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring a object (way 1)
		Student vaibhav;
		vaibhav = new Student();
		
		// declaring a object (way 2)
		Student student1 = new Student();
		System.out.println(student1.rno); // 0
		System.out.println(student1.name); // null
		System.out.println(student1.marks); // 0.0
		
		// declaring values :
		System.out.println("values declared for student1");
		
		student1.rno = 13 ;
		student1.name = "vaibhav";
		student1.marks = 35.5f ;

		System.out.println(student1.rno);
		System.out.println(student1.name); 
		System.out.println(student1.marks); 
		
		// declaring a object with values in itself;
		Student divi = new Student();
		
		
		// declaring a array of Student class
		Student[] vibhi = new Student[5];
		System.out.println(Arrays.toString(vibhi));
//		above statement will give null array as it is not initialized yet.
		
		Student kunal = new Student ();
		
		
	}
	
	
}

class Student{
	int rno;
	String name;
	float marks;
	
	//CONSTRUCTOR
	Student(){
		this.rno = 33 ;
		this.name = "vaibhav";
		this.marks = 88.5f ;
	}
}
// you can also assign a default value to anyone of the properties.
// eg : marks = 90 ;
