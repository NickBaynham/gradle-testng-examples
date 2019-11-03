package io.automation.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ParameterizedTest {

    @Test(groups="examples")
    @Parameters("name")
    public void parameterizedTest(String name) {
        System.out.println("Parameter Passed to Test: " + name);
    }
}
