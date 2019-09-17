public class IntStack {

    private int[] stack;
    private int counter;

    public IntStack(int i) {
        stack = new int[i];
        counter = 0;
    }

    public void push(int i) {
        stack[counter] = i;
        counter++;
    }

    public void pop() {
        counter--;
        int data = stack[counter];
        stack[counter] = 0;
    }

    public void print() {
        int number = stack.length-1;
        while(number >= 0) {
            System.out.println(stack[number]);
            number--;
        }
    }

    public int size() {
        return counter;
    }

    public int peek() {
        return stack[counter-1];
    }

    public boolean isEmpty() {
        return counter <= 0;
    }
}
