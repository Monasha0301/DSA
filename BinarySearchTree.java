public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    Node root;

    // Insert
    Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else
            node.right = insert(node.right, key);

        return node;
    }

    // Inorder Traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.println("Inorder Traversal:");
        bst.inorder(bst.root);
    }
}
