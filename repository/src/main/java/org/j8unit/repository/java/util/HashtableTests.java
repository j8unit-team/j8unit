package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Hashtable class java.util.Hashtable}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link HashtableClassTests}.
 * </p>
 *
 * @see java.util.Hashtable class java.util.Hashtable (the hereby targeted class-under-test class)
 * @see HashtableClassTests HashtableClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HashtableTests<SUT extends java.util.Hashtable<K, V>, K, V>
extends MapTests<SUT, K, V>, org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
DictionaryTests<SUT, K, V> {

    /**
     * <p>
     * Test method for {@link java.util.Hashtable#keySet() public java.util.Set<K> java.util.Hashtable.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#keySet() public java.util.Set java.util.Hashtable.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#keySet() public java.util.Set java.util.Hashtable.keySet() (the hereby targeted
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
     * Test method for {@link java.util.Hashtable#hashCode() public synchronized int java.util.Hashtable.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#hashCode() public synchronized int java.util.Hashtable.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#hashCode() public synchronized int java.util.Hashtable.hashCode() (the hereby targeted
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
     * Test method for {@link java.util.Hashtable#get(Object) public synchronized V
     * java.util.Hashtable.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#get(Object) public synchronized java.lang.Object
     * java.util.Hashtable.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#get(Object) public synchronized java.lang.Object
     *      java.util.Hashtable.get(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#putAll(java.util.Map) public synchronized void
     * java.util.Hashtable.putAll(java.util.Map<? extends K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#putAll(java.util.Map) public synchronized void
     * java.util.Hashtable.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#putAll(java.util.Map) public synchronized void java.util.Hashtable.putAll(java.util.Map)
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
     * Test method for {@link java.util.Hashtable#merge(Object, Object, java.util.function.BiFunction) public
     * synchronized V java.util.Hashtable.merge(K,V,java.util.function.BiFunction<? super V, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#merge(Object, Object, java.util.function.BiFunction) public
     * synchronized java.lang.Object
     * java.util.Hashtable.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#merge(Object, Object, java.util.function.BiFunction) public synchronized
     *      java.lang.Object java.util.Hashtable.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#compute(Object, java.util.function.BiFunction) public synchronized V
     * java.util.Hashtable.compute(K,java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#compute(Object, java.util.function.BiFunction) public synchronized
     * java.lang.Object java.util.Hashtable.compute(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#compute(Object, java.util.function.BiFunction) public synchronized java.lang.Object
     *      java.util.Hashtable.compute(java.lang.Object,java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.Hashtable#remove(Object, Object) public synchronized boolean
     * java.util.Hashtable.remove(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#remove(Object, Object) public synchronized boolean
     * java.util.Hashtable.remove(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#remove(Object, Object) public synchronized boolean
     *      java.util.Hashtable.remove(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#remove(Object) public synchronized V
     * java.util.Hashtable.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#remove(Object) public synchronized java.lang.Object
     * java.util.Hashtable.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#remove(Object) public synchronized java.lang.Object
     *      java.util.Hashtable.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#put(Object, Object) public synchronized V
     * java.util.Hashtable.put(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#put(Object, Object) public synchronized java.lang.Object
     * java.util.Hashtable.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#put(Object, Object) public synchronized java.lang.Object
     *      java.util.Hashtable.put(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#containsValue(Object) public boolean
     * java.util.Hashtable.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#containsValue(Object) public boolean
     * java.util.Hashtable.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#containsValue(Object) public boolean java.util.Hashtable.containsValue(java.lang.Object)
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
     * Test method for {@link java.util.Hashtable#replaceAll(java.util.function.BiFunction) public synchronized void
     * java.util.Hashtable.replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#replaceAll(java.util.function.BiFunction) public synchronized void
     * java.util.Hashtable.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#replaceAll(java.util.function.BiFunction) public synchronized void
     *      java.util.Hashtable.replaceAll(java.util.function.BiFunction) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#replace(Object, Object, Object) public synchronized boolean
     * java.util.Hashtable.replace(K,V,V)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#replace(Object, Object, Object) public synchronized boolean
     * java.util.Hashtable.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#replace(Object, Object, Object) public synchronized boolean
     *      java.util.Hashtable.replace(java.lang.Object,java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.Hashtable#replace(Object, Object) public synchronized V
     * java.util.Hashtable.replace(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#replace(Object, Object) public synchronized java.lang.Object
     * java.util.Hashtable.replace(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#replace(Object, Object) public synchronized java.lang.Object
     *      java.util.Hashtable.replace(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#keys() public synchronized java.util.Enumeration
     * <K> java.util.Hashtable.keys()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#keys() public synchronized java.util.Enumeration
     * java.util.Hashtable.keys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#keys() public synchronized java.util.Enumeration java.util.Hashtable.keys() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.Hashtable#values() public java.util.Collection<V> java.util.Hashtable.values()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#values() public java.util.Collection java.util.Hashtable.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#values() public java.util.Collection java.util.Hashtable.values() (the hereby targeted
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
     * Test method for {@link java.util.Hashtable#computeIfAbsent(Object, java.util.function.Function) public
     * synchronized V java.util.Hashtable.computeIfAbsent(K,java.util.function.Function<? super K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#computeIfAbsent(Object, java.util.function.Function) public
     * synchronized java.lang.Object java.util.Hashtable.computeIfAbsent(java.lang.Object,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#computeIfAbsent(Object, java.util.function.Function) public synchronized
     *      java.lang.Object java.util.Hashtable.computeIfAbsent(java.lang.Object,java.util.function.Function) (the
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
     * Test method for {@link java.util.Hashtable#getOrDefault(Object, Object) public synchronized V
     * java.util.Hashtable.getOrDefault(java.lang.Object,V)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#getOrDefault(Object, Object) public synchronized java.lang.Object
     * java.util.Hashtable.getOrDefault(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#getOrDefault(Object, Object) public synchronized java.lang.Object
     *      java.util.Hashtable.getOrDefault(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#putIfAbsent(Object, Object) public synchronized V
     * java.util.Hashtable.putIfAbsent(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#putIfAbsent(Object, Object) public synchronized java.lang.Object
     * java.util.Hashtable.putIfAbsent(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#putIfAbsent(Object, Object) public synchronized java.lang.Object
     *      java.util.Hashtable.putIfAbsent(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#toString() public synchronized java.lang.String
     * java.util.Hashtable.toString()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#toString() public synchronized java.lang.String
     * java.util.Hashtable.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#toString() public synchronized java.lang.String java.util.Hashtable.toString() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#clone() public synchronized java.lang.Object
     * java.util.Hashtable.clone()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#clone() public synchronized java.lang.Object
     * java.util.Hashtable.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#clone() public synchronized java.lang.Object java.util.Hashtable.clone() (the hereby
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
     * Test method for {@link java.util.Hashtable#equals(Object) public synchronized boolean
     * java.util.Hashtable.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#equals(Object) public synchronized boolean
     * java.util.Hashtable.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#equals(Object) public synchronized boolean java.util.Hashtable.equals(java.lang.Object)
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
     * Test method for {@link java.util.Hashtable#elements() public synchronized java.util.Enumeration
     * <V> java.util.Hashtable.elements()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#elements() public synchronized java.util.Enumeration
     * java.util.Hashtable.elements()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#elements() public synchronized java.util.Enumeration java.util.Hashtable.elements() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.Hashtable#size() public synchronized int java.util.Hashtable.size()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#size() public synchronized int java.util.Hashtable.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#size() public synchronized int java.util.Hashtable.size() (the hereby targeted
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
     * Test method for {@link java.util.Hashtable#contains(Object) public synchronized boolean
     * java.util.Hashtable.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#contains(Object) public synchronized boolean
     * java.util.Hashtable.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#contains(Object) public synchronized boolean
     *      java.util.Hashtable.contains(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#computeIfPresent(Object, java.util.function.BiFunction) public
     * synchronized V java.util.Hashtable.computeIfPresent(K,java.util.function.BiFunction<? super K, ? super V, ?
     * extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#computeIfPresent(Object, java.util.function.BiFunction) public
     * synchronized java.lang.Object
     * java.util.Hashtable.computeIfPresent(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#computeIfPresent(Object, java.util.function.BiFunction) public synchronized
     *      java.lang.Object java.util.Hashtable.computeIfPresent(java.lang.Object,java.util.function.BiFunction) (the
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
     * Test method for {@link java.util.Hashtable#clear() public synchronized void java.util.Hashtable.clear()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#clear() public synchronized void java.util.Hashtable.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#clear() public synchronized void java.util.Hashtable.clear() (the hereby targeted
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
     * Test method for {@link java.util.Hashtable#isEmpty() public synchronized boolean java.util.Hashtable.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#isEmpty() public synchronized boolean java.util.Hashtable.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#isEmpty() public synchronized boolean java.util.Hashtable.isEmpty() (the hereby targeted
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
     * Test method for {@link java.util.Hashtable#containsKey(Object) public synchronized boolean
     * java.util.Hashtable.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#containsKey(Object) public synchronized boolean
     * java.util.Hashtable.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#containsKey(Object) public synchronized boolean
     *      java.util.Hashtable.containsKey(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#forEach(java.util.function.BiConsumer) public synchronized void
     * java.util.Hashtable.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#forEach(java.util.function.BiConsumer) public synchronized void
     * java.util.Hashtable.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#forEach(java.util.function.BiConsumer) public synchronized void
     *      java.util.Hashtable.forEach(java.util.function.BiConsumer) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.Hashtable#entrySet() public java.util.Set<java.util.Map.java.util.Map$Entry<K,
     * V>> java.util.Hashtable.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.Hashtable#entrySet() public java.util.Set java.util.Hashtable.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Hashtable#entrySet() public java.util.Set java.util.Hashtable.entrySet() (the hereby targeted
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

}
