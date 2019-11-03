package com.payroll.test;

import com.consulting.payroll.BusinessLogic;
import com.consulting.payroll.EmployeeDetails;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestEmployeeDetails {
    private BusinessLogic businessLogic = new BusinessLogic();
    private EmployeeDetails employeeDetails = new EmployeeDetails();

    @Test(groups="payroll")
    public void testCalculateAppraisal() {
        employeeDetails.setFirstName("Sami");
        employeeDetails.setLastName("Fletcher");
        employeeDetails.setAge(45);
        employeeDetails.setMonthlySalary(8000);

        double appraisal = businessLogic.calculateAppraisalAmount(employeeDetails);
        assertEquals(500, appraisal, 0.0, "500");
    }

    @Test(groups="payroll")
    public void testCalculateAnnualSalary() {
        employeeDetails.setFirstName("Roger");
        employeeDetails.setLastName("Rabbit");
        employeeDetails.setAge(21);
        employeeDetails.setMonthlySalary(8000);

        double salary = businessLogic.calculateAnnualSalary(employeeDetails);
        assertEquals(96000, salary, 0.0, "8000");
    }
}
