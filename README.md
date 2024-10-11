
# Singly Linked List Implementation in Java

This repository contains the implementation of a **Singly Linked List** from scratch in Java. The project has multiple components including the `Node` class, `SinglyLinkedList` class, input handling, and operations like insertion, deletion, traversal, search, and list reversal.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [How to Use](#how-to-use)
- [Contributors](#contributors)

## Introduction

This project demonstrates how to implement a **Singly Linked List** data structure in Java. The linked list is composed of nodes, each containing data and a reference to the next node. The project supports the following operations:
- Adding nodes (at the head, tail, or specific position)
- Removing nodes (by value or position)
- Traversing the list
- Searching for elements
- Reversing the list

## Features

- **Node Class**: Represents individual nodes in the list.
- **Singly Linked List Class**: Contains methods for adding, removing, searching, and reversing the list.
- **Input Handler**: A user-friendly interface to interact with the list from the console.
- **File Structure**: The project is divided into multiple Java files for better modularity and organization.

## Installation

### Prerequisites

Make sure you have the following installed on your system:
- **Java Development Kit (JDK)** (version 8 or higher)
- **Visual Studio Code (VSCode)** or any preferred IDE
- **Git** for version control

### Cloning the Repository

1. Open a terminal or command prompt.
2. Navigate to the directory where you want to clone the project.
3. Run the following command:

    ```bash
    git clone https://github.com/SyntaxIDK/singly-linked-list-java.git
    ```

4. Change into the cloned repository's directory:

    ```bash
    cd singly-linked-list-java
    ```

### Setting Up in Visual Studio Code

1. Open **Visual Studio Code**.
2. Click on **File** > **Open Folder...** and select the project folder (`singly-linked-list-java`).
3. Make sure the Java extension pack is installed in VSCode if not already:
   - Go to **Extensions** (from the sidebar).
   - Search for `Java Extension Pack`.
   - Install it.

4. Once the folder is opened, you should be able to see all the Java files (`Node.java`, `SinglyLinkedList.java`, `InputHandler.java`, `Main.java`) in the **Explorer** on the left sidebar.

## Running the Application

To run the application in Visual Studio Code:

1. Make sure the `Main.java` file is opened.
2. You can run the program by clicking the **Run** button at the top right of the VSCode interface or by using the terminal:
   - Click **Terminal** > **New Terminal** from the menu.
   - In the terminal, navigate to the `src` folder (where the `.java` files are located).
   - Compile the code using the command:

     ```bash
     javac com/example/*.java
     ```

   - Run the compiled code:

     ```bash
     java com.example.Main
     ```

3. The application will start in the terminal, and you will be able to interact with the singly linked list by choosing options (like adding/removing nodes, traversing, etc.).

## Project Structure

```bash
singly-linked-list-java/
│
├── src/
│   ├── com/example/
│   │   ├── Node.java              # Node class representing each node in the list
│   │   ├── SinglyLinkedList.java  # Singly Linked List class with all operations
│   │   ├── InputHandler.java      # Handles user input to interact with the list
│   │   └── Main.java              # Entry point of the program
│
└── README.md                      # This README file
```

## How to Use

Once the program is running, you will see a menu in the terminal that looks like this:

```
Choose an option:
1. Add at Head
2. Add at Tail
3. Add at Position
4. Remove by Value
5. Remove by Position
6. Display List
7. Search for Element
8. Reverse List
9. Exit
```

You can enter the corresponding number to perform actions on the singly linked list. For example:
- Press `1` to add a node at the head.
- Press `2` to add a node at the tail.
- Press `3` to add a node at a specific position.
- Press `4` to remove a node by its value.
- Press `5` to remove a node by its position.
- Press `6` to traverse and display the entire list.
- Press `7` to search for an element.
- Press `8` to reverse the list.
- Press `9` to exit.

Follow the prompts to input data or perform operations as needed.

## Contributors

This project is a collaborative effort. Special thanks to the group members for their contributions.

- [Kaveesha](https://github.com/SyntaxIDK) 
- will be added