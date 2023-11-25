package C4_Hashing;

import java.util.HashSet;

public class A8_Q2_Union_of_2arrays {
    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
    }

    public static int union(int [] arr1, int [] arr2){

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }
        for (int i = 0 ; i < arr2.length ; i++){
            set.add(arr2[i]);
        }

        return set.size();
    }
}
