// Map List of Employees to List of Names

class Employee {
    String name;
    int age;
    // constructor, getters
  Employee(String name, int age) {
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

public class Main {
    public static void main(String[] args) {
List<Employee> employees = Arrays.asList(
    new Employee("John", 25),
    new Employee("Sarah", 32),
    new Employee("Mark", 40),
    new Employee("Anna", 28)
);


List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());

System.out.println(names);

    }
}
