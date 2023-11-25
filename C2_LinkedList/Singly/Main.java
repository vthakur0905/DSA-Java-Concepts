package C2_LinkedList.Singly;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();

        LL list = new LL(); // default size will be zero as per our constructor.

        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(7);

        list.display();


    }
}
