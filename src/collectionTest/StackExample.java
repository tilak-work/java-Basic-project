package collectionTest;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Adding elements
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Peeking and popping
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());

        // Iterating
        System.out.println("Stack Elements:");
        for (String item : stack) {
            System.out.println(item);
        }
    }
}
