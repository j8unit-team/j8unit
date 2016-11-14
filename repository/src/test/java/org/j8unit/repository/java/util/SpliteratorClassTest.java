package org.j8unit.repository.java.util;

import java.util.Spliterator;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.Spliterator.OfPrimitive;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Spliterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SpliteratorClassTest
implements SpliteratorClassTests<Spliterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Spliterator]

    @Override
    public Class<Spliterator> createNewSUT() {
        return Spliterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Spliterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Spliterator]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OfPrimitive} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorClassTests.OfPrimitiveClassTests}).
     */
    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class OfPrimitiveClassTest
    implements OfPrimitiveClassTests<OfPrimitive> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Spliterator$OfPrimitive]

        @Override
        public Class<OfPrimitive> createNewSUT() {
            return OfPrimitive.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Spliterator$OfPrimitive]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Spliterator$OfPrimitive]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OfLong} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.util.SpliteratorClassTests.OfLongClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OfLongClassTest
    implements OfLongClassTests<OfLong> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Spliterator$OfLong]

        @Override
        public Class<OfLong> createNewSUT() {
            return OfLong.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Spliterator$OfLong]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Spliterator$OfLong]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OfInt} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.util.SpliteratorClassTests.OfIntClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OfIntClassTest
    implements OfIntClassTests<OfInt> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Spliterator$OfInt]

        @Override
        public Class<OfInt> createNewSUT() {
            return OfInt.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Spliterator$OfInt]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Spliterator$OfInt]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link OfDouble} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.SpliteratorClassTests.OfDoubleClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OfDoubleClassTest
    implements OfDoubleClassTests<OfDouble> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Spliterator$OfDouble]

        @Override
        public Class<OfDouble> createNewSUT() {
            return OfDouble.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Spliterator$OfDouble]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Spliterator$OfDouble]

    }

}
