package org.j8unit.repository.java.util;

import java.util.PrimitiveIterator;
import java.util.PrimitiveIterator.OfDouble;
import java.util.PrimitiveIterator.OfInt;
import java.util.PrimitiveIterator.OfLong;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrimitiveIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.PrimitiveIteratorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PrimitiveIteratorClassTest
implements PrimitiveIteratorClassTests<PrimitiveIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.PrimitiveIterator]

    @Override
    public Class<PrimitiveIterator> createNewSUT() {
        return PrimitiveIterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.PrimitiveIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.PrimitiveIterator]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OfLong} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfLongClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class OfLongClassTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfLongClassTests<OfLong> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.PrimitiveIterator$OfLong]

        @Override
        public Class<OfLong> createNewSUT() {
            return OfLong.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.PrimitiveIterator$OfLong]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.PrimitiveIterator$OfLong]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OfDouble} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfDoubleClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class OfDoubleClassTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfDoubleClassTests<OfDouble> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.PrimitiveIterator$OfDouble]

        @Override
        public Class<OfDouble> createNewSUT() {
            return OfDouble.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.PrimitiveIterator$OfDouble]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.PrimitiveIterator$OfDouble]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OfInt} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfIntClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class OfIntClassTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfIntClassTests<OfInt> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.PrimitiveIterator$OfInt]

        @Override
        public Class<OfInt> createNewSUT() {
            return OfInt.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.PrimitiveIterator$OfInt]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.PrimitiveIterator$OfInt]

    }

}
