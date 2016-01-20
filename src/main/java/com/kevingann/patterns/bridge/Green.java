package com.kevingann.patterns.bridge;

public class Green implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying green color.");
    }
}
