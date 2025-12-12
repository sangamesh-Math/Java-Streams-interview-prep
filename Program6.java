// PROBLEM 6 — Get Unique Elements

import java.util.*;
import java.util.stream.*;

public class Problem6 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 5);

        nums.stream()
            .distinct()                        // Remove duplicates
            .forEach(System.out::println);     // Print unique elements
    }
}
