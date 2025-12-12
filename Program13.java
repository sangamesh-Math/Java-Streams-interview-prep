// Find the Average Age of Employees

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {

List<Employee> employees = Arrays.asList(
    new Employee("John", 25),
    new Employee("Sarah", 32),
    new Employee("Mark", 40),
    new Employee("Anna", 28)
);

double avgAge = employees.stream().collect(Collectors.averagingInt(Employee :: getAge));
System.out.println(avgAge);


    }
}
