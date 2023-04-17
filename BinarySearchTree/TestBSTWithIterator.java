package org.example.BinarySearchTree;

public class TestBSTWithIterator {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Frank");
        tree.insert("John");
        tree.insert("July");
        for(String s: tree)
            System.out.print(s.toUpperCase() + " ");
        System.out.println("\n" + new String(new char[25]).replace("\0", "\u2500"));
        for(String s: tree)
            System.out.print(s + " ");
    }
}
