PROBLEM 11 — Character Frequency Map

import java.util.*;
import java.util.stream.*;

public class Problem11 {
    public static void main(String[] args) {
        String text = "banana";

        Map<Character, Long> freq =
                text.chars()                         // IntStream of char codes
                    .mapToObj(c -> (char)c)          // Convert to Character objects
                    .collect(
                        Collectors.groupingBy(
                            c -> c,                 // Key = character
                            Collectors.counting()   // Count frequency
                        )
                    );

        System.out.println(freq);
    }
}
