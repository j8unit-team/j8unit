package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.PrimitiveIterator interface java.util.PrimitiveIterator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.PrimitiveIteratorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.PrimitiveIteratorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.PrimitiveIterator
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrimitiveIteratorTests<SUT extends java.util.PrimitiveIterator<T, T_CONS>, T, T_CONS>
extends org.j8unit.repository.java.util.IteratorTests<SUT, T> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.PrimitiveIterator.OfDouble interface
     * java.util.PrimitiveIterator$OfDouble}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.java.util.PrimitiveIteratorTests.OfDoubleTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfDoubleClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.PrimitiveIterator.OfDouble
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfDoubleTests<SUT extends java.util.PrimitiveIterator.OfDouble>
    extends org.j8unit.repository.java.util.PrimitiveIteratorTests<SUT, java.lang.Double, java.util.function.DoubleConsumer> {

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.Consumer)
         * public default void java.util.PrimitiveIterator$OfDouble.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.Consumer)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_forEachRemaining_Consumer()
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer)
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
         * Test method for {@link java.util.PrimitiveIterator.OfDouble#next() public default java.lang.Double
         * java.util.PrimitiveIterator$OfDouble.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfDouble#next()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_next()
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfDouble#nextDouble()
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

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.PrimitiveIterator.OfInt interface
     * java.util.PrimitiveIterator$OfInt}, containing all instance relevant test methods (i.&thinsp;e., test methods of
     * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.util.PrimitiveIteratorTests.OfIntTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfIntClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.PrimitiveIterator.OfInt
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfIntTests<SUT extends java.util.PrimitiveIterator.OfInt>
    extends org.j8unit.repository.java.util.PrimitiveIteratorTests<SUT, java.lang.Integer, java.util.function.IntConsumer> {

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.PrimitiveIterator$OfInt.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.Consumer)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_forEachRemaining_Consumer()
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfInt#forEachRemaining(java.util.function.IntConsumer)
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
         * Test method for {@link java.util.PrimitiveIterator.OfInt#next() public default java.lang.Integer
         * java.util.PrimitiveIterator$OfInt.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfInt#next()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfInt#nextInt()
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

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.PrimitiveIterator.OfLong interface
     * java.util.PrimitiveIterator$OfLong}, containing all instance relevant test methods (i.&thinsp;e., test methods of
     * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.util.PrimitiveIteratorTests.OfLongTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.PrimitiveIteratorClassTests.OfLongClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.PrimitiveIterator.OfLong
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfLongTests<SUT extends java.util.PrimitiveIterator.OfLong>
    extends org.j8unit.repository.java.util.PrimitiveIteratorTests<SUT, java.lang.Long, java.util.function.LongConsumer> {

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.Consumer)
         * public default void java.util.PrimitiveIterator$OfLong.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.Consumer)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfLong#forEachRemaining(java.util.function.LongConsumer)
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

        /**
         * <p>
         * Test method for {@link java.util.PrimitiveIterator.OfLong#next() public default java.lang.Long
         * java.util.PrimitiveIterator$OfLong.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfLong#next()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.PrimitiveIterator.OfLong#nextLong()
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

    }

    /**
     * <p>
     * Test method for {@link java.util.PrimitiveIterator#forEachRemaining(java.lang.Object) public abstract void
     * java.util.PrimitiveIterator.forEachRemaining(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.PrimitiveIterator#forEachRemaining(java.lang.Object)
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

}
