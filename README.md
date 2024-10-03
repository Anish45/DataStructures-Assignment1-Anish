# DataStructures-Assignment1-Anish

Name: Anish Chaudhary
Student-Id: C0916426

1) Artifact Vault

The purpose of this software is to maintain an age-sorted collection of artifacts by allowing users to add, remove, and search for artifacts using an array-based structure.

The Approach:- 
  - created an Artifact class to provide a name and age for each individual artifact.
  - To handle an array of Artifact objects, a class called ArtifactVault was created. It contains methods for adding, removing, and searching artifacts.
  - Java Streams was used to implement the sorting of artifacts by age following each addition.

Presumptions
  - The vault's initialization defines its fixed capacity.
  - Artifacts must have unique names in order to be added.


2) Labyrinth Path

Using a linked list structure, this software keeps track of a path through a labyrinth. Users can add and remove sites, check for loops, and display the path.

The Approach:-
  - Created a PathNode class to symbolize every point along the path.
  - To manage the linked list of PathNode objects, a LabyrinthPath class was created, including methods for adding, removing, and searching locations.
  - Applied Floyd's Cycle Detection method to loop detection.

Presumptions:-
   - The linked list structure facilitates simple location removal and traversal
   - The path can expand dynamically as new locations are added.


3) Scroll Stack

This software simulates a stack structure to manage scrolls, offering ability to push, pop, peek, and check for the existence of scrolls.

The Approach :-
  - To maintain scroll titles, Java's Stack class was utilized.
  - Put into practice techniques for popping and pushing scrolls, looking up at the top scroll, and determining whether a certain scroll is there.

Presumptions:- 
  - Scroll titles are unique and can only be pushed once;
  - The stack functions according to LIFO (Last In, First Out).


4) Explorer Queue

This application lets users add and remove explorers from a queue while keeping track of how many people are in line to attend a temple.


The Approach :-
  - Used an array to hold explorer names in a circular queue.
  - Offered ways to verify the status of the queue and to enqueue and dequeue explorers.

Presumptions:-
  - When the queue is initialized, its size is fixed;
  - When the queue is full, explorers cannot be enqueued.


5) Clue Tree

Using a binary search tree (BST), this application stores and organizes clues so that users can insert, locate, and explore them in whatever sequence they choose.

The Approach :-
  - To represent each hint and its offspring, a Node class was created.
  - The ClueTree class was implemented to manage traversal techniques, counting, searching, and insertion.

Presumptions:-
  - The sequence in which the clues are inserted is alphabetical.
  - The tree does not permit duplicates.




