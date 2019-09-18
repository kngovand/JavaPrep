public class BST {

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static class Tree {
        public Node newNode(int num) {
            Node x = new Node();
            x.data = num;
            x.left = null;
            x.right = null;
            return x;
        }

        public Node insert(Node n, int num) {
            if(n == null) {
                return newNode(num);
            }
            if(num < n.data) {
                n.left = insert(n.left, num);
            }
            else if(num > n.data) {
                n.right = insert(n.right, num);
            }
            return n;
        }
        //To complete
        public Node delete(Node n, int num) {
            if(n == null) {
                return null;
            }
            if(num < n.data) {
                n.left = delete(n.left, num);
            }
            else if(num > n.data) {
                n.right = delete(n.right, num);
            }
            else {
                if(n.left == null || n.right == null) {
                    Node temp = null;
                }
            }
            return n;
        }

        public void print(Node n) {
            if(n == null) {
                return;
            }
            print(n.left);
            System.out.println(n.data + " ");
            print(n.right);
        }
    }

    public static void main(String[] args) {
        Tree x = new Tree();
        Node root = null;
        root = x.insert(root, 17);
        root = x.insert(root, 8);
        root = x.insert(root, 5);
        root = x.insert(root, 600);
        root = x.insert(root, 7);
        x.print(root);


    }


}
