// PROBLEM 5 — Count Strings Starting With 'a'

import java.util.*;
import java.util.stream.*;

public class Problem5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot");

        long count = words.stream()
                          .filter(w -> w.startsWith("a"))  // Keep only words starting with 'a'
                          .count();                        // Count them

        System.out.println(count);
    }
}
