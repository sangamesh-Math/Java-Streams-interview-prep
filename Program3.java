// PROBLEM 3 — Find First String With Length > 5
// Question:

// Find the first string whose length is greater than 5.

import java.util.*;
import java.util.stream.*;

public class Problem3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "pear", "grape", "kiwi");

        strings.stream()
               .filter(s -> s.length() > 5)        // Keep strings of length > 5
               .findFirst()                        // Return the first matching one
               .ifPresent(System.out::println);    // Print if present
    }
}
