package com.example;

public class SinglyLinkedList {
    private Node head; // Reference to the head
    private int size;

    // Constructor to create empty list
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add a node to the beginning of the list
    public void addAtHead(String data) {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
        size++;
    }


}
