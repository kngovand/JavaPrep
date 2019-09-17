import java.util.*;

public class Stack {
    public static void main(String[] args) {
        IntStack stack = new IntStack(3);
        stack.push(15);
        stack.push(10);
        stack.push(50);
        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
