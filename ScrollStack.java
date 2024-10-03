import java.util.Stack;

public class ScrollStack {
    private Stack<String> stack;

    // Constructor to initialize the stack
    public ScrollStack() {
        stack = new Stack<>();
    }

    // Method to push a new scroll onto the stack
    public void pushScroll(String title) {
        stack.push(title);
        System.out.println("Pushed scroll: " + title);
    }

    // Method to pop the top scroll off the stack
    public String popScroll() {
        if (!stack.isEmpty()) {
            String title = stack.pop();
            System.out.println("Popped scroll: " + title);
            return title;
        } else {
            System.out.println("No scrolls to pop.");
            return null;
        }
    }

    // Method to peek at the top scroll without removing it
    public String peekScroll() {
        if (!stack.isEmpty()) {
            String title = stack.peek();
            System.out.println("Peeked at top scroll: " + title);
            return title;
        } else {
            System.out.println("No scrolls to peek at.");
            return null;
        }
    }

    // Method to check if a specific scroll title exists in the stack
    public boolean containsScroll(String title) {
        boolean exists = stack.contains(title);
        if (exists) {
            System.out.println("Scroll titled \"" + title + "\" exists in the stack.");
        } else {
            System.out.println("Scroll titled \"" + title + "\" does not exist in the stack.");
        }
        return exists;
    }

    // Main method for testing
    public static void main(String[] args) {
        ScrollStack scrollStack = new ScrollStack();
        scrollStack.pushScroll("Scroll of Wisdom");
        scrollStack.pushScroll("Scroll of Power");
        scrollStack.pushScroll("Scroll of Bravery");
        scrollStack.peekScroll();
        scrollStack.popScroll();
        scrollStack.containsScroll("Scroll of Wisdom");
    }
}