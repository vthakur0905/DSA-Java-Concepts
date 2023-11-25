package C4_Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class A3_HashSet {
    public static void main(String[] args) {

//      creating a hashset
        HashSet<Integer> set = new HashSet<>();

//      inserting in hashset
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);

//      printing the set
        System.out.println(set);

//      to search - contains
        System.out.println(set.contains(5));

//      delete
        set.remove(5);
        System.out.println(set.contains(5));

//      size
        System.out.println(set.size());

//      iterator - to iterate the set , cause set does not have any index
        Iterator it = set.iterator();
//       now iterator has 2 functions : 1. hasNext  2. next


        System.out.println(it.next());// this will print the next item in the hashset, initially set to null.
        System.out.println(it.hasNext());// this check whether there is next item or not;

        System.out.println("-----------------");

//        to print all elements using above 2 functions

        while(it.hasNext()){
            System.out.println(it.next());
        }
        


    }
}
