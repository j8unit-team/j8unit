package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ConcurrentSkipListSet class
 * java.util.concurrent.ConcurrentSkipListSet}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ConcurrentSkipListSetClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ConcurrentSkipListSet class java.util.concurrent.ConcurrentSkipListSet (the hereby targeted
 *      class-under-test class)
 * @see ConcurrentSkipListSetClassTests ConcurrentSkipListSetClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentSkipListSetTests<SUT extends java.util.concurrent.ConcurrentSkipListSet<E>, E>
extends org.j8unit.repository.java.util.NavigableSetTests<SUT, E>, org.j8unit.repository.java.lang.CloneableTests<SUT>,
org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.util.AbstractSetTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#size() public int
     * java.util.concurrent.ConcurrentSkipListSet.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#size() public int
     * java.util.concurrent.ConcurrentSkipListSet.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#size() public int
     *      java.util.concurrent.ConcurrentSkipListSet.size() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#equals(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#equals(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#equals(Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListSet.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#comparator() public java.util.Comparator<?
     * super E> java.util.concurrent.ConcurrentSkipListSet.comparator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#comparator() public java.util.Comparator
     * java.util.concurrent.ConcurrentSkipListSet.comparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#comparator() public java.util.Comparator
     *      java.util.concurrent.ConcurrentSkipListSet.comparator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#contains(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#contains(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#contains(Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListSet.contains(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#first() public E
     * java.util.concurrent.ConcurrentSkipListSet.first()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#first() public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.first()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#first() public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.first() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_first()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#higher(Object) public E
     * java.util.concurrent.ConcurrentSkipListSet.higher(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#higher(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.higher(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#higher(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.higher(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_higher_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#clone() public
     * java.util.concurrent.ConcurrentSkipListSet<E> java.util.concurrent.ConcurrentSkipListSet.clone()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#clone() public
     * java.util.concurrent.ConcurrentSkipListSet java.util.concurrent.ConcurrentSkipListSet.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#clone() public java.util.concurrent.ConcurrentSkipListSet
     *      java.util.concurrent.ConcurrentSkipListSet.clone() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#pollFirst() public E
     * java.util.concurrent.ConcurrentSkipListSet.pollFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#pollFirst() public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.pollFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#pollFirst() public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.pollFirst() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_pollFirst()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#last() public E
     * java.util.concurrent.ConcurrentSkipListSet.last()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#last() public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.last()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#last() public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.last() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_last()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#spliterator() public java.util.Spliterator
     * <E> java.util.concurrent.ConcurrentSkipListSet.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#spliterator() public java.util.Spliterator
     * java.util.concurrent.ConcurrentSkipListSet.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#spliterator() public java.util.Spliterator
     *      java.util.concurrent.ConcurrentSkipListSet.spliterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_spliterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#lower(Object) public E
     * java.util.concurrent.ConcurrentSkipListSet.lower(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#lower(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.lower(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#lower(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.lower(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lower_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#add(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#add(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#add(Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListSet.add(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_add_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#tailSet(Object, boolean) public
     * java.util.NavigableSet<E> java.util.concurrent.ConcurrentSkipListSet.tailSet(E,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#tailSet(Object, boolean) public
     * java.util.NavigableSet java.util.concurrent.ConcurrentSkipListSet.tailSet(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#tailSet(Object, boolean) public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListSet.tailSet(java.lang.Object,boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_tailSet_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#tailSet(Object) public java.util.NavigableSet
     * <E> java.util.concurrent.ConcurrentSkipListSet.tailSet(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#tailSet(Object) public java.util.NavigableSet
     * java.util.concurrent.ConcurrentSkipListSet.tailSet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#tailSet(Object) public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListSet.tailSet(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_tailSet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#ceiling(Object) public E
     * java.util.concurrent.ConcurrentSkipListSet.ceiling(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#ceiling(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.ceiling(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#ceiling(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.ceiling(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_ceiling_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#clear() public void
     * java.util.concurrent.ConcurrentSkipListSet.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#clear() public void
     * java.util.concurrent.ConcurrentSkipListSet.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#clear() public void
     *      java.util.concurrent.ConcurrentSkipListSet.clear() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#isEmpty() public boolean
     * java.util.concurrent.ConcurrentSkipListSet.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#isEmpty() public boolean
     * java.util.concurrent.ConcurrentSkipListSet.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#isEmpty() public boolean
     *      java.util.concurrent.ConcurrentSkipListSet.isEmpty() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#iterator() public java.util.Iterator
     * <E> java.util.concurrent.ConcurrentSkipListSet.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#iterator() public java.util.Iterator
     * java.util.concurrent.ConcurrentSkipListSet.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#iterator() public java.util.Iterator
     *      java.util.concurrent.ConcurrentSkipListSet.iterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#removeAll(java.util.Collection) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.removeAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#removeAll(java.util.Collection) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.removeAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#removeAll(java.util.Collection) public boolean
     *      java.util.concurrent.ConcurrentSkipListSet.removeAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#floor(Object) public E
     * java.util.concurrent.ConcurrentSkipListSet.floor(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#floor(Object) public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.floor(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#floor(Object) public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.floor(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_floor_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#subSet(Object, Object) public
     * java.util.NavigableSet<E> java.util.concurrent.ConcurrentSkipListSet.subSet(E,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#subSet(Object, Object) public
     * java.util.NavigableSet java.util.concurrent.ConcurrentSkipListSet.subSet(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#subSet(Object, Object) public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListSet.subSet(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_subSet_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#subSet(Object, boolean, Object, boolean) public
     * java.util.NavigableSet<E> java.util.concurrent.ConcurrentSkipListSet.subSet(E,boolean,E,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#subSet(Object, boolean, Object, boolean) public
     * java.util.NavigableSet
     * java.util.concurrent.ConcurrentSkipListSet.subSet(java.lang.Object,boolean,java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#subSet(Object, boolean, Object, boolean) public
     *      java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListSet.subSet(java.lang.Object,boolean,java.lang.Object,boolean) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_subSet_Object_boolean_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#headSet(Object, boolean) public
     * java.util.NavigableSet<E> java.util.concurrent.ConcurrentSkipListSet.headSet(E,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#headSet(Object, boolean) public
     * java.util.NavigableSet java.util.concurrent.ConcurrentSkipListSet.headSet(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#headSet(Object, boolean) public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListSet.headSet(java.lang.Object,boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_headSet_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#headSet(Object) public java.util.NavigableSet
     * <E> java.util.concurrent.ConcurrentSkipListSet.headSet(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#headSet(Object) public java.util.NavigableSet
     * java.util.concurrent.ConcurrentSkipListSet.headSet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#headSet(Object) public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListSet.headSet(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_headSet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#pollLast() public E
     * java.util.concurrent.ConcurrentSkipListSet.pollLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#pollLast() public java.lang.Object
     * java.util.concurrent.ConcurrentSkipListSet.pollLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#pollLast() public java.lang.Object
     *      java.util.concurrent.ConcurrentSkipListSet.pollLast() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_pollLast()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#remove(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#remove(Object) public boolean
     * java.util.concurrent.ConcurrentSkipListSet.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#remove(Object) public boolean
     *      java.util.concurrent.ConcurrentSkipListSet.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#descendingIterator() public java.util.Iterator
     * <E> java.util.concurrent.ConcurrentSkipListSet.descendingIterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#descendingIterator() public java.util.Iterator
     * java.util.concurrent.ConcurrentSkipListSet.descendingIterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#descendingIterator() public java.util.Iterator
     *      java.util.concurrent.ConcurrentSkipListSet.descendingIterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_descendingIterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#descendingSet() public java.util.NavigableSet
     * <E> java.util.concurrent.ConcurrentSkipListSet.descendingSet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#descendingSet() public java.util.NavigableSet
     * java.util.concurrent.ConcurrentSkipListSet.descendingSet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentSkipListSet#descendingSet() public java.util.NavigableSet
     *      java.util.concurrent.ConcurrentSkipListSet.descendingSet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_descendingSet()
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
     * <li>{@linkplain java.util.AbstractSet#containsAll(java.util.Collection) class java.util.AbstractSet}</li>
     * <li>{@linkplain java.util.Set#containsAll(java.util.Collection) interface java.util.Set}</li>
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
    public default void test_containsAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractSet#addAll(java.util.Collection) class java.util.AbstractSet}</li>
     * <li>{@linkplain java.util.Set#addAll(java.util.Collection) interface java.util.Set}</li>
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
    public default void test_addAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractSet#toArray() class java.util.AbstractSet}</li>
     * <li>{@linkplain java.util.Set#toArray() interface java.util.Set}</li>
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
    public default void test_toArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractSet#toArray(Object[]) class java.util.AbstractSet}</li>
     * <li>{@linkplain java.util.Set#toArray(Object[]) interface java.util.Set}</li>
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
    public default void test_toArray_ObjectArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractSet#retainAll(java.util.Collection) class java.util.AbstractSet}</li>
     * <li>{@linkplain java.util.Set#retainAll(java.util.Collection) interface java.util.Set}</li>
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
    public default void test_retainAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractSet#hashCode() class java.util.AbstractSet}</li>
     * <li>{@linkplain java.util.Set#hashCode() interface java.util.Set}</li>
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

}
