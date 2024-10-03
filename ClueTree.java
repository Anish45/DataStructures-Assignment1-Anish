class ClueTree {
    static class Node {
        String clue; // The clue stored in the node
        Node left;  // Left child
        Node right; // Right child

        Node(String clue) {
            this.clue = clue;
            this.left = null;
            this.right = null;
        }
    }

    private Node root; // Root of the binary tree

    public ClueTree() {
        this.root = null; // Initialize the root to null
    }

    // Method to insert a new clue into the tree
    public void insert(String clue) {
        root = insertRec(root, clue);
    }

    // Recursive method to insert a new clue
    private Node insertRec(Node root, String clue) {
        if (root == null) {
            root = new Node(clue);
            return root;
        }

        // Assuming clues are inserted based on alphabetical order
        if (clue.compareTo(root.clue) < 0) {
            root.left = insertRec(root.left, clue);
        } else if (clue.compareTo(root.clue) > 0) {
            root.right = insertRec(root.right, clue);
        }
        // If the clue is already present, we do not insert it again
        return root;
    }

    // Method for in-order traversal
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.clue + " ");
            inOrderRec(root.right);
        }
    }

    // Method for pre-order traversal
    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.clue + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Method for post-order traversal
    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.clue + " ");
        }
    }

    // Method to find a specific clue in the tree
    public boolean find(String clue) {
        return findRec(root, clue);
    }

    private boolean findRec(Node root, String clue) {
        if (root == null) {
            return false; // Clue is not found
        }
        if (root.clue.equals(clue)) {
            return true; // Clue found
        }
        // Search in left or right subtree
        return clue.compareTo(root.clue) < 0 ? findRec(root.left, clue) : findRec(root.right, clue);
    }

    // Method to count the total number of clues in the tree
    public int countClues() {
        return countRec(root);
    }

    private int countRec(Node root) {
        if (root == null) {
            return 0; // Base case
        }
        // Count current node + left subtree + right subtree
        return 1 + countRec(root.left) + countRec(root.right);
    }

    public static void main(String[] args) {
        ClueTree clueTree = new ClueTree();

        // Insert clues
        clueTree.insert("Clue A");
        clueTree.insert("Clue C");
        clueTree.insert("Clue B");
        clueTree.insert("Clue D");

        // Print all added clues
        System.out.println("All Added Clues:");
        clueTree.inOrder(); 
        System.out.println(); 

        // Perform traversals
        System.out.println("In-Order Traversal:");
        clueTree.inOrder(); // Should print clues in alphabetical order
        System.out.println();

        System.out.println("Pre-Order Traversal:");
        clueTree.preOrder(); // Should print clues in pre-order
        System.out.println();

        System.out.println("Post-Order Traversal:");
        clueTree.postOrder(); // Should print clues in post-order
        System.out.println();

        // Find clues
        System.out.println("Finding 'Clue B': " + clueTree.find("Clue B")); // Should return true
        System.out.println("Finding 'Clue E': " + clueTree.find("Clue E")); // Should return false

        // Count clues
        System.out.println("Total number of clues: " + clueTree.countClues()); // Should return the count of clues
    }
}