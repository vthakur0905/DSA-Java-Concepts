package A5_Array_and_ArrayList;
import java.util.*;

public class A6_ArrayList_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0 ; i < 5 ; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(list);
		
		System.out.println("print using for loop");
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
