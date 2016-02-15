package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ConcurrentNavigableMap interface
 * java.util.concurrent.ConcurrentNavigableMap}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ConcurrentNavigableMapClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ConcurrentNavigableMap interface java.util.concurrent.ConcurrentNavigableMap (the hereby
 *      targeted class-under-test class)
 * @see ConcurrentNavigableMapClassTests ConcurrentNavigableMapClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentNavigableMapTests<SUT extends java.util.concurrent.ConcurrentNavigableMap<K, V>, K, V>
extends ConcurrentMapTests<SUT, K, V>, org.j8unit.repository.java.util.NavigableMapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#subMap(Object, boolean, Object, boolean)
     * public abstract java.util.concurrent.ConcurrentNavigableMap<K, V>
     * java.util.concurrent.ConcurrentNavigableMap.subMap(K,boolean,K,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#subMap(Object, boolean, Object, boolean)
     * public abstract java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.subMap(java.lang.Object,boolean,java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#subMap(Object, boolean, Object, boolean) public abstract
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentNavigableMap.subMap(java.lang.Object,boolean,java.lang.Object,boolean) (the
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#subMap(Object, Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentNavigableMap.subMap(K,K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#subMap(Object, Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.subMap(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#subMap(Object, Object) public abstract
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentNavigableMap.subMap(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#descendingMap() public abstract
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentNavigableMap.descendingMap()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#descendingMap() public abstract
     * java.util.concurrent.ConcurrentNavigableMap java.util.concurrent.ConcurrentNavigableMap.descendingMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#descendingMap() public abstract
     *      java.util.concurrent.ConcurrentNavigableMap java.util.concurrent.ConcurrentNavigableMap.descendingMap() (the
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#descendingKeySet() public abstract
     * java.util.NavigableSet<K> java.util.concurrent.ConcurrentNavigableMap.descendingKeySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#descendingKeySet() public abstract
     * java.util.NavigableSet java.util.concurrent.ConcurrentNavigableMap.descendingKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#descendingKeySet() public abstract java.util.NavigableSet
     *      java.util.concurrent.ConcurrentNavigableMap.descendingKeySet() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#tailMap(Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentNavigableMap.tailMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#tailMap(Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.tailMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#tailMap(Object) public abstract
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentNavigableMap.tailMap(java.lang.Object) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#tailMap(Object, boolean) public abstract
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentNavigableMap.tailMap(K,boolean)}
     * .
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#tailMap(Object, boolean) public abstract
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.tailMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#tailMap(Object, boolean) public abstract
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentNavigableMap.tailMap(java.lang.Object,boolean) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#keySet() public abstract
     * java.util.NavigableSet<K> java.util.concurrent.ConcurrentNavigableMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#keySet() public abstract
     * java.util.NavigableSet java.util.concurrent.ConcurrentNavigableMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#keySet() public abstract java.util.NavigableSet
     *      java.util.concurrent.ConcurrentNavigableMap.keySet() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#headMap(Object, boolean) public abstract
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentNavigableMap.headMap(K,boolean)}
     * .
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#headMap(Object, boolean) public abstract
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.headMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#headMap(Object, boolean) public abstract
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentNavigableMap.headMap(java.lang.Object,boolean) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#headMap(Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap<K, V> java.util.concurrent.ConcurrentNavigableMap.headMap(K)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#headMap(Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.headMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#headMap(Object) public abstract
     *      java.util.concurrent.ConcurrentNavigableMap
     *      java.util.concurrent.ConcurrentNavigableMap.headMap(java.lang.Object) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#navigableKeySet() public abstract
     * java.util.NavigableSet<K> java.util.concurrent.ConcurrentNavigableMap.navigableKeySet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#navigableKeySet() public abstract
     * java.util.NavigableSet java.util.concurrent.ConcurrentNavigableMap.navigableKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentNavigableMap#navigableKeySet() public abstract java.util.NavigableSet
     *      java.util.concurrent.ConcurrentNavigableMap.navigableKeySet() (the hereby targeted method-under-test)
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#remove(Object, Object) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#remove(Object, Object) interface java.util.Map}</li>
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
    public default void test_remove_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#replaceAll(java.util.function.BiFunction) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#replaceAll(java.util.function.BiFunction) interface java.util.Map}</li>
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
    public default void test_replaceAll_BiFunction()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#replace(Object, Object, Object) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#replace(Object, Object, Object) interface java.util.Map}</li>
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
    public default void test_replace_Object_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#replace(Object, Object) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#replace(Object, Object) interface java.util.Map}</li>
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
    public default void test_replace_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#computeIfAbsent(Object, java.util.function.Function) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#computeIfAbsent(Object, java.util.function.Function) interface java.util.Map}</li>
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
    public default void test_computeIfAbsent_Object_Function()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#forEach(java.util.function.BiConsumer) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#forEach(java.util.function.BiConsumer) interface java.util.Map}</li>
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
    public default void test_forEach_BiConsumer()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#getOrDefault(Object, Object) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#getOrDefault(Object, Object) interface java.util.Map}</li>
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
    public default void test_getOrDefault_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Map#values() interface java.util.Map}</li>
     * <li>{@linkplain java.util.SortedMap#values() interface java.util.SortedMap}</li>
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
    public default void test_values()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#putIfAbsent(Object, Object) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#putIfAbsent(Object, Object) interface java.util.Map}</li>
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
    public default void test_putIfAbsent_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Map#entrySet() interface java.util.Map}</li>
     * <li>{@linkplain java.util.SortedMap#entrySet() interface java.util.SortedMap}</li>
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
    public default void test_entrySet()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#merge(Object, Object, java.util.function.BiFunction) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#merge(Object, Object, java.util.function.BiFunction) interface java.util.Map}</li>
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
    public default void test_merge_Object_Object_BiFunction()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#computeIfPresent(Object, java.util.function.BiFunction)
     * interface java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#computeIfPresent(Object, java.util.function.BiFunction) interface java.util.Map}
     * </li>
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
    public default void test_computeIfPresent_Object_BiFunction()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ConcurrentMap#compute(Object, java.util.function.BiFunction) interface
     * java.util.concurrent.ConcurrentMap}</li>
     * <li>{@linkplain java.util.Map#compute(Object, java.util.function.BiFunction) interface java.util.Map}</li>
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
    public default void test_compute_Object_BiFunction()
    throws Exception {
    }

}
