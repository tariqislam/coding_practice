package com.fc.tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 1/5/16.
 */
public class SimpleBinaryTreeTest {

    SimpleBinaryTree<Integer> binaryTree;

    @Before
    public void setUp() throws Exception {
        this.binaryTree = new SimpleBinaryTree<Integer>();
        this.binaryTree.setData(10);
        this.binaryTree.setLeftChild(new SimpleBinaryTree(5));
        this.binaryTree.setRightChild(new SimpleBinaryTree(15));
        BinaryTree leftchild = (SimpleBinaryTree) this.binaryTree.getLeftChild();
        leftchild.setLeftChild(new SimpleBinaryTree(1));
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSimpleBinaryTree() {
        assertEquals(10, (int) this.binaryTree.getData());
        BinaryTree leftChild = (SimpleBinaryTree) this.binaryTree.getLeftChild();
        BinaryTree rightChild = (SimpleBinaryTree) this.binaryTree.getRightChild();
        assertEquals(5, leftChild.getData());
        assertEquals(15, rightChild.getData());
        leftChild = (SimpleBinaryTree) leftChild.getLeftChild();
        assertEquals(1, leftChild.getData());
        assertNull(leftChild.getLeftChild());
        assertNull(leftChild.getRightChild());
    }

    @Test
    public void testAllMaxPaths() {

        SimpleBinaryTree<Integer> sbt25 = new SimpleBinaryTree<Integer>(25);
        sbt25.leftChild = new SimpleBinaryTree<Integer>(22);
        sbt25.rightChild = new SimpleBinaryTree<Integer>(27);
        SimpleBinaryTree<Integer> sbt30 = new SimpleBinaryTree<Integer>(30);
        sbt30.leftChild = sbt25;
        sbt30.rightChild = new SimpleBinaryTree<Integer>(52);

        SimpleBinaryTree<Integer> sbt15 = new SimpleBinaryTree<Integer>(15);
        sbt15.leftChild = new SimpleBinaryTree<Integer>(10);
        sbt15.rightChild = new SimpleBinaryTree<Integer>(17);

        this.binaryTree = new SimpleBinaryTree<Integer>(20);
        this.binaryTree.leftChild = sbt15;
        this.binaryTree.rightChild = sbt30;

        this.binaryTree.findAllMaxPathsFromRoot();
    }
}