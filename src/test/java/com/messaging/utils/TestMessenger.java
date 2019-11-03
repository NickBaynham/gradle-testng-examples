package com.messaging.utils;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class TestMessenger {
    private String message = "Hello Tester!";
    private Messenger messenger = new Messenger(message);

    @Test(groups="examples")
    public void testMessenger() {
        assertEquals(message, messenger.printMessage());
    }
}
