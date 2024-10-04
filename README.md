# Data Structures - Assignment 1

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

## Author

*Anish Chaudhary*  
*Student ID*: C0916426

---

## Table of Contents

- [Overview](#overview)
- [Implementations](#implementations)
  - [1. Artifact Vault](#1-artifact-vault)
  - [2. Labyrinth Path](#2-labyrinth-path)
  - [3. Scroll Stack](#3-scroll-stack)
  - [4. Explorer Queue](#4-explorer-queue)
  - [5. Clue Tree](#5-clue-tree)
- [Installation](#installation)
- [Usage](#usage)
- [Contact](#contact)
- [License](#license)

---

## Overview

This repository contains five Java implementations of fundamental data structures developed as part of the Data Structures course assignment. Each project demonstrates the practical application of different data structures, including arrays, linked lists, stacks, queues, and binary search trees (BST), to solve specific problems.

---

## Implementations

### 1. Artifact Vault

*Description:*  
A system that maintains an age-sorted collection of artifacts, allowing users to add, remove, and search for artifacts. Artifacts are stored in an array and sorted using Java Streams after each addition.

*Classes:*
- Artifact
- ArtifactVault

*Data Structure:*  
Array-based storage.

*Features:*
- Add artifacts
- Remove artifacts
- Search for artifacts

*Assumptions:*
- Fixed capacity for the vault
- Unique artifact names

---

### 2. Labyrinth Path

*Description:*  
A labyrinth navigation system that tracks a path using a linked list. Users can add and remove locations, check for loops, and display the path. Floyd’s Cycle Detection method is implemented to identify loops.

*Classes:*
- PathNode
- LabyrinthPath

*Data Structure:*  
Linked list.

*Features:*
- Add locations
- Remove locations
- Detect loops
- Display the path

*Assumptions:*
- Dynamic expansion of the path as new locations are added

---

### 3. Scroll Stack

*Description:*  
A stack-based system for managing scrolls, allowing users to push, pop, peek, and check for the existence of scrolls. The stack adheres to the Last In, First Out (LIFO) principle.

*Data Structure:*  
Stack (Java's built-in Stack class).

*Features:*
- Push scrolls
- Pop scrolls
- Peek at the top scroll
- Search for scrolls

*Assumptions:*
- Scroll titles are unique
- Stack operates on LIFO basis

---

### 4. Explorer Queue

*Description:*  
A system for managing explorers in a queue, enabling users to add and remove explorers while tracking the number of people in line to attend a temple. Utilizes a circular queue for efficient operations.

*Data Structure:*  
Circular queue (array-based).

*Features:*
- Enqueue explorers
- Dequeue explorers
- Check queue status

*Assumptions:*
- Fixed queue size upon initialization
- No enqueuing when the queue is full

---

### 5. Clue Tree

*Description:*  
A binary search tree (BST) application that stores and organizes clues. Users can insert, locate, and traverse clues in various orders.

*Classes:*
- Node
- ClueTree

*Data Structure:*  
Binary Search Tree (BST).

*Features:*
- Insert clues
- Search for clues
- Traverse the tree (in-order, pre-order, post-order)

*Assumptions:*
- Clues are inserted in alphabetical order
- No duplicate clues allowed

---

## Installation

Ensure you have the Java Development Kit (JDK) installed on your system. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

1. *Clone the repository:*

   ```bash
   git clone https://github.com/your-username/DataStructures-Assignment1-Anish.git

2. *Compile java code:*

   ```bash
   Javac Filename.java

3. *Run Java Code:*

   ```bash
   Java Filename

4. *Output:*

   After running the program successfully you can see the output in the console.
