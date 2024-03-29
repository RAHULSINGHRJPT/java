//-Design a java code for implementing Binary Search, pass array as parameter to the method
public class binary {
    
    Node root;

    int getLevelDiff(Node node) {
        if (node == null)
            return 0;

        return node.data - getLevelDiff(node.left) - getLevelDiff(node.right);
    }

    public static void main(String[] args) {
        binary tree = new binary();

        // Creating the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int levelDiff = tree.getLevelDiff(tree.root);
        System.out.println("Difference between the sum of odd level and even level nodes: " + levelDiff);
    }
}

