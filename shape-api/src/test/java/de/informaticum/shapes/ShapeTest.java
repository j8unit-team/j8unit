package de.informaticum.shapes;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;
import org.hamcrest.Matcher;
import org.junit.Test;
import de.informaticum.j8junit.repository.J8UnitTest;

public abstract interface ShapeTest<S extends Shape>
extends J8UnitTest<S> {

    public static final Matcher<Double> IS_POSITIVE_DOUBLE = is(both(greaterThan(0.0)).and(lessThanOrEqualTo(Double.MAX_VALUE)));

    @Test
    public default void testAreaIsPositive() {
        final S sut = this.getNewSubjectUnderTest();
        assertThat(sut.getArea(), IS_POSITIVE_DOUBLE);
    }

}
