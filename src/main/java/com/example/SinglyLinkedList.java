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
    
    // Remove a node by position
    public void removeByPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            head = head.getNextNode();
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 1; i < position; i++) {
                previous = current;
                current = current.getNextNode();
            }
            previous.setNextNode(current.getNextNode());
        }
        size--;
    }
    
    // Find the size of the list
    public int getSize() {
        return size;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Traversal and display of the list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNextNode();
        }
    }  
    
    // Search for an element and return its position
    public int search(String data) {
        Node current = head;
        int position = 1;
        while (current != null) {
            if (current.getData().equals(data)) {
                return position;
            }
            current = current.getNextNode();
            position++;
        }
        return -1; // Element not found
    }    

    // Reverse the linked list in place
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }

}
