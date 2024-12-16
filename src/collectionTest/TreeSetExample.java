package collectionTest;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(50);
        set.add(10);
        set.add(30);

        // Iterating (Sorted Order)
        System.out.println("TreeSet Elements:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // First and Last elements
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());
    }
}
