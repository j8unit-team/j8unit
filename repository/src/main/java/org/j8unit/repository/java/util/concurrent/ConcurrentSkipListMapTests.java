package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ConcurrentSkipListMap class
 * java.util.concurrent.ConcurrentSkipListMap}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ConcurrentSkipListMapClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ConcurrentSkipListMap class java.util.concurrent.ConcurrentSkipListMap (the hereby targeted
 *      class-under-test class)
 * @see ConcurrentSkipListMapClassTests ConcurrentSkipListMapClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentSkipListMapTests<SUT extends java.util.concurrent.ConcurrentSkipListMap<K, V>, K, V>
extends ConcurrentNavigableMapTests<SUT, K, V>, org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.util.AbstractMapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentSkipListMap#computeIfPresent(Object, java.util.function.BiFunction) public
     * V java.util.concurrent.ConcurrentSkipListMap.computeIfPresent(K,java.util.function.BiFunction<? super K, ? super
     * V, ? extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentSkipListMap#computeIfPresent(Object, java.util.function.BiFunction) public
     * java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.computeIfPresent(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#computeIfPresent(Object, java.util.function.BiFunction) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.computeIfPresent(java.lang.Object,java.util.function.BiFunction)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lastEntry() public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.lastEntry()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lastEntry() public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.lastEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#lastEntry() public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.lastEntry() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lastEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#comparator() public java.util.Comparator<?
     * super K> java.util.concurrent.ConcurrentSkipListMap.comparator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#comparator() public java.util.Comparator
     * java.util.concurrent.ConcurrentSkipListMap.comparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#comparator() public java.util.Comparator
     *      java.util.concurrent.ConcurrentSkipListMap.comparator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#firstKey() public K
     * java.util.concurrent.ConcurrentSkipListMap.firstKey()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#firstKey() public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.firstKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#firstKey() public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.firstKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_firstKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#equals(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#equals(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#equals(Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListMap.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#size() public int
     * java.util.concurrent.ConcurrentSkipListMap.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#size() public int
     * java.util.concurrent.ConcurrentSkipListMap.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#size() public int
     *      java.util.concurrent.ConcurrentSkipListMap.size() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#headMap(Object, boolean) public
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentSkipListMap.headMap(K,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#headMap(Object, boolean) public
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentSkipListMap.headMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#headMap(Object, boolean) public
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentSkipListMap.headMap(java.lang.Object,boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_headMap_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#headMap(Object) public
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentSkipListMap.headMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#headMap(Object) public
     * java.util.concurrent.ConcurrentNavigableMap java.util.concurrent.ConcurrentSkipListMap.headMap(java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#headMap(Object) public
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentSkipListMap.headMap(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_headMap_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#clone() public
     * java.util.concurrent.ConcurrentSkipListMap<K, V> java.util.concurrent.ConcurrentSkipListMap.clone()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#clone() public
     * java.util.concurrent.ConcurrentSkipListMap java.util.concurrent.ConcurrentSkipListMap.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#clone() public java.util.concurrent.ConcurrentSkipListMap
     *      java.util.concurrent.ConcurrentSkipListMap.clone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lowerKey(Object) public K
     * java.util.concurrent.ConcurrentSkipListMap.lowerKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lowerKey(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.lowerKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#lowerKey(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.lowerKey(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lowerKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#tailMap(Object) public
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentSkipListMap.tailMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#tailMap(Object) public
     * java.util.concurrent.ConcurrentNavigableMap java.util.concurrent.ConcurrentSkipListMap.tailMap(java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#tailMap(Object) public
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentSkipListMap.tailMap(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_tailMap_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#tailMap(Object, boolean) public
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentSkipListMap.tailMap(K,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#tailMap(Object, boolean) public
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentSkipListMap.tailMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#tailMap(Object, boolean) public
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentSkipListMap.tailMap(java.lang.Object,boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_tailMap_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#putIfAbsent(Object, Object) public V
     * java.util.concurrent.ConcurrentSkipListMap.putIfAbsent(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#putIfAbsent(Object, Object) public
     * java.lang.Object java.util.concurrent.ConcurrentSkipListMap.putIfAbsent(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#putIfAbsent(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.putIfAbsent(java.lang.Object,java.lang.Object) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#floorKey(Object) public K
     * java.util.concurrent.ConcurrentSkipListMap.floorKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#floorKey(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.floorKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#floorKey(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.floorKey(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_floorKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#containsKey(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#containsKey(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#containsKey(Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListMap.containsKey(java.lang.Object) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#forEach(java.util.function.BiConsumer) public
     * void java.util.concurrent.ConcurrentSkipListMap.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#forEach(java.util.function.BiConsumer) public
     * void java.util.concurrent.ConcurrentSkipListMap.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#forEach(java.util.function.BiConsumer) public void
     *      java.util.concurrent.ConcurrentSkipListMap.forEach(java.util.function.BiConsumer) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#floorEntry(Object) public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.floorEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#floorEntry(Object) public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.floorEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#floorEntry(Object) public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.floorEntry(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_floorEntry_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#subMap(Object, Object) public
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentSkipListMap.subMap(K,K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#subMap(Object, Object) public
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentSkipListMap.subMap(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#subMap(Object, Object) public
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentSkipListMap.subMap(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_subMap_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#subMap(Object, boolean, Object, boolean) public
     * java.util.concurrent.ConcurrentNavigableMap<K, V>
     * java.util.concurrent.ConcurrentSkipListMap.subMap(K,boolean,K,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#subMap(Object, boolean, Object, boolean) public
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentSkipListMap.subMap(java.lang.Object,boolean,java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#subMap(Object, boolean, Object, boolean) public
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentSkipListMap.subMap(java.lang.Object,boolean,java.lang.Object,boolean) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_subMap_Object_boolean_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#entrySet() public
     * java.util.Set<java.util.Map.java.util.Map$Entry<K, V>> java.util.concurrent.ConcurrentSkipListMap.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#entrySet() public java.util.Set
     * java.util.concurrent.ConcurrentSkipListMap.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#entrySet() public java.util.Set
     *      java.util.concurrent.ConcurrentSkipListMap.entrySet() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#clear() public void
     * java.util.concurrent.ConcurrentSkipListMap.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#clear() public void
     * java.util.concurrent.ConcurrentSkipListMap.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#clear() public void
     *      java.util.concurrent.ConcurrentSkipListMap.clear() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#isEmpty() public boolean
     * java.util.concurrent.ConcurrentSkipListMap.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#isEmpty() public boolean
     * java.util.concurrent.ConcurrentSkipListMap.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#isEmpty() public boolean
     *      java.util.concurrent.ConcurrentSkipListMap.isEmpty() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ceilingKey(Object) public K
     * java.util.concurrent.ConcurrentSkipListMap.ceilingKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ceilingKey(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.ceilingKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#ceilingKey(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.ceilingKey(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_ceilingKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#pollLastEntry() public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.pollLastEntry()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#pollLastEntry() public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.pollLastEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#pollLastEntry() public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.pollLastEntry() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_pollLastEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#compute(Object, java.util.function.BiFunction)
     * public V java.util.concurrent.ConcurrentSkipListMap.compute(K,java.util.function.BiFunction<? super K, ? super V,
     * ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#compute(Object, java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.compute(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#compute(Object, java.util.function.BiFunction) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.compute(java.lang.Object,java.util.function.BiFunction) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#pollFirstEntry() public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.pollFirstEntry()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#pollFirstEntry() public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.pollFirstEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#pollFirstEntry() public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.pollFirstEntry() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_pollFirstEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#higherKey(Object) public K
     * java.util.concurrent.ConcurrentSkipListMap.higherKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#higherKey(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.higherKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#higherKey(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.higherKey(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_higherKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#get(Object) public V
     * java.util.concurrent.ConcurrentSkipListMap.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#get(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#get(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.get(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.ConcurrentSkipListMap#merge(Object, Object, java.util.function.BiFunction) public V
     * java.util.concurrent.ConcurrentSkipListMap.merge(K,V,java.util.function.BiFunction<? super V, ? super V, ?
     * extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentSkipListMap#merge(Object, Object, java.util.function.BiFunction) public
     * java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#merge(Object, Object, java.util.function.BiFunction) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.merge(java.lang.Object,java.lang.Object,java.util.function.
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#firstEntry() public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.firstEntry()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#firstEntry() public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.firstEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#firstEntry() public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.firstEntry() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_firstEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lastKey() public K
     * java.util.concurrent.ConcurrentSkipListMap.lastKey()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lastKey() public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.lastKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#lastKey() public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.lastKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lastKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#keySet() public java.util.NavigableSet
     * <K> java.util.concurrent.ConcurrentSkipListMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#keySet() public java.util.NavigableSet
     * java.util.concurrent.ConcurrentSkipListMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#keySet() public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListMap.keySet() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ceilingEntry(Object) public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.ceilingEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ceilingEntry(Object) public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.ceilingEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#ceilingEntry(Object) public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.ceilingEntry(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_ceilingEntry_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#getOrDefault(Object, Object) public V
     * java.util.concurrent.ConcurrentSkipListMap.getOrDefault(java.lang.Object,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#getOrDefault(Object, Object) public
     * java.lang.Object java.util.concurrent.ConcurrentSkipListMap.getOrDefault(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#getOrDefault(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.getOrDefault(java.lang.Object,java.lang.Object) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#descendingKeySet() public
     * java.util.NavigableSet<K> java.util.concurrent.ConcurrentSkipListMap.descendingKeySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#descendingKeySet() public
     * java.util.NavigableSet java.util.concurrent.ConcurrentSkipListMap.descendingKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#descendingKeySet() public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListMap.descendingKeySet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_descendingKeySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lowerEntry(Object) public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.lowerEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#lowerEntry(Object) public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.lowerEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#lowerEntry(Object) public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.lowerEntry(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lowerEntry_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#descendingMap() public
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentSkipListMap.descendingMap()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#descendingMap() public
     * java.util.concurrent.ConcurrentNavigableMap java.util.concurrent.ConcurrentSkipListMap.descendingMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#descendingMap() public
     *      java.util.concurrent.ConcurrentNavigableMap java.util.concurrent.ConcurrentSkipListMap.descendingMap() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_descendingMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#values() public java.util.Collection
     * <V> java.util.concurrent.ConcurrentSkipListMap.values()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#values() public java.util.Collection
     * java.util.concurrent.ConcurrentSkipListMap.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#values() public java.util.Collection
     *      java.util.concurrent.ConcurrentSkipListMap.values() (the hereby targeted method-under-test)
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
     * {@link java.util.concurrent.ConcurrentSkipListMap#computeIfAbsent(Object, java.util.function.Function) public V
     * java.util.concurrent.ConcurrentSkipListMap.computeIfAbsent(K,java.util.function.Function<? super K, ? extends
     * V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentSkipListMap#computeIfAbsent(Object, java.util.function.Function) public
     * java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.computeIfAbsent(java.lang.Object,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#computeIfAbsent(Object, java.util.function.Function) public
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.computeIfAbsent(java.lang.Object,java.util.function.Function)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#navigableKeySet() public java.util.NavigableSet
     * <K> java.util.concurrent.ConcurrentSkipListMap.navigableKeySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#navigableKeySet() public java.util.NavigableSet
     * java.util.concurrent.ConcurrentSkipListMap.navigableKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#navigableKeySet() public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListMap.navigableKeySet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_navigableKeySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#higherEntry(Object) public
     * java.util.Map.java.util.Map$Entry<K, V> java.util.concurrent.ConcurrentSkipListMap.higherEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#higherEntry(Object) public java.util.Map$Entry
     * java.util.concurrent.ConcurrentSkipListMap.higherEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#higherEntry(Object) public java.util.Map$Entry
     *      java.util.concurrent.ConcurrentSkipListMap.higherEntry(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_higherEntry_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#replace(Object, Object) public V
     * java.util.concurrent.ConcurrentSkipListMap.replace(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#replace(Object, Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.replace(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#replace(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.replace(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#replace(Object, Object, Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.replace(K,V,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#replace(Object, Object, Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#replace(Object, Object, Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListMap.replace(java.lang.Object,java.lang.Object,java.lang.Object) (the
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#remove(Object) public V
     * java.util.concurrent.ConcurrentSkipListMap.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#remove(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#remove(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#remove(Object, Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.remove(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#remove(Object, Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.remove(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#remove(Object, Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListMap.remove(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#put(Object, Object) public V
     * java.util.concurrent.ConcurrentSkipListMap.put(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#put(Object, Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListMap.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#put(Object, Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListMap.put(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#containsValue(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#containsValue(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListMap.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#containsValue(Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListMap.containsValue(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#replaceAll(java.util.function.BiFunction)
     * public void java.util.concurrent.ConcurrentSkipListMap.replaceAll(java.util.function.BiFunction<? super K, ?
     * super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#replaceAll(java.util.function.BiFunction)
     * public void java.util.concurrent.ConcurrentSkipListMap.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListMap#replaceAll(java.util.function.BiFunction) public void
     *      java.util.concurrent.ConcurrentSkipListMap.replaceAll(java.util.function.BiFunction) (the hereby targeted
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractMap#hashCode() class java.util.AbstractMap}</li>
     * <li>{@linkplain java.util.Map#hashCode() interface java.util.Map}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractMap#putAll(java.util.Map) class java.util.AbstractMap}</li>
     * <li>{@linkplain java.util.Map#putAll(java.util.Map) interface java.util.Map}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_putAll_Map()
    throws Exception {
    }

}
