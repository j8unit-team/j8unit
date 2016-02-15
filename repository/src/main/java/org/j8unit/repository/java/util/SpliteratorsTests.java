package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Spliterators class java.util.Spliterators}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SpliteratorsClassTests}.
 * </p>
 *
 * @see java.util.Spliterators class java.util.Spliterators (the hereby targeted class-under-test class)
 * @see SpliteratorsClassTests SpliteratorsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SpliteratorsTests<SUT extends java.util.Spliterators>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Spliterators.AbstractLongSpliterator class
     * java.util.Spliterators$AbstractLongSpliterator}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link SpliteratorsClassTests.AbstractLongSpliteratorClassTests}.
     * </p>
     *
     * @see java.util.Spliterators.AbstractLongSpliterator class java.util.Spliterators$AbstractLongSpliterator (the
     *      hereby targeted class-under-test class)
     * @see SpliteratorsClassTests.AbstractLongSpliteratorClassTests
     *      SpliteratorsClassTests.AbstractLongSpliteratorClassTests (the complementary j8unit test interface containing
     *      the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractLongSpliteratorTests<SUT extends java.util.Spliterators.AbstractLongSpliterator>
    extends SpliteratorTests.OfLongTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractLongSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractLongSpliterator.characteristics()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractLongSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractLongSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractLongSpliterator#characteristics() public int
         *      java.util.Spliterators$AbstractLongSpliterator.characteristics() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_characteristics()
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
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractLongSpliterator#trySplit() public
         * java.util.Spliterator$OfLong java.util.Spliterators$AbstractLongSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractLongSpliterator#trySplit() public java.util.Spliterator$OfLong
         *      java.util.Spliterators$AbstractLongSpliterator.trySplit() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_trySplit()
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
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractLongSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractLongSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractLongSpliterator#estimateSize() public long
         *      java.util.Spliterators$AbstractLongSpliterator.estimateSize() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_estimateSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Spliterators.AbstractIntSpliterator class
     * java.util.Spliterators$AbstractIntSpliterator}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link SpliteratorsClassTests.AbstractIntSpliteratorClassTests}.
     * </p>
     *
     * @see java.util.Spliterators.AbstractIntSpliterator class java.util.Spliterators$AbstractIntSpliterator (the
     *      hereby targeted class-under-test class)
     * @see SpliteratorsClassTests.AbstractIntSpliteratorClassTests
     *      SpliteratorsClassTests.AbstractIntSpliteratorClassTests (the complementary j8unit test interface containing
     *      the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractIntSpliteratorTests<SUT extends java.util.Spliterators.AbstractIntSpliterator>
    extends SpliteratorTests.OfIntTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractIntSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractIntSpliterator.characteristics()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractIntSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractIntSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractIntSpliterator#characteristics() public int
         *      java.util.Spliterators$AbstractIntSpliterator.characteristics() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_characteristics()
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
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractIntSpliterator#trySplit() public
         * java.util.Spliterator$OfInt java.util.Spliterators$AbstractIntSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractIntSpliterator#trySplit() public java.util.Spliterator$OfInt
         *      java.util.Spliterators$AbstractIntSpliterator.trySplit() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_trySplit()
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
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractIntSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractIntSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractIntSpliterator#estimateSize() public long
         *      java.util.Spliterators$AbstractIntSpliterator.estimateSize() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_estimateSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Spliterators.AbstractDoubleSpliterator class
     * java.util.Spliterators$AbstractDoubleSpliterator}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link SpliteratorsClassTests.AbstractDoubleSpliteratorClassTests}.
     * </p>
     *
     * @see java.util.Spliterators.AbstractDoubleSpliterator class java.util.Spliterators$AbstractDoubleSpliterator (the
     *      hereby targeted class-under-test class)
     * @see SpliteratorsClassTests.AbstractDoubleSpliteratorClassTests
     *      SpliteratorsClassTests.AbstractDoubleSpliteratorClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractDoubleSpliteratorTests<SUT extends java.util.Spliterators.AbstractDoubleSpliterator>
    extends SpliteratorTests.OfDoubleTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractDoubleSpliterator.estimateSize()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractDoubleSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractDoubleSpliterator#estimateSize() public long
         *      java.util.Spliterators$AbstractDoubleSpliterator.estimateSize() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
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
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#trySplit() public
         * java.util.Spliterator$OfDouble java.util.Spliterators$AbstractDoubleSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractDoubleSpliterator#trySplit() public java.util.Spliterator$OfDouble
         *      java.util.Spliterators$AbstractDoubleSpliterator.trySplit() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_trySplit()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractDoubleSpliterator.characteristics()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractDoubleSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractDoubleSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractDoubleSpliterator#characteristics() public int
         *      java.util.Spliterators$AbstractDoubleSpliterator.characteristics() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_characteristics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Spliterators.AbstractSpliterator class
     * java.util.Spliterators$AbstractSpliterator}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link SpliteratorsClassTests.AbstractSpliteratorClassTests}.
     * </p>
     *
     * @see java.util.Spliterators.AbstractSpliterator class java.util.Spliterators$AbstractSpliterator (the hereby
     *      targeted class-under-test class)
     * @see SpliteratorsClassTests.AbstractSpliteratorClassTests SpliteratorsClassTests.AbstractSpliteratorClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractSpliteratorTests<SUT extends java.util.Spliterators.AbstractSpliterator<T>, T>
    extends SpliteratorTests<SUT, T>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractSpliterator.characteristics()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#characteristics() public int
         * java.util.Spliterators$AbstractSpliterator.characteristics()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractSpliterator#characteristics() public int
         *      java.util.Spliterators$AbstractSpliterator.characteristics() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_characteristics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#trySplit() public java.util.Spliterator
         * <T> java.util.Spliterators$AbstractSpliterator.trySplit()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#trySplit() public java.util.Spliterator
         * java.util.Spliterators$AbstractSpliterator.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractSpliterator#trySplit() public java.util.Spliterator
         *      java.util.Spliterators$AbstractSpliterator.trySplit() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_trySplit()
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
         * <p>
         * Test method for {@link java.util.Spliterators.AbstractSpliterator#estimateSize() public long
         * java.util.Spliterators$AbstractSpliterator.estimateSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterators.AbstractSpliterator#estimateSize() public long
         *      java.util.Spliterators$AbstractSpliterator.estimateSize() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_estimateSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
