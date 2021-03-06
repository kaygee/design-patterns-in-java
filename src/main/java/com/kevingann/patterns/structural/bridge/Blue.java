package com.kevingann.patterns.structural.bridge;

/**
 * Notice the implementation of the method from Color
 */
public class Blue implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying blue color.");
    }
}
