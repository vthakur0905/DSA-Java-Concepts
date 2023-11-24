package B6_Recursion_Subset;

public class A1_remove_char_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav";
		System.out.println(skip(str , 'a' , 0 , ""));
	}
	
	static String skip(String str , char s, int i, String ans ) {
		if ( i == str.length()) {
			return ans;
		}
		
		if (str.charAt(i) != s) {
			ans = ans + str.charAt(i);
		}
		
		return skip( str , s , i +1 , ans);
	}

}
