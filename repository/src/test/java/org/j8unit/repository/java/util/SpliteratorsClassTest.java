package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SpliteratorsClassTest
implements org.j8unit.repository.java.util.SpliteratorsClassTests<java.util.Spliterators> {

    @RunWith(J8Unit4.class)
    public static class AbstractDoubleSpliteratorClassTest
    implements org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractDoubleSpliteratorClassTests<java.util.Spliterators.AbstractDoubleSpliterator> {

        @Override
        public Class<java.util.Spliterators.AbstractDoubleSpliterator> createNewSUT() {
            return java.util.Spliterators.AbstractDoubleSpliterator.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class AbstractIntSpliteratorClassTest
    implements org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractIntSpliteratorClassTests<java.util.Spliterators.AbstractIntSpliterator> {

        @Override
        public Class<java.util.Spliterators.AbstractIntSpliterator> createNewSUT() {
            return java.util.Spliterators.AbstractIntSpliterator.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class AbstractLongSpliteratorClassTest
    implements org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractLongSpliteratorClassTests<java.util.Spliterators.AbstractLongSpliterator> {

        @Override
        public Class<java.util.Spliterators.AbstractLongSpliterator> createNewSUT() {
            return java.util.Spliterators.AbstractLongSpliterator.class;
        }

    }

    @RunWith(J8Unit4.class)
    @SuppressWarnings("rawtypes")
    public static class AbstractSpliteratorClassTest
    implements org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractSpliteratorClassTests<java.util.Spliterators.AbstractSpliterator> {

        @Override
        public Class<java.util.Spliterators.AbstractSpliterator> createNewSUT() {
            return java.util.Spliterators.AbstractSpliterator.class;
        }

    }

    @Override
    public Class<java.util.Spliterators> createNewSUT() {
        return java.util.Spliterators.class;
    }

}
