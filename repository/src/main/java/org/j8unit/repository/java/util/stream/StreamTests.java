package org.j8unit.repository.java.util.stream;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.stream.Stream interface java.util.stream.Stream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link StreamClassTests}.
 * </p>
 *
 * @see java.util.stream.Stream interface java.util.stream.Stream (the hereby targeted class-under-test class)
 * @see StreamClassTests StreamClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamTests<SUT extends java.util.stream.Stream<T>, T>
extends BaseStreamTests<SUT, T, java.util.stream.Stream<T>> {

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#sorted() public abstract java.util.stream.Stream
     * <T> java.util.stream.Stream.sorted()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#sorted() public abstract java.util.stream.Stream
     * java.util.stream.Stream.sorted()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#sorted() public abstract java.util.stream.Stream java.util.stream.Stream.sorted()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.Stream#sorted(java.util.Comparator) public abstract
     * java.util.stream.Stream<T> java.util.stream.Stream.sorted(java.util.Comparator<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#sorted(java.util.Comparator) public abstract
     * java.util.stream.Stream java.util.stream.Stream.sorted(java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#sorted(java.util.Comparator) public abstract java.util.stream.Stream
     *      java.util.stream.Stream.sorted(java.util.Comparator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sorted_Comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#filter(java.util.function.Predicate) public abstract
     * java.util.stream.Stream<T> java.util.stream.Stream.filter(java.util.function.Predicate<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#filter(java.util.function.Predicate) public abstract
     * java.util.stream.Stream java.util.stream.Stream.filter(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#filter(java.util.function.Predicate) public abstract java.util.stream.Stream
     *      java.util.stream.Stream.filter(java.util.function.Predicate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filter_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMap(java.util.function.Function) public abstract
     * <R> java.util.stream.Stream<R> java.util.stream.Stream.flatMap(java.util.function.Function<? super T, ? extends
     * java.util.stream.Stream<? extends R>>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMap(java.util.function.Function) public abstract
     * java.util.stream.Stream java.util.stream.Stream.flatMap(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#flatMap(java.util.function.Function) public abstract java.util.stream.Stream
     *      java.util.stream.Stream.flatMap(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flatMap_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#mapToInt(java.util.function.ToIntFunction) public abstract
     * java.util.stream.IntStream java.util.stream.Stream.mapToInt(java.util.function.ToIntFunction<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#mapToInt(java.util.function.ToIntFunction) public abstract
     * java.util.stream.IntStream java.util.stream.Stream.mapToInt(java.util.function.ToIntFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#mapToInt(java.util.function.ToIntFunction) public abstract
     *      java.util.stream.IntStream java.util.stream.Stream.mapToInt(java.util.function.ToIntFunction) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mapToInt_ToIntFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.stream.Stream#collect(java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BiConsumer)
     * public abstract <R> R java.util.stream.Stream.collect(java.util.function.Supplier
     * <R>,java.util.function.BiConsumer<R, ? super T>,java.util.function.BiConsumer<R, R>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.stream.Stream#collect(java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BiConsumer)
     * public abstract java.lang.Object
     * java.util.stream.Stream.collect(java.util.function.Supplier,java.util.function.BiConsumer,java.util.function.BiConsumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#collect(java.util.function.Supplier, java.util.function.BiConsumer,
     *      java.util.function.BiConsumer) public abstract java.lang.Object
     *      java.util.stream.Stream.collect(java.util.function.Supplier,java.util.function.BiConsumer,java.util.function
     *      .BiConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_collect_Supplier_BiConsumer_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#collect(java.util.stream.Collector) public abstract <R,A> R
     * java.util.stream.Stream.collect(java.util.stream.Collector<? super T, A, R>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#collect(java.util.stream.Collector) public abstract
     * java.lang.Object java.util.stream.Stream.collect(java.util.stream.Collector)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#collect(java.util.stream.Collector) public abstract java.lang.Object
     *      java.util.stream.Stream.collect(java.util.stream.Collector) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_collect_Collector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#reduce(java.util.function.BinaryOperator) public abstract
     * java.util.Optional<T> java.util.stream.Stream.reduce(java.util.function.BinaryOperator<T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#reduce(java.util.function.BinaryOperator) public abstract
     * java.util.Optional java.util.stream.Stream.reduce(java.util.function.BinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#reduce(java.util.function.BinaryOperator) public abstract java.util.Optional
     *      java.util.stream.Stream.reduce(java.util.function.BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduce_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.stream.Stream#reduce(Object, java.util.function.BiFunction, java.util.function.BinaryOperator)
     * public abstract <U> U java.util.stream.Stream.reduce(U,java.util.function.BiFunction<U, ? super T,
     * U>,java.util.function.BinaryOperator<U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.stream.Stream#reduce(Object, java.util.function.BiFunction, java.util.function.BinaryOperator)
     * public abstract java.lang.Object
     * java.util.stream.Stream.reduce(java.lang.Object,java.util.function.BiFunction,java.util.function.BinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#reduce(Object, java.util.function.BiFunction, java.util.function.BinaryOperator)
     *      public abstract java.lang.Object
     *      java.util.stream.Stream.reduce(java.lang.Object,java.util.function.BiFunction,java.util.function.
     *      BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduce_Object_BiFunction_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#reduce(Object, java.util.function.BinaryOperator) public abstract
     * T java.util.stream.Stream.reduce(T,java.util.function.BinaryOperator<T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#reduce(Object, java.util.function.BinaryOperator) public abstract
     * java.lang.Object java.util.stream.Stream.reduce(java.lang.Object,java.util.function.BinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#reduce(Object, java.util.function.BinaryOperator) public abstract java.lang.Object
     *      java.util.stream.Stream.reduce(java.lang.Object,java.util.function.BinaryOperator) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduce_Object_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#forEach(java.util.function.Consumer) public abstract void
     * java.util.stream.Stream.forEach(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#forEach(java.util.function.Consumer) public abstract void
     * java.util.stream.Stream.forEach(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#forEach(java.util.function.Consumer) public abstract void
     *      java.util.stream.Stream.forEach(java.util.function.Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEach_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#max(java.util.Comparator) public abstract java.util.Optional
     * <T> java.util.stream.Stream.max(java.util.Comparator<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#max(java.util.Comparator) public abstract java.util.Optional
     * java.util.stream.Stream.max(java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#max(java.util.Comparator) public abstract java.util.Optional
     *      java.util.stream.Stream.max(java.util.Comparator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_max_Comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#count() public abstract long java.util.stream.Stream.count()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#count() public abstract long java.util.stream.Stream.count()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#count() public abstract long java.util.stream.Stream.count() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.stream.Stream#peek(java.util.function.Consumer) public abstract
     * java.util.stream.Stream<T> java.util.stream.Stream.peek(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#peek(java.util.function.Consumer) public abstract
     * java.util.stream.Stream java.util.stream.Stream.peek(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#peek(java.util.function.Consumer) public abstract java.util.stream.Stream
     *      java.util.stream.Stream.peek(java.util.function.Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_peek_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMapToDouble(java.util.function.Function) public abstract
     * java.util.stream.DoubleStream java.util.stream.Stream.flatMapToDouble(java.util.function.Function<? super T, ?
     * extends java.util.stream.DoubleStream>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMapToDouble(java.util.function.Function) public abstract
     * java.util.stream.DoubleStream java.util.stream.Stream.flatMapToDouble(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#flatMapToDouble(java.util.function.Function) public abstract
     *      java.util.stream.DoubleStream java.util.stream.Stream.flatMapToDouble(java.util.function.Function) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flatMapToDouble_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#min(java.util.Comparator) public abstract java.util.Optional
     * <T> java.util.stream.Stream.min(java.util.Comparator<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#min(java.util.Comparator) public abstract java.util.Optional
     * java.util.stream.Stream.min(java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#min(java.util.Comparator) public abstract java.util.Optional
     *      java.util.stream.Stream.min(java.util.Comparator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_min_Comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMapToInt(java.util.function.Function) public abstract
     * java.util.stream.IntStream java.util.stream.Stream.flatMapToInt(java.util.function.Function<? super T, ? extends
     * java.util.stream.IntStream>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMapToInt(java.util.function.Function) public abstract
     * java.util.stream.IntStream java.util.stream.Stream.flatMapToInt(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#flatMapToInt(java.util.function.Function) public abstract java.util.stream.IntStream
     *      java.util.stream.Stream.flatMapToInt(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flatMapToInt_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#findAny() public abstract java.util.Optional
     * <T> java.util.stream.Stream.findAny()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#findAny() public abstract java.util.Optional
     * java.util.stream.Stream.findAny()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#findAny() public abstract java.util.Optional java.util.stream.Stream.findAny() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.Stream#noneMatch(java.util.function.Predicate) public abstract boolean
     * java.util.stream.Stream.noneMatch(java.util.function.Predicate<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#noneMatch(java.util.function.Predicate) public abstract boolean
     * java.util.stream.Stream.noneMatch(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#noneMatch(java.util.function.Predicate) public abstract boolean
     *      java.util.stream.Stream.noneMatch(java.util.function.Predicate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_noneMatch_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#mapToLong(java.util.function.ToLongFunction) public abstract
     * java.util.stream.LongStream java.util.stream.Stream.mapToLong(java.util.function.ToLongFunction<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#mapToLong(java.util.function.ToLongFunction) public abstract
     * java.util.stream.LongStream java.util.stream.Stream.mapToLong(java.util.function.ToLongFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#mapToLong(java.util.function.ToLongFunction) public abstract
     *      java.util.stream.LongStream java.util.stream.Stream.mapToLong(java.util.function.ToLongFunction) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mapToLong_ToLongFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMapToLong(java.util.function.Function) public abstract
     * java.util.stream.LongStream java.util.stream.Stream.flatMapToLong(java.util.function.Function<? super T, ?
     * extends java.util.stream.LongStream>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#flatMapToLong(java.util.function.Function) public abstract
     * java.util.stream.LongStream java.util.stream.Stream.flatMapToLong(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#flatMapToLong(java.util.function.Function) public abstract
     *      java.util.stream.LongStream java.util.stream.Stream.flatMapToLong(java.util.function.Function) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flatMapToLong_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#forEachOrdered(java.util.function.Consumer) public abstract void
     * java.util.stream.Stream.forEachOrdered(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#forEachOrdered(java.util.function.Consumer) public abstract void
     * java.util.stream.Stream.forEachOrdered(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#forEachOrdered(java.util.function.Consumer) public abstract void
     *      java.util.stream.Stream.forEachOrdered(java.util.function.Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachOrdered_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#limit(long) public abstract java.util.stream.Stream
     * <T> java.util.stream.Stream.limit(long)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#limit(long) public abstract java.util.stream.Stream
     * java.util.stream.Stream.limit(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#limit(long) public abstract java.util.stream.Stream
     *      java.util.stream.Stream.limit(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.Stream#toArray(java.util.function.IntFunction) public abstract <A> A[]
     * java.util.stream.Stream.toArray(java.util.function.IntFunction<A[]>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#toArray(java.util.function.IntFunction) public abstract
     * java.lang.Object[] java.util.stream.Stream.toArray(java.util.function.IntFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#toArray(java.util.function.IntFunction) public abstract java.lang.Object[]
     *      java.util.stream.Stream.toArray(java.util.function.IntFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toArray_IntFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#toArray() public abstract java.lang.Object[]
     * java.util.stream.Stream.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#toArray() public abstract java.lang.Object[]
     * java.util.stream.Stream.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#toArray() public abstract java.lang.Object[] java.util.stream.Stream.toArray() (the
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
     * Test method for {@link java.util.stream.Stream#mapToDouble(java.util.function.ToDoubleFunction) public abstract
     * java.util.stream.DoubleStream java.util.stream.Stream.mapToDouble(java.util.function.ToDoubleFunction<? super
     * T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#mapToDouble(java.util.function.ToDoubleFunction) public abstract
     * java.util.stream.DoubleStream java.util.stream.Stream.mapToDouble(java.util.function.ToDoubleFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#mapToDouble(java.util.function.ToDoubleFunction) public abstract
     *      java.util.stream.DoubleStream java.util.stream.Stream.mapToDouble(java.util.function.ToDoubleFunction) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mapToDouble_ToDoubleFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#map(java.util.function.Function) public abstract
     * <R> java.util.stream.Stream<R> java.util.stream.Stream.map(java.util.function.Function<? super T, ? extends R>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#map(java.util.function.Function) public abstract
     * java.util.stream.Stream java.util.stream.Stream.map(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#map(java.util.function.Function) public abstract java.util.stream.Stream
     *      java.util.stream.Stream.map(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_map_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#anyMatch(java.util.function.Predicate) public abstract boolean
     * java.util.stream.Stream.anyMatch(java.util.function.Predicate<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#anyMatch(java.util.function.Predicate) public abstract boolean
     * java.util.stream.Stream.anyMatch(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#anyMatch(java.util.function.Predicate) public abstract boolean
     *      java.util.stream.Stream.anyMatch(java.util.function.Predicate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_anyMatch_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Stream#skip(long) public abstract java.util.stream.Stream
     * <T> java.util.stream.Stream.skip(long)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#skip(long) public abstract java.util.stream.Stream
     * java.util.stream.Stream.skip(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#skip(long) public abstract java.util.stream.Stream
     *      java.util.stream.Stream.skip(long) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.Stream#findFirst() public abstract java.util.Optional
     * <T> java.util.stream.Stream.findFirst()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#findFirst() public abstract java.util.Optional
     * java.util.stream.Stream.findFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#findFirst() public abstract java.util.Optional java.util.stream.Stream.findFirst()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.Stream#distinct() public abstract java.util.stream.Stream
     * <T> java.util.stream.Stream.distinct()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#distinct() public abstract java.util.stream.Stream
     * java.util.stream.Stream.distinct()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#distinct() public abstract java.util.stream.Stream
     *      java.util.stream.Stream.distinct() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.Stream#allMatch(java.util.function.Predicate) public abstract boolean
     * java.util.stream.Stream.allMatch(java.util.function.Predicate<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.stream.Stream#allMatch(java.util.function.Predicate) public abstract boolean
     * java.util.stream.Stream.allMatch(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Stream#allMatch(java.util.function.Predicate) public abstract boolean
     *      java.util.stream.Stream.allMatch(java.util.function.Predicate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allMatch_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.stream.Stream.Builder interface
     * java.util.stream.Stream$Builder}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link StreamClassTests.BuilderClassTests}.
     * </p>
     *
     * @see java.util.stream.Stream.Builder interface java.util.stream.Stream$Builder (the hereby targeted
     *      class-under-test class)
     * @see StreamClassTests.BuilderClassTests StreamClassTests.BuilderClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderTests<SUT extends java.util.stream.Stream.Builder<T>, T>
    extends org.j8unit.repository.java.util.function.ConsumerTests<SUT, T> {

        /**
         * <p>
         * Test method for {@link java.util.stream.Stream.Builder#build() public abstract java.util.stream.Stream
         * <T> java.util.stream.Stream$Builder.build()}.
         *
         * <p>
         * Test method for {@link java.util.stream.Stream.Builder#build() public abstract java.util.stream.Stream
         * java.util.stream.Stream$Builder.build()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.stream.Stream.Builder#build() public abstract java.util.stream.Stream
         *      java.util.stream.Stream$Builder.build() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.stream.Stream.Builder#add(Object) public default
         * java.util.stream.Stream.java.util.stream.Stream$Builder<T> java.util.stream.Stream$Builder.add(T)}.
         *
         * <p>
         * Test method for {@link java.util.stream.Stream.Builder#add(Object) public default
         * java.util.stream.Stream$Builder java.util.stream.Stream$Builder.add(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.stream.Stream.Builder#add(Object) public default java.util.stream.Stream$Builder
         *      java.util.stream.Stream$Builder.add(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_add_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.stream.Stream.Builder#accept(Object) public abstract void
         * java.util.stream.Stream$Builder.accept(T)}.
         *
         * <p>
         * Test method for {@link java.util.stream.Stream.Builder#accept(Object) public abstract void
         * java.util.stream.Stream$Builder.accept(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.stream.Stream.Builder#accept(Object) public abstract void
         *      java.util.stream.Stream$Builder.accept(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
