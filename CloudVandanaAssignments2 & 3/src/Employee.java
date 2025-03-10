import java.util.ArrayList;

//  Problem Statement: 3. Object-Oriented Programming - Employee Management System
//Design a simple Java class Employee with the following attributes:
//• id (integer)
//• name (string)
//• salary (double)
//Create a method displayDetails() to print employee details.
//Write a main method to:
//1. Create at least 3 Employee objects.
//2. Store them in a list.
//3. Display their details.

public class Employee {
    // Employee attributes
    int id;
    String name;
    double salary;

    // Constructor to initialize the attributes
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        // Create a list to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating employee objects and adding them to the list
        employees.add(new Employee(101, "John Doe", 50000));
        employees.add(new Employee(102, "Jane Smith", 60000));
        employees.add(new Employee(103, "Sam Wilson", 55000));

        // Display their details using the displayDetails() method
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}
