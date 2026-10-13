// Create a Java program to store:
// - Employee ID
// - Employee name
// - Salary
// - Performance rating
// - Employment status
// Use appropriate data types and print all values.

public class EmpDetails {
    public static void main(String[] args) {
        // Employee details
        int empid = 11;
        String empname = "John Doe";
        double salary = 50000.00;
        String performanceRating = "B";
        boolean empStatus = true;

        // Print employee details
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Salary: $" + salary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Employment Status: " + (empStatus ? "Active" : "Inactive"));
    }
}