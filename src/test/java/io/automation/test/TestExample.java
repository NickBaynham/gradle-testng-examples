package io.automation.test;

import org.testng.annotations.*;

public class TestExample {

    @BeforeSuite(groups="examples")
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest(groups="examples")
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass(groups="examples")
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeGroups(groups="examples")
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeMethod(groups="examples")
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(groups="examples")
    public void test() {
        System.out.println("Hello, Tester!");
    }

    @Test(enabled=false)
    public void ignoredTest() {
        System.out.println("This test will be ignored.");
    }

    @AfterMethod(groups="examples")
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterGroups(groups="examples")
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @AfterClass(groups="examples")
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterTest(groups="examples")
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite(groups="examples")
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
