package org.j8unit.shapes;

/**
 * Definition of a two-dimensional shape.
 *
 * @author <a href="mailto:stefan.gasterstaedt@informaticum.de">Stefan Gasterst&auml;dt</a>
 */
public abstract interface Shape {

    /**
     * Any shape has a positive, non-zero perimeter; the path that surrounds a two-dimensional shape.
     *
     * Technically spoken, the result of this method will be a value between {@link Double#MIN_NORMAL} and
     * {@link Double#MAX_VALUE} (incl. border values).
     *
     * @return the shape's perimeter
     */
    public abstract double getPerimeter();

    /**
     * Any shape has a positive, non-zero area; the quantity that expresses the extent of a shape in the plane.
     *
     * Technically spoken, the result of this method will be a value between {@link Double#MIN_NORMAL} and
     * {@link Double#MAX_VALUE} (incl. border values).
     *
     * @return the shape's area
     */
    public abstract double getArea();

}
