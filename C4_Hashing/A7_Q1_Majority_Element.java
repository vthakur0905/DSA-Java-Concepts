package C4_Hashing;

// ques link = https://leetcode.com/problems/majority-element/
// approach - using hashmap : put the keys in the map, and update the only freq if the number is found again.

import java.util.HashMap;

public class A7_Q1_Majority_Element {

    public static void MajorityElement(int [] arr){

        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0 ; i < arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i] , 1);
            }
        }

        for (int key : map.keySet() ){
            if (map.get(key) > arr.length/2){
                System.out.println(key);
            }
        }


    }



    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};

        MajorityElement(arr);



    }
}
