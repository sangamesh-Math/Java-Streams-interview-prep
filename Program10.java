// PROBLEM 10 — Find Name of Oldest Person

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    public String getName() { return name; }
    public int getAge() { return age; }
}

public class Problem10 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Alice", 30),
            new Person("Bob", 28),
            new Person("Diana", 32)
        );

        String name = people.stream()
            .max(Comparator.comparingInt(Person::getAge)) // Find oldest
            .map(Person::getName)                         // Extract name
            .orElse(null);                                // Handle empty list

        System.out.println("Oldest person: " + name);
    }
}
