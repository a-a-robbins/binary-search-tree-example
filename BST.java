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
    public int getMin(Node n) {
        Node current = n; 
        //traverse the tree
        while(current.left != null) {
            current = current.left;
        }
        return current.key; 
    }


    public int getMax(Node n) {
        Node current = n; 
        //traverse the tree
        while(current.right != null) {
            current = current.right;
        }
        return current.key; 
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
        return delete(root, key); 
    }
    private Node delete(Node n, int key) {
        //is the node in the tree?
        if(n == null) {
            return null; 
        }
        //traversing
        if(n.key > key) {
            n.left = delete(n.left, key);
        }
        else if(n.key < key) {
            n.right = delete(n.right, key); 
        }
        //we found target node
        else {
            //case 1: node is a leaf
            if(n.left == null && n.right == null) {
                return null; 
            }
            //case 2: node has 1 subtree (1 child)
            if(n.left == null) {
                return n.right;
            }
            else if(n.right == null) {
                return n.left;
            }
            //case 3: node has 2 subtrees (2 children)
            int replaceKey = getMin(n.right); 
            n.key = replaceKey; 
            n.right = delete(n.right, key); 
        }
        return n; 
    }


    public int findCeiling(int input) {
        return 1; 
    }


    public int findFloor(int input) {
        return 1; 
    }

    //traversal methods

    //traversal 1: post-order
    //biggest -> smallest
    public void printPostOrder() {
        printPostOrder(root); 
    }
    private void printPostOrder(Node n) {
        //is the node null?
        if(n == null) return; 
        printPostOrder(n.left); 
        printPostOrder(n.right); 
        System.out.println(n.key + " "); 
    }

    public void printPreOrder() {
        printPreOrder(root); 
    }
    private void printPreOrder(Node n) {
        //is the node null?
        if(n == null) return; 
        System.out.print(n.key + " "); 
        printPreOrder(n.left); 
        printPreOrder(n.right); 
    }

    public void printInOrder() {
        printInOrder(root); 
    }
    private void printInOrder(Node n) {
        //is the node null?
        if(n == null) return; 
        printInOrder(n.left); 
        System.out.print(n.key + " "); 
        printInOrder(n.right); 
    }

    //traversal 2: in-order
    //in order from tree, smallest -> biggest

    //traversal 3: pre-order
    //root + smallest -> biggest

    //driver
    public static void main(String[] args) {
        BST tree = new BST(); 

        tree.insert(45); 
        tree.insert(100); 
        tree.insert(42); 
        tree.insert(5); 
        tree.insert(99); 
        tree.insert(140); 
        tree.insert(9); 
        tree.insert(1); 
        tree.printInOrder(); 
    }
    
}
