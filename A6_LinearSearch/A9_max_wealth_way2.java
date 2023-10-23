package A6_Linear_Search;

public class A9_max_wealth_way2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr = {
				{ 1, 2, 3 },
				{ 4, 5 },
				{ 3, 6, 8, 9 },
				{ 2, 3 }
		};
		
		System.out.println(max(arr));
		
	}

	static int max(int[][] arr) {
		// TODO Auto-generated method stub
		int ans = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			
			int sum = 0;
			for (int j = 0 ; j < arr[i].length ; j++) {
				sum = sum + arr[i][j];
			}
			
			if (sum > ans) {
				ans = sum ;
			}
		}
		return ans ;
	}

}
