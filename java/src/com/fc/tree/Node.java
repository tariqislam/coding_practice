package com.fc.tree;

/**
 * Created by tislam on 1/5/16.
 */
public interface Node {

    Object getData();
    void setData(Object value);
    Node[] getChildren();
    void setChildren(Node[] children);

}