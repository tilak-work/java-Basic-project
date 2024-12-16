package java8Features;

import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using Lambda Expression
        names.forEach(System.out::println);
    }
}
