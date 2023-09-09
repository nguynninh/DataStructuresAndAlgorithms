package stack;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayBasedStack object
        Stack<Integer> stack = new ArrayBasedStack<>();

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek at the top element without removing it
        System.out.println("Top element: " + stack.peek());

        // Pop the top element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Search for an element in the stack
        int elementToSearch = 2;
        int position = stack.search(elementToSearch);
        if (position != -1) {
            System.out.println("Element " + elementToSearch + " found at position " + position);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the stack.");
        }

        // Print all elements in the stack
        System.out.println("Stack elements:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }

        // Check if the stack is empty after removing elements
        System.out.println("Is the stack empty? " + stack.empty());
    }
}

