package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.DirectoryStream interface java.nio.file.DirectoryStream}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link DirectoryStreamClassTests}.
 * </p>
 *
 * @see java.nio.file.DirectoryStream interface java.nio.file.DirectoryStream (the hereby targeted class-under-test
 *      class)
 * @see DirectoryStreamClassTests DirectoryStreamClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirectoryStreamTests<SUT extends java.nio.file.DirectoryStream<T>, T>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.lang.IterableTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.nio.file.DirectoryStream#iterator() public abstract java.util.Iterator
     * <T> java.nio.file.DirectoryStream.iterator()}.
     *
     * <p>
     * Test method for {@link java.nio.file.DirectoryStream#iterator() public abstract java.util.Iterator
     * java.nio.file.DirectoryStream.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.DirectoryStream#iterator() public abstract java.util.Iterator
     *      java.nio.file.DirectoryStream.iterator() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.nio.file.DirectoryStream.Filter interface
     * java.nio.file.DirectoryStream$Filter}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link DirectoryStreamClassTests.FilterClassTests}.
     * </p>
     *
     * @see java.nio.file.DirectoryStream.Filter interface java.nio.file.DirectoryStream$Filter (the hereby targeted
     *      class-under-test class)
     * @see DirectoryStreamClassTests.FilterClassTests DirectoryStreamClassTests.FilterClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterTests<SUT extends java.nio.file.DirectoryStream.Filter<T>, T>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.file.DirectoryStream.Filter#accept(Object) public abstract boolean
         * java.nio.file.DirectoryStream$Filter.accept(T) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.nio.file.DirectoryStream.Filter#accept(Object) public abstract boolean
         * java.nio.file.DirectoryStream$Filter.accept(java.lang.Object) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.nio.file.DirectoryStream.Filter#accept(Object) public abstract boolean
         *      java.nio.file.DirectoryStream$Filter.accept(java.lang.Object) throws java.io.IOException (the hereby
         *      targeted method-under-test)
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

}
