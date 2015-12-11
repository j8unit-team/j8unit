package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SpliteratorClassTest
implements org.j8unit.repository.java.util.SpliteratorClassTests<java.util.Spliterator> {

    @RunWith(J8Unit4.class)
    public static class OfDoubleClassTest
    implements org.j8unit.repository.java.util.SpliteratorClassTests.OfDoubleClassTests<java.util.Spliterator.OfDouble> {

        @Override
        public Class<java.util.Spliterator.OfDouble> createNewSUT() {
            return java.util.Spliterator.OfDouble.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OfIntClassTest
    implements org.j8unit.repository.java.util.SpliteratorClassTests.OfIntClassTests<java.util.Spliterator.OfInt> {

        @Override
        public Class<java.util.Spliterator.OfInt> createNewSUT() {
            return java.util.Spliterator.OfInt.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OfLongClassTest
    implements org.j8unit.repository.java.util.SpliteratorClassTests.OfLongClassTests<java.util.Spliterator.OfLong> {

        @Override
        public Class<java.util.Spliterator.OfLong> createNewSUT() {
            return java.util.Spliterator.OfLong.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OfPrimitiveClassTest
    implements org.j8unit.repository.java.util.SpliteratorClassTests.OfPrimitiveClassTests<java.util.Spliterator.OfPrimitive> {

        @Override
        public Class<java.util.Spliterator.OfPrimitive> createNewSUT() {
            return java.util.Spliterator.OfPrimitive.class;
        }

    }

    @Override
    public Class<java.util.Spliterator> createNewSUT() {
        return java.util.Spliterator.class;
    }

}
