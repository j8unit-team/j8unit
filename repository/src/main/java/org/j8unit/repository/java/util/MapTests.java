package org.j8unit.repository.java.util;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Map interface java.util.Map}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link MapClassTests}.
 * </p>
 *
 * @see java.util.Map interface java.util.Map (the hereby targeted class-under-test class)
 * @see MapClassTests MapClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MapTests<SUT extends java.util.Map<K, V>, K, V>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Map#get(Object) public abstract V java.util.Map.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Map#get(Object) public abstract java.lang.Object
     * java.util.Map.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#get(Object) public abstract java.lang.Object java.util.Map.get(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#putAll(java.util.Map) public abstract void
     * java.util.Map.putAll(java.util.Map<? extends K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Map#putAll(java.util.Map) public abstract void
     * java.util.Map.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#putAll(java.util.Map) public abstract void java.util.Map.putAll(java.util.Map) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#merge(Object, Object, java.util.function.BiFunction) public default V
     * java.util.Map.merge(K,V,java.util.function.BiFunction<? super V, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Map#merge(Object, Object, java.util.function.BiFunction) public default
     * java.lang.Object java.util.Map.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#merge(Object, Object, java.util.function.BiFunction) public default java.lang.Object
     *      java.util.Map.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#hashCode() public abstract int java.util.Map.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.Map#hashCode() public abstract int java.util.Map.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#hashCode() public abstract int java.util.Map.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#compute(Object, java.util.function.BiFunction) public default V
     * java.util.Map.compute(K,java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Map#compute(Object, java.util.function.BiFunction) public default
     * java.lang.Object java.util.Map.compute(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#compute(Object, java.util.function.BiFunction) public default java.lang.Object
     *      java.util.Map.compute(java.lang.Object,java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#keySet() public abstract java.util.Set<K> java.util.Map.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.Map#keySet() public abstract java.util.Set java.util.Map.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#keySet() public abstract java.util.Set java.util.Map.keySet() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#values() public abstract java.util.Collection<V> java.util.Map.values()}.
     *
     * <p>
     * Test method for {@link java.util.Map#values() public abstract java.util.Collection java.util.Map.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#values() public abstract java.util.Collection java.util.Map.values() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#computeIfAbsent(Object, java.util.function.Function) public default V
     * java.util.Map.computeIfAbsent(K,java.util.function.Function<? super K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Map#computeIfAbsent(Object, java.util.function.Function) public default
     * java.lang.Object java.util.Map.computeIfAbsent(java.lang.Object,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#computeIfAbsent(Object, java.util.function.Function) public default java.lang.Object
     *      java.util.Map.computeIfAbsent(java.lang.Object,java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#getOrDefault(Object, Object) public default V
     * java.util.Map.getOrDefault(java.lang.Object,V)}.
     *
     * <p>
     * Test method for {@link java.util.Map#getOrDefault(Object, Object) public default java.lang.Object
     * java.util.Map.getOrDefault(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#getOrDefault(Object, Object) public default java.lang.Object
     *      java.util.Map.getOrDefault(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#remove(Object) public abstract V java.util.Map.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Map#remove(Object) public abstract java.lang.Object
     * java.util.Map.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#remove(Object) public abstract java.lang.Object java.util.Map.remove(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#remove(Object, Object) public default boolean
     * java.util.Map.remove(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Map#remove(Object, Object) public default boolean
     * java.util.Map.remove(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#remove(Object, Object) public default boolean
     *      java.util.Map.remove(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#put(Object, Object) public abstract V java.util.Map.put(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.Map#put(Object, Object) public abstract java.lang.Object
     * java.util.Map.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#put(Object, Object) public abstract java.lang.Object
     *      java.util.Map.put(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#containsValue(Object) public abstract boolean
     * java.util.Map.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Map#containsValue(Object) public abstract boolean
     * java.util.Map.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#containsValue(Object) public abstract boolean java.util.Map.containsValue(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#replaceAll(java.util.function.BiFunction) public default void
     * java.util.Map.replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Map#replaceAll(java.util.function.BiFunction) public default void
     * java.util.Map.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#replaceAll(java.util.function.BiFunction) public default void
     *      java.util.Map.replaceAll(java.util.function.BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#replace(Object, Object) public default V java.util.Map.replace(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.Map#replace(Object, Object) public default java.lang.Object
     * java.util.Map.replace(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#replace(Object, Object) public default java.lang.Object
     *      java.util.Map.replace(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#replace(Object, Object, Object) public default boolean
     * java.util.Map.replace(K,V,V)}.
     *
     * <p>
     * Test method for {@link java.util.Map#replace(Object, Object, Object) public default boolean
     * java.util.Map.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#replace(Object, Object, Object) public default boolean
     *      java.util.Map.replace(java.lang.Object,java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#equals(Object) public abstract boolean
     * java.util.Map.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Map#equals(Object) public abstract boolean
     * java.util.Map.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#equals(Object) public abstract boolean java.util.Map.equals(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#size() public abstract int java.util.Map.size()}.
     *
     * <p>
     * Test method for {@link java.util.Map#size() public abstract int java.util.Map.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#size() public abstract int java.util.Map.size() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#computeIfPresent(Object, java.util.function.BiFunction) public default V
     * java.util.Map.computeIfPresent(K,java.util.function.BiFunction<? super K, ? super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.Map#computeIfPresent(Object, java.util.function.BiFunction) public default
     * java.lang.Object java.util.Map.computeIfPresent(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#computeIfPresent(Object, java.util.function.BiFunction) public default java.lang.Object
     *      java.util.Map.computeIfPresent(java.lang.Object,java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#putIfAbsent(Object, Object) public default V java.util.Map.putIfAbsent(K,V)}
     * .
     *
     * <p>
     * Test method for {@link java.util.Map#putIfAbsent(Object, Object) public default java.lang.Object
     * java.util.Map.putIfAbsent(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#putIfAbsent(Object, Object) public default java.lang.Object
     *      java.util.Map.putIfAbsent(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#containsKey(Object) public abstract boolean
     * java.util.Map.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Map#containsKey(Object) public abstract boolean
     * java.util.Map.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#containsKey(Object) public abstract boolean java.util.Map.containsKey(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#forEach(java.util.function.BiConsumer) public default void
     * java.util.Map.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.Map#forEach(java.util.function.BiConsumer) public default void
     * java.util.Map.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#forEach(java.util.function.BiConsumer) public default void
     *      java.util.Map.forEach(java.util.function.BiConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#entrySet() public abstract
     * java.util.Set<java.util.Map.java.util.Map$Entry<K, V>> java.util.Map.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.Map#entrySet() public abstract java.util.Set java.util.Map.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#entrySet() public abstract java.util.Set java.util.Map.entrySet() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#clear() public abstract void java.util.Map.clear()}.
     *
     * <p>
     * Test method for {@link java.util.Map#clear() public abstract void java.util.Map.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#clear() public abstract void java.util.Map.clear() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.Map#isEmpty() public abstract boolean java.util.Map.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.Map#isEmpty() public abstract boolean java.util.Map.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Map#isEmpty() public abstract boolean java.util.Map.isEmpty() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Map.Entry interface java.util.Map$Entry}. The complementary
     * j8unit test interface containing the class relevant aspects is {@link MapClassTests.EntryClassTests}.
     * </p>
     *
     * @see java.util.Map.Entry interface java.util.Map$Entry (the hereby targeted class-under-test class)
     * @see MapClassTests.EntryClassTests MapClassTests.EntryClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EntryTests<SUT extends java.util.Map.Entry<K, V>, K, V>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Map.Entry#getValue() public abstract V java.util.Map$Entry.getValue()}.
         *
         * <p>
         * Test method for {@link java.util.Map.Entry#getValue() public abstract java.lang.Object
         * java.util.Map$Entry.getValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Map.Entry#getValue() public abstract java.lang.Object java.util.Map$Entry.getValue() (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getValue()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Map.Entry#getKey() public abstract K java.util.Map$Entry.getKey()}.
         *
         * <p>
         * Test method for {@link java.util.Map.Entry#getKey() public abstract java.lang.Object
         * java.util.Map$Entry.getKey()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Map.Entry#getKey() public abstract java.lang.Object java.util.Map$Entry.getKey() (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getKey()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Map.Entry#hashCode() public abstract int java.util.Map$Entry.hashCode()}.
         *
         * <p>
         * Test method for {@link java.util.Map.Entry#hashCode() public abstract int java.util.Map$Entry.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Map.Entry#hashCode() public abstract int java.util.Map$Entry.hashCode() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
         * Test method for {@link java.util.Map.Entry#equals(Object) public abstract boolean
         * java.util.Map$Entry.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.util.Map.Entry#equals(Object) public abstract boolean
         * java.util.Map$Entry.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Map.Entry#equals(Object) public abstract boolean java.util.Map$Entry.equals(java.lang.Object)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
         * Test method for {@link java.util.Map.Entry#setValue(Object) public abstract V
         * java.util.Map$Entry.setValue(V)}.
         *
         * <p>
         * Test method for {@link java.util.Map.Entry#setValue(Object) public abstract java.lang.Object
         * java.util.Map$Entry.setValue(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Map.Entry#setValue(Object) public abstract java.lang.Object
         *      java.util.Map$Entry.setValue(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setValue_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
