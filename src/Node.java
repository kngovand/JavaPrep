public class Node {
    private int data;
    private Node next;

    public static void main(String[] args) {
        Node x = new Node(1, null);
        Node y = new Node(2, x);
        Node z = new Node(3, y);

        Node iterator = z;
        do {
            System.out.println("Node value: " + iterator.getData());
            iterator = iterator.getNext();
        } while (iterator != null);
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }


}
