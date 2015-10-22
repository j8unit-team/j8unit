package org.j8unit.shapes;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;
import org.hamcrest.Matcher;
import org.j8unit.SupplierBasedJ8UnitTest;
import org.j8unit.shapes.Shape;
import org.junit.Test;

public abstract interface ShapeTest<S extends Shape>
extends SupplierBasedJ8UnitTest<S> {

    public static final Matcher<Double> IS_POSITIVE_DOUBLE = is(both(greaterThan(0.0)).and(lessThanOrEqualTo(Double.MAX_VALUE)));

    @Test
    public default void testAreaIsPositive() {
        final S sut = this.getNewSubjectUnderTest();
        assertThat(sut.getArea(), IS_POSITIVE_DOUBLE);
    }

}
