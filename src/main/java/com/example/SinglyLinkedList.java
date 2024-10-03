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
    
    // Add a node at a specific position
    public void addAtPosition(String data, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtHead(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.getNextNode();
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
            size++;
        }
    }
    
    // Remove a node by value
    public void removeByValue(String data) {
        if (head == null) return;

        if (head.getData().equals(data)) {
            head = head.getNextNode();
            size--;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null && !current.getData().equals(data)) {
            previous = current;
            current = current.getNextNode();
        }

        if (current != null) {
            previous.setNextNode(current.getNextNode());
            size--;
        }
    }    
}
