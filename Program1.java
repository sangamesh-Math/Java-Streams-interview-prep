// PROBLEM 1 — Filter Even Numbers
// Question:

// Given a list of integers, filter out all even numbers and print them.
import java.util.*;
import java.util.stream.*;

public class Problem1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()                         // Convert list → Stream<Integer>
               .filter(n -> n % 2 == 0)          // Keep only even numbers
               .forEach(System.out::println);    // Print each even number
    }
}



