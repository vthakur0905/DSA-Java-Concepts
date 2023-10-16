package A3_Switch_Statements_Nested_Loops;

import java.util.*;

public class A1_Switch_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();
		
		switch(fruit) {
			case "mango":
				System.out.println("king of fruit");
				break;
			case "apple":
				System.out.println("keeps doctor away");
				break;
			case "orange":
				System.out.println("full of vitamins");
				break;
			default :
				System.out.println("no valid input");
		}
	}

}
