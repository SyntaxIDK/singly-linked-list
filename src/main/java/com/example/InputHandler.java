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

            switch (choice) {
                case 1:
                    System.out.println("Enter data to add at head:");
                    String headData = scanner.nextLine();
                    linkedList.addAtHead(headData);
                    break;
                case 2:
                    System.out.println("Enter data to add at tail:");
                    String tailData = scanner.nextLine();
                    linkedList.addAtTail(tailData);
                    break;
                case 3:
                    System.out.println("Enter data and position to add at:");
                    String data = scanner.nextLine();
                    int position = scanner.nextInt();
                    linkedList.addAtPosition(data, position);
                    break;
                case 4:
                    System.out.println("Enter value to remove:");
                    String valueToRemove = scanner.nextLine();
                    linkedList.removeByValue(valueToRemove);
                    break;
                case 5:
                    System.out.println("Enter position to remove:");
                    int positionToRemove = scanner.nextInt();
                    linkedList.removeByPosition(positionToRemove);
                    break;
                case 6:
                    System.out.println("Linked List:");
                    linkedList.traverse();
                    break;
                case 7:
                    System.out.println("Enter data to search:");
                    String searchData = scanner.nextLine();
                    int foundPosition = linkedList.search(searchData);
                    if (foundPosition == -1) {
                        System.out.println("Element not found.");
                    } else {
                        System.out.println("Element found at position: " + foundPosition);
                    }
                    break;
                case 8:
                    System.out.println("Reversing the list...");
                    linkedList.reverse();
                    linkedList.traverse();
                    break;
                case 9:
                    System.out.println("Bye...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
