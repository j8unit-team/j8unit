package org.j8unit.shapes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.j8unit.shapes.Circle;
import org.junit.Test;

public abstract interface CircleTest<C extends Circle>
extends AbstractShapeTest<C> {

    @Test
    public default void testRadiusIsPositive() {
        final C sut = this.createNewSUT();
        assertThat(sut.getRadius(), IS_POSITIVE_DOUBLE);
    }

    @Test
    public default void testScalingAreaByScalingRadius() {
        final C sut = this.createNewSUT();
        final double oldArea = sut.getArea();
        sut.setRadius(2 * sut.getRadius());
        final double newArea = sut.getArea();
        assertEquals(newArea, 4 * oldArea, 0.0);
    }

    @Test
    public default void testScalingDiameterByScalingHeight() {
        final C sut = this.createNewSUT();
        final double oldDiameter = sut.getDiameter();
        sut.setRadius(2 * sut.getRadius());
        final double newDiameter = sut.getArea();
        assertEquals(newDiameter, 2 * oldDiameter, 0.0);
    }

}
