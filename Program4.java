PROBLEM 4 — Convert Strings to Uppercase

import java.util.*;
import java.util.stream.*;

public class Problem4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");

        words.stream()
             .map(String::toUpperCase)         // Convert each string to uppercase
             .forEach(System.out::println);    // Print all
    }
}
