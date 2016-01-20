package com.kevingann.patterns.bridge;

/**
 * One side of the bridge.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
