package org.j8unit.repository.java.util;

import java.util.Spliterator;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.Spliterator.OfPrimitive;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SpliteratorTest<T>
implements org.j8unit.repository.java.util.SpliteratorTests<Spliterator<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator]

    @Override
    public Spliterator<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator]

    @RunWith(J8Unit4.class)
    public static class OfPrimitiveTest<T, T_CONS, T_SPLITR extends OfPrimitive<T, T_CONS, T_SPLITR>>
    implements org.j8unit.repository.java.util.SpliteratorTests.OfPrimitiveTests<OfPrimitive<T, T_CONS, T_SPLITR>, T, T_CONS, T_SPLITR> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfPrimitive]

        @Override
        public OfPrimitive<T, T_CONS, T_SPLITR> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfPrimitive], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfPrimitive]

    }

    @RunWith(J8Unit4.class)
    public static class OfLongTest
    implements org.j8unit.repository.java.util.SpliteratorTests.OfLongTests<OfLong> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfLong]

        @Override
        public OfLong createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfLong], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfLong]

    }

    @RunWith(J8Unit4.class)
    public static class OfIntTest
    implements org.j8unit.repository.java.util.SpliteratorTests.OfIntTests<OfInt> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfInt]

        @Override
        public OfInt createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfInt], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfInt]

    }

    @RunWith(J8Unit4.class)
    public static class OfDoubleTest
    implements org.j8unit.repository.java.util.SpliteratorTests.OfDoubleTests<OfDouble> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfDouble]

        @Override
        public OfDouble createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterator.OfDouble], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterator$OfDouble]

    }

}
