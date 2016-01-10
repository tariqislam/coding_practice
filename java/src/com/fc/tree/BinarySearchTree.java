package com.fc.tree;

import java.util.Comparator;

/**
 * Created by tislam on 1/5/16.
 */
public class BinarySearchTree <T extends Comparable<T>> extends SimpleBinaryTree {

    private Comparator<T> comparator;

    public BinarySearchTree() {
        super();
        this.comparator = null;
    }

    public BinarySearchTree(Comparator<T> comparator) {
        super();
        this.comparator = comparator;
    }

    private int compare(T x, T y) {
        if (this.comparator == null) {
            return x.compareTo(y);
        }
        else {
            return this.comparator.compare(x,y);
        }
    }

    public void insert(T value) {
        if (this.getData() == null) {
            this.setData(value);
        }
        else {
            this.performSearch(this, value);
        }
    }

    private BinarySearchTree<T> performInsert(BinarySearchTree<T> root, T value) {
        if (root == null) {
            root = new BinarySearchTree<T>(this.comparator);
            root.setData(value);
        }
        else if (compare(value, (T) root.getData()) == 0)
            return null;

        if (compare(value, (T) root.getData()) < 0){
            root.leftChild = performInsert((BinarySearchTree<T>) root.getLeftChild(), value);
        }
        else {
            root.rightChild = performInsert((BinarySearchTree<T>) root.getRightChild(), value);
        }

        return root;
    }

    public boolean search(T value) {
        return this.performSearch(this, value);
    }

    private boolean performSearch(BinarySearchTree<T> root, T value) {
        if (root == null) {
            return false;
        }
        if (this.compare(value, (T) this.getData()) == 0) {
            return true;
        }
        else if (compare(value, (T) this.getData()) < 0) {
            return this.performSearch((BinarySearchTree<T>) root.getLeftChild(), value);
        }
        else {
            return this.performSearch((BinarySearchTree<T>) root.getRightChild(), value);
        }
    }

    public void delete(Object value) {

    }
}
