package org.j8unit.repository.java.util;

import java.util.PrimitiveIterator;
import java.util.PrimitiveIterator.OfDouble;
import java.util.PrimitiveIterator.OfInt;
import java.util.PrimitiveIterator.OfLong;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrimitiveIteratorTest<T, T_CONS>
implements org.j8unit.repository.java.util.PrimitiveIteratorTests<PrimitiveIterator<T, T_CONS>, T, T_CONS> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.PrimitiveIterator]

    @Override
    public PrimitiveIterator<T, T_CONS> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.PrimitiveIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.PrimitiveIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.PrimitiveIterator]

    @RunWith(J8Unit4.class)
    public static class OfLongTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorTests.OfLongTests<OfLong> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.PrimitiveIterator$OfLong]

        @Override
        public OfLong createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.PrimitiveIterator.OfLong], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.PrimitiveIterator$OfLong]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.PrimitiveIterator$OfLong]

    }

    @RunWith(J8Unit4.class)
    public static class OfDoubleTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorTests.OfDoubleTests<OfDouble> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.PrimitiveIterator$OfDouble]

        @Override
        public OfDouble createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.PrimitiveIterator.OfDouble], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.PrimitiveIterator$OfDouble]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.PrimitiveIterator$OfDouble]

    }

    @RunWith(J8Unit4.class)
    public static class OfIntTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorTests.OfIntTests<OfInt> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.PrimitiveIterator$OfInt]

        @Override
        public OfInt createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.PrimitiveIterator.OfInt], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.PrimitiveIterator$OfInt]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.PrimitiveIterator$OfInt]

    }

}
