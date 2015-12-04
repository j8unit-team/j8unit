package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.ConcurrentHashMap class java.util.concurrent.ConcurrentHashMap},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ConcurrentHashMapClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ConcurrentHashMapTests<SUT extends java.util.concurrent.ConcurrentHashMap<K, V>, K, V>
extends org.j8unit.repository.java.util.concurrent.ConcurrentMapTests<SUT, K, V>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.util.AbstractMapTests<SUT, K, V> {

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ConcurrentHashMap$KeySetView class
     * java.util.concurrent.ConcurrentHashMap$KeySetView}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ConcurrentHashMapClassTests.KeySetViewClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KeySetViewTests<SUT extends java.util.concurrent.ConcurrentHashMap.KeySetView<K, V>, K, V>
    extends org.j8unit.repository.java.util.SetTests<SUT, K>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.util.CollectionTests<SUT, K>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#add(java.lang.Object) public boolean
         * java.util.concurrent.ConcurrentHashMap$KeySetView.add(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_add_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#addAll(java.util.Collection) public
         * boolean java.util.concurrent.ConcurrentHashMap$KeySetView.addAll(java.util.Collection)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addAll_Collection()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_clear()
        throws Exception {
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#contains(java.lang.Object) public
         * boolean java.util.concurrent.ConcurrentHashMap$KeySetView.contains(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_contains_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_containsAll_Collection()
        throws Exception {
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#equals(java.lang.Object) public
         * boolean java.util.concurrent.ConcurrentHashMap$KeySetView.equals(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_equals_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#forEach(java.util.function.Consumer)
         * public void java.util.concurrent.ConcurrentHashMap$KeySetView.forEach(java.util.function.Consumer)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_forEach_Consumer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#getMappedValue() public
         * java.lang.Object java.util.concurrent.ConcurrentHashMap$KeySetView.getMappedValue()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getMappedValue()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#hashCode() public int
         * java.util.concurrent.ConcurrentHashMap$KeySetView.hashCode()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_hashCode()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_isEmpty()
        throws Exception {
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#iterator() public java.util.Iterator
         * java.util.concurrent.ConcurrentHashMap$KeySetView.iterator()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_iterator()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#remove(java.lang.Object) public
         * boolean java.util.concurrent.ConcurrentHashMap$KeySetView.remove(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_remove_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_removeAll_Collection()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_retainAll_Collection()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_size()
        throws Exception {
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ConcurrentHashMap.KeySetView#spliterator() public
         * java.util.Spliterator java.util.concurrent.ConcurrentHashMap$KeySetView.spliterator()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_spliterator()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toArray()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test. In result, there are duplicated according test method within the super test classes. To
         * solve this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon
         * and, thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toArray_ObjectArray()
        throws Exception {
        }

    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#clear() public void
     * java.util.concurrent.ConcurrentHashMap.clear()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_clear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#compute(java.lang.Object,java.util.function.BiFunction) public
     * java.lang.Object java.util.concurrent.ConcurrentHashMap.compute(java.lang.Object,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_compute_Object_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#computeIfAbsent(java.lang.Object,java.util.function.Function)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object,java.util.function.Function)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_computeIfAbsent_Object_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#computeIfPresent(java.lang.Object,java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_computeIfPresent_Object_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#contains(java.lang.Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.contains(java.lang.Object)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#containsKey(java.lang.Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.containsKey(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_containsKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#containsValue(java.lang.Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.containsValue(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_containsValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#elements() public java.util.Enumeration
     * java.util.concurrent.ConcurrentHashMap.elements()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#entrySet() public java.util.Set
     * java.util.concurrent.ConcurrentHashMap.entrySet()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_entrySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#equals(java.lang.Object) public boolean
     * java.util.concurrent.ConcurrentHashMap.equals(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEach(java.util.function.BiConsumer) public void
     * java.util.concurrent.ConcurrentHashMap.forEach(java.util.function.BiConsumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_forEach_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEach(long,java.util.function.BiConsumer) public
     * void java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiConsumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEach_long_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEach(long,java.util.function.BiFunction,java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEach(long,java.util.function.BiFunction,java.util.function.Consumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEach_long_BiFunction_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachEntry(long,java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Consumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachEntry_long_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachEntry(long,java.util.function.Function,java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEachEntry(long,java.util.function.Function,java.util.function.Consumer)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachEntry_long_Function_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachKey(long,java.util.function.Consumer) public
     * void java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Consumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachKey_long_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachKey(long,java.util.function.Function,java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEachKey(long,java.util.function.Function,java.util.function.Consumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachKey_long_Function_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#forEachValue(long,java.util.function.Consumer)
     * public void java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Consumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachValue_long_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#forEachValue(long,java.util.function.Function,java.util.function.Consumer)
     * public void
     * java.util.concurrent.ConcurrentHashMap.forEachValue(long,java.util.function.Function,java.util.function.Consumer)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEachValue_long_Function_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#get(java.lang.Object) public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.get(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_get_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#getOrDefault(java.lang.Object,java.lang.Object)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.getOrDefault(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getOrDefault_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#hashCode() public int
     * java.util.concurrent.ConcurrentHashMap.hashCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#isEmpty() public boolean
     * java.util.concurrent.ConcurrentHashMap.isEmpty()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isEmpty()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keys() public java.util.Enumeration
     * java.util.concurrent.ConcurrentHashMap.keys()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keySet() public
     * java.util.concurrent.ConcurrentHashMap$KeySetView java.util.concurrent.ConcurrentHashMap.keySet()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_keySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#keySet(java.lang.Object) public
     * java.util.concurrent.ConcurrentHashMap$KeySetView
     * java.util.concurrent.ConcurrentHashMap.keySet(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_keySet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#mappingCount() public long
     * java.util.concurrent.ConcurrentHashMap.mappingCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mappingCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.merge(java.lang.Object,java.lang.Object,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_merge_Object_Object_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#put(java.lang.Object,java.lang.Object) public
     * java.lang.Object java.util.concurrent.ConcurrentHashMap.put(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_put_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#putAll(java.util.Map) public void
     * java.util.concurrent.ConcurrentHashMap.putAll(java.util.Map)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_putAll_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#putIfAbsent(java.lang.Object,java.lang.Object)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.putIfAbsent(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_putIfAbsent_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduce(long,java.util.function.BiFunction,java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduce(long,java.util.function.BiFunction,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduce_long_BiFunction_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceEntries(long,java.util.function.BiFunction)
     * public java.util.Map$Entry
     * java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntries_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntries(long,java.util.function.Function,java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduceEntries(long,java.util.function.Function,java.util.function.BiFunction)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntries_long_Function_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntriesToDouble_long_ToDoubleFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntriesToInt_long_ToIntFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceEntriesToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceEntriesToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceEntriesToLong_long_ToLongFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceKeys(long,java.util.function.BiFunction)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeys_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeys(long,java.util.function.Function,java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduceKeys(long,java.util.function.Function,java.util.function.BiFunction)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeys_long_Function_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceKeysToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeysToDouble_long_ToDoubleFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceKeysToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeysToInt_long_ToIntFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceKeysToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceKeysToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceKeysToLong_long_ToLongFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToDouble(long,java.util.function.ToDoubleBiFunction,double,java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceToDouble(long,java.util.function.ToDoubleBiFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceToDouble_long_ToDoubleBiFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToInt(long,java.util.function.ToIntBiFunction,int,java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceToInt(long,java.util.function.ToIntBiFunction,int,java.util.function.IntBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceToInt_long_ToIntBiFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceToLong(long,java.util.function.ToLongBiFunction,long,java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceToLong(long,java.util.function.ToLongBiFunction,long,java.util.function.LongBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceToLong_long_ToLongBiFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#reduceValues(long,java.util.function.BiFunction)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValues_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValues(long,java.util.function.Function,java.util.function.BiFunction)
     * public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.reduceValues(long,java.util.function.Function,java.util.function.BiFunction)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValues_long_Function_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)
     * public double
     * java.util.concurrent.ConcurrentHashMap.reduceValuesToDouble(long,java.util.function.ToDoubleFunction,double,java.util.function.DoubleBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValuesToDouble_long_ToDoubleFunction_double_DoubleBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)
     * public int
     * java.util.concurrent.ConcurrentHashMap.reduceValuesToInt(long,java.util.function.ToIntFunction,int,java.util.function.IntBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValuesToInt_long_ToIntFunction_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#reduceValuesToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)
     * public long
     * java.util.concurrent.ConcurrentHashMap.reduceValuesToLong(long,java.util.function.ToLongFunction,long,java.util.function.LongBinaryOperator)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reduceValuesToLong_long_ToLongFunction_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#remove(java.lang.Object) public java.lang.Object
     * java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_remove_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#remove(java.lang.Object,java.lang.Object) public
     * boolean java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_remove_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replace(java.lang.Object,java.lang.Object) public
     * java.lang.Object java.util.concurrent.ConcurrentHashMap.replace(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_replace_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentHashMap#replace(java.lang.Object,java.lang.Object,java.lang.Object) public
     * boolean java.util.concurrent.ConcurrentHashMap.replace(java.lang.Object,java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_replace_Object_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#replaceAll(java.util.function.BiFunction) public
     * void java.util.concurrent.ConcurrentHashMap.replaceAll(java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_replaceAll_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#search(long,java.util.function.BiFunction) public
     * java.lang.Object java.util.concurrent.ConcurrentHashMap.search(long,java.util.function.BiFunction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_search_long_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchEntries(long,java.util.function.Function)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.searchEntries(long,java.util.function.Function)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_searchEntries_long_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchKeys(long,java.util.function.Function) public
     * java.lang.Object java.util.concurrent.ConcurrentHashMap.searchKeys(long,java.util.function.Function)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_searchKeys_long_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#searchValues(long,java.util.function.Function)
     * public java.lang.Object java.util.concurrent.ConcurrentHashMap.searchValues(long,java.util.function.Function)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_searchValues_long_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#size() public int
     * java.util.concurrent.ConcurrentHashMap.size()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#toString() public java.lang.String
     * java.util.concurrent.ConcurrentHashMap.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#values() public java.util.Collection
     * java.util.concurrent.ConcurrentHashMap.values()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_values()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
