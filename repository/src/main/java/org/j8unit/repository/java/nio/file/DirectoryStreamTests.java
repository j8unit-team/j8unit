package org.j8unit.repository.java.nio.file;

import java.nio.file.DirectoryStream;
import java.nio.file.DirectoryStream.Filter;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.CloseableTests;
import org.j8unit.repository.java.lang.IterableTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DirectoryStream
 * public abstract interface java.nio.file.DirectoryStream<T>}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link DirectoryStreamClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirectoryStreamTests<SUT extends DirectoryStream<T>, T>
extends CloseableTests<SUT>, IterableTests<SUT, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryStream]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.file.DirectoryStream#iterator() public
     * abstract java.util.Iterator<T> java.nio.file.DirectoryStream.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.DirectoryStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.DirectoryStream]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Filter
     * public abstract static interface java.nio.file.DirectoryStream$Filter<T>}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.java.nio.file.DirectoryStreamClassTests.FilterClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterTests<SUT extends Filter<T>, T>
    extends RepositoryTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryStream$Filter]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.nio.file.DirectoryStream.Filter#accept(Object) public abstract boolean
         * java.nio.file.DirectoryStream$Filter.accept(T) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_accept_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.DirectoryStream$Filter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.DirectoryStream$Filter]
    }

}
