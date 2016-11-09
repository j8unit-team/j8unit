package org.j8unit.repository.java.util;

import java.util.Spliterators;
import java.util.Spliterators.AbstractDoubleSpliterator;
import java.util.Spliterators.AbstractIntSpliterator;
import java.util.Spliterators.AbstractLongSpliterator;
import java.util.Spliterators.AbstractSpliterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Spliterators} (by simply reusing the
 * J8Unit test interface {@link SpliteratorsTests}).
 */

@RunWith(J8Unit4.class)
public class SpliteratorsTest
implements SpliteratorsTests<Spliterators> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterators]

    @Override
    public Spliterators createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Spliterators], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterators]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterators]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractDoubleSpliterator} (by
     * simply reusing the J8Unit test interface {@link AbstractDoubleSpliteratorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AbstractDoubleSpliteratorTest
    implements AbstractDoubleSpliteratorTests<AbstractDoubleSpliterator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterators$AbstractDoubleSpliterator]

        @Override
        public AbstractDoubleSpliterator createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterators.AbstractDoubleSpliterator], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterators$AbstractDoubleSpliterator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterators$AbstractDoubleSpliterator]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractSpliterator} (by simply
     * reusing the J8Unit test interface {@link AbstractSpliteratorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AbstractSpliteratorTest<T>
    implements AbstractSpliteratorTests<AbstractSpliterator<T>, T> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterators$AbstractSpliterator]

        @Override
        public AbstractSpliterator<T> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterators.AbstractSpliterator], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterators$AbstractSpliterator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterators$AbstractSpliterator]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractLongSpliterator} (by
     * simply reusing the J8Unit test interface {@link AbstractLongSpliteratorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AbstractLongSpliteratorTest
    implements AbstractLongSpliteratorTests<AbstractLongSpliterator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterators$AbstractLongSpliterator]

        @Override
        public AbstractLongSpliterator createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterators.AbstractLongSpliterator], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterators$AbstractLongSpliterator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterators$AbstractLongSpliterator]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractIntSpliterator} (by
     * simply reusing the J8Unit test interface {@link AbstractIntSpliteratorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AbstractIntSpliteratorTest
    implements AbstractIntSpliteratorTests<AbstractIntSpliterator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Spliterators$AbstractIntSpliterator]

        @Override
        public AbstractIntSpliterator createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Spliterators.AbstractIntSpliterator], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Spliterators$AbstractIntSpliterator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Spliterators$AbstractIntSpliterator]

    }

}
