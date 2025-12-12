// PROBLEM 2 — Sum of Squares of Odd Numbers
// Question:

// Find the sum of squares of odd numbers.

import java.util.*;
import java.util.stream.*;

public class Problem2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)     // Keep only odd numbers
                .map(n -> n * n)             // Convert each odd number → its square
                .mapToInt(Integer::intValue) // Convert to IntStream for summing
                .sum();                      // Sum all squares

        System.out.println(sum);
    }
}
