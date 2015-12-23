package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.DirectoryStream interface java.nio.file.DirectoryStream}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.DirectoryStreamTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.DirectoryStreamClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.DirectoryStream
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirectoryStreamTests<SUT extends java.nio.file.DirectoryStream<T>, T>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.lang.IterableTests<SUT, T> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.nio.file.DirectoryStream.Filter interface
     * java.nio.file.DirectoryStream$Filter}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.java.nio.file.DirectoryStreamTests.FilterTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.nio.file.DirectoryStreamClassTests.FilterClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.nio.file.DirectoryStream.Filter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterTests<SUT extends java.nio.file.DirectoryStream.Filter<T>, T>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.file.DirectoryStream.Filter#accept(java.lang.Object) public abstract boolean
         * java.nio.file.DirectoryStream$Filter.accept(java.lang.Object) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.nio.file.DirectoryStream.Filter#accept(java.lang.Object)
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

    }

    /**
     * <p>
     * Test method for {@link java.nio.file.DirectoryStream#iterator() public abstract java.util.Iterator
     * java.nio.file.DirectoryStream.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.DirectoryStream#iterator()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
