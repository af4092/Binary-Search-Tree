package org.example.BinarySearchTree;

public interface Tree<E> extends Iterable<E>{
    public boolean search(E element);
    public boolean insert(E element);
    public boolean delete(E element);
    public void inorder();
    public void postorder();
    public void preorder();
    public int getSize();
    public boolean isEmpty();
}
