package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ConcurrentHashMap class
 * java.util.concurrent.ConcurrentHashMap}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ConcurrentHashMapClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ConcurrentHashMap class java.util.concurrent.ConcurrentHashMap (the hereby targeted
 *      class-under-test class)
 * @see ConcurrentHashMapClassTests ConcurrentHashMapClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentHashMapTests<SUT extends java.util.concurrent.ConcurrentHashMap<K, V>, K, V>
extends ConcurrentMapTests<SUT, K, V>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.util.AbstractMapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValues(long, java.util.function.Function, java.util.function.BiFunction)
     * public <U> U java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.Function<? super V, ?
     * extends U>,java.util.function.BiFunction<? super U, ? super U, ? extends U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValues(long, java.util.function.Function, java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.Function,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceValues(long, java.util.function.Function,
     *      java.util.function.BiFunction) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.Function,java.util.function.
     *      BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValues_long_Function_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceValues(long, java.util.function.BiFunction)
     * public V java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.BiFunction<? super V, ?
     * super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceValues(long, java.util.function.BiFunction)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceValues(long, java.util.function.BiFunction) public
     *      java.lang.Object java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.BiFunction)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValues_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#mappingCount() public long
     * java.util.concurrent.ConcurrentHashMap.mappingCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#mappingCount() public long
     * java.util.concurrent.ConcurrentHashMap.mappingCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#mappingCount() public long
     *      java.util.concurrent.ConcurrentHashMap.mappingCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mappingCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduce(long, java.util.function.BiFunction, java.util.function.BiFunction)
     * public <U> U java.util.concurrent.ConcurrentHashMap.reduce(long,java.util.function.BiFunction<? super K, ? super
     * V, ? extends U>,java.util.function.BiFunction<? super U, ? super U, ? extends U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduce(long, java.util.function.BiFunction, java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduce(long,java.util.function.BiFunction,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduce(long, java.util.function.BiFunction,
     *      java.util.function.BiFunction) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.reduce(long,java.util.function.BiFunction,java.util.function.
     *      BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduce_long_BiFunction_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#entrySet() public
     * java.util.Set<java.util.Map.java.util.Map$Entry<K, V>> java.util.concurrent.ConcurrentHashMap.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#entrySet() public java.util.Set
     * java.util.concurrent.ConcurrentHashMap.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#entrySet() public java.util.Set
     *      java.util.concurrent.ConcurrentHashMap.entrySet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_entrySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#containsKey(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#containsKey(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#containsKey(Object) public boolean
     *      java.util.concurrent.ConcurrentHashMap.containsKey(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_containsKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToDouble(long, java.util.function.ToDoubleFunction, double, java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceValuesToDouble(long,java.util.function.ToDoubleFunction<? super
     * V>,double,java.util.function.DoubleBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToDouble(long, java.util.function.ToDoubleFunction, double, java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceValuesToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceValuesToDouble(long, java.util.function.ToDoubleFunction,
     *      double, java.util.function.DoubleBinaryOperator) public double
     *      java.util.concurrent.ConcurrentHashMap.reduceValuesToDouble(long,java.util.function.ToDoubleFunction,double,
     *      java.util.function.DoubleBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValuesToDouble_long_ToDoubleFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#contains(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#contains(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#contains(Object) public boolean
     *      java.util.concurrent.ConcurrentHashMap.contains(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#size() public int
     * java.util.concurrent.ConcurrentHashMap.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#size() public int
     * java.util.concurrent.ConcurrentHashMap.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#size() public int java.util.concurrent.ConcurrentHashMap.size() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntries(long, java.util.function.Function, java.util.function.BiFunction)
     * public <U> U
     * java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.Function<java.util.Map.java.util.Map$Entry<K,
     * V>, ? extends U>,java.util.function.BiFunction<? super U, ? super U, ? extends U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntries(long, java.util.function.Function, java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.Function,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceEntries(long, java.util.function.Function,
     *      java.util.function.BiFunction) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.Function,java.util.function.
     *      BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntries_long_Function_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceEntries(long, java.util.function.BiFunction)
     * public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.BiFunction<java.util.Map.java.util.Map$Entry<K,
     * V>, java.util.Map.java.util.Map$Entry<K, V>, ? extends java.util.Map.java.util.Map$Entry<K, V>>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceEntries(long, java.util.function.BiFunction)
     * public java.util.Map$Entry
     * java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceEntries(long, java.util.function.BiFunction) public
     *      java.util.Map$Entry java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.BiFunction)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntries_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToLong(long, java.util.function.ToLongFunction, long, java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToLong(long,java.util.function.ToLongFunction<java.util.Map.java.util.Map$Entry<K,
     * V>>,long,java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToLong(long, java.util.function.ToLongFunction, long, java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceEntriesToLong(long, java.util.function.ToLongFunction, long,
     *      java.util.function.LongBinaryOperator) public long
     *      java.util.concurrent.ConcurrentHashMap.reduceEntriesToLong(long,java.util.function.ToLongFunction,long,java.
     *      util.function.LongBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntriesToLong_long_ToLongFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replace(Object, Object) public V
     * java.util.concurrent.ConcurrentHashMap.replace(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replace(Object, Object) public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.replace(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#replace(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.replace(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_replace_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replace(Object, Object, Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.replace(K,V,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replace(Object, Object, Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#replace(Object, Object, Object) public boolean
     *      java.util.concurrent.ConcurrentHashMap.replace(java.lang.Object,java.lang.Object,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_replace_Object_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#put(Object, Object) public V
     * java.util.concurrent.ConcurrentHashMap.put(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#put(Object, Object) public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#put(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.put(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_put_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#containsValue(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#containsValue(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#containsValue(Object) public boolean
     *      java.util.concurrent.ConcurrentHashMap.containsValue(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_containsValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#getOrDefault(Object, Object) public V
     * java.util.concurrent.ConcurrentHashMap.getOrDefault(java.lang.Object,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#getOrDefault(Object, Object) public
     * java.lang.Object java.util.concurrent.ConcurrentHashMap.getOrDefault(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#getOrDefault(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.getOrDefault(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getOrDefault_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToInt(long, java.util.function.ToIntBiFunction, int, java.util.function.IntBinaryOperator)
     * public int java.util.concurrent.ConcurrentHashMap.reduceToInt(long,java.util.function.ToIntBiFunction<? super K,
     * ? super V>,int,java.util.function.IntBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToInt(long, java.util.function.ToIntBiFunction, int, java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceToInt(long,java.util.function.ToIntBiFunction,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceToInt(long, java.util.function.ToIntBiFunction, int,
     *      java.util.function.IntBinaryOperator) public int
     *      java.util.concurrent.ConcurrentHashMap.reduceToInt(long,java.util.function.ToIntBiFunction,int,java.util.
     *      function.IntBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceToInt_long_ToIntBiFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchKeys(long, java.util.function.Function)
     * public <U> U java.util.concurrent.ConcurrentHashMap.searchKeys(long,java.util.function.Function<? super K, ?
     * extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchKeys(long, java.util.function.Function)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.searchKeys(long,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#searchKeys(long, java.util.function.Function) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.searchKeys(long,java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_searchKeys_long_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#compute(Object, java.util.function.BiFunction)
     * public V java.util.concurrent.ConcurrentHashMap.compute(K,java.util.function.BiFunction<? super K, ? super V, ?
     * extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#compute(Object, java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.compute(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#compute(Object, java.util.function.BiFunction) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.compute(java.lang.Object,java.util.function.BiFunction) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_compute_Object_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToInt(long, java.util.function.ToIntFunction, int, java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToInt(long,java.util.function.ToIntFunction<java.util.Map.java.util.Map$Entry<K,
     * V>>,int,java.util.function.IntBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToInt(long, java.util.function.ToIntFunction, int, java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceEntriesToInt(long, java.util.function.ToIntFunction, int,
     *      java.util.function.IntBinaryOperator) public int
     *      java.util.concurrent.ConcurrentHashMap.reduceEntriesToInt(long,java.util.function.ToIntFunction,int,java.
     *      util.function.IntBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntriesToInt_long_ToIntFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#merge(Object, Object, java.util.function.BiFunction) public V
     * java.util.concurrent.ConcurrentHashMap.merge(K,V,java.util.function.BiFunction<? super V, ? super V, ? extends
     * V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#merge(Object, Object, java.util.function.BiFunction) public
     * java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#merge(Object, Object, java.util.function.BiFunction) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.merge(java.lang.Object,java.lang.Object,java.util.function.
     *      BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_merge_Object_Object_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#clear() public void
     * java.util.concurrent.ConcurrentHashMap.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#clear() public void
     * java.util.concurrent.ConcurrentHashMap.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#clear() public void java.util.concurrent.ConcurrentHashMap.clear()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#isEmpty() public boolean
     * java.util.concurrent.ConcurrentHashMap.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#isEmpty() public boolean
     * java.util.concurrent.ConcurrentHashMap.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#isEmpty() public boolean
     *      java.util.concurrent.ConcurrentHashMap.isEmpty() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isEmpty()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToDouble(long, java.util.function.ToDoubleBiFunction, double, java.util.function.DoubleBinaryOperator)
     * public double java.util.concurrent.ConcurrentHashMap.reduceToDouble(long,java.util.function.ToDoubleBiFunction<?
     * super K, ? super V>,double,java.util.function.DoubleBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToDouble(long, java.util.function.ToDoubleBiFunction, double, java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceToDouble(long,java.util.function.ToDoubleBiFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceToDouble(long, java.util.function.ToDoubleBiFunction, double,
     *      java.util.function.DoubleBinaryOperator) public double
     *      java.util.concurrent.ConcurrentHashMap.reduceToDouble(long,java.util.function.ToDoubleBiFunction,double,java
     *      .util.function.DoubleBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceToDouble_long_ToDoubleBiFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEach(long, java.util.function.BiConsumer) public
     * void java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEach(long, java.util.function.BiConsumer) public
     * void java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEach(long, java.util.function.BiConsumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEach_long_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEach(long, java.util.function.BiFunction, java.util.function.Consumer)
     * public <U> void java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiFunction<? super K, ?
     * super V, ? extends U>,java.util.function.Consumer<? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEach(long, java.util.function.BiFunction, java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiFunction,java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEach(long, java.util.function.BiFunction,
     *      java.util.function.Consumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiFunction,java.util.function.
     *      Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEach_long_BiFunction_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEach(java.util.function.BiConsumer) public void
     * java.util.concurrent.ConcurrentHashMap.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEach(java.util.function.BiConsumer) public void
     * java.util.concurrent.ConcurrentHashMap.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEach(java.util.function.BiConsumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEach(java.util.function.BiConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_forEach_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToDouble(long, java.util.function.ToDoubleFunction, double, java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToDouble(long,java.util.function.ToDoubleFunction<java.util.Map.java.util.Map$Entry<K,
     * V>>,double,java.util.function.DoubleBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToDouble(long, java.util.function.ToDoubleFunction, double, java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceEntriesToDouble(long, java.util.function.ToDoubleFunction,
     *      double, java.util.function.DoubleBinaryOperator) public double
     *      java.util.concurrent.ConcurrentHashMap.reduceEntriesToDouble(long,java.util.function.ToDoubleFunction,double
     *      ,java.util.function.DoubleBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntriesToDouble_long_ToDoubleFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachKey(long, java.util.function.Function, java.util.function.Consumer)
     * public <U> void java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Function<? super K, ?
     * extends U>,java.util.function.Consumer<? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachKey(long, java.util.function.Function, java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Function,java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEachKey(long, java.util.function.Function,
     *      java.util.function.Consumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Function,java.util.function.
     *      Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachKey_long_Function_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachKey(long, java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Consumer<? super K>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachKey(long, java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEachKey(long, java.util.function.Consumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachKey_long_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToLong(long, java.util.function.ToLongFunction, long, java.util.function.LongBinaryOperator)
     * public long java.util.concurrent.ConcurrentHashMap.reduceValuesToLong(long,java.util.function.ToLongFunction<?
     * super V>,long,java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToLong(long, java.util.function.ToLongFunction, long, java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceValuesToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceValuesToLong(long, java.util.function.ToLongFunction, long,
     *      java.util.function.LongBinaryOperator) public long
     *      java.util.concurrent.ConcurrentHashMap.reduceValuesToLong(long,java.util.function.ToLongFunction,long,java.
     *      util.function.LongBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValuesToLong_long_ToLongFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#toString() public java.lang.String
     * java.util.concurrent.ConcurrentHashMap.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#toString() public java.lang.String
     * java.util.concurrent.ConcurrentHashMap.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#toString() public java.lang.String
     *      java.util.concurrent.ConcurrentHashMap.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#putIfAbsent(Object, Object) public V
     * java.util.concurrent.ConcurrentHashMap.putIfAbsent(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#putIfAbsent(Object, Object) public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.putIfAbsent(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#putIfAbsent(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.putIfAbsent(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_putIfAbsent_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeys(long, java.util.function.Function, java.util.function.BiFunction)
     * public <U> U java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.Function<? super K, ?
     * extends U>,java.util.function.BiFunction<? super U, ? super U, ? extends U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeys(long, java.util.function.Function, java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.Function,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceKeys(long, java.util.function.Function,
     *      java.util.function.BiFunction) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.Function,java.util.function.
     *      BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeys_long_Function_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceKeys(long, java.util.function.BiFunction)
     * public K java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.BiFunction<? super K, ? super
     * K, ? extends K>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceKeys(long, java.util.function.BiFunction)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceKeys(long, java.util.function.BiFunction) public
     *      java.lang.Object java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.BiFunction) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeys_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToInt(long, java.util.function.ToIntFunction, int, java.util.function.IntBinaryOperator)
     * public int java.util.concurrent.ConcurrentHashMap.reduceValuesToInt(long,java.util.function.ToIntFunction<? super
     * V>,int,java.util.function.IntBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToInt(long, java.util.function.ToIntFunction, int, java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceValuesToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceValuesToInt(long, java.util.function.ToIntFunction, int,
     *      java.util.function.IntBinaryOperator) public int
     *      java.util.concurrent.ConcurrentHashMap.reduceValuesToInt(long,java.util.function.ToIntFunction,int,java.util
     *      .function.IntBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValuesToInt_long_ToIntFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#computeIfPresent(Object, java.util.function.BiFunction) public V
     * java.util.concurrent.ConcurrentHashMap.computeIfPresent(K,java.util.function.BiFunction<? super K, ? super V, ?
     * extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#computeIfPresent(Object, java.util.function.BiFunction) public
     * java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#computeIfPresent(Object, java.util.function.BiFunction) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object,java.util.function.BiFunction) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_computeIfPresent_Object_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachValue(long, java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Consumer<? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachValue(long, java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEachValue(long, java.util.function.Consumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachValue_long_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachValue(long, java.util.function.Function, java.util.function.Consumer)
     * public <U> void java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Function<? super V, ?
     * extends U>,java.util.function.Consumer<? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachValue(long, java.util.function.Function, java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Function,java.util.function.Consumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEachValue(long, java.util.function.Function,
     *      java.util.function.Consumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Function,java.util.function.
     *      Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachValue_long_Function_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#equals(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#equals(Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#equals(Object) public boolean
     *      java.util.concurrent.ConcurrentHashMap.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#elements() public java.util.Enumeration
     * <V> java.util.concurrent.ConcurrentHashMap.elements()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#elements() public java.util.Enumeration
     * java.util.concurrent.ConcurrentHashMap.elements()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#elements() public java.util.Enumeration
     *      java.util.concurrent.ConcurrentHashMap.elements() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_elements()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replaceAll(java.util.function.BiFunction) public
     * void java.util.concurrent.ConcurrentHashMap.replaceAll(java.util.function.BiFunction<? super K, ? super V, ?
     * extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replaceAll(java.util.function.BiFunction) public
     * void java.util.concurrent.ConcurrentHashMap.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#replaceAll(java.util.function.BiFunction) public void
     *      java.util.concurrent.ConcurrentHashMap.replaceAll(java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_replaceAll_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#remove(Object) public V
     * java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#remove(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#remove(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#remove(Object, Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#remove(Object, Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#remove(Object, Object) public boolean
     *      java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachEntry(long, java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Consumer<? super
     * java.util.Map.java.util.Map$Entry<K, V>>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachEntry(long, java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEachEntry(long, java.util.function.Consumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachEntry_long_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachEntry(long, java.util.function.Function, java.util.function.Consumer)
     * public <U> void
     * java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Function<java.util.Map.java.util.Map$Entry<K,
     * V>, ? extends U>,java.util.function.Consumer<? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachEntry(long, java.util.function.Function, java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Function,java.util.function.Consumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#forEachEntry(long, java.util.function.Function,
     *      java.util.function.Consumer) public void
     *      java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Function,java.util.function.
     *      Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachEntry_long_Function_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keys() public java.util.Enumeration
     * <K> java.util.concurrent.ConcurrentHashMap.keys()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keys() public java.util.Enumeration
     * java.util.concurrent.ConcurrentHashMap.keys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#keys() public java.util.Enumeration
     *      java.util.concurrent.ConcurrentHashMap.keys() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_keys()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#values() public java.util.Collection
     * <V> java.util.concurrent.ConcurrentHashMap.values()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#values() public java.util.Collection
     * java.util.concurrent.ConcurrentHashMap.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#values() public java.util.Collection
     *      java.util.concurrent.ConcurrentHashMap.values() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_values()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#computeIfAbsent(Object, java.util.function.Function) public V
     * java.util.concurrent.ConcurrentHashMap.computeIfAbsent(K,java.util.function.Function<? super K, ? extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#computeIfAbsent(Object, java.util.function.Function) public
     * java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#computeIfAbsent(Object, java.util.function.Function) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object,java.util.function.Function) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_computeIfAbsent_Object_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToDouble(long, java.util.function.ToDoubleFunction, double, java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceKeysToDouble(long,java.util.function.ToDoubleFunction<? super
     * K>,double,java.util.function.DoubleBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToDouble(long, java.util.function.ToDoubleFunction, double, java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceKeysToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceKeysToDouble(long, java.util.function.ToDoubleFunction, double,
     *      java.util.function.DoubleBinaryOperator) public double
     *      java.util.concurrent.ConcurrentHashMap.reduceKeysToDouble(long,java.util.function.ToDoubleFunction,double,
     *      java.util.function.DoubleBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeysToDouble_long_ToDoubleFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keySet(Object) public
     * java.util.concurrent.ConcurrentHashMap.java.util.concurrent.ConcurrentHashMap$KeySetView<K, V>
     * java.util.concurrent.ConcurrentHashMap.keySet(V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keySet(Object) public
     * java.util.concurrent.ConcurrentHashMap$KeySetView
     * java.util.concurrent.ConcurrentHashMap.keySet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#keySet(Object) public
     *      java.util.concurrent.ConcurrentHashMap$KeySetView
     *      java.util.concurrent.ConcurrentHashMap.keySet(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_keySet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keySet() public
     * java.util.concurrent.ConcurrentHashMap.java.util.concurrent.ConcurrentHashMap$KeySetView<K, V>
     * java.util.concurrent.ConcurrentHashMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keySet() public
     * java.util.concurrent.ConcurrentHashMap$KeySetView java.util.concurrent.ConcurrentHashMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#keySet() public java.util.concurrent.ConcurrentHashMap$KeySetView
     *      java.util.concurrent.ConcurrentHashMap.keySet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_keySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToInt(long, java.util.function.ToIntFunction, int, java.util.function.IntBinaryOperator)
     * public int java.util.concurrent.ConcurrentHashMap.reduceKeysToInt(long,java.util.function.ToIntFunction<? super
     * K>,int,java.util.function.IntBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToInt(long, java.util.function.ToIntFunction, int, java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceKeysToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceKeysToInt(long, java.util.function.ToIntFunction, int,
     *      java.util.function.IntBinaryOperator) public int
     *      java.util.concurrent.ConcurrentHashMap.reduceKeysToInt(long,java.util.function.ToIntFunction,int,java.util.
     *      function.IntBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeysToInt_long_ToIntFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToLong(long, java.util.function.ToLongFunction, long, java.util.function.LongBinaryOperator)
     * public long java.util.concurrent.ConcurrentHashMap.reduceKeysToLong(long,java.util.function.ToLongFunction<?
     * super K>,long,java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToLong(long, java.util.function.ToLongFunction, long, java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceKeysToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceKeysToLong(long, java.util.function.ToLongFunction, long,
     *      java.util.function.LongBinaryOperator) public long
     *      java.util.concurrent.ConcurrentHashMap.reduceKeysToLong(long,java.util.function.ToLongFunction,long,java.
     *      util.function.LongBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeysToLong_long_ToLongFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#search(long, java.util.function.BiFunction) public
     * <U> U java.util.concurrent.ConcurrentHashMap.search(long,java.util.function.BiFunction<? super K, ? super V, ?
     * extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#search(long, java.util.function.BiFunction) public
     * java.lang.Object java.util.concurrent.ConcurrentHashMap.search(long,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#search(long, java.util.function.BiFunction) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.search(long,java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_search_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchEntries(long, java.util.function.Function)
     * public <U> U
     * java.util.concurrent.ConcurrentHashMap.searchEntries(long,java.util.function.Function<java.util.Map.java.util.Map$Entry<K,
     * V>, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchEntries(long, java.util.function.Function)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.searchEntries(long,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#searchEntries(long, java.util.function.Function) public
     *      java.lang.Object java.util.concurrent.ConcurrentHashMap.searchEntries(long,java.util.function.Function) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_searchEntries_long_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToLong(long, java.util.function.ToLongBiFunction, long, java.util.function.LongBinaryOperator)
     * public long java.util.concurrent.ConcurrentHashMap.reduceToLong(long,java.util.function.ToLongBiFunction<? super
     * K, ? super V>,long,java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToLong(long, java.util.function.ToLongBiFunction, long, java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceToLong(long,java.util.function.ToLongBiFunction,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#reduceToLong(long, java.util.function.ToLongBiFunction, long,
     *      java.util.function.LongBinaryOperator) public long
     *      java.util.concurrent.ConcurrentHashMap.reduceToLong(long,java.util.function.ToLongBiFunction,long,java.util.
     *      function.LongBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceToLong_long_ToLongBiFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#hashCode() public int
     * java.util.concurrent.ConcurrentHashMap.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#hashCode() public int
     * java.util.concurrent.ConcurrentHashMap.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#hashCode() public int
     *      java.util.concurrent.ConcurrentHashMap.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchValues(long, java.util.function.Function)
     * public <U> U java.util.concurrent.ConcurrentHashMap.searchValues(long,java.util.function.Function<? super V, ?
     * extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchValues(long, java.util.function.Function)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.searchValues(long,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#searchValues(long, java.util.function.Function) public
     *      java.lang.Object java.util.concurrent.ConcurrentHashMap.searchValues(long,java.util.function.Function) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_searchValues_long_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#get(Object) public V
     * java.util.concurrent.ConcurrentHashMap.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#get(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#get(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentHashMap.get(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#putAll(java.util.Map) public void
     * java.util.concurrent.ConcurrentHashMap.putAll(java.util.Map<? extends K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#putAll(java.util.Map) public void
     * java.util.concurrent.ConcurrentHashMap.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap#putAll(java.util.Map) public void
     *      java.util.concurrent.ConcurrentHashMap.putAll(java.util.Map) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_putAll_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.ConcurrentHashMap.KeySetView class
     * java.util.concurrent.ConcurrentHashMap$KeySetView}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link ConcurrentHashMapClassTests.KeySetViewClassTests}.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentHashMap.KeySetView class java.util.concurrent.ConcurrentHashMap$KeySetView
     *      (the hereby targeted class-under-test class)
     * @see ConcurrentHashMapClassTests.KeySetViewClassTests ConcurrentHashMapClassTests.KeySetViewClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeySetViewTests<SUT extends java.util.concurrent.ConcurrentHashMap.KeySetView<K, V>, K, V>
    extends org.j8unit.repository.java.util.SetTests<SUT, K>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.util.CollectionTests<SUT, K>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#spliterator() public
         * java.util.Spliterator<K> java.util.concurrent.ConcurrentHashMap$KeySetView.spliterator()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#spliterator() public
         * java.util.Spliterator java.util.concurrent.ConcurrentHashMap$KeySetView.spliterator()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#spliterator() public java.util.Spliterator
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.spliterator() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#addAll(java.util.Collection) public
         * boolean java.util.concurrent.ConcurrentHashMap$KeySetView.addAll(java.util.Collection<? extends K>)}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#addAll(java.util.Collection) public
         * boolean java.util.concurrent.ConcurrentHashMap$KeySetView.addAll(java.util.Collection)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#addAll(java.util.Collection) public boolean
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.addAll(java.util.Collection) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_addAll_Collection()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#equals(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#equals(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#equals(Object) public boolean
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.equals(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_equals_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#hashCode() public int
         * java.util.concurrent.ConcurrentHashMap$KeySetView.hashCode()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#hashCode() public int
         * java.util.concurrent.ConcurrentHashMap$KeySetView.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#hashCode() public int
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.hashCode() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_hashCode()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#forEach(java.util.function.Consumer)
         * public void java.util.concurrent.ConcurrentHashMap$KeySetView.forEach(java.util.function.Consumer<? super
         * K>)}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#forEach(java.util.function.Consumer)
         * public void java.util.concurrent.ConcurrentHashMap$KeySetView.forEach(java.util.function.Consumer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#forEach(java.util.function.Consumer) public void
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.forEach(java.util.function.Consumer) (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#add(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.add(K)}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#add(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.add(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#add(Object) public boolean
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.add(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#contains(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.contains(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#contains(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.contains(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#contains(Object) public boolean
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.contains(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_contains_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#iterator() public java.util.Iterator
         * <K> java.util.concurrent.ConcurrentHashMap$KeySetView.iterator()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#iterator() public java.util.Iterator
         * java.util.concurrent.ConcurrentHashMap$KeySetView.iterator()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#iterator() public java.util.Iterator
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.iterator() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#remove(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.remove(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#remove(Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.remove(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#remove(Object) public boolean
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.remove(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_remove_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#getMappedValue() public V
         * java.util.concurrent.ConcurrentHashMap$KeySetView.getMappedValue()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#getMappedValue() public
         * java.lang.Object java.util.concurrent.ConcurrentHashMap$KeySetView.getMappedValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ConcurrentHashMap.KeySetView#getMappedValue() public java.lang.Object
         *      java.util.concurrent.ConcurrentHashMap$KeySetView.getMappedValue() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getMappedValue()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#containsAll(java.util.Collection) interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#containsAll(java.util.Collection) interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_containsAll_Collection()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#size() interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#size() interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_size()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#removeAll(java.util.Collection) interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#removeAll(java.util.Collection) interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_removeAll_Collection()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#retainAll(java.util.Collection) interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#retainAll(java.util.Collection) interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_retainAll_Collection()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#clear() interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#clear() interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_clear()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#isEmpty() interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#isEmpty() interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_isEmpty()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#toArray(Object[]) interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#toArray(Object[]) interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toArray_ObjectArray()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.util.Collection#toArray() interface java.util.Collection}</li>
         * <li>{@linkplain java.util.Set#toArray() interface java.util.Set}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toArray()
        throws Exception {
        }

    }

}
