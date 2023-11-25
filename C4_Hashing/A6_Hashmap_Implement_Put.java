package C4_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class A6_Hashmap_Implement_Put {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India" , 140);
        map.put("US" ,100);
        map.put("brazil" ,80);

        System.out.println(map.isEmpty());
        System.out.println(map.keyset());
        System.out.println(map.get("US"));

        System.out.println("-----------------");

        ArrayList<String> keys = map.keyset();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }


    }


    static class HashMap<K,V>{ // generics : a general type of variable which is K(key) and V(Value), we don't the data type, so we write generic type.
        private class Node{
            K key ;
            V value ;

            public Node (K key, V value){
                this.key = key ;
                this.value = value ;
            }
        }

        private int n ; // n -> no of nodes
        private int N ; // N -> no of buckets / size of array
        private LinkedList<Node> [] buckets ;

        public HashMap(){
            this.N = 4 ;
            this.buckets = new LinkedList[4];
            for (int i = 0 ; i<4 ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
            // Maths.abs converts negative value to positive value. and value should be in range (0 , n-1) , hence we take remainder.

        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi] ;
            int di = 0 ;
            for (int i = 0 ; i < ll.size() ; i++){
                if (ll.get(i).key == key){
                    di = i ;
                    return di;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> [] oldBuckets = buckets ; // stored values of bucket into temp.
            buckets = new LinkedList[N*2] ; // created a ll of double size.

            // make a null ll at each bucket
            for (int i = 0; i < N*2 ; i++) {
                buckets[i] = new LinkedList<>();
            }

            // shifting values from old bucket(temp) to new bucket ;
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i] ;
                for (int j = 0; j < ll.size() ; j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key,V value){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi); // di = data index = where it is residing in that particular LL.

            if (di == -1){
                // key doesn't exist, create a new one.
                buckets[bi].add(new Node(key , value));
                n++ ;
            }
            else {
                //key exists , just update the prev one.
                Node data = buckets[bi].get(di);
                data.value = value ;
            }

            double lambda = (double) n / N ;
            if( lambda > 2.0){
                // perform rehashing
                rehash() ;
            }
        }

        public V get(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi); // di = data index = where it is residing in that particular LL.

            if (di == -1){
                // key doesn't exist, return null.
                return null;
            }
            else {
                //key exists , just return the value.
                Node data = buckets[bi].get(di);
                return data.value  ;
            }
        }

        public boolean contains(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi); // di = data index = where it is residing in that particular LL.

            if (di == -1){
                // key doesn't exist, return false ;
                return false ;
            }
            else {
                //key exists , return true ;
                return true ;
            }
        }

        public V remove(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi); // di = data index = where it is residing in that particular LL.

            if (di == -1){
                // key doesn't exist, nothing to remove , return null;
                return null ;
            }
            else {
                //key exists , just update the prev one.
                Node data = buckets[bi].get(di);
                Node node = buckets[bi].remove(di);
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<K>();

            for (int i = 0; i < buckets.length ; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys ;
        }



    }

}

