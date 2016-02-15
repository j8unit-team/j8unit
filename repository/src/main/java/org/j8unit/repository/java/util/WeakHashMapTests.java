package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.WeakHashMap class java.util.WeakHashMap}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link WeakHashMapClassTests}.
 * </p>
 *
 * @see java.util.WeakHashMap class java.util.WeakHashMap (the hereby targeted class-under-test class)
 * @see WeakHashMapClassTests WeakHashMapClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WeakHashMapTests<SUT extends java.util.WeakHashMap<K, V>, K, V>
extends MapTests<SUT, K, V>, AbstractMapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for {@link java.util.WeakHashMap#keySet() public java.util.Set<K> java.util.WeakHashMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#keySet() public java.util.Set java.util.WeakHashMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#keySet() public java.util.Set java.util.WeakHashMap.keySet() (the hereby targeted
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
     * Test method for {@link java.util.WeakHashMap#get(Object) public V java.util.WeakHashMap.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#get(Object) public java.lang.Object
     * java.util.WeakHashMap.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#get(Object) public java.lang.Object java.util.WeakHashMap.get(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#putAll(java.util.Map) public void
     * java.util.WeakHashMap.putAll(java.util.Map<? extends K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#putAll(java.util.Map) public void
     * java.util.WeakHashMap.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#putAll(java.util.Map) public void java.util.WeakHashMap.putAll(java.util.Map) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#size() public int java.util.WeakHashMap.size()}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#size() public int java.util.WeakHashMap.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#size() public int java.util.WeakHashMap.size() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#remove(Object) public V
     * java.util.WeakHashMap.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#remove(Object) public java.lang.Object
     * java.util.WeakHashMap.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#remove(Object) public java.lang.Object java.util.WeakHashMap.remove(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#put(Object, Object) public V java.util.WeakHashMap.put(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#put(Object, Object) public java.lang.Object
     * java.util.WeakHashMap.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#put(Object, Object) public java.lang.Object
     *      java.util.WeakHashMap.put(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#containsValue(Object) public boolean
     * java.util.WeakHashMap.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#containsValue(Object) public boolean
     * java.util.WeakHashMap.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#containsValue(Object) public boolean
     *      java.util.WeakHashMap.containsValue(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#replaceAll(java.util.function.BiFunction) public void
     * java.util.WeakHashMap.replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#replaceAll(java.util.function.BiFunction) public void
     * java.util.WeakHashMap.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#replaceAll(java.util.function.BiFunction) public void
     *      java.util.WeakHashMap.replaceAll(java.util.function.BiFunction) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#clear() public void java.util.WeakHashMap.clear()}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#clear() public void java.util.WeakHashMap.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#clear() public void java.util.WeakHashMap.clear() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#isEmpty() public boolean java.util.WeakHashMap.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#isEmpty() public boolean java.util.WeakHashMap.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#isEmpty() public boolean java.util.WeakHashMap.isEmpty() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#containsKey(Object) public boolean
     * java.util.WeakHashMap.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#containsKey(Object) public boolean
     * java.util.WeakHashMap.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#containsKey(Object) public boolean java.util.WeakHashMap.containsKey(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#forEach(java.util.function.BiConsumer) public void
     * java.util.WeakHashMap.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#forEach(java.util.function.BiConsumer) public void
     * java.util.WeakHashMap.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#forEach(java.util.function.BiConsumer) public void
     *      java.util.WeakHashMap.forEach(java.util.function.BiConsumer) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.WeakHashMap#values() public java.util.Collection
     * <V> java.util.WeakHashMap.values()}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#values() public java.util.Collection java.util.WeakHashMap.values()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#values() public java.util.Collection java.util.WeakHashMap.values() (the hereby
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
     * Test method for {@link java.util.WeakHashMap#entrySet() public java.util.Set<java.util.Map.java.util.Map$Entry<K,
     * V>> java.util.WeakHashMap.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.WeakHashMap#entrySet() public java.util.Set java.util.WeakHashMap.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.WeakHashMap#entrySet() public java.util.Set java.util.WeakHashMap.entrySet() (the hereby targeted
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

}
