package com.fc.tree;

/**
 * Created by tislam on 1/5/16.
 */
interface BinaryTree extends Node {

    Node getLeftChild();
    void setLeftChild(Node node);
    Node getRightChild();
    void setRightChild(Node node);

}