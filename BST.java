public class BST {

    class Node {
        int key; //contains value of the node
        Node left, right, parent; //how we point to the Nodes

        //create a Node
        Node(int value) {
            key = value;
            left = right = null; 
        }
    }

    private Node root; 
    
    //create the binary search tree
    public BST() {
        root = null; 
    }

    //BST Methods
    public int getMin() {
        return 1; 
    }

    public int getMax() {
        return 1; 
    }

    public void insert(int key) {

    }

    public Node search(int key) {
        return root; 
    }

    public Node delete(int key) {
        return root; 
    }

    public int findCeiling(int input) {
        return 1; 
    }

    public int findFloor(int input) {
        return 1; 
    }

    public static void main(String[] args) {
        
    }
    
}
