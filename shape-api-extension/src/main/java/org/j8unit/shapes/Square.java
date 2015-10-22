package org.j8unit.shapes;

public class Square
extends Rectangle {

    @Override
    public void setHeight(final double height)
    throws IllegalArgumentException {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(final double width)
    throws IllegalArgumentException {
        super.setHeight(width);
        super.setWidth(width);
    }

    public Square(final double width)
    throws IllegalArgumentException {
        super(width, width);
    }

}
