package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.Provider class java.security.Provider}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ProviderClassTests}.
 * </p>
 *
 * @see java.security.Provider class java.security.Provider (the hereby targeted class-under-test class)
 * @see ProviderClassTests ProviderClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProviderTests<SUT extends java.security.Provider>
extends org.j8unit.repository.java.util.PropertiesTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Provider#getService(String, String) public synchronized
     * java.security.Provider$Service java.security.Provider.getService(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#getService(String, String) public synchronized
     * java.security.Provider$Service java.security.Provider.getService(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#getService(String, String) public synchronized java.security.Provider$Service
     *      java.security.Provider.getService(java.lang.String,java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getService_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Provider#clear() public synchronized void java.security.Provider.clear()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#clear() public synchronized void java.security.Provider.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#clear() public synchronized void java.security.Provider.clear() (the hereby targeted
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
     * Test method for {@link java.security.Provider#forEach(java.util.function.BiConsumer) public synchronized void
     * java.security.Provider.forEach(java.util.function.BiConsumer<? super java.lang.Object, ? super
     * java.lang.Object>)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#forEach(java.util.function.BiConsumer) public synchronized void
     * java.security.Provider.forEach(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#forEach(java.util.function.BiConsumer) public synchronized void
     *      java.security.Provider.forEach(java.util.function.BiConsumer) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#entrySet() public synchronized
     * java.util.Set<java.util.Map.java.util.Map$Entry<java.lang.Object, java.lang.Object>>
     * java.security.Provider.entrySet()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#entrySet() public synchronized java.util.Set
     * java.security.Provider.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#entrySet() public synchronized java.util.Set java.security.Provider.entrySet() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#getInfo() public java.lang.String java.security.Provider.getInfo()}
     * .
     *
     * <p>
     * Test method for {@link java.security.Provider#getInfo() public java.lang.String java.security.Provider.getInfo()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#getInfo() public java.lang.String java.security.Provider.getInfo() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Provider#getProperty(String) public java.lang.String
     * java.security.Provider.getProperty(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#getProperty(String) public java.lang.String
     * java.security.Provider.getProperty(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#getProperty(String) public java.lang.String
     *      java.security.Provider.getProperty(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getProperty_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Provider#getVersion() public double java.security.Provider.getVersion()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#getVersion() public double java.security.Provider.getVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#getVersion() public double java.security.Provider.getVersion() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Provider#putIfAbsent(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.putIfAbsent(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#putIfAbsent(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.putIfAbsent(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#putIfAbsent(Object, Object) public synchronized java.lang.Object
     *      java.security.Provider.putIfAbsent(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.security.Provider#toString() public java.lang.String
     * java.security.Provider.toString()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#toString() public java.lang.String
     * java.security.Provider.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#toString() public java.lang.String java.security.Provider.toString() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.Provider#elements() public java.util.Enumeration
     * <java.lang.Object> java.security.Provider.elements()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#elements() public java.util.Enumeration
     * java.security.Provider.elements()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#elements() public java.util.Enumeration java.security.Provider.elements() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.Provider#computeIfPresent(Object, java.util.function.BiFunction) public
     * synchronized java.lang.Object
     * java.security.Provider.computeIfPresent(java.lang.Object,java.util.function.BiFunction<? super java.lang.Object,
     * ? super java.lang.Object, ?>)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#computeIfPresent(Object, java.util.function.BiFunction) public
     * synchronized java.lang.Object
     * java.security.Provider.computeIfPresent(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#computeIfPresent(Object, java.util.function.BiFunction) public synchronized
     *      java.lang.Object java.security.Provider.computeIfPresent(java.lang.Object,java.util.function.BiFunction)
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
     * Test method for {@link java.security.Provider#remove(Object) public synchronized java.lang.Object
     * java.security.Provider.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#remove(Object) public synchronized java.lang.Object
     * java.security.Provider.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#remove(Object) public synchronized java.lang.Object
     *      java.security.Provider.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#remove(Object, Object) public synchronized boolean
     * java.security.Provider.remove(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#remove(Object, Object) public synchronized boolean
     * java.security.Provider.remove(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#remove(Object, Object) public synchronized boolean
     *      java.security.Provider.remove(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#put(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.put(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#put(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#put(Object, Object) public synchronized java.lang.Object
     *      java.security.Provider.put(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#replaceAll(java.util.function.BiFunction) public synchronized void
     * java.security.Provider.replaceAll(java.util.function.BiFunction<? super java.lang.Object, ? super
     * java.lang.Object, ?>)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#replaceAll(java.util.function.BiFunction) public synchronized void
     * java.security.Provider.replaceAll(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#replaceAll(java.util.function.BiFunction) public synchronized void
     *      java.security.Provider.replaceAll(java.util.function.BiFunction) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#replace(Object, Object, Object) public synchronized boolean
     * java.security.Provider.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#replace(Object, Object, Object) public synchronized boolean
     * java.security.Provider.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#replace(Object, Object, Object) public synchronized boolean
     *      java.security.Provider.replace(java.lang.Object,java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.security.Provider#replace(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.replace(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#replace(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.replace(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#replace(Object, Object) public synchronized java.lang.Object
     *      java.security.Provider.replace(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#values() public java.util.Collection
     * <java.lang.Object> java.security.Provider.values()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#values() public java.util.Collection
     * java.security.Provider.values()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#values() public java.util.Collection java.security.Provider.values() (the hereby
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
     * Test method for {@link java.security.Provider#computeIfAbsent(Object, java.util.function.Function) public
     * synchronized java.lang.Object
     * java.security.Provider.computeIfAbsent(java.lang.Object,java.util.function.Function<? super java.lang.Object,
     * ?>)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#computeIfAbsent(Object, java.util.function.Function) public
     * synchronized java.lang.Object
     * java.security.Provider.computeIfAbsent(java.lang.Object,java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#computeIfAbsent(Object, java.util.function.Function) public synchronized
     *      java.lang.Object java.security.Provider.computeIfAbsent(java.lang.Object,java.util.function.Function) (the
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
     * Test method for {@link java.security.Provider#keys() public java.util.Enumeration
     * <java.lang.Object> java.security.Provider.keys()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#keys() public java.util.Enumeration java.security.Provider.keys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#keys() public java.util.Enumeration java.security.Provider.keys() (the hereby
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
     * Test method for {@link java.security.Provider#getName() public java.lang.String java.security.Provider.getName()}
     * .
     *
     * <p>
     * Test method for {@link java.security.Provider#getName() public java.lang.String java.security.Provider.getName()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#getName() public java.lang.String java.security.Provider.getName() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Provider#getOrDefault(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.getOrDefault(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#getOrDefault(Object, Object) public synchronized java.lang.Object
     * java.security.Provider.getOrDefault(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#getOrDefault(Object, Object) public synchronized java.lang.Object
     *      java.security.Provider.getOrDefault(java.lang.Object,java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.security.Provider#keySet() public java.util.Set
     * <java.lang.Object> java.security.Provider.keySet()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#keySet() public java.util.Set java.security.Provider.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#keySet() public java.util.Set java.security.Provider.keySet() (the hereby targeted
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
     * Test method for {@link java.security.Provider#getServices() public synchronized java.util.Set
     * <java.security.Provider$Service> java.security.Provider.getServices()}.
     *
     * <p>
     * Test method for {@link java.security.Provider#getServices() public synchronized java.util.Set
     * java.security.Provider.getServices()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#getServices() public synchronized java.util.Set java.security.Provider.getServices()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServices()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Provider#get(Object) public java.lang.Object
     * java.security.Provider.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#get(Object) public java.lang.Object
     * java.security.Provider.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#get(Object) public java.lang.Object java.security.Provider.get(java.lang.Object) (the
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
     * Test method for {@link java.security.Provider#putAll(java.util.Map) public synchronized void
     * java.security.Provider.putAll(java.util.Map<?, ?>)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#putAll(java.util.Map) public synchronized void
     * java.security.Provider.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#putAll(java.util.Map) public synchronized void
     *      java.security.Provider.putAll(java.util.Map) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Provider#merge(Object, Object, java.util.function.BiFunction) public
     * synchronized java.lang.Object
     * java.security.Provider.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction<? super
     * java.lang.Object, ? super java.lang.Object, ?>)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#merge(Object, Object, java.util.function.BiFunction) public
     * synchronized java.lang.Object
     * java.security.Provider.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#merge(Object, Object, java.util.function.BiFunction) public synchronized
     *      java.lang.Object
     *      java.security.Provider.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.Provider#load(java.io.InputStream) public synchronized void
     * java.security.Provider.load(java.io.InputStream) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.Provider#load(java.io.InputStream) public synchronized void
     * java.security.Provider.load(java.io.InputStream) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#load(java.io.InputStream) public synchronized void
     *      java.security.Provider.load(java.io.InputStream) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_load_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Provider#compute(Object, java.util.function.BiFunction) public synchronized
     * java.lang.Object java.security.Provider.compute(java.lang.Object,java.util.function.BiFunction<? super
     * java.lang.Object, ? super java.lang.Object, ?>)}.
     *
     * <p>
     * Test method for {@link java.security.Provider#compute(Object, java.util.function.BiFunction) public synchronized
     * java.lang.Object java.security.Provider.compute(java.lang.Object,java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Provider#compute(Object, java.util.function.BiFunction) public synchronized java.lang.Object
     *      java.security.Provider.compute(java.lang.Object,java.util.function.BiFunction) (the hereby targeted
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.Provider.Service class java.security.Provider$Service}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link ProviderClassTests.ServiceClassTests}.
     * </p>
     *
     * @see java.security.Provider.Service class java.security.Provider$Service (the hereby targeted class-under-test
     *      class)
     * @see ProviderClassTests.ServiceClassTests ProviderClassTests.ServiceClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ServiceTests<SUT extends java.security.Provider.Service>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.Provider.Service#getType() public final java.lang.String
         * java.security.Provider$Service.getType()}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#getType() public final java.lang.String
         * java.security.Provider$Service.getType()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#getType() public final java.lang.String
         *      java.security.Provider$Service.getType() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getType()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.Provider.Service#getAlgorithm() public final java.lang.String
         * java.security.Provider$Service.getAlgorithm()}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#getAlgorithm() public final java.lang.String
         * java.security.Provider$Service.getAlgorithm()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#getAlgorithm() public final java.lang.String
         *      java.security.Provider$Service.getAlgorithm() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAlgorithm()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.Provider.Service#getAttribute(String) public final java.lang.String
         * java.security.Provider$Service.getAttribute(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#getAttribute(String) public final java.lang.String
         * java.security.Provider$Service.getAttribute(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#getAttribute(String) public final java.lang.String
         *      java.security.Provider$Service.getAttribute(java.lang.String) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAttribute_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.Provider.Service#supportsParameter(Object) public boolean
         * java.security.Provider$Service.supportsParameter(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#supportsParameter(Object) public boolean
         * java.security.Provider$Service.supportsParameter(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#supportsParameter(Object) public boolean
         *      java.security.Provider$Service.supportsParameter(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_supportsParameter_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.Provider.Service#getProvider() public final java.security.Provider
         * java.security.Provider$Service.getProvider()}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#getProvider() public final java.security.Provider
         * java.security.Provider$Service.getProvider()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#getProvider() public final java.security.Provider
         *      java.security.Provider$Service.getProvider() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getProvider()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.Provider.Service#getClassName() public final java.lang.String
         * java.security.Provider$Service.getClassName()}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#getClassName() public final java.lang.String
         * java.security.Provider$Service.getClassName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#getClassName() public final java.lang.String
         *      java.security.Provider$Service.getClassName() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getClassName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.Provider.Service#toString() public java.lang.String
         * java.security.Provider$Service.toString()}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#toString() public java.lang.String
         * java.security.Provider$Service.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#toString() public java.lang.String
         *      java.security.Provider$Service.toString() (the hereby targeted method-under-test)
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
         * Test method for {@link java.security.Provider.Service#newInstance(Object) public java.lang.Object
         * java.security.Provider$Service.newInstance(java.lang.Object) throws java.security.NoSuchAlgorithmException}.
         *
         * <p>
         * Test method for {@link java.security.Provider.Service#newInstance(Object) public java.lang.Object
         * java.security.Provider$Service.newInstance(java.lang.Object) throws java.security.NoSuchAlgorithmException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.Provider.Service#newInstance(Object) public java.lang.Object
         *      java.security.Provider$Service.newInstance(java.lang.Object) throws
         *      java.security.NoSuchAlgorithmException (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_newInstance_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
