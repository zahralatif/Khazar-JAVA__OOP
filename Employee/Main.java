package Employee;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter details for Employee 1:");
    System.out.print("Name: ");
    String name1 = scanner.nextLine();
    System.out.print("Job Title: ");
    String jobTitle1 = scanner.nextLine();
    System.out.print("Salary: ");
    double salary1 = scanner.nextDouble();

    scanner.nextLine(); // Consume the newline character

    System.out.println("Enter details for Employee 2:");
    System.out.print("Name: ");
    String name2 = scanner.nextLine();
    System.out.print("Job Title: ");
    String jobTitle2 = scanner.nextLine();
    System.out.print("Salary: ");
    double salary2 = scanner.nextDouble();

    // Create Employee instances
    Employee employee1 = new Employee(name1, jobTitle1, salary1);
    Employee employee2 = new Employee(name2, jobTitle2, salary2);

    // Display employee details
    System.out.println("\nEmployee Details:");
    employee1.printEmployeeDetails();
    employee2.printEmployeeDetails();

    // Raise salaries
    employee1.raiseSalary(8);
    employee2.raiseSalary(12);

    // Display updated details
    System.out.println("\nAfter raising salary:");
    System.out.println("\n8% for '" + name1 + "':");
    employee1.printEmployeeDetails();
    System.out.println("\n12% for '" + name2 + "':");
    employee2.printEmployeeDetails();

    scanner.close();
  }
}

