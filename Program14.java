//Find the Longest word in the given list. 
import java.util.*;
import java.util.stream.*;

public class Problem14 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "giraffe");

        // Find the longest string using streams
        String longest = words.stream()
            .max(Comparator.comparingInt(String::length))  // Compare by string length
            .orElse(null);                                 // Handle empty list safely

        System.out.println("Longest word: " + longest);
    }
}
