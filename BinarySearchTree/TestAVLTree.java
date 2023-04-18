package org.example.BinarySearchTree;

public class TestAVLTree {
    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<>(new Integer[]{
                25, 20, 5});
        System.out.print("After inserting 25, 20, 5: ");
        printTree(tree);

        tree.insert(34);
        tree.insert(50);
        System.out.print("\nAfter inserting 34, 50: ");
        printTree(tree);

        tree.insert(30);
        System.out.print("\nAfter inserting 30");
        printTree(tree);

        tree.insert(10);
        System.out.print("\nAfter inserting 10");
        printTree(tree);

        tree.delete(34);
        printTree(tree);

        System.out.print("\nTraverse the elements in the tree: ");
        for(int e: tree){
            System.out.print(e + " ");
        }
    }
    public static void printTree(BST tree){
        System.out.print("\nInorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder:" );
        tree.postorder();
    }
}
