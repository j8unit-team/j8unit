package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ConcurrentMap interface
 * java.util.concurrent.ConcurrentMap}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ConcurrentMapClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ConcurrentMap interface java.util.concurrent.ConcurrentMap (the hereby targeted
 *      class-under-test class)
 * @see ConcurrentMapClassTests ConcurrentMapClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentMapTests<SUT extends java.util.concurrent.ConcurrentMap<K, V>, K, V>
extends org.j8unit.repository.java.util.MapTests<SUT, K, V> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#remove(Object, Object) public abstract boolean
     * java.util.concurrent.ConcurrentMap.remove(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#remove(Object, Object) public abstract boolean
     * java.util.concurrent.ConcurrentMap.remove(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#remove(Object, Object) public abstract boolean
     *      java.util.concurrent.ConcurrentMap.remove(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#replaceAll(java.util.function.BiFunction) public
     * default void java.util.concurrent.ConcurrentMap.replaceAll(java.util.function.BiFunction<? super K, ? super V, ?
     * extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#replaceAll(java.util.function.BiFunction) public
     * default void java.util.concurrent.ConcurrentMap.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#replaceAll(java.util.function.BiFunction) public default void
     *      java.util.concurrent.ConcurrentMap.replaceAll(java.util.function.BiFunction) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#putIfAbsent(Object, Object) public abstract V
     * java.util.concurrent.ConcurrentMap.putIfAbsent(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#putIfAbsent(Object, Object) public abstract
     * java.lang.Object java.util.concurrent.ConcurrentMap.putIfAbsent(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#putIfAbsent(Object, Object) public abstract java.lang.Object
     *      java.util.concurrent.ConcurrentMap.putIfAbsent(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#replace(Object, Object, Object) public abstract boolean
     * java.util.concurrent.ConcurrentMap.replace(K,V,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#replace(Object, Object, Object) public abstract boolean
     * java.util.concurrent.ConcurrentMap.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#replace(Object, Object, Object) public abstract boolean
     *      java.util.concurrent.ConcurrentMap.replace(java.lang.Object,java.lang.Object,java.lang.Object) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#replace(Object, Object) public abstract V
     * java.util.concurrent.ConcurrentMap.replace(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#replace(Object, Object) public abstract
     * java.lang.Object java.util.concurrent.ConcurrentMap.replace(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#replace(Object, Object) public abstract java.lang.Object
     *      java.util.concurrent.ConcurrentMap.replace(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#computeIfAbsent(Object, java.util.function.Function)
     * public default V java.util.concurrent.ConcurrentMap.computeIfAbsent(K,java.util.function.Function<? super K, ?
     * extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#computeIfAbsent(Object, java.util.function.Function)
     * public default java.lang.Object
     * java.util.concurrent.ConcurrentMap.computeIfAbsent(java.lang.Object,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#computeIfAbsent(Object, java.util.function.Function) public default
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentMap.computeIfAbsent(java.lang.Object,java.util.function.Function) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#merge(Object, Object, java.util.function.BiFunction)
     * public default V java.util.concurrent.ConcurrentMap.merge(K,V,java.util.function.BiFunction<? super V, ? super V,
     * ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#merge(Object, Object, java.util.function.BiFunction)
     * public default java.lang.Object
     * java.util.concurrent.ConcurrentMap.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#merge(Object, Object, java.util.function.BiFunction) public default
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentMap.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#forEach(java.util.function.BiConsumer) public default
     * void java.util.concurrent.ConcurrentMap.forEach(java.util.function.BiConsumer<? super K, ? super V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#forEach(java.util.function.BiConsumer) public default
     * void java.util.concurrent.ConcurrentMap.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#forEach(java.util.function.BiConsumer) public default void
     *      java.util.concurrent.ConcurrentMap.forEach(java.util.function.BiConsumer) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#computeIfPresent(Object, java.util.function.BiFunction)
     * public default V java.util.concurrent.ConcurrentMap.computeIfPresent(K,java.util.function.BiFunction<? super K, ?
     * super V, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#computeIfPresent(Object, java.util.function.BiFunction)
     * public default java.lang.Object
     * java.util.concurrent.ConcurrentMap.computeIfPresent(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#computeIfPresent(Object, java.util.function.BiFunction) public default
     *      java.lang.Object
     *      java.util.concurrent.ConcurrentMap.computeIfPresent(java.lang.Object,java.util.function.BiFunction) (the
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#getOrDefault(Object, Object) public default V
     * java.util.concurrent.ConcurrentMap.getOrDefault(java.lang.Object,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#getOrDefault(Object, Object) public default
     * java.lang.Object java.util.concurrent.ConcurrentMap.getOrDefault(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#getOrDefault(Object, Object) public default java.lang.Object
     *      java.util.concurrent.ConcurrentMap.getOrDefault(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ConcurrentMap#compute(Object, java.util.function.BiFunction) public
     * default V java.util.concurrent.ConcurrentMap.compute(K,java.util.function.BiFunction<? super K, ? super V, ?
     * extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentMap#compute(Object, java.util.function.BiFunction) public
     * default java.lang.Object
     * java.util.concurrent.ConcurrentMap.compute(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentMap#compute(Object, java.util.function.BiFunction) public default
     *      java.lang.Object java.util.concurrent.ConcurrentMap.compute(java.lang.Object,java.util.function.BiFunction)
     *      (the hereby targeted method-under-test)
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

}
