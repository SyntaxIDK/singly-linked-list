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
    
    // Add a node to the end of the list
    public void addAtTail(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
        size++;
    }    
}
