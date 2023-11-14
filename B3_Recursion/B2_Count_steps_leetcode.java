package B3_Recursion;

public class B2_Count_steps_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(steps(8));
	}

	static int ans = 0;

	static int steps(int num) {
		
		// base condition
		if ( num <= 0) {
			return ans;
		}
		
		if (num%2 ==0) {
			ans++;
			return steps(num/2);
		}
		else {
			ans++;
			return steps(num-1);
		}
	}

}
