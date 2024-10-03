package com.example;

import java.util.Scanner;

public class InputHandler {
    private SinglyLinkedList linkedList = new SinglyLinkedList();
    private Scanner scanner = new Scanner(System.in);

    // Handle user input to perform linked list operations
    public void handleInput() {
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add at Head");
            System.out.println("2. Add at Tail");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Value");
            System.out.println("5. Remove by Position");
            System.out.println("6. Display List");
            System.out.println("7. Search for Element");
            System.out.println("8. Reverse List");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

}
