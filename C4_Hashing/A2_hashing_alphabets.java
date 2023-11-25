package C4_Hashing;

import java.util.Scanner;

public class A2_hashing_alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = "vaibhav" ;

//        precompute
        int [] hash = new int[26] ;
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }


        int q = sc.nextInt() ;
        while (q-- > 0){
            char c ;
            c = sc.next().charAt(0) ;
            System.out.println(hash[c - 'a']);
        }

    }
}
