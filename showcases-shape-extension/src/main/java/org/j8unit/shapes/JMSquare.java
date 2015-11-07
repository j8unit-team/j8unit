package org.j8unit.shapes;

import org.j8unit.shapes.Rectangle;

public class JMSquare
extends Rectangle {

    public JMSquare(final double width) {
        super(width, width);
    }

    @Override
    public void setHeight(final double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(final double width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}
