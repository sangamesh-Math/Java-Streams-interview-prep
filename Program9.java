PROBLEM 9 — Partition Numbers into >10 and <=10

import java.util.*;
import java.util.stream.*;

public class Problem9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 15, 7, 22, 10, 8, 19, 6);

        Map<Boolean, List<Integer>> partitioned =
                numbers.stream()
                       .collect(Collectors.partitioningBy(n -> n > 10)); // true: >10, false: ≤10

        System.out.println("Numbers > 10: " + partitioned.get(true));
        System.out.println("Numbers <= 10: " + partitioned.get(false));
    }
}
