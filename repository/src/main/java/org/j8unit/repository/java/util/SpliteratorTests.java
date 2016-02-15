package org.j8unit.repository.java.util;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Spliterator interface java.util.Spliterator}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SpliteratorClassTests}.
 * </p>
 *
 * @see java.util.Spliterator interface java.util.Spliterator (the hereby targeted class-under-test class)
 * @see SpliteratorClassTests SpliteratorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SpliteratorTests<SUT extends java.util.Spliterator<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Spliterator#estimateSize() public abstract long
     * java.util.Spliterator.estimateSize()}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#estimateSize() public abstract long
     * java.util.Spliterator.estimateSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#estimateSize() public abstract long java.util.Spliterator.estimateSize() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.Spliterator#getExactSizeIfKnown() public default long
     * java.util.Spliterator.getExactSizeIfKnown()}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#getExactSizeIfKnown() public default long
     * java.util.Spliterator.getExactSizeIfKnown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#getExactSizeIfKnown() public default long java.util.Spliterator.getExactSizeIfKnown()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Spliterator#forEachRemaining(java.util.function.Consumer) public default void
     * java.util.Spliterator.forEachRemaining(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#forEachRemaining(java.util.function.Consumer) public default void
     * java.util.Spliterator.forEachRemaining(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#forEachRemaining(java.util.function.Consumer) public default void
     *      java.util.Spliterator.forEachRemaining(java.util.function.Consumer) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Spliterator#hasCharacteristics(int) public default boolean
     * java.util.Spliterator.hasCharacteristics(int)}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#hasCharacteristics(int) public default boolean
     * java.util.Spliterator.hasCharacteristics(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#hasCharacteristics(int) public default boolean
     *      java.util.Spliterator.hasCharacteristics(int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Spliterator#getComparator() public default java.util.Comparator<? super T>
     * java.util.Spliterator.getComparator()}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#getComparator() public default java.util.Comparator
     * java.util.Spliterator.getComparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#getComparator() public default java.util.Comparator
     *      java.util.Spliterator.getComparator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Spliterator#trySplit() public abstract java.util.Spliterator
     * <T> java.util.Spliterator.trySplit()}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#trySplit() public abstract java.util.Spliterator
     * java.util.Spliterator.trySplit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#trySplit() public abstract java.util.Spliterator java.util.Spliterator.trySplit() (the
     *      hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.util.Spliterator#tryAdvance(java.util.function.Consumer) public abstract boolean
     * java.util.Spliterator.tryAdvance(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#tryAdvance(java.util.function.Consumer) public abstract boolean
     * java.util.Spliterator.tryAdvance(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#tryAdvance(java.util.function.Consumer) public abstract boolean
     *      java.util.Spliterator.tryAdvance(java.util.function.Consumer) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Spliterator#characteristics() public abstract int
     * java.util.Spliterator.characteristics()}.
     *
     * <p>
     * Test method for {@link java.util.Spliterator#characteristics() public abstract int
     * java.util.Spliterator.characteristics()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Spliterator#characteristics() public abstract int java.util.Spliterator.characteristics() (the
     *      hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Spliterator.OfDouble interface
     * java.util.Spliterator$OfDouble}. The complementary j8unit test interface containing the class relevant aspects is
     * {@link SpliteratorClassTests.OfDoubleClassTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfDouble interface java.util.Spliterator$OfDouble (the hereby targeted
     *      class-under-test class)
     * @see SpliteratorClassTests.OfDoubleClassTests SpliteratorClassTests.OfDoubleClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfDoubleTests<SUT extends java.util.Spliterator.OfDouble>
    extends SpliteratorTests.OfPrimitiveTests<SUT, Double, java.util.function.DoubleConsumer, java.util.Spliterator.OfDouble> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer)
         * public default void java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.DoubleConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer)
         * public default void java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.DoubleConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.DoubleConsumer) public default void
         *      java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.DoubleConsumer) (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.Consumer<? super
         * java.lang.Double>)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfDouble#forEachRemaining(java.util.function.Consumer) public default void
         *      java.util.Spliterator$OfDouble.forEachRemaining(java.util.function.Consumer) (the hereby targeted
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
         * Test method for {@link java.util.Spliterator.OfDouble#trySplit() public abstract
         * java.util.Spliterator$OfDouble java.util.Spliterator$OfDouble.trySplit()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#trySplit() public abstract
         * java.util.Spliterator$OfDouble java.util.Spliterator$OfDouble.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfDouble#trySplit() public abstract java.util.Spliterator$OfDouble
         *      java.util.Spliterator$OfDouble.trySplit() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.Spliterator.OfDouble#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfDouble.tryAdvance(java.util.function.Consumer<? super java.lang.Double>)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfDouble.tryAdvance(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfDouble#tryAdvance(java.util.function.Consumer) public default boolean
         *      java.util.Spliterator$OfDouble.tryAdvance(java.util.function.Consumer) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.Spliterator.OfDouble#tryAdvance(java.util.function.DoubleConsumer) public
         * abstract boolean java.util.Spliterator$OfDouble.tryAdvance(java.util.function.DoubleConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfDouble#tryAdvance(java.util.function.DoubleConsumer) public
         * abstract boolean java.util.Spliterator$OfDouble.tryAdvance(java.util.function.DoubleConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfDouble#tryAdvance(java.util.function.DoubleConsumer) public abstract boolean
         *      java.util.Spliterator$OfDouble.tryAdvance(java.util.function.DoubleConsumer) (the hereby targeted
         *      method-under-test)
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

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Spliterator.OfLong interface java.util.Spliterator$OfLong}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link SpliteratorClassTests.OfLongClassTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfLong interface java.util.Spliterator$OfLong (the hereby targeted class-under-test
     *      class)
     * @see SpliteratorClassTests.OfLongClassTests SpliteratorClassTests.OfLongClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfLongTests<SUT extends java.util.Spliterator.OfLong>
    extends SpliteratorTests.OfPrimitiveTests<SUT, Long, java.util.function.LongConsumer, java.util.Spliterator.OfLong> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfLong.tryAdvance(java.util.function.Consumer<? super java.lang.Long>)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfLong.tryAdvance(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfLong#tryAdvance(java.util.function.Consumer) public default boolean
         *      java.util.Spliterator$OfLong.tryAdvance(java.util.function.Consumer) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.Spliterator.OfLong#tryAdvance(java.util.function.LongConsumer) public
         * abstract boolean java.util.Spliterator$OfLong.tryAdvance(java.util.function.LongConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#tryAdvance(java.util.function.LongConsumer) public
         * abstract boolean java.util.Spliterator$OfLong.tryAdvance(java.util.function.LongConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfLong#tryAdvance(java.util.function.LongConsumer) public abstract boolean
         *      java.util.Spliterator$OfLong.tryAdvance(java.util.function.LongConsumer) (the hereby targeted
         *      method-under-test)
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
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#trySplit() public abstract java.util.Spliterator$OfLong
         * java.util.Spliterator$OfLong.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfLong#trySplit() public abstract java.util.Spliterator$OfLong
         *      java.util.Spliterator$OfLong.trySplit() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.Spliterator.OfLong#forEachRemaining(java.util.function.LongConsumer) public
         * default void java.util.Spliterator$OfLong.forEachRemaining(java.util.function.LongConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#forEachRemaining(java.util.function.LongConsumer) public
         * default void java.util.Spliterator$OfLong.forEachRemaining(java.util.function.LongConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfLong#forEachRemaining(java.util.function.LongConsumer) public default void
         *      java.util.Spliterator$OfLong.forEachRemaining(java.util.function.LongConsumer) (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.Spliterator.OfLong#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfLong.forEachRemaining(java.util.function.Consumer<? super
         * java.lang.Long>)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfLong#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfLong.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfLong#forEachRemaining(java.util.function.Consumer) public default void
         *      java.util.Spliterator$OfLong.forEachRemaining(java.util.function.Consumer) (the hereby targeted
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
     * non-{@code static} methods) of {@linkplain java.util.Spliterator.OfPrimitive interface
     * java.util.Spliterator$OfPrimitive}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link SpliteratorClassTests.OfPrimitiveClassTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfPrimitive interface java.util.Spliterator$OfPrimitive (the hereby targeted
     *      class-under-test class)
     * @see SpliteratorClassTests.OfPrimitiveClassTests SpliteratorClassTests.OfPrimitiveClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfPrimitiveTests<SUT extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>, T, T_CONS, T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>>
    extends SpliteratorTests<SUT, T> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfPrimitive#forEachRemaining(Object) public default void
         * java.util.Spliterator$OfPrimitive.forEachRemaining(T_CONS)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfPrimitive#forEachRemaining(Object) public default void
         * java.util.Spliterator$OfPrimitive.forEachRemaining(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfPrimitive#forEachRemaining(Object) public default void
         *      java.util.Spliterator$OfPrimitive.forEachRemaining(java.lang.Object) (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.Spliterator.OfPrimitive#trySplit() public abstract T_SPLITR
         * java.util.Spliterator$OfPrimitive.trySplit()}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfPrimitive#trySplit() public abstract
         * java.util.Spliterator$OfPrimitive java.util.Spliterator$OfPrimitive.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfPrimitive#trySplit() public abstract java.util.Spliterator$OfPrimitive
         *      java.util.Spliterator$OfPrimitive.trySplit() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.Spliterator.OfPrimitive#tryAdvance(Object) public abstract boolean
         * java.util.Spliterator$OfPrimitive.tryAdvance(T_CONS)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfPrimitive#tryAdvance(Object) public abstract boolean
         * java.util.Spliterator$OfPrimitive.tryAdvance(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfPrimitive#tryAdvance(Object) public abstract boolean
         *      java.util.Spliterator$OfPrimitive.tryAdvance(java.lang.Object) (the hereby targeted method-under-test)
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

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Spliterator.OfInt interface java.util.Spliterator$OfInt}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link SpliteratorClassTests.OfIntClassTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfInt interface java.util.Spliterator$OfInt (the hereby targeted class-under-test
     *      class)
     * @see SpliteratorClassTests.OfIntClassTests SpliteratorClassTests.OfIntClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfIntTests<SUT extends java.util.Spliterator.OfInt>
    extends SpliteratorTests.OfPrimitiveTests<SUT, Integer, java.util.function.IntConsumer, java.util.Spliterator.OfInt> {

        /**
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfInt.tryAdvance(java.util.function.Consumer<? super java.lang.Integer>)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#tryAdvance(java.util.function.Consumer) public default
         * boolean java.util.Spliterator$OfInt.tryAdvance(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfInt#tryAdvance(java.util.function.Consumer) public default boolean
         *      java.util.Spliterator$OfInt.tryAdvance(java.util.function.Consumer) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.Spliterator.OfInt#tryAdvance(java.util.function.IntConsumer) public abstract
         * boolean java.util.Spliterator$OfInt.tryAdvance(java.util.function.IntConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#tryAdvance(java.util.function.IntConsumer) public abstract
         * boolean java.util.Spliterator$OfInt.tryAdvance(java.util.function.IntConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfInt#tryAdvance(java.util.function.IntConsumer) public abstract boolean
         *      java.util.Spliterator$OfInt.tryAdvance(java.util.function.IntConsumer) (the hereby targeted
         *      method-under-test)
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
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#trySplit() public abstract java.util.Spliterator$OfInt
         * java.util.Spliterator$OfInt.trySplit()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfInt#trySplit() public abstract java.util.Spliterator$OfInt
         *      java.util.Spliterator$OfInt.trySplit() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.Spliterator.OfInt#forEachRemaining(java.util.function.IntConsumer) public
         * default void java.util.Spliterator$OfInt.forEachRemaining(java.util.function.IntConsumer)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#forEachRemaining(java.util.function.IntConsumer) public
         * default void java.util.Spliterator$OfInt.forEachRemaining(java.util.function.IntConsumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfInt#forEachRemaining(java.util.function.IntConsumer) public default void
         *      java.util.Spliterator$OfInt.forEachRemaining(java.util.function.IntConsumer) (the hereby targeted
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
         * Test method for {@link java.util.Spliterator.OfInt#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfInt.forEachRemaining(java.util.function.Consumer<? super
         * java.lang.Integer>)}.
         *
         * <p>
         * Test method for {@link java.util.Spliterator.OfInt#forEachRemaining(java.util.function.Consumer) public
         * default void java.util.Spliterator$OfInt.forEachRemaining(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Spliterator.OfInt#forEachRemaining(java.util.function.Consumer) public default void
         *      java.util.Spliterator$OfInt.forEachRemaining(java.util.function.Consumer) (the hereby targeted
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

}
