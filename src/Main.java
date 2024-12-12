public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] elements = {56, 30, 70, 22, 40, 60, 95, 3, 16, 65, 63, 67};

        for (int element : elements) {
            tree.add(element);
        }

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal();

        System.out.println("\nSize of the tree: " + tree.size());

        System.out.println("Search for 63: " + tree.search(63));
        System.out.println("Search for 100: " + tree.search(100));
    }
}