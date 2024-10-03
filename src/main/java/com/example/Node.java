package com.example;

public class Node {
    String data; // Store data
    Node nextNode; // Reference to the next node

    // Constructor to create node (data)
    public Node(String data) {
        this.data = data;
        this.nextNode = null; // set the next node is null
    }
    
    // Getters and setters
    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public String getData() {
        return data;
    }
}
