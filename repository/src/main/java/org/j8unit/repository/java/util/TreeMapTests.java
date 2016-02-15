package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.TreeMap class java.util.TreeMap}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link TreeMapClassTests}.
 * </p>
 *
 * @see java.util.TreeMap class java.util.TreeMap (the hereby targeted class-under-test class)
 * @see TreeMapClassTests TreeMapClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TreeMapTests<SUT extends java.util.TreeMap<K, V>, K, V>
extends NavigableMapTests<SUT, K, V>, org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
AbstractMapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for {@link java.util.TreeMap#size() public int java.util.TreeMap.size()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#size() public int java.util.TreeMap.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#size() public int java.util.TreeMap.size() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#firstKey() public K java.util.TreeMap.firstKey()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#firstKey() public java.lang.Object java.util.TreeMap.firstKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#firstKey() public java.lang.Object java.util.TreeMap.firstKey() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#comparator() public java.util.Comparator<? super K>
     * java.util.TreeMap.comparator()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#comparator() public java.util.Comparator java.util.TreeMap.comparator()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#comparator() public java.util.Comparator java.util.TreeMap.comparator() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#lastEntry() public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.lastEntry()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#lastEntry() public java.util.Map$Entry java.util.TreeMap.lastEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#lastEntry() public java.util.Map$Entry java.util.TreeMap.lastEntry() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#tailMap(Object, boolean) public java.util.NavigableMap<K, V>
     * java.util.TreeMap.tailMap(K,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#tailMap(Object, boolean) public java.util.NavigableMap
     * java.util.TreeMap.tailMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#tailMap(Object, boolean) public java.util.NavigableMap
     *      java.util.TreeMap.tailMap(java.lang.Object,boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#tailMap(Object) public java.util.SortedMap<K, V>
     * java.util.TreeMap.tailMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#tailMap(Object) public java.util.SortedMap
     * java.util.TreeMap.tailMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#tailMap(Object) public java.util.SortedMap java.util.TreeMap.tailMap(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#clone() public java.lang.Object java.util.TreeMap.clone()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#clone() public java.lang.Object java.util.TreeMap.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#clone() public java.lang.Object java.util.TreeMap.clone() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#lowerKey(Object) public K java.util.TreeMap.lowerKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#lowerKey(Object) public java.lang.Object
     * java.util.TreeMap.lowerKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#lowerKey(Object) public java.lang.Object java.util.TreeMap.lowerKey(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#headMap(Object, boolean) public java.util.NavigableMap<K, V>
     * java.util.TreeMap.headMap(K,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#headMap(Object, boolean) public java.util.NavigableMap
     * java.util.TreeMap.headMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#headMap(Object, boolean) public java.util.NavigableMap
     *      java.util.TreeMap.headMap(java.lang.Object,boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#headMap(Object) public java.util.SortedMap<K, V>
     * java.util.TreeMap.headMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#headMap(Object) public java.util.SortedMap
     * java.util.TreeMap.headMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#headMap(Object) public java.util.SortedMap java.util.TreeMap.headMap(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#entrySet() public java.util.Set<java.util.Map.java.util.Map$Entry<K, V>>
     * java.util.TreeMap.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#entrySet() public java.util.Set java.util.TreeMap.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#entrySet() public java.util.Set java.util.TreeMap.entrySet() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#containsKey(Object) public boolean
     * java.util.TreeMap.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#containsKey(Object) public boolean
     * java.util.TreeMap.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#containsKey(Object) public boolean java.util.TreeMap.containsKey(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#forEach(java.util.function.BiConsumer) public void
     * java.util.TreeMap.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#forEach(java.util.function.BiConsumer) public void
     * java.util.TreeMap.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#forEach(java.util.function.BiConsumer) public void
     *      java.util.TreeMap.forEach(java.util.function.BiConsumer) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#floorEntry(Object) public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.floorEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#floorEntry(Object) public java.util.Map$Entry
     * java.util.TreeMap.floorEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#floorEntry(Object) public java.util.Map$Entry
     *      java.util.TreeMap.floorEntry(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#subMap(Object, Object) public java.util.SortedMap<K, V>
     * java.util.TreeMap.subMap(K,K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#subMap(Object, Object) public java.util.SortedMap
     * java.util.TreeMap.subMap(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#subMap(Object, Object) public java.util.SortedMap
     *      java.util.TreeMap.subMap(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#subMap(Object, boolean, Object, boolean) public
     * java.util.NavigableMap<K, V> java.util.TreeMap.subMap(K,boolean,K,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#subMap(Object, boolean, Object, boolean) public java.util.NavigableMap
     * java.util.TreeMap.subMap(java.lang.Object,boolean,java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#subMap(Object, boolean, Object, boolean) public java.util.NavigableMap
     *      java.util.TreeMap.subMap(java.lang.Object,boolean,java.lang.Object,boolean) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#floorKey(Object) public K java.util.TreeMap.floorKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#floorKey(Object) public java.lang.Object
     * java.util.TreeMap.floorKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#floorKey(Object) public java.lang.Object java.util.TreeMap.floorKey(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#ceilingKey(Object) public K java.util.TreeMap.ceilingKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#ceilingKey(Object) public java.lang.Object
     * java.util.TreeMap.ceilingKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#ceilingKey(Object) public java.lang.Object java.util.TreeMap.ceilingKey(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#pollLastEntry() public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.pollLastEntry()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#pollLastEntry() public java.util.Map$Entry
     * java.util.TreeMap.pollLastEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#pollLastEntry() public java.util.Map$Entry java.util.TreeMap.pollLastEntry() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#clear() public void java.util.TreeMap.clear()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#clear() public void java.util.TreeMap.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#clear() public void java.util.TreeMap.clear() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#higherKey(Object) public K java.util.TreeMap.higherKey(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#higherKey(Object) public java.lang.Object
     * java.util.TreeMap.higherKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#higherKey(Object) public java.lang.Object java.util.TreeMap.higherKey(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#get(Object) public V java.util.TreeMap.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#get(Object) public java.lang.Object
     * java.util.TreeMap.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#get(Object) public java.lang.Object java.util.TreeMap.get(java.lang.Object) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#putAll(java.util.Map) public void
     * java.util.TreeMap.putAll(java.util.Map<? extends K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#putAll(java.util.Map) public void
     * java.util.TreeMap.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#putAll(java.util.Map) public void java.util.TreeMap.putAll(java.util.Map) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#pollFirstEntry() public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.pollFirstEntry()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#pollFirstEntry() public java.util.Map$Entry
     * java.util.TreeMap.pollFirstEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#pollFirstEntry() public java.util.Map$Entry java.util.TreeMap.pollFirstEntry() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#keySet() public java.util.Set<K> java.util.TreeMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#keySet() public java.util.Set java.util.TreeMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#keySet() public java.util.Set java.util.TreeMap.keySet() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#lastKey() public K java.util.TreeMap.lastKey()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#lastKey() public java.lang.Object java.util.TreeMap.lastKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#lastKey() public java.lang.Object java.util.TreeMap.lastKey() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#firstEntry() public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.firstEntry()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#firstEntry() public java.util.Map$Entry java.util.TreeMap.firstEntry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#firstEntry() public java.util.Map$Entry java.util.TreeMap.firstEntry() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#descendingMap() public java.util.NavigableMap<K, V>
     * java.util.TreeMap.descendingMap()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#descendingMap() public java.util.NavigableMap
     * java.util.TreeMap.descendingMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#descendingMap() public java.util.NavigableMap java.util.TreeMap.descendingMap() (the
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
     * Test method for {@link java.util.TreeMap#values() public java.util.Collection<V> java.util.TreeMap.values()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#values() public java.util.Collection java.util.TreeMap.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#values() public java.util.Collection java.util.TreeMap.values() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#descendingKeySet() public java.util.NavigableSet
     * <K> java.util.TreeMap.descendingKeySet()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#descendingKeySet() public java.util.NavigableSet
     * java.util.TreeMap.descendingKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#descendingKeySet() public java.util.NavigableSet java.util.TreeMap.descendingKeySet() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#lowerEntry(Object) public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.lowerEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#lowerEntry(Object) public java.util.Map$Entry
     * java.util.TreeMap.lowerEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#lowerEntry(Object) public java.util.Map$Entry
     *      java.util.TreeMap.lowerEntry(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#ceilingEntry(Object) public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.ceilingEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#ceilingEntry(Object) public java.util.Map$Entry
     * java.util.TreeMap.ceilingEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#ceilingEntry(Object) public java.util.Map$Entry
     *      java.util.TreeMap.ceilingEntry(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#replaceAll(java.util.function.BiFunction) public void
     * java.util.TreeMap.replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#replaceAll(java.util.function.BiFunction) public void
     * java.util.TreeMap.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#replaceAll(java.util.function.BiFunction) public void
     *      java.util.TreeMap.replaceAll(java.util.function.BiFunction) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#remove(Object) public V java.util.TreeMap.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#remove(Object) public java.lang.Object
     * java.util.TreeMap.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#remove(Object) public java.lang.Object java.util.TreeMap.remove(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#put(Object, Object) public V java.util.TreeMap.put(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#put(Object, Object) public java.lang.Object
     * java.util.TreeMap.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#put(Object, Object) public java.lang.Object
     *      java.util.TreeMap.put(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#containsValue(Object) public boolean
     * java.util.TreeMap.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#containsValue(Object) public boolean
     * java.util.TreeMap.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#containsValue(Object) public boolean java.util.TreeMap.containsValue(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#replace(Object, Object) public V java.util.TreeMap.replace(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#replace(Object, Object) public java.lang.Object
     * java.util.TreeMap.replace(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#replace(Object, Object) public java.lang.Object
     *      java.util.TreeMap.replace(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#replace(Object, Object, Object) public boolean
     * java.util.TreeMap.replace(K,V,V)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#replace(Object, Object, Object) public boolean
     * java.util.TreeMap.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#replace(Object, Object, Object) public boolean
     *      java.util.TreeMap.replace(java.lang.Object,java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.TreeMap#navigableKeySet() public java.util.NavigableSet
     * <K> java.util.TreeMap.navigableKeySet()}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#navigableKeySet() public java.util.NavigableSet
     * java.util.TreeMap.navigableKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#navigableKeySet() public java.util.NavigableSet java.util.TreeMap.navigableKeySet() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.TreeMap#higherEntry(Object) public java.util.Map.java.util.Map$Entry<K, V>
     * java.util.TreeMap.higherEntry(K)}.
     *
     * <p>
     * Test method for {@link java.util.TreeMap#higherEntry(Object) public java.util.Map$Entry
     * java.util.TreeMap.higherEntry(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TreeMap#higherEntry(Object) public java.util.Map$Entry
     *      java.util.TreeMap.higherEntry(java.lang.Object) (the hereby targeted method-under-test)
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
     * <li>{@linkplain java.util.AbstractMap#equals(Object) class java.util.AbstractMap}</li>
     * <li>{@linkplain java.util.Map#equals(Object) interface java.util.Map}</li>
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
    public default void test_equals_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractMap#isEmpty() class java.util.AbstractMap}</li>
     * <li>{@linkplain java.util.Map#isEmpty() interface java.util.Map}</li>
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
    public default void test_isEmpty()
    throws Exception {
    }

}
