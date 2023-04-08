package com.linked_List;

public class LinkedList {
    Node head, tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
        }
    }
}