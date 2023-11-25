package C4_Hashing;

import java.util.HashSet;

public class A9_Q3_Intersection_of_2_arrays {
    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,2,9,4};
        System.out.println(inter(arr1,arr2));
    }

    public static HashSet<Integer> inter(int [] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int count = 0;

        for (int i = 0 ; i< arr1.length ; i++){
            set.add(arr1[i]);
        }
        for (int i = 0 ; i< arr2.length ; i++){
            if (set.contains(arr2[i])){
                set1.add(arr2[i]);
            }
        }


        return set1 ;
    }
}
