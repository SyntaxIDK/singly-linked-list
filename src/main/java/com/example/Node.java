package com.example;

public class Node {
    String data; // Store data
    Node nextNode; // Reference to the next node

    // Constructor to create node (data)
    public Node(String data) {
        this.data = data;
        this.nextNode = null; // set the next node is null
    }
}
