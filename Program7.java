// PROBLEM 7 — Group Strings by Length

import java.util.*;
import java.util.stream.*;

public class Problem7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear", "grape", "orange");

        Map<Integer, List<String>> groupedByLength =
                words.stream()
                     .collect(Collectors.groupingBy(String::length)); // Group by length

        groupedByLength.forEach((len, list) ->
                System.out.println("Length " + len + ": " + list));
    }
}
