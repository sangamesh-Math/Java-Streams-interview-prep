// PROBLEM 12 — Flatten List of Lists

  import java.util.*;
import java.util.stream.*;

public class Problem12 {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flat =
                listOfLists.stream()
                           .flatMap(List::stream)       // Flatten inner streams
                           .collect(Collectors.toList());// Collect to single list

        System.out.println(flat);
    }
}
