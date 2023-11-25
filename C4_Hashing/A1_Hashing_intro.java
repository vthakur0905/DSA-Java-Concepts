package C4_Hashing;

import java.util.Scanner;

public class A1_Hashing_intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the size of array");
        int n  = sc.nextInt();

        int [] arr = new int [n];


        System.out.println("enter the array");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int [] hash = new int [13]; // 13 here is the max element in the given array.
        for (int i = 0 ; i < n ; i++){
            hash[arr[i]]++;
        }

        System.out.println(hash[2]);


    }
}
