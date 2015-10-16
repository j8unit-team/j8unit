package org.j8unit.shapes;

public class Rectangle
extends AbstractShape {

    private double width;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(final double width)
    throws IllegalArgumentException {
        this.width = this.validateValue(width, "width");
    }

    private double height;

    public double getHeight() {
        return this.height;
    }

    public void setHeight(final double height)
    throws IllegalArgumentException {
        this.height = this.validateValue(height, "height");
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    public Rectangle(final double width, final double height)
    throws IllegalArgumentException {
        this.width = this.validateValue(width, "width");
        this.height = this.validateValue(height, "height");
    }

}
