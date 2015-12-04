package org.j8unit.repository.java.util;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Spliterator interface java.util.Spliterator}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.SpliteratorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SpliteratorTests<SUT extends java.util.Spliterator<T>, T>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.Spliterator$OfDouble interface java.util.Spliterator$OfDouble}, containing all
     * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorClassTests.OfDoubleClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfDoubleTests<SUT extends java.util.Spliterator.OfDouble>
    extends
    org.j8unit.repository.java.util.SpliteratorTests.OfPrimitiveTests<SUT, java.lang.Double, java.util.function.DoubleConsumer, java.util.Spliterator.OfDouble> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.Consumer)}.
         * </p>
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
         * Test method for {@link java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer)
         * public default void java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.DoubleConsumer)}.
         * </p>
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
         * Test method for {@link java.util.Spliterator.OfDouble#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfDouble.tryAdvance(java.util.function.Consumer)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_tryAdvance_Consumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#tryAdvance(java.util.function.DoubleConsumer) public
         * abstract boolean java.util.Spliterator$OfDouble.tryAdvance(java.util.function.DoubleConsumer)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_tryAdvance_DoubleConsumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#trySplit() public abstract
         * java.util.Spliterator$OfDouble java.util.Spliterator$OfDouble.trySplit()}.
         * </p>
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
     * Test class for {@link java.util.Spliterator$OfInt interface java.util.Spliterator$OfInt}, containing all instance
     * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorClassTests.OfIntClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfIntTests<SUT extends java.util.Spliterator.OfInt>
    extends
    org.j8unit.repository.java.util.SpliteratorTests.OfPrimitiveTests<SUT, java.lang.Integer, java.util.function.IntConsumer, java.util.Spliterator.OfInt> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfInt.forEachRemaining(java.util.function.Consumer)}.
         * </p>
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
         * Test method for {@link java.util.Spliterator.OfInt#forEachRemaining(java.util.function.IntConsumer) public
         * default void java.util.Spliterator$OfInt.forEachRemaining(java.util.function.IntConsumer)}.
         * </p>
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
         * Test method for {@link java.util.Spliterator.OfInt#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfInt.tryAdvance(java.util.function.Consumer)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_tryAdvance_Consumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#tryAdvance(java.util.function.IntConsumer) public abstract
         * boolean java.util.Spliterator$OfInt.tryAdvance(java.util.function.IntConsumer)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_tryAdvance_IntConsumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#trySplit() public abstract java.util.Spliterator$OfInt
         * java.util.Spliterator$OfInt.trySplit()}.
         * </p>
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
     * Test class for {@link java.util.Spliterator$OfLong interface java.util.Spliterator$OfLong}, containing all
     * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorClassTests.OfLongClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfLongTests<SUT extends java.util.Spliterator.OfLong>
    extends
    org.j8unit.repository.java.util.SpliteratorTests.OfPrimitiveTests<SUT, java.lang.Long, java.util.function.LongConsumer, java.util.Spliterator.OfLong> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfLong.forEachRemaining(java.util.function.Consumer)}.
         * </p>
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
         * Test method for {@link java.util.Spliterator.OfLong#forEachRemaining(java.util.function.LongConsumer) public
         * default void java.util.Spliterator$OfLong.forEachRemaining(java.util.function.LongConsumer)}.
         * </p>
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
         * Test method for {@link java.util.Spliterator.OfLong#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfLong.tryAdvance(java.util.function.Consumer)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_tryAdvance_Consumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#tryAdvance(java.util.function.LongConsumer) public
         * abstract boolean java.util.Spliterator$OfLong.tryAdvance(java.util.function.LongConsumer)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_tryAdvance_LongConsumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#trySplit() public abstract java.util.Spliterator$OfLong
         * java.util.Spliterator$OfLong.trySplit()}.
         * </p>
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
     * Test class for {@link java.util.Spliterator$OfPrimitive interface java.util.Spliterator$OfPrimitive}, containing
     * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorClassTests.OfPrimitiveClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfPrimitiveTests<SUT extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>, T, T_CONS, T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>>
    extends org.j8unit.repository.java.util.SpliteratorTests<SUT, T> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfPrimitive#forEachRemaining(java.lang.Object) public default
         * void java.util.Spliterator$OfPrimitive.forEachRemaining(java.lang.Object)}.
         * </p>
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
         * Test method for {@link java.util.Spliterator.OfPrimitive#tryAdvance(java.lang.Object) public abstract boolean
         * java.util.Spliterator$OfPrimitive.tryAdvance(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_tryAdvance_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfPrimitive#trySplit() public abstract
         * java.util.Spliterator$OfPrimitive java.util.Spliterator$OfPrimitive.trySplit()}.
         * </p>
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
     * Test method for {@link java.util.Spliterator#characteristics() public abstract int
     * java.util.Spliterator.characteristics()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Spliterator#estimateSize() public abstract long
     * java.util.Spliterator.estimateSize()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Spliterator#forEachRemaining(java.util.function.Consumer) public default void
     * java.util.Spliterator.forEachRemaining(java.util.function.Consumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Spliterator#getComparator() public default java.util.Comparator
     * java.util.Spliterator.getComparator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterator#getExactSizeIfKnown() public default long
     * java.util.Spliterator.getExactSizeIfKnown()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExactSizeIfKnown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterator#hasCharacteristics(int) public default boolean
     * java.util.Spliterator.hasCharacteristics(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasCharacteristics_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterator#tryAdvance(java.util.function.Consumer) public abstract boolean
     * java.util.Spliterator.tryAdvance(java.util.function.Consumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAdvance_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterator#trySplit() public abstract java.util.Spliterator
     * java.util.Spliterator.trySplit()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_trySplit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
