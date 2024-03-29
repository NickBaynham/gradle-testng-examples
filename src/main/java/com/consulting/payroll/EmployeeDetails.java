package com.consulting.payroll;

public class EmployeeDetails {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private int age;

    public String getFirstName() {
        return firstName.toString();
    }

    public String getLastName() {
        return lastName.toString();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
