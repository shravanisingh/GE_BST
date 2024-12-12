class BinarySearchTree {
    private Node root;

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node current) {
        if (current == null) {
            return 0;
        }
        return 1 + sizeRecursive(current.left) + sizeRecursive(current.right);
    }

    public void inorderTraversal() {
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(Node node) {
        if (node != null) {
            inorderTraversalRecursive(node.left);
            System.out.print(node.data + " ");
            inorderTraversalRecursive(node.right);
        }
    }
    public boolean search(int data) {
        return searchRecursive(root, data);
    }
    private boolean searchRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        if (data < current.data) {
            return searchRecursive(current.left, data);
        } else {
            return searchRecursive(current.right, data);
        }
    }

}