package org.j8unit.repository.java.util.stream;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.stream.LongStream interface java.util.stream.LongStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LongStreamClassTests}.
 * </p>
 *
 * @see java.util.stream.LongStream interface java.util.stream.LongStream (the hereby targeted class-under-test class)
 * @see LongStreamClassTests LongStreamClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LongStreamTests<SUT extends java.util.stream.LongStream>
extends BaseStreamTests<SUT, Long, java.util.stream.LongStream> {

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#reduce(java.util.function.LongBinaryOperator) public abstract
     * java.util.OptionalLong java.util.stream.LongStream.reduce(java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#reduce(java.util.function.LongBinaryOperator) public abstract
     * java.util.OptionalLong java.util.stream.LongStream.reduce(java.util.function.LongBinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#reduce(java.util.function.LongBinaryOperator) public abstract
     *      java.util.OptionalLong java.util.stream.LongStream.reduce(java.util.function.LongBinaryOperator) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduce_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#reduce(long, java.util.function.LongBinaryOperator) public
     * abstract long java.util.stream.LongStream.reduce(long,java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#reduce(long, java.util.function.LongBinaryOperator) public
     * abstract long java.util.stream.LongStream.reduce(long,java.util.function.LongBinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#reduce(long, java.util.function.LongBinaryOperator) public abstract long
     *      java.util.stream.LongStream.reduce(long,java.util.function.LongBinaryOperator) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduce_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#forEach(java.util.function.LongConsumer) public abstract void
     * java.util.stream.LongStream.forEach(java.util.function.LongConsumer)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#forEach(java.util.function.LongConsumer) public abstract void
     * java.util.stream.LongStream.forEach(java.util.function.LongConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#forEach(java.util.function.LongConsumer) public abstract void
     *      java.util.stream.LongStream.forEach(java.util.function.LongConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEach_LongConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#max() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.max()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#max() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.max()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#max() public abstract java.util.OptionalLong java.util.stream.LongStream.max()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_max()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#spliterator() public abstract java.util.Spliterator$OfLong
     * java.util.stream.LongStream.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#spliterator() public abstract java.util.Spliterator$OfLong
     * java.util.stream.LongStream.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#spliterator() public abstract java.util.Spliterator$OfLong
     *      java.util.stream.LongStream.spliterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_spliterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#count() public abstract long
     * java.util.stream.LongStream.count()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#count() public abstract long
     * java.util.stream.LongStream.count()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#count() public abstract long java.util.stream.LongStream.count() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_count()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#peek(java.util.function.LongConsumer) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.peek(java.util.function.LongConsumer)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#peek(java.util.function.LongConsumer) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.peek(java.util.function.LongConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#peek(java.util.function.LongConsumer) public abstract
     *      java.util.stream.LongStream java.util.stream.LongStream.peek(java.util.function.LongConsumer) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_peek_LongConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#boxed() public abstract java.util.stream.Stream
     * <java.lang.Long> java.util.stream.LongStream.boxed()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#boxed() public abstract java.util.stream.Stream
     * java.util.stream.LongStream.boxed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#boxed() public abstract java.util.stream.Stream
     *      java.util.stream.LongStream.boxed() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_boxed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#sorted() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.sorted()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#sorted() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.sorted()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#sorted() public abstract java.util.stream.LongStream
     *      java.util.stream.LongStream.sorted() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sorted()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#filter(java.util.function.LongPredicate) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.filter(java.util.function.LongPredicate)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#filter(java.util.function.LongPredicate) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.filter(java.util.function.LongPredicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) public abstract
     *      java.util.stream.LongStream java.util.stream.LongStream.filter(java.util.function.LongPredicate) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filter_LongPredicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#flatMap(java.util.function.LongFunction) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.flatMap(java.util.function.LongFunction<? extends
     * java.util.stream.LongStream>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#flatMap(java.util.function.LongFunction) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.flatMap(java.util.function.LongFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#flatMap(java.util.function.LongFunction) public abstract
     *      java.util.stream.LongStream java.util.stream.LongStream.flatMap(java.util.function.LongFunction) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flatMap_LongFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#mapToInt(java.util.function.LongToIntFunction) public abstract
     * java.util.stream.IntStream java.util.stream.LongStream.mapToInt(java.util.function.LongToIntFunction)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#mapToInt(java.util.function.LongToIntFunction) public abstract
     * java.util.stream.IntStream java.util.stream.LongStream.mapToInt(java.util.function.LongToIntFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#mapToInt(java.util.function.LongToIntFunction) public abstract
     *      java.util.stream.IntStream java.util.stream.LongStream.mapToInt(java.util.function.LongToIntFunction) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mapToInt_LongToIntFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#summaryStatistics() public abstract
     * java.util.LongSummaryStatistics java.util.stream.LongStream.summaryStatistics()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#summaryStatistics() public abstract
     * java.util.LongSummaryStatistics java.util.stream.LongStream.summaryStatistics()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#summaryStatistics() public abstract java.util.LongSummaryStatistics
     *      java.util.stream.LongStream.summaryStatistics() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_summaryStatistics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.stream.LongStream#collect(java.util.function.Supplier, java.util.function.ObjLongConsumer, java.util.function.BiConsumer)
     * public abstract <R> R java.util.stream.LongStream.collect(java.util.function.Supplier
     * <R>,java.util.function.ObjLongConsumer<R>,java.util.function.BiConsumer<R, R>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.stream.LongStream#collect(java.util.function.Supplier, java.util.function.ObjLongConsumer, java.util.function.BiConsumer)
     * public abstract java.lang.Object
     * java.util.stream.LongStream.collect(java.util.function.Supplier,java.util.function.ObjLongConsumer,java.util.function.BiConsumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#collect(java.util.function.Supplier, java.util.function.ObjLongConsumer,
     *      java.util.function.BiConsumer) public abstract java.lang.Object
     *      java.util.stream.LongStream.collect(java.util.function.Supplier,java.util.function.ObjLongConsumer,java.util
     *      .function.BiConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_collect_Supplier_ObjLongConsumer_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#average() public abstract java.util.OptionalDouble
     * java.util.stream.LongStream.average()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#average() public abstract java.util.OptionalDouble
     * java.util.stream.LongStream.average()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#average() public abstract java.util.OptionalDouble
     *      java.util.stream.LongStream.average() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_average()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#sequential() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.sequential()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#sequential() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.sequential()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#sequential() public abstract java.util.stream.LongStream
     *      java.util.stream.LongStream.sequential() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_sequential()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#skip(long) public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.skip(long)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#skip(long) public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.skip(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#skip(long) public abstract java.util.stream.LongStream
     *      java.util.stream.LongStream.skip(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_skip_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#sum() public abstract long java.util.stream.LongStream.sum()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#sum() public abstract long java.util.stream.LongStream.sum()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#sum() public abstract long java.util.stream.LongStream.sum() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#findFirst() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.findFirst()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#findFirst() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.findFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#findFirst() public abstract java.util.OptionalLong
     *      java.util.stream.LongStream.findFirst() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findFirst()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#distinct() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.distinct()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#distinct() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.distinct()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#distinct() public abstract java.util.stream.LongStream
     *      java.util.stream.LongStream.distinct() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_distinct()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#mapToObj(java.util.function.LongFunction) public abstract
     * <U> java.util.stream.Stream<U> java.util.stream.LongStream.mapToObj(java.util.function.LongFunction<? extends
     * U>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#mapToObj(java.util.function.LongFunction) public abstract
     * java.util.stream.Stream java.util.stream.LongStream.mapToObj(java.util.function.LongFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#mapToObj(java.util.function.LongFunction) public abstract
     *      java.util.stream.Stream java.util.stream.LongStream.mapToObj(java.util.function.LongFunction) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mapToObj_LongFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#allMatch(java.util.function.LongPredicate) public abstract
     * boolean java.util.stream.LongStream.allMatch(java.util.function.LongPredicate)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#allMatch(java.util.function.LongPredicate) public abstract
     * boolean java.util.stream.LongStream.allMatch(java.util.function.LongPredicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#allMatch(java.util.function.LongPredicate) public abstract boolean
     *      java.util.stream.LongStream.allMatch(java.util.function.LongPredicate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allMatch_LongPredicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#min() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.min()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#min() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.min()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#min() public abstract java.util.OptionalLong java.util.stream.LongStream.min()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_min()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#asDoubleStream() public abstract java.util.stream.DoubleStream
     * java.util.stream.LongStream.asDoubleStream()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#asDoubleStream() public abstract java.util.stream.DoubleStream
     * java.util.stream.LongStream.asDoubleStream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#asDoubleStream() public abstract java.util.stream.DoubleStream
     *      java.util.stream.LongStream.asDoubleStream() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asDoubleStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#iterator() public abstract java.util.PrimitiveIterator$OfLong
     * java.util.stream.LongStream.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#iterator() public abstract java.util.PrimitiveIterator$OfLong
     * java.util.stream.LongStream.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#iterator() public abstract java.util.PrimitiveIterator$OfLong
     *      java.util.stream.LongStream.iterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.LongStream#findAny() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.findAny()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#findAny() public abstract java.util.OptionalLong
     * java.util.stream.LongStream.findAny()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#findAny() public abstract java.util.OptionalLong
     *      java.util.stream.LongStream.findAny() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findAny()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#noneMatch(java.util.function.LongPredicate) public abstract
     * boolean java.util.stream.LongStream.noneMatch(java.util.function.LongPredicate)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#noneMatch(java.util.function.LongPredicate) public abstract
     * boolean java.util.stream.LongStream.noneMatch(java.util.function.LongPredicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#noneMatch(java.util.function.LongPredicate) public abstract boolean
     *      java.util.stream.LongStream.noneMatch(java.util.function.LongPredicate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_noneMatch_LongPredicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#parallel() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.parallel()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#parallel() public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.parallel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#parallel() public abstract java.util.stream.LongStream
     *      java.util.stream.LongStream.parallel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_parallel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#forEachOrdered(java.util.function.LongConsumer) public
     * abstract void java.util.stream.LongStream.forEachOrdered(java.util.function.LongConsumer)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#forEachOrdered(java.util.function.LongConsumer) public
     * abstract void java.util.stream.LongStream.forEachOrdered(java.util.function.LongConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#forEachOrdered(java.util.function.LongConsumer) public abstract void
     *      java.util.stream.LongStream.forEachOrdered(java.util.function.LongConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachOrdered_LongConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#limit(long) public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.limit(long)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#limit(long) public abstract java.util.stream.LongStream
     * java.util.stream.LongStream.limit(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#limit(long) public abstract java.util.stream.LongStream
     *      java.util.stream.LongStream.limit(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_limit_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#toArray() public abstract long[]
     * java.util.stream.LongStream.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#toArray() public abstract long[]
     * java.util.stream.LongStream.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#toArray() public abstract long[] java.util.stream.LongStream.toArray() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#mapToDouble(java.util.function.LongToDoubleFunction) public
     * abstract java.util.stream.DoubleStream
     * java.util.stream.LongStream.mapToDouble(java.util.function.LongToDoubleFunction)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#mapToDouble(java.util.function.LongToDoubleFunction) public
     * abstract java.util.stream.DoubleStream
     * java.util.stream.LongStream.mapToDouble(java.util.function.LongToDoubleFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#mapToDouble(java.util.function.LongToDoubleFunction) public abstract
     *      java.util.stream.DoubleStream
     *      java.util.stream.LongStream.mapToDouble(java.util.function.LongToDoubleFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mapToDouble_LongToDoubleFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.map(java.util.function.LongUnaryOperator)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) public abstract
     * java.util.stream.LongStream java.util.stream.LongStream.map(java.util.function.LongUnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) public abstract
     *      java.util.stream.LongStream java.util.stream.LongStream.map(java.util.function.LongUnaryOperator) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_map_LongUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.LongStream#anyMatch(java.util.function.LongPredicate) public abstract
     * boolean java.util.stream.LongStream.anyMatch(java.util.function.LongPredicate)}.
     *
     * <p>
     * Test method for {@link java.util.stream.LongStream#anyMatch(java.util.function.LongPredicate) public abstract
     * boolean java.util.stream.LongStream.anyMatch(java.util.function.LongPredicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.LongStream#anyMatch(java.util.function.LongPredicate) public abstract boolean
     *      java.util.stream.LongStream.anyMatch(java.util.function.LongPredicate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_anyMatch_LongPredicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.stream.LongStream.Builder interface
     * java.util.stream.LongStream$Builder}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link LongStreamClassTests.BuilderClassTests}.
     * </p>
     *
     * @see java.util.stream.LongStream.Builder interface java.util.stream.LongStream$Builder (the hereby targeted
     *      class-under-test class)
     * @see LongStreamClassTests.BuilderClassTests LongStreamClassTests.BuilderClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderTests<SUT extends java.util.stream.LongStream.Builder>
    extends org.j8unit.repository.java.util.function.LongConsumerTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.stream.LongStream.Builder#add(long) public default
         * java.util.stream.LongStream$Builder java.util.stream.LongStream$Builder.add(long)}.
         *
         * <p>
         * Test method for {@link java.util.stream.LongStream.Builder#add(long) public default
         * java.util.stream.LongStream$Builder java.util.stream.LongStream$Builder.add(long)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.stream.LongStream.Builder#add(long) public default java.util.stream.LongStream$Builder
         *      java.util.stream.LongStream$Builder.add(long) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_add_long()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.stream.LongStream.Builder#build() public abstract
         * java.util.stream.LongStream java.util.stream.LongStream$Builder.build()}.
         *
         * <p>
         * Test method for {@link java.util.stream.LongStream.Builder#build() public abstract
         * java.util.stream.LongStream java.util.stream.LongStream$Builder.build()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.stream.LongStream.Builder#build() public abstract java.util.stream.LongStream
         *      java.util.stream.LongStream$Builder.build() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_build()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.stream.LongStream.Builder#accept(long) public abstract void
         * java.util.stream.LongStream$Builder.accept(long)}.
         *
         * <p>
         * Test method for {@link java.util.stream.LongStream.Builder#accept(long) public abstract void
         * java.util.stream.LongStream$Builder.accept(long)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.stream.LongStream.Builder#accept(long) public abstract void
         *      java.util.stream.LongStream$Builder.accept(long) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_accept_long()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
