package com.fc.tree;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by tislam on 1/5/16.
 */
public class SimpleBinaryTree<T> implements BinaryTree {

    T data;
    SimpleBinaryTree<T> leftChild;
    SimpleBinaryTree<T> rightChild;

    public SimpleBinaryTree() {
        this.data = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public SimpleBinaryTree(T value) {
        this.data = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public Node getLeftChild() {
        return this.leftChild;
    }

    @Override
    public void setLeftChild(Node node) {
        this.leftChild = (SimpleBinaryTree<T>) node;
    }

    @Override
    public Node getRightChild() {
        return this.rightChild;
    }

    @Override
    public void setRightChild(Node node) {
        this.rightChild = (SimpleBinaryTree<T>) node;
    }

    public T getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = (T) data;
    }

    @Override
    public Node[] getChildren() {
        return new Node[] {this.leftChild, this.rightChild};
    }

    @Override
    public void setChildren(Node[] children) throws NotImplementedException {
        throw new NotImplementedException();
    }

    public String toString() {
        return this.data.toString();
    }

    /**
     * Given a binary tree, finds all max paths from root to leaves.
     */
    public void findAllMaxPathsFromRoot() {

        SimpleBinaryTree<T> root = this;

        int maxWeight = -1;
        ArrayList<T> currentPath = new ArrayList<T>();
        ArrayList<ArrayList<T>> allMaxPaths = new ArrayList<ArrayList<T>>();

        maxWeight = this.findAllMaxPaths(root, currentPath, 0, allMaxPaths, maxWeight);

        System.out.println("Max weight: " + maxWeight);
        System.out.println("Paths:");
        for (ArrayList<T> path : allMaxPaths) {
            for (int i=0; i < path.size(); i++) {
                T data = path.get(i);
                System.out.print(data + " - ");
            }
            System.out.println();
        }
    }

    private int findAllMaxPaths(SimpleBinaryTree<T> root, ArrayList<T> currentPath, int currentWeight, ArrayList<ArrayList<T>> allMaxPaths, int maxWeight) {

        if (root == null) {
            return maxWeight;
        }

        currentWeight += (Integer) root.getData();
        currentPath.add(root.getData());

        if (root.leftChild == null && root.rightChild == null) {
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
                allMaxPaths.clear();
            }
            if (currentWeight == maxWeight) {
                allMaxPaths.add(currentPath);
            }
        }

        maxWeight = this.findAllMaxPaths(root.leftChild, new ArrayList<T>(currentPath), currentWeight, allMaxPaths, maxWeight);
        maxWeight = this.findAllMaxPaths(root.rightChild, new ArrayList<T>(currentPath), currentWeight, allMaxPaths, maxWeight);

        return maxWeight;
    }

}
