package com.kevingann.patterns.bridge;


/**
 * Notice the inheritance from Shape and that the overridden method uses the method from the instance.
 */
public class Square extends Shape {


    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
