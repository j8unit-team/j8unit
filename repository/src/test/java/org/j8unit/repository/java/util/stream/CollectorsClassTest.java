package org.j8unit.repository.java.util.stream;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollectorsClassTest
implements org.j8unit.repository.java.util.stream.CollectorsClassTests<Collectors> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.stream.Collectors]

    @Override
    public Class<Collectors> createNewSUT() {
        return Collectors.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Collectors#toConcurrentMap(Function, Function, BinaryOperator) public static
     * <T,K,U> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, U>>
     * java.util.stream.Collectors.toConcurrentMap(java.util.function.Function<? super T, ? extends
     * K>,java.util.function.Function<? super T, ? extends U>,java.util.function.BinaryOperator<U>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toConcurrentMap_Function_Function_BinaryOperator()
    throws Exception {
        // write some test for {@link Collectors#toConcurrentMap(Function, Function, BinaryOperator)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#toConcurrentMap(Function, Function)
     * public static <T,K,U> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, U>>
     * java.util.stream.Collectors.toConcurrentMap(java.util.function.Function<? super T, ? extends
     * K>,java.util.function.Function<? super T, ? extends U>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toConcurrentMap_Function_Function()
    throws Exception {
        // write some test for {@link Collectors#toConcurrentMap(Function, Function)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Collectors#toConcurrentMap(Function, Function, BinaryOperator, Supplier) public static
     * <T,K,U,M> java.util.stream.Collector<T, ?, M>
     * java.util.stream.Collectors.toConcurrentMap(java.util.function.Function<? super T, ? extends
     * K>,java.util.function.Function<? super T, ? extends U>,java.util.function.BinaryOperator
     * <U>,java.util.function.Supplier<M>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toConcurrentMap_Function_Function_BinaryOperator_Supplier()
    throws Exception {
        // write some test for {@link Collectors#toConcurrentMap(Function, Function, BinaryOperator, Supplier)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#counting() public static
     * <T> java.util.stream.Collector<T, ?, java.lang.Long> java.util.stream.Collectors.counting()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_counting()
    throws Exception {
        // write some test for {@link Collectors#counting()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#mapping(Function, Collector) public
     * static <T,U,A,R> java.util.stream.Collector<T, ?, R>
     * java.util.stream.Collectors.mapping(java.util.function.Function<? super T, ? extends
     * U>,java.util.stream.Collector<? super U, A, R>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_mapping_Function_Collector()
    throws Exception {
        // write some test for {@link Collectors#mapping(Function, Collector)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#reducing(BinaryOperator) public static
     * <T> java.util.stream.Collector<T, ?, java.util.Optional<T>>
     * java.util.stream.Collectors.reducing(java.util.function.BinaryOperator<T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_reducing_BinaryOperator()
    throws Exception {
        // write some test for {@link Collectors#reducing(BinaryOperator)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#reducing(Object, BinaryOperator) public
     * static <T> java.util.stream.Collector<T, ?, T>
     * java.util.stream.Collectors.reducing(T,java.util.function.BinaryOperator<T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_reducing_Object_BinaryOperator()
    throws Exception {
        // write some test for {@link Collectors#reducing(Object, BinaryOperator)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Collectors#reducing(Object, Function, BinaryOperator) public static <T,U> java.util.stream.Collector<T, ?,
     * U> java.util.stream.Collectors.reducing(U,java.util.function.Function<? super T, ? extends
     * U>,java.util.function.BinaryOperator<U>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_reducing_Object_Function_BinaryOperator()
    throws Exception {
        // write some test for {@link Collectors#reducing(Object, Function, BinaryOperator)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#summingLong(ToLongFunction) public static
     * <T> java.util.stream.Collector<T, ?, java.lang.Long>
     * java.util.stream.Collectors.summingLong(java.util.function.ToLongFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_summingLong_ToLongFunction()
    throws Exception {
        // write some test for {@link Collectors#summingLong(ToLongFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#averagingInt(ToIntFunction) public static
     * <T> java.util.stream.Collector<T, ?, java.lang.Double>
     * java.util.stream.Collectors.averagingInt(java.util.function.ToIntFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_averagingInt_ToIntFunction()
    throws Exception {
        // write some test for {@link Collectors#averagingInt(ToIntFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#summingInt(ToIntFunction) public static
     * <T> java.util.stream.Collector<T, ?, java.lang.Integer>
     * java.util.stream.Collectors.summingInt(java.util.function.ToIntFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_summingInt_ToIntFunction()
    throws Exception {
        // write some test for {@link Collectors#summingInt(ToIntFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#minBy(Comparator) public static
     * <T> java.util.stream.Collector<T, ?, java.util.Optional<T>>
     * java.util.stream.Collectors.minBy(java.util.Comparator<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_minBy_Comparator()
    throws Exception {
        // write some test for {@link Collectors#minBy(Comparator)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#averagingDouble(ToDoubleFunction) public
     * static <T> java.util.stream.Collector<T, ?, java.lang.Double>
     * java.util.stream.Collectors.averagingDouble(java.util.function.ToDoubleFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_averagingDouble_ToDoubleFunction()
    throws Exception {
        // write some test for {@link Collectors#averagingDouble(ToDoubleFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#groupingByConcurrent(Function, Collector)
     * public static <T,K,A,D> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, D>>
     * java.util.stream.Collectors.groupingByConcurrent(java.util.function.Function<? super T, ? extends
     * K>,java.util.stream.Collector<? super T, A, D>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_groupingByConcurrent_Function_Collector()
    throws Exception {
        // write some test for {@link Collectors#groupingByConcurrent(Function, Collector)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Collectors#groupingByConcurrent(Function, Supplier, Collector) public static
     * <T,K,A,D,M> java.util.stream.Collector<T, ?, M>
     * java.util.stream.Collectors.groupingByConcurrent(java.util.function.Function<? super T, ? extends
     * K>,java.util.function.Supplier<M>,java.util.stream.Collector<? super T, A, D>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_groupingByConcurrent_Function_Supplier_Collector()
    throws Exception {
        // write some test for {@link Collectors#groupingByConcurrent(Function, Supplier, Collector)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#groupingByConcurrent(Function) public
     * static <T,K> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, java.util.List<T>>>
     * java.util.stream.Collectors.groupingByConcurrent(java.util.function.Function<? super T, ? extends K>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_groupingByConcurrent_Function()
    throws Exception {
        // write some test for {@link Collectors#groupingByConcurrent(Function)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#toMap(Function, Function, BinaryOperator)
     * public static <T,K,U> java.util.stream.Collector<T, ?, java.util.Map<K, U>>
     * java.util.stream.Collectors.toMap(java.util.function.Function<? super T, ? extends
     * K>,java.util.function.Function<? super T, ? extends U>,java.util.function.BinaryOperator<U>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toMap_Function_Function_BinaryOperator()
    throws Exception {
        // write some test for {@link Collectors#toMap(Function, Function, BinaryOperator)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Collectors#toMap(Function, Function, BinaryOperator, Supplier) public static
     * <T,K,U,M> java.util.stream.Collector<T, ?, M> java.util.stream.Collectors.toMap(java.util.function.Function<?
     * super T, ? extends K>,java.util.function.Function<? super T, ? extends U>,java.util.function.BinaryOperator
     * <U>,java.util.function.Supplier<M>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toMap_Function_Function_BinaryOperator_Supplier()
    throws Exception {
        // write some test for {@link Collectors#toMap(Function, Function, BinaryOperator, Supplier)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#toMap(Function, Function) public static
     * <T,K,U> java.util.stream.Collector<T, ?, java.util.Map<K, U>>
     * java.util.stream.Collectors.toMap(java.util.function.Function<? super T, ? extends
     * K>,java.util.function.Function<? super T, ? extends U>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toMap_Function_Function()
    throws Exception {
        // write some test for {@link Collectors#toMap(Function, Function)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#maxBy(Comparator) public static
     * <T> java.util.stream.Collector<T, ?, java.util.Optional<T>>
     * java.util.stream.Collectors.maxBy(java.util.Comparator<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_maxBy_Comparator()
    throws Exception {
        // write some test for {@link Collectors#maxBy(Comparator)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#collectingAndThen(Collector, Function)
     * public static <T,A,R,RR> java.util.stream.Collector<T, A, RR>
     * java.util.stream.Collectors.collectingAndThen(java.util.stream.Collector<T, A, R>,java.util.function.Function<R,
     * RR>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_collectingAndThen_Collector_Function()
    throws Exception {
        // write some test for {@link Collectors#collectingAndThen(Collector, Function)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#toSet() public static
     * <T> java.util.stream.Collector<T, ?, java.util.Set<T>> java.util.stream.Collectors.toSet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toSet()
    throws Exception {
        // write some test for {@link Collectors#toSet()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#toList() public static
     * <T> java.util.stream.Collector<T, ?, java.util.List<T>> java.util.stream.Collectors.toList()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toList()
    throws Exception {
        // write some test for {@link Collectors#toList()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#partitioningBy(Predicate, Collector)
     * public static <T,D,A> java.util.stream.Collector<T, ?, java.util.Map<java.lang.Boolean, D>>
     * java.util.stream.Collectors.partitioningBy(java.util.function.Predicate<? super T>,java.util.stream.Collector<?
     * super T, A, D>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_partitioningBy_Predicate_Collector()
    throws Exception {
        // write some test for {@link Collectors#partitioningBy(Predicate, Collector)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#partitioningBy(Predicate) public static
     * <T> java.util.stream.Collector<T, ?, java.util.Map<java.lang.Boolean, java.util.List<T>>>
     * java.util.stream.Collectors.partitioningBy(java.util.function.Predicate<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_partitioningBy_Predicate()
    throws Exception {
        // write some test for {@link Collectors#partitioningBy(Predicate)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#averagingLong(ToLongFunction) public
     * static <T> java.util.stream.Collector<T, ?, java.lang.Double>
     * java.util.stream.Collectors.averagingLong(java.util.function.ToLongFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_averagingLong_ToLongFunction()
    throws Exception {
        // write some test for {@link Collectors#averagingLong(ToLongFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Collectors#joining(CharSequence, CharSequence, CharSequence) public static
     * java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String>
     * java.util.stream.Collectors.joining(java.lang.CharSequence,java.lang.CharSequence,java.lang.CharSequence)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_joining_CharSequence_CharSequence_CharSequence()
    throws Exception {
        // write some test for {@link Collectors#joining(CharSequence, CharSequence, CharSequence)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#joining() public static
     * java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> java.util.stream.Collectors.joining()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_joining()
    throws Exception {
        // write some test for {@link Collectors#joining()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#joining(CharSequence) public static
     * java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String>
     * java.util.stream.Collectors.joining(java.lang.CharSequence)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_joining_CharSequence()
    throws Exception {
        // write some test for {@link Collectors#joining(CharSequence)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#groupingBy(Function, Supplier, Collector)
     * public static <T,K,D,A,M> java.util.stream.Collector<T, ?, M>
     * java.util.stream.Collectors.groupingBy(java.util.function.Function<? super T, ? extends
     * K>,java.util.function.Supplier<M>,java.util.stream.Collector<? super T, A, D>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_groupingBy_Function_Supplier_Collector()
    throws Exception {
        // write some test for {@link Collectors#groupingBy(Function, Supplier, Collector)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#groupingBy(Function) public static
     * <T,K> java.util.stream.Collector<T, ?, java.util.Map<K, java.util.List<T>>>
     * java.util.stream.Collectors.groupingBy(java.util.function.Function<? super T, ? extends K>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_groupingBy_Function()
    throws Exception {
        // write some test for {@link Collectors#groupingBy(Function)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#groupingBy(Function, Collector) public
     * static <T,K,A,D> java.util.stream.Collector<T, ?, java.util.Map<K, D>>
     * java.util.stream.Collectors.groupingBy(java.util.function.Function<? super T, ? extends
     * K>,java.util.stream.Collector<? super T, A, D>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_groupingBy_Function_Collector()
    throws Exception {
        // write some test for {@link Collectors#groupingBy(Function, Collector)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#summarizingInt(ToIntFunction) public
     * static <T> java.util.stream.Collector<T, ?, java.util.IntSummaryStatistics>
     * java.util.stream.Collectors.summarizingInt(java.util.function.ToIntFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_summarizingInt_ToIntFunction()
    throws Exception {
        // write some test for {@link Collectors#summarizingInt(ToIntFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#summarizingDouble(ToDoubleFunction)
     * public static <T> java.util.stream.Collector<T, ?, java.util.DoubleSummaryStatistics>
     * java.util.stream.Collectors.summarizingDouble(java.util.function.ToDoubleFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_summarizingDouble_ToDoubleFunction()
    throws Exception {
        // write some test for {@link Collectors#summarizingDouble(ToDoubleFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#toCollection(Supplier) public static
     * <T,C> java.util.stream.Collector<T, ?, C> java.util.stream.Collectors.toCollection(java.util.function.Supplier
     * <C>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toCollection_Supplier()
    throws Exception {
        // write some test for {@link Collectors#toCollection(Supplier)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#summarizingLong(ToLongFunction) public
     * static <T> java.util.stream.Collector<T, ?, java.util.LongSummaryStatistics>
     * java.util.stream.Collectors.summarizingLong(java.util.function.ToLongFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_summarizingLong_ToLongFunction()
    throws Exception {
        // write some test for {@link Collectors#summarizingLong(ToLongFunction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Collectors#summingDouble(ToDoubleFunction) public
     * static <T> java.util.stream.Collector<T, ?, java.lang.Double>
     * java.util.stream.Collectors.summingDouble(java.util.function.ToDoubleFunction<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_summingDouble_ToDoubleFunction()
    throws Exception {
        // write some test for {@link Collectors#summingDouble(ToDoubleFunction)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.stream.Collectors]

}
