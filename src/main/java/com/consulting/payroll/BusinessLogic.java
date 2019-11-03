package com.consulting.payroll;

public class BusinessLogic {

    // Calculate Annual Salary of Employee
    public double calculateAnnualSalary(EmployeeDetails employeeDetails) {
        double annualSalary = 0;
        annualSalary = employeeDetails.getMonthlySalary() * 12;
        return annualSalary;
    }

    // Calculate the Appraisal Amount of Employee
    public double calculateAppraisalAmount(EmployeeDetails employeeDetails) {
        double appraisal = 0;

        if (employeeDetails.getMonthlySalary() < 10000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }
        return appraisal;
    }
}
