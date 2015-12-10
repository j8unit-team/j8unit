package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PrimitiveIteratorClassTest
implements org.j8unit.repository.java.util.PrimitiveIteratorClassTests<java.util.PrimitiveIterator> {

    @RunWith(J8Unit4.class)
    public static class OfDoubleClassTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfDoubleClassTests<java.util.PrimitiveIterator.OfDouble> {

        @Override
        public Class<java.util.PrimitiveIterator.OfDouble> createNewSUT() {
            return java.util.PrimitiveIterator.OfDouble.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OfIntClassTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfIntClassTests<java.util.PrimitiveIterator.OfInt> {

        @Override
        public Class<java.util.PrimitiveIterator.OfInt> createNewSUT() {
            return java.util.PrimitiveIterator.OfInt.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OfLongClassTest
    implements org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfLongClassTests<java.util.PrimitiveIterator.OfLong> {

        @Override
        public Class<java.util.PrimitiveIterator.OfLong> createNewSUT() {
            return java.util.PrimitiveIterator.OfLong.class;
        }

    }

    @Override
    public Class<java.util.PrimitiveIterator> createNewSUT() {
        return java.util.PrimitiveIterator.class;
    }

}
