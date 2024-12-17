package java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Employee class to demonstrate Stream API operations
class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class StreamAPIDemo {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 28, "HR", 55000),
                new Employee("Bob", 35, "Engineering", 75000),
                new Employee("Charlie", 42, "Finance", 65000),
                new Employee("David", 25, "Engineering", 60000),
                new Employee("Eve", 33, "HR", 58000)
        );

        // 1. Filter employees from Engineering department
        System.out.println("Engineering Department Employees:");
        employees.stream()
                .filter(e -> e.getDepartment().equals("Engineering"))
                .forEach(System.out::println);

        // 2. Calculate average salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.printf("\nAverage Salary: $%.2f\n", averageSalary);

        // 3. Group employees by department
        System.out.println("\nEmployees Grouped by Department:");
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        employeesByDepartment.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });

        // 4. Find top 2 highest-paid employees
        System.out.println("\nTop 2 Highest Paid Employees:");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(2)
                .forEach(System.out::println);

        // 5. Calculate total salary for employees over 30
        double totalSalaryOver30 = employees.stream()
                .filter(e -> e.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.printf("\nTotal Salary for Employees over 30: $%.2f\n", totalSalaryOver30);
    }
}