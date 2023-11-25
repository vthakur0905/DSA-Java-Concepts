package C3_Stacks_Queue;

import java.util.Stack;

public class A1_Inbuilt_stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); //new object of stack is created. the variable name is in stack memory, and the actual object is in heap memory.
        stack.push(34); // first item, to be removed at last.
        stack.push(35);
        stack.push(36);
        stack.push(37); // last item, to be removed at first.

        System.out.println(stack.pop()); // 37 will be removed.
        System.out.println(stack.pop()); // 36 will be removed.
        System.out.println(stack.pop()); // 35 will be removed.
        System.out.println(stack.pop()); // 34 will be removed.

        System.out.println(stack.empty()); // returns true or false whether stack is empty or not.

        System.out.println(stack.elements());
    }
}
