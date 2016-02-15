package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.SortedMap interface java.util.SortedMap}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SortedMapClassTests}.
 * </p>
 *
 * @see java.util.SortedMap interface java.util.SortedMap (the hereby targeted class-under-test class)
 * @see SortedMapClassTests SortedMapClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SortedMapTests<SUT extends java.util.SortedMap<K, V>, K, V>
extends MapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for {@link java.util.SortedMap#tailMap(Object) public abstract java.util.SortedMap<K, V>
     * java.util.SortedMap.tailMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#tailMap(Object) public abstract java.util.SortedMap
     * java.util.SortedMap.tailMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#tailMap(Object) public abstract java.util.SortedMap
     *      java.util.SortedMap.tailMap(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.SortedMap#keySet() public abstract java.util.Set
     * <K> java.util.SortedMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#keySet() public abstract java.util.Set java.util.SortedMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#keySet() public abstract java.util.Set java.util.SortedMap.keySet() (the hereby targeted
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
     * Test method for {@link java.util.SortedMap#headMap(Object) public abstract java.util.SortedMap<K, V>
     * java.util.SortedMap.headMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#headMap(Object) public abstract java.util.SortedMap
     * java.util.SortedMap.headMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#headMap(Object) public abstract java.util.SortedMap
     *      java.util.SortedMap.headMap(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.SortedMap#lastKey() public abstract K java.util.SortedMap.lastKey()}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#lastKey() public abstract java.lang.Object
     * java.util.SortedMap.lastKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#lastKey() public abstract java.lang.Object java.util.SortedMap.lastKey() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.SortedMap#firstKey() public abstract K java.util.SortedMap.firstKey()}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#firstKey() public abstract java.lang.Object
     * java.util.SortedMap.firstKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#firstKey() public abstract java.lang.Object java.util.SortedMap.firstKey() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.SortedMap#values() public abstract java.util.Collection
     * <V> java.util.SortedMap.values()}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#values() public abstract java.util.Collection
     * java.util.SortedMap.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#values() public abstract java.util.Collection java.util.SortedMap.values() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.SortedMap#subMap(Object, Object) public abstract java.util.SortedMap<K, V>
     * java.util.SortedMap.subMap(K,K)}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#subMap(Object, Object) public abstract java.util.SortedMap
     * java.util.SortedMap.subMap(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#subMap(Object, Object) public abstract java.util.SortedMap
     *      java.util.SortedMap.subMap(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.SortedMap#entrySet() public abstract
     * java.util.Set<java.util.Map.java.util.Map$Entry<K, V>> java.util.SortedMap.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#entrySet() public abstract java.util.Set
     * java.util.SortedMap.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#entrySet() public abstract java.util.Set java.util.SortedMap.entrySet() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.SortedMap#comparator() public abstract java.util.Comparator<? super K>
     * java.util.SortedMap.comparator()}.
     *
     * <p>
     * Test method for {@link java.util.SortedMap#comparator() public abstract java.util.Comparator
     * java.util.SortedMap.comparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedMap#comparator() public abstract java.util.Comparator java.util.SortedMap.comparator() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
