package com.messaging.utils;

/**
 *   This class prints out a message on the console
 */
public class Messenger {
    private String message;

    /**
     * @param message - A message to be printed to the console
     */
    public Messenger(String message) {
        this.message = message;
    }

    // Prints the message
    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
