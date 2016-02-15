package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.IdentityHashMap class java.util.IdentityHashMap}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link IdentityHashMapClassTests}.
 * </p>
 *
 * @see java.util.IdentityHashMap class java.util.IdentityHashMap (the hereby targeted class-under-test class)
 * @see IdentityHashMapClassTests IdentityHashMapClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IdentityHashMapTests<SUT extends java.util.IdentityHashMap<K, V>, K, V>
extends MapTests<SUT, K, V>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.CloneableTests<SUT>,
AbstractMapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for {@link java.util.IdentityHashMap#values() public java.util.Collection
     * <V> java.util.IdentityHashMap.values()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#values() public java.util.Collection
     * java.util.IdentityHashMap.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#values() public java.util.Collection java.util.IdentityHashMap.values() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#containsKey(Object) public boolean
     * java.util.IdentityHashMap.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#containsKey(Object) public boolean
     * java.util.IdentityHashMap.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#containsKey(Object) public boolean
     *      java.util.IdentityHashMap.containsKey(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#forEach(java.util.function.BiConsumer) public void
     * java.util.IdentityHashMap.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#forEach(java.util.function.BiConsumer) public void
     * java.util.IdentityHashMap.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#forEach(java.util.function.BiConsumer) public void
     *      java.util.IdentityHashMap.forEach(java.util.function.BiConsumer) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#entrySet() public
     * java.util.Set<java.util.Map.java.util.Map$Entry<K, V>> java.util.IdentityHashMap.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#entrySet() public java.util.Set
     * java.util.IdentityHashMap.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#entrySet() public java.util.Set java.util.IdentityHashMap.entrySet() (the hereby
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
     * Test method for {@link java.util.IdentityHashMap#clear() public void java.util.IdentityHashMap.clear()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#clear() public void java.util.IdentityHashMap.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#clear() public void java.util.IdentityHashMap.clear() (the hereby targeted
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
     * Test method for {@link java.util.IdentityHashMap#isEmpty() public boolean java.util.IdentityHashMap.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#isEmpty() public boolean java.util.IdentityHashMap.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#isEmpty() public boolean java.util.IdentityHashMap.isEmpty() (the hereby targeted
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
     * Test method for {@link java.util.IdentityHashMap#remove(Object) public V
     * java.util.IdentityHashMap.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#remove(Object) public java.lang.Object
     * java.util.IdentityHashMap.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#remove(Object) public java.lang.Object
     *      java.util.IdentityHashMap.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#put(Object, Object) public V java.util.IdentityHashMap.put(K,V)}
     * .
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#put(Object, Object) public java.lang.Object
     * java.util.IdentityHashMap.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#put(Object, Object) public java.lang.Object
     *      java.util.IdentityHashMap.put(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#containsValue(Object) public boolean
     * java.util.IdentityHashMap.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#containsValue(Object) public boolean
     * java.util.IdentityHashMap.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#containsValue(Object) public boolean
     *      java.util.IdentityHashMap.containsValue(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#replaceAll(java.util.function.BiFunction) public void
     * java.util.IdentityHashMap.replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#replaceAll(java.util.function.BiFunction) public void
     * java.util.IdentityHashMap.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#replaceAll(java.util.function.BiFunction) public void
     *      java.util.IdentityHashMap.replaceAll(java.util.function.BiFunction) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#get(Object) public V
     * java.util.IdentityHashMap.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#get(Object) public java.lang.Object
     * java.util.IdentityHashMap.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#get(Object) public java.lang.Object
     *      java.util.IdentityHashMap.get(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#equals(Object) public boolean
     * java.util.IdentityHashMap.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#equals(Object) public boolean
     * java.util.IdentityHashMap.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#equals(Object) public boolean java.util.IdentityHashMap.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#putAll(java.util.Map) public void
     * java.util.IdentityHashMap.putAll(java.util.Map<? extends K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#putAll(java.util.Map) public void
     * java.util.IdentityHashMap.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#putAll(java.util.Map) public void java.util.IdentityHashMap.putAll(java.util.Map)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#hashCode() public int java.util.IdentityHashMap.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#hashCode() public int java.util.IdentityHashMap.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#hashCode() public int java.util.IdentityHashMap.hashCode() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#size() public int java.util.IdentityHashMap.size()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#size() public int java.util.IdentityHashMap.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#size() public int java.util.IdentityHashMap.size() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#clone() public java.lang.Object
     * java.util.IdentityHashMap.clone()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#clone() public java.lang.Object
     * java.util.IdentityHashMap.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#clone() public java.lang.Object java.util.IdentityHashMap.clone() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.IdentityHashMap#keySet() public java.util.Set
     * <K> java.util.IdentityHashMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.IdentityHashMap#keySet() public java.util.Set
     * java.util.IdentityHashMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IdentityHashMap#keySet() public java.util.Set java.util.IdentityHashMap.keySet() (the hereby
     *      targeted method-under-test)
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

}
