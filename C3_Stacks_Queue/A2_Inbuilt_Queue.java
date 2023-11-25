package C3_Stacks_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class A2_Inbuilt_Queue {
    public static void main(String[] args) {
//      queue is an interface which means that it extends Linked-list.


        Queue<Integer> queue = new LinkedList<>();
        queue.add(4); // first element to add, first element to remove (FIFO)
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue.peek()); // returns the first element
        System.out.println(queue.remove()); // removes the last element
        System.out.println(queue.peek());
    }
}
