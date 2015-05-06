package de.informaticum.shapes;

public abstract class AbstractShape
implements Shape {

    protected double validateValue(final double value, final String name)
    throws IllegalArgumentException {
        if ((value >= Double.MIN_NORMAL) && (value <= Double.MAX_VALUE)) {
            return value;
        }
        throw new IllegalArgumentException(String.format("The %s must be a positive (non-zero) value, but actually is %f!", name, value));
    }

}
