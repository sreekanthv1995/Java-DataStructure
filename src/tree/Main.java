package tree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bTree = new BinarySearchTree();


        bTree.insert(68);
        bTree.insert(55);
        bTree.insert(70);
        bTree.rInsert(38);

        System.out.println(bTree);
    }
}
