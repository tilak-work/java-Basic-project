package collectionTest;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Removing an element
        list.remove("Banana");

        // Iterating
        System.out.println("ArrayList Elements:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
