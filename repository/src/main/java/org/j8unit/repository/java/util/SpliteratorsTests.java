package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.Spliterators class java.util.Spliterators}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.SpliteratorsTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.SpliteratorsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.Spliterators
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SpliteratorsTests<SUT extends java.util.Spliterators>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.Spliterators.AbstractDoubleSpliterator class
     * java.util.Spliterators$AbstractDoubleSpliterator}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractDoubleSpliteratorTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractDoubleSpliteratorClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.Spliterators.AbstractDoubleSpliterator
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractDoubleSpliteratorTests<SUT extends java.util.Spliterators.AbstractDoubleSpliterator>
    extends org.j8unit.repository.java.util.SpliteratorTests.OfDoubleTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractDoubleSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractDoubleSpliterator#characteristics()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_characteristics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractDoubleSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractDoubleSpliterator#estimateSize()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_estimateSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#trySplit() public
         * java.util.Spliterator$OfDouble java.util.Spliterators$AbstractDoubleSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractDoubleSpliterator#trySplit()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_trySplit()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.Spliterators.AbstractIntSpliterator class
     * java.util.Spliterators$AbstractIntSpliterator}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractIntSpliteratorTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractIntSpliteratorClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.Spliterators.AbstractIntSpliterator
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractIntSpliteratorTests<SUT extends java.util.Spliterators.AbstractIntSpliterator>
    extends org.j8unit.repository.java.util.SpliteratorTests.OfIntTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractIntSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractIntSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractIntSpliterator#characteristics()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_characteristics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractIntSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractIntSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractIntSpliterator#estimateSize()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_estimateSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractIntSpliterator#trySplit() public
         * java.util.Spliterator$OfInt java.util.Spliterators$AbstractIntSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractIntSpliterator#trySplit()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_trySplit()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.Spliterators.AbstractLongSpliterator class
     * java.util.Spliterators$AbstractLongSpliterator}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractLongSpliteratorTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractLongSpliteratorClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.Spliterators.AbstractLongSpliterator
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractLongSpliteratorTests<SUT extends java.util.Spliterators.AbstractLongSpliterator>
    extends org.j8unit.repository.java.util.SpliteratorTests.OfLongTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractLongSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractLongSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractLongSpliterator#characteristics()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_characteristics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractLongSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractLongSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractLongSpliterator#estimateSize()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_estimateSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractLongSpliterator#trySplit() public
         * java.util.Spliterator$OfLong java.util.Spliterators$AbstractLongSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractLongSpliterator#trySplit()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_trySplit()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.Spliterators.AbstractSpliterator class
     * java.util.Spliterators$AbstractSpliterator}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractSpliteratorTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.SpliteratorsClassTests.AbstractSpliteratorClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.Spliterators.AbstractSpliterator
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractSpliteratorTests<SUT extends java.util.Spliterators.AbstractSpliterator<T>, T>
    extends org.j8unit.repository.java.util.SpliteratorTests<SUT, T>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractSpliterator#characteristics()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_characteristics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractSpliterator#estimateSize()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_estimateSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#trySplit() public java.util.Spliterator
         * java.util.Spliterators$AbstractSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Spliterators.AbstractSpliterator#trySplit()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_trySplit()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
