package com.fc.linkedlist;

import java.util.List;

/**
 * Created by tislam on 11/8/15.
 */
public class ListElement {

    protected Object data;
    protected ListElement next;

    public ListElement(Object data) {
        this.data = data;
    }

    public ListElement insertInFront(Object data) {
        ListElement newElement = new ListElement(data);
        newElement.next = this;
        return newElement;
    }

    public ListElement find(Object data) {
        ListElement foundElement = null;
        ListElement pointer = this;

        while (pointer != null) {
            if (pointer.data == data) {
                foundElement = pointer;
                break;
            }
            pointer = pointer.next;
        }
        return foundElement;
    }

    public ListElement delete(Object data) {
        ListElement head, pointer, previous;
        head = pointer = this;
        previous = null;

        while (pointer != null) {
            if (pointer.data != data) {
                previous = pointer;
                pointer = pointer.next;
            }
            else {
                if (head == pointer) {
                    head = pointer.next;
                }
                else {
                    previous.next = pointer.next;
                }
                pointer.next = null;
                pointer.data = null;
                break;
            }
        }

        return head;
    }

    public boolean hasNext() {
        boolean hasNext = false;
        if (this.next != null) {
            hasNext = true;
        }
        return hasNext;
    }

    public ListElement next() {
        return this.next;
    }

    public Object getData() {
        return this.data;
    }

}
