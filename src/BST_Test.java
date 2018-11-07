public class BST_Test {
    public static void main(String[] args) {
        BinarySearchingTree<String> tree = new BinarySearchingTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("Inorder(sorted):");
        tree.inorder();
        System.out.println("the number of nodes is: "+tree.getSize());
    }
}
