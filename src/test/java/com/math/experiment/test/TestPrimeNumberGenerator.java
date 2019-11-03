package com.math.experiment.test;

import com.math.experiment.PrimeNumberGenerator;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class TestPrimeNumberGenerator {
    private PrimeNumberGenerator primeNumberGenerator;

    @BeforeMethod(groups = "examples")
    public void initialize() {
        primeNumberGenerator = new PrimeNumberGenerator();
    }

    @DataProvider(name = "test", parallel = true)
    public static Object[][] primeNumbers() {
        return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }

    @Test(dataProvider = "test", groups = "examples")
    public void testPrimeNumberGenerator(Integer inputNumber, Boolean expectedResult) {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: "+id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(inputNumber + " " + expectedResult);
        System.out.println(primeNumberGenerator.validate(inputNumber));
        assertEquals(expectedResult, primeNumberGenerator.validate(inputNumber));
    }
}
