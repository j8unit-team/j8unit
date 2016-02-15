package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.AbstractMap class java.util.AbstractMap}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link AbstractMapClassTests}.
 * </p>
 *
 * @see java.util.AbstractMap class java.util.AbstractMap (the hereby targeted class-under-test class)
 * @see AbstractMapClassTests AbstractMapClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractMapTests<SUT extends java.util.AbstractMap<K, V>, K, V>
extends MapTests<SUT, K, V>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.AbstractMap#hashCode() public int java.util.AbstractMap.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#hashCode() public int java.util.AbstractMap.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#hashCode() public int java.util.AbstractMap.hashCode() (the hereby targeted
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
     * Test method for {@link java.util.AbstractMap#get(Object) public V java.util.AbstractMap.get(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#get(Object) public java.lang.Object
     * java.util.AbstractMap.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#get(Object) public java.lang.Object java.util.AbstractMap.get(java.lang.Object) (the
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
     * Test method for {@link java.util.AbstractMap#equals(Object) public boolean
     * java.util.AbstractMap.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#equals(Object) public boolean
     * java.util.AbstractMap.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#equals(Object) public boolean java.util.AbstractMap.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.AbstractMap#putAll(java.util.Map) public void
     * java.util.AbstractMap.putAll(java.util.Map<? extends K, ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#putAll(java.util.Map) public void
     * java.util.AbstractMap.putAll(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#putAll(java.util.Map) public void java.util.AbstractMap.putAll(java.util.Map) (the
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
     * Test method for {@link java.util.AbstractMap#size() public int java.util.AbstractMap.size()}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#size() public int java.util.AbstractMap.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#size() public int java.util.AbstractMap.size() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.AbstractMap#toString() public java.lang.String java.util.AbstractMap.toString()}
     * .
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#toString() public java.lang.String java.util.AbstractMap.toString()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#toString() public java.lang.String java.util.AbstractMap.toString() (the hereby
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
     * Test method for {@link java.util.AbstractMap#keySet() public java.util.Set<K> java.util.AbstractMap.keySet()}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#keySet() public java.util.Set java.util.AbstractMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#keySet() public java.util.Set java.util.AbstractMap.keySet() (the hereby targeted
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
     * Test method for {@link java.util.AbstractMap#containsKey(Object) public boolean
     * java.util.AbstractMap.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#containsKey(Object) public boolean
     * java.util.AbstractMap.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#containsKey(Object) public boolean java.util.AbstractMap.containsKey(java.lang.Object)
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
     * Test method for {@link java.util.AbstractMap#values() public java.util.Collection
     * <V> java.util.AbstractMap.values()}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#values() public java.util.Collection java.util.AbstractMap.values()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#values() public java.util.Collection java.util.AbstractMap.values() (the hereby
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
     * Test method for {@link java.util.AbstractMap#entrySet() public abstract
     * java.util.Set<java.util.Map.java.util.Map$Entry<K, V>> java.util.AbstractMap.entrySet()}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#entrySet() public abstract java.util.Set
     * java.util.AbstractMap.entrySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#entrySet() public abstract java.util.Set java.util.AbstractMap.entrySet() (the hereby
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
     * Test method for {@link java.util.AbstractMap#clear() public void java.util.AbstractMap.clear()}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#clear() public void java.util.AbstractMap.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#clear() public void java.util.AbstractMap.clear() (the hereby targeted
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
     * Test method for {@link java.util.AbstractMap#isEmpty() public boolean java.util.AbstractMap.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#isEmpty() public boolean java.util.AbstractMap.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#isEmpty() public boolean java.util.AbstractMap.isEmpty() (the hereby targeted
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
     * Test method for {@link java.util.AbstractMap#remove(Object) public V
     * java.util.AbstractMap.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#remove(Object) public java.lang.Object
     * java.util.AbstractMap.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#remove(Object) public java.lang.Object java.util.AbstractMap.remove(java.lang.Object)
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
     * Test method for {@link java.util.AbstractMap#put(Object, Object) public V java.util.AbstractMap.put(K,V)}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#put(Object, Object) public java.lang.Object
     * java.util.AbstractMap.put(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#put(Object, Object) public java.lang.Object
     *      java.util.AbstractMap.put(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.AbstractMap#containsValue(Object) public boolean
     * java.util.AbstractMap.containsValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.AbstractMap#containsValue(Object) public boolean
     * java.util.AbstractMap.containsValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.AbstractMap#containsValue(Object) public boolean
     *      java.util.AbstractMap.containsValue(java.lang.Object) (the hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.AbstractMap.SimpleImmutableEntry class
     * java.util.AbstractMap$SimpleImmutableEntry}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link AbstractMapClassTests.SimpleImmutableEntryClassTests}.
     * </p>
     *
     * @see java.util.AbstractMap.SimpleImmutableEntry class java.util.AbstractMap$SimpleImmutableEntry (the hereby
     *      targeted class-under-test class)
     * @see AbstractMapClassTests.SimpleImmutableEntryClassTests AbstractMapClassTests.SimpleImmutableEntryClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SimpleImmutableEntryTests<SUT extends java.util.AbstractMap.SimpleImmutableEntry<K, V>, K, V>
    extends MapTests.EntryTests<SUT, K, V>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#toString() public java.lang.String
         * java.util.AbstractMap$SimpleImmutableEntry.toString()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#toString() public java.lang.String
         * java.util.AbstractMap$SimpleImmutableEntry.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleImmutableEntry#toString() public java.lang.String
         *      java.util.AbstractMap$SimpleImmutableEntry.toString() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#hashCode() public int
         * java.util.AbstractMap$SimpleImmutableEntry.hashCode()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#hashCode() public int
         * java.util.AbstractMap$SimpleImmutableEntry.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleImmutableEntry#hashCode() public int
         *      java.util.AbstractMap$SimpleImmutableEntry.hashCode() (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#equals(Object) public boolean
         * java.util.AbstractMap$SimpleImmutableEntry.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#equals(Object) public boolean
         * java.util.AbstractMap$SimpleImmutableEntry.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleImmutableEntry#equals(Object) public boolean
         *      java.util.AbstractMap$SimpleImmutableEntry.equals(java.lang.Object) (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#setValue(Object) public V
         * java.util.AbstractMap$SimpleImmutableEntry.setValue(V)}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#setValue(Object) public java.lang.Object
         * java.util.AbstractMap$SimpleImmutableEntry.setValue(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleImmutableEntry#setValue(Object) public java.lang.Object
         *      java.util.AbstractMap$SimpleImmutableEntry.setValue(java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_setValue_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#getValue() public V
         * java.util.AbstractMap$SimpleImmutableEntry.getValue()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#getValue() public java.lang.Object
         * java.util.AbstractMap$SimpleImmutableEntry.getValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleImmutableEntry#getValue() public java.lang.Object
         *      java.util.AbstractMap$SimpleImmutableEntry.getValue() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#getKey() public K
         * java.util.AbstractMap$SimpleImmutableEntry.getKey()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#getKey() public java.lang.Object
         * java.util.AbstractMap$SimpleImmutableEntry.getKey()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleImmutableEntry#getKey() public java.lang.Object
         *      java.util.AbstractMap$SimpleImmutableEntry.getKey() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getKey()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.AbstractMap.SimpleEntry class
     * java.util.AbstractMap$SimpleEntry}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link AbstractMapClassTests.SimpleEntryClassTests}.
     * </p>
     *
     * @see java.util.AbstractMap.SimpleEntry class java.util.AbstractMap$SimpleEntry (the hereby targeted
     *      class-under-test class)
     * @see AbstractMapClassTests.SimpleEntryClassTests AbstractMapClassTests.SimpleEntryClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SimpleEntryTests<SUT extends java.util.AbstractMap.SimpleEntry<K, V>, K, V>
    extends MapTests.EntryTests<SUT, K, V>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#equals(Object) public boolean
         * java.util.AbstractMap$SimpleEntry.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#equals(Object) public boolean
         * java.util.AbstractMap$SimpleEntry.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleEntry#equals(Object) public boolean
         *      java.util.AbstractMap$SimpleEntry.equals(java.lang.Object) (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.AbstractMap.SimpleEntry#setValue(Object) public V
         * java.util.AbstractMap$SimpleEntry.setValue(V)}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#setValue(Object) public java.lang.Object
         * java.util.AbstractMap$SimpleEntry.setValue(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleEntry#setValue(Object) public java.lang.Object
         *      java.util.AbstractMap$SimpleEntry.setValue(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_setValue_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#hashCode() public int
         * java.util.AbstractMap$SimpleEntry.hashCode()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#hashCode() public int
         * java.util.AbstractMap$SimpleEntry.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleEntry#hashCode() public int java.util.AbstractMap$SimpleEntry.hashCode()
         *      (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.AbstractMap.SimpleEntry#getValue() public V
         * java.util.AbstractMap$SimpleEntry.getValue()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#getValue() public java.lang.Object
         * java.util.AbstractMap$SimpleEntry.getValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleEntry#getValue() public java.lang.Object
         *      java.util.AbstractMap$SimpleEntry.getValue() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.AbstractMap.SimpleEntry#getKey() public K
         * java.util.AbstractMap$SimpleEntry.getKey()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#getKey() public java.lang.Object
         * java.util.AbstractMap$SimpleEntry.getKey()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleEntry#getKey() public java.lang.Object
         *      java.util.AbstractMap$SimpleEntry.getKey() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link java.util.AbstractMap.SimpleEntry#toString() public java.lang.String
         * java.util.AbstractMap$SimpleEntry.toString()}.
         *
         * <p>
         * Test method for {@link java.util.AbstractMap.SimpleEntry#toString() public java.lang.String
         * java.util.AbstractMap$SimpleEntry.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.AbstractMap.SimpleEntry#toString() public java.lang.String
         *      java.util.AbstractMap$SimpleEntry.toString() (the hereby targeted method-under-test)
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

    }

}
