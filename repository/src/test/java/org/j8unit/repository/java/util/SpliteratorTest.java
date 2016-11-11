package org.j8unit.repository.java.util;

import java.util.Spliterator;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.Spliterator.OfPrimitive;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Spliterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorTests}).
 */

@RunWith(J8Unit4.class)
public class SpliteratorTest<T>
implements SpliteratorTests<Spliterator<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator]

    @Override
    public Spliterator<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterator]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link OfPrimitive} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorTests.OfPrimitiveTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OfPrimitiveTest<T, T_CONS, T_SPLITR extends OfPrimitive<T, T_CONS, T_SPLITR>>
    implements OfPrimitiveTests<OfPrimitive<T, T_CONS, T_SPLITR>, T, T_CONS, T_SPLITR> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfPrimitive]

        @Override
        public OfPrimitive<T, T_CONS, T_SPLITR> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfPrimitive], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterator$OfPrimitive]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterator$OfPrimitive]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link OfLong} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorTests.OfLongTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OfLongTest
    implements OfLongTests<OfLong> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfLong]

        @Override
        public OfLong createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfLong], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterator$OfLong]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterator$OfLong]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link OfInt} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorTests.OfIntTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OfIntTest
    implements OfIntTests<OfInt> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfInt]

        @Override
        public OfInt createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfInt], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterator$OfInt]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterator$OfInt]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link OfDouble} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorTests.OfDoubleTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OfDoubleTest
    implements OfDoubleTests<OfDouble> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfDouble]

        @Override
        public OfDouble createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfDouble], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterator$OfDouble]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterator$OfDouble]

    }

}
