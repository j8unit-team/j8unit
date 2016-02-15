package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.PrimitiveIterator interface java.util.PrimitiveIterator}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PrimitiveIteratorClassTests}.
 * </p>
 *
 * @see java.util.PrimitiveIterator interface java.util.PrimitiveIterator (the hereby targeted class-under-test class)
 * @see PrimitiveIteratorClassTests PrimitiveIteratorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrimitiveIteratorTests<SUT extends java.util.PrimitiveIterator<T, T_CONS>, T, T_CONS>
extends IteratorTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.util.PrimitiveIterator#forEachRemaining(Object) public abstract void
     * java.util.PrimitiveIterator.forEachRemaining(T_CONS)}.
     *
     * <p>
     * Test method for {@link java.util.PrimitiveIterator#forEachRemaining(Object) public abstract void
     * java.util.PrimitiveIterator.forEachRemaining(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PrimitiveIterator#forEachRemaining(Object) public abstract void
     *      java.util.PrimitiveIterator.forEachRemaining(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachRemaining_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.PrimitiveIterator.OfInt interface
     * java.util.PrimitiveIterator$OfInt}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link PrimitiveIteratorClassTests.OfIntClassTests}.
     * </p>
     *
     * @see java.util.PrimitiveIterator.OfInt interface java.util.PrimitiveIterator$OfInt (the hereby targeted
     *      class-under-test class)
     * @see PrimitiveIteratorClassTests.OfIntClassTests PrimitiveIteratorClassTests.OfIntClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfIntTests<SUT extends java.util.PrimitiveIterator.OfInt>
    extends PrimitiveIteratorTests<SUT, Integer, java.util.function.IntConsumer> {

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#next() public default java.lang.Integer
         * java.util.PrimitiveIterator$OfInt.next()}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#next() public default java.lang.Integer
         * java.util.PrimitiveIterator$OfInt.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfInt#next() public default java.lang.Integer
         *      java.util.PrimitiveIterator$OfInt.next() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_next()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#nextInt() public abstract int
         * java.util.PrimitiveIterator$OfInt.nextInt()}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#nextInt() public abstract int
         * java.util.PrimitiveIterator$OfInt.nextInt()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfInt#nextInt() public abstract int
         *      java.util.PrimitiveIterator$OfInt.nextInt() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_nextInt()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.IntConsumer)
         * public default void java.util.PrimitiveIterator$OfInt.forEachRemaining(java.util.function.IntConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.IntConsumer)
         * public default void java.util.PrimitiveIterator$OfInt.forEachRemaining(java.util.function.IntConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.IntConsumer) public default void
         *      java.util.PrimitiveIterator$OfInt.forEachRemaining(java.util.function.IntConsumer) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_forEachRemaining_IntConsumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.PrimitiveIterator$OfInt.forEachRemaining(java.util.function.Consumer<? super
         * java.lang.Integer>)}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.PrimitiveIterator$OfInt.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.Consumer) public default void
         *      java.util.PrimitiveIterator$OfInt.forEachRemaining(java.util.function.Consumer) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_forEachRemaining_Consumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.PrimitiveIterator.OfLong interface
     * java.util.PrimitiveIterator$OfLong}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link PrimitiveIteratorClassTests.OfLongClassTests}.
     * </p>
     *
     * @see java.util.PrimitiveIterator.OfLong interface java.util.PrimitiveIterator$OfLong (the hereby targeted
     *      class-under-test class)
     * @see PrimitiveIteratorClassTests.OfLongClassTests PrimitiveIteratorClassTests.OfLongClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfLongTests<SUT extends java.util.PrimitiveIterator.OfLong>
    extends PrimitiveIteratorTests<SUT, Long, java.util.function.LongConsumer> {

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#next() public default java.lang.Long
         * java.util.PrimitiveIterator$OfLong.next()}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#next() public default java.lang.Long
         * java.util.PrimitiveIterator$OfLong.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfLong#next() public default java.lang.Long
         *      java.util.PrimitiveIterator$OfLong.next() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_next()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#nextLong() public abstract long
         * java.util.PrimitiveIterator$OfLong.nextLong()}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#nextLong() public abstract long
         * java.util.PrimitiveIterator$OfLong.nextLong()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfLong#nextLong() public abstract long
         *      java.util.PrimitiveIterator$OfLong.nextLong() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_nextLong()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.Consumer)
         * public default void java.util.PrimitiveIterator$OfLong.forEachRemaining(java.util.function.Consumer<? super
         * java.lang.Long>)}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.Consumer)
         * public default void java.util.PrimitiveIterator$OfLong.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.Consumer) public default void
         *      java.util.PrimitiveIterator$OfLong.forEachRemaining(java.util.function.Consumer) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_forEachRemaining_Consumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.LongConsumer)
         * public default void java.util.PrimitiveIterator$OfLong.forEachRemaining(java.util.function.LongConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.LongConsumer)
         * public default void java.util.PrimitiveIterator$OfLong.forEachRemaining(java.util.function.LongConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.LongConsumer) public default void
         *      java.util.PrimitiveIterator$OfLong.forEachRemaining(java.util.function.LongConsumer) (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_forEachRemaining_LongConsumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.PrimitiveIterator.OfDouble interface
     * java.util.PrimitiveIterator$OfDouble}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link PrimitiveIteratorClassTests.OfDoubleClassTests}.
     * </p>
     *
     * @see java.util.PrimitiveIterator.OfDouble interface java.util.PrimitiveIterator$OfDouble (the hereby targeted
     *      class-under-test class)
     * @see PrimitiveIteratorClassTests.OfDoubleClassTests PrimitiveIteratorClassTests.OfDoubleClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfDoubleTests<SUT extends java.util.PrimitiveIterator.OfDouble>
    extends PrimitiveIteratorTests<SUT, Double, java.util.function.DoubleConsumer> {

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#next() public default java.lang.Double
         * java.util.PrimitiveIterator$OfDouble.next()}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#next() public default java.lang.Double
         * java.util.PrimitiveIterator$OfDouble.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfDouble#next() public default java.lang.Double
         *      java.util.PrimitiveIterator$OfDouble.next() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_next()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer) public
         * default void java.util.PrimitiveIterator$OfDouble.forEachRemaining(java.util.function.DoubleConsumer)}.
         *
         * <p>
         * Test method for
         * {@link java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer) public
         * default void java.util.PrimitiveIterator$OfDouble.forEachRemaining(java.util.function.DoubleConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer) public default
         *      void java.util.PrimitiveIterator$OfDouble.forEachRemaining(java.util.function.DoubleConsumer) (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_forEachRemaining_DoubleConsumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.Consumer)
         * public default void java.util.PrimitiveIterator$OfDouble.forEachRemaining(java.util.function.Consumer<? super
         * java.lang.Double>)}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.Consumer)
         * public default void java.util.PrimitiveIterator$OfDouble.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.Consumer) public default void
         *      java.util.PrimitiveIterator$OfDouble.forEachRemaining(java.util.function.Consumer) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_forEachRemaining_Consumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#nextDouble() public abstract double
         * java.util.PrimitiveIterator$OfDouble.nextDouble()}.
         *
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#nextDouble() public abstract double
         * java.util.PrimitiveIterator$OfDouble.nextDouble()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.PrimitiveIterator.OfDouble#nextDouble() public abstract double
         *      java.util.PrimitiveIterator$OfDouble.nextDouble() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_nextDouble()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
