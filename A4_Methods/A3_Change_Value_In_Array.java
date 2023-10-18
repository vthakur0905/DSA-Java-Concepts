package A4_Methods;

public class A3_Change_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("before change");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		changeValue(arr);

		System.out.println("after change");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void changeValue(int[] arr) {
		// TODO Auto-generated method stub
		arr[0] = 98;
	}

}
