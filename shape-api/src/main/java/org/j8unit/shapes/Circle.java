package org.j8unit.shapes;

import static java.lang.Math.PI;

public class Circle
extends AbstractShape {

    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(final double width)
    throws IllegalArgumentException {
        this.radius = this.validateValue(this.radius, "radius");
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public Circle(final double radius)
    throws IllegalArgumentException {
        this.radius = this.validateValue(radius, "radius");
    }

}
