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
        root = insert(root, key); 
    }
    private Node insert(Node n, int key) {
        //is the tree empty?
        if(root == null) {
            root = new Node(key); 
            return root;
        }
        //traversing the tree for the right spot
        if(n.key > key) {
            n.left = insert(n.left, key); 
        }
        else {
            n.right = insert(n.right, key);
        }

        return root; 
    }


    public Node search(int key) {
        return search(root, key); 
    }
    private Node search(Node n, int key) {
        //is the node in the tree?
        if(n == null) {
            return null; 
        }
        //if we find the key
        if(n.key == key) {
            return n; 
        }
        //traversing the tree
        else if(n.key > key) {
            return search(n.left, key); 
        }
        else {
            return search(n.right, key); 
        }
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

    //driver

    public static void main(String[] args) {
        
    }
    
}
