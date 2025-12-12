// PROBLEM 8 — Sort List of Objects by Age, Then Name

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Problem8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 30)
        );

        List<Person> sorted = people.stream()
            .sorted(
                Comparator.comparingInt(Person::getAge)  // Sort by age
                          .thenComparing(Person::getName) // Then by name
            )
            .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}
