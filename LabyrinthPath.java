class PathNode {
    String location;
    PathNode next;

    public PathNode(String location) {
        this.location = location;
        this.next = null;
    }
}

class LabyrinthPath {
    private PathNode head;
    private PathNode tail;
    private int size;

    public LabyrinthPath() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Method to add a new location to the path
    public void addLocation(String location) {
        PathNode newNode = new PathNode(location);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Method to remove the last visited location
    public void removeLastLocation() {
        if (head == null) {
            System.out.println("Path is empty. No location to remove.");
            return;
        }

        if (head == tail) { // Only one element
            head = null;
            tail = null;
        } else {
            PathNode current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null; // Remove the last node
            tail = current; // Update tail to the new last node
        }
        size--;
    }

    // Method to check if the path contains a loop (trap)
    public boolean containsLoop() {
        if (head == null) return false;

        PathNode slow = head;
        PathNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1 step
            fast = fast.next.next; // Move fast by 2 steps

            if (slow == fast) {
                return true; // Loop detected
            }
        }
        return false; // No loop detected
    }

    // Method to print the entire path
    public void printPath() {
        if (head == null) {
            System.out.println("Path is empty.");
            return;
        }

        PathNode current = head;
        while (current != null) {
            System.out.print(current.location);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LabyrinthPath path = new LabyrinthPath();
        path.addLocation("Start");
        path.addLocation("User");
        path.addLocation("Desktop");
        path.addLocation("Java");
        System.out.print("New Path: ");
        path.printPath();
        System.out.print("path after deleting last visited location: ");
        path.removeLastLocation();
        path.printPath();


        // Check if there is a loop (should return false)
        System.out.println("Contains loop(trap): " + path.containsLoop());
    }
}