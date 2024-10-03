class ExplorerQueue {
    private String[] queue; // Array to store explorers
    private int front; // Index of the front of the queue
    private int rear; // Index of the rear of the queue
    private int maxSize; // Maximum size of the queue
    private int currentSize; // Current number of elements in the queue

    // Constructor to initialize the queue
    public ExplorerQueue(int size) {
        maxSize = size;
        queue = new String[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Enqueue a new explorer to the queue
    public void enqueue(String explorer) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + explorer);
            return;
        }
        rear = (rear + 1) % maxSize; // Circular increment
        queue[rear] = explorer;
        currentSize++;
        System.out.println(explorer + " has entered the queue.");
    }

    // Dequeue an explorer from the queue
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No explorer to dequeue.");
            return null;
        }
        String explorer = queue[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize--;
        System.out.println(explorer + " has entered the temple.");
        return explorer;
    }

    // Display the next explorer in line
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No explorer in line.");
            return null;
        }
        return queue[front];
    }

    // Check if the queue is full
    public boolean isFull() {
        return currentSize == maxSize;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Method to get the current size of the queue (optional)
    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
    ExplorerQueue explorerQueue = new ExplorerQueue(3); // Create a queue with a maximum size of 3

    // Check if the queue is empty
    System.out.println("Is the queue empty? " + explorerQueue.isEmpty());

    // Enqueue explorers
    explorerQueue.enqueue("Explorer 1");
    explorerQueue.enqueue("Explorer 2");
    explorerQueue.enqueue("Explorer 3");

    // Check if the queue is full
    System.out.println("Is the queue full? " + explorerQueue.isFull());

    // Attempting to enqueue another explorer
    explorerQueue.enqueue("Explorer 4"); // This should show a message that the queue is full

    // Dequeue explorers
    explorerQueue.dequeue();
    explorerQueue.dequeue();

    // Check if the queue is empty after dequeuing
    System.out.println("Is the queue empty? " + explorerQueue.isEmpty());

    // Enqueue more explorers
    explorerQueue.enqueue("Explorer 5");
    
    // Check the next explorer in line
    System.out.println("Next explorer in line: " + explorerQueue.peek());
    }
}