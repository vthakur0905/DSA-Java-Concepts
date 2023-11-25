package C4_Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class A4_Hashmap {
    public static void main(String[] args) {

//        country (key), population(value)
        HashMap<String , Integer> map = new HashMap<>();

//        insertion
        map.put("India" , 140);
        map.put("Bangladesh" , 17);
        map.put("China" , 130);

//        print
        System.out.println(map);

//        again putting same key but with different value
        map.put("China" , 180); // this will update the value of the previous key present there

//        Search
        System.out.println(map.containsKey("China"));
        if (map.containsKey("indonesia")) {
            System.out.println("yes it is present");
        }
        else{
            System.out.println("no it is not present");
        }

        System.out.println("-----------------");

//        Get value corresponding to a key
        System.out.println(map.get("India")); // here key is present
        System.out.println(map.get("USA")); // here key is not present

//        remove a particular key with its value
        map.remove("China");

        System.out.println(map);

    }
}
