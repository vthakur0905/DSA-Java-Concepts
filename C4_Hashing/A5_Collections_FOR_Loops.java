package C4_Hashing;

import java.util.HashMap;
import java.util.Map;

public class A5_Collections_FOR_Loops {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

//        basic for loop to transverse / iterate :
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
//        enhanced for loop
        System.out.println("enhanced for loop");

        for (int val : arr){
            System.out.print(val + " ");
        }

        System.out.println();

//        create a hashmap :
        HashMap<String , Integer> map = new HashMap<>();

        map.put("India" , 140);
        map.put("china" , 150);
        map.put("bangladesh" , 17);

        System.out.println(map);

//        transversing using for loop ;
        for (Map.Entry<String , Integer> e : map.entrySet() ){
            System.out.println(e);
        }

//        for loop to just transversing key or value (only one of them)
        for(Map.Entry<String , Integer> i : map.entrySet()){
            System.out.print(i.getKey() + " -> "); // this will only return the key
            System.out.print(i.getValue()); // this will only return the value
            System.out.println();
        }

        System.out.println("-------------");



    }
}
