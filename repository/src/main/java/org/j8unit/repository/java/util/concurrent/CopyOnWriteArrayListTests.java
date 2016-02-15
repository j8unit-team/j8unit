package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.CopyOnWriteArrayList class
 * java.util.concurrent.CopyOnWriteArrayList}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CopyOnWriteArrayListClassTests}.
 * </p>
 *
 * @see java.util.concurrent.CopyOnWriteArrayList class java.util.concurrent.CopyOnWriteArrayList (the hereby targeted
 *      class-under-test class)
 * @see CopyOnWriteArrayListClassTests CopyOnWriteArrayListClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CopyOnWriteArrayListTests<SUT extends java.util.concurrent.CopyOnWriteArrayList<E>, E>
extends org.j8unit.repository.java.util.ListTests<SUT, E>, org.j8unit.repository.java.util.RandomAccessTests<SUT>,
org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#retainAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.retainAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#retainAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.retainAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#retainAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.retainAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_retainAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addIfAbsent(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.addIfAbsent(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addIfAbsent(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.addIfAbsent(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#addIfAbsent(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.addIfAbsent(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addIfAbsent_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#toString() public java.lang.String
     * java.util.concurrent.CopyOnWriteArrayList.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#toString() public java.lang.String
     * java.util.concurrent.CopyOnWriteArrayList.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#toString() public java.lang.String
     *      java.util.concurrent.CopyOnWriteArrayList.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#listIterator() public java.util.ListIterator
     * <E> java.util.concurrent.CopyOnWriteArrayList.listIterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#listIterator() public java.util.ListIterator
     * java.util.concurrent.CopyOnWriteArrayList.listIterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#listIterator() public java.util.ListIterator
     *      java.util.concurrent.CopyOnWriteArrayList.listIterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_listIterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#listIterator(int) public java.util.ListIterator
     * <E> java.util.concurrent.CopyOnWriteArrayList.listIterator(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#listIterator(int) public java.util.ListIterator
     * java.util.concurrent.CopyOnWriteArrayList.listIterator(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#listIterator(int) public java.util.ListIterator
     *      java.util.concurrent.CopyOnWriteArrayList.listIterator(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_listIterator_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#clone() public java.lang.Object
     * java.util.concurrent.CopyOnWriteArrayList.clone()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#clone() public java.lang.Object
     * java.util.concurrent.CopyOnWriteArrayList.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#clone() public java.lang.Object
     *      java.util.concurrent.CopyOnWriteArrayList.clone() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#equals(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#equals(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#equals(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.addAll(java.util.Collection<? extends E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.addAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#addAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.addAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addAll(int, java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.addAll(int,java.util.Collection<? extends E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addAll(int, java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.addAll(int,java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#addAll(int, java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.addAll(int,java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addAll_int_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#size() public int
     * java.util.concurrent.CopyOnWriteArrayList.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#size() public int
     * java.util.concurrent.CopyOnWriteArrayList.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#size() public int java.util.concurrent.CopyOnWriteArrayList.size()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#contains(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#contains(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#contains(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.contains(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#lastIndexOf(Object) public int
     * java.util.concurrent.CopyOnWriteArrayList.lastIndexOf(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#lastIndexOf(Object) public int
     * java.util.concurrent.CopyOnWriteArrayList.lastIndexOf(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#lastIndexOf(Object) public int
     *      java.util.concurrent.CopyOnWriteArrayList.lastIndexOf(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lastIndexOf_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#lastIndexOf(Object, int) public int
     * java.util.concurrent.CopyOnWriteArrayList.lastIndexOf(E,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#lastIndexOf(Object, int) public int
     * java.util.concurrent.CopyOnWriteArrayList.lastIndexOf(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#lastIndexOf(Object, int) public int
     *      java.util.concurrent.CopyOnWriteArrayList.lastIndexOf(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lastIndexOf_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#removeIf(java.util.function.Predicate) public
     * boolean java.util.concurrent.CopyOnWriteArrayList.removeIf(java.util.function.Predicate<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#removeIf(java.util.function.Predicate) public
     * boolean java.util.concurrent.CopyOnWriteArrayList.removeIf(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#removeIf(java.util.function.Predicate) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.removeIf(java.util.function.Predicate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeIf_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#sort(java.util.Comparator) public void
     * java.util.concurrent.CopyOnWriteArrayList.sort(java.util.Comparator<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#sort(java.util.Comparator) public void
     * java.util.concurrent.CopyOnWriteArrayList.sort(java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#sort(java.util.Comparator) public void
     *      java.util.concurrent.CopyOnWriteArrayList.sort(java.util.Comparator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_sort_Comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#clear() public void
     * java.util.concurrent.CopyOnWriteArrayList.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#clear() public void
     * java.util.concurrent.CopyOnWriteArrayList.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#clear() public void
     *      java.util.concurrent.CopyOnWriteArrayList.clear() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#isEmpty() public boolean
     * java.util.concurrent.CopyOnWriteArrayList.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#isEmpty() public boolean
     * java.util.concurrent.CopyOnWriteArrayList.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#isEmpty() public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.isEmpty() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#containsAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.containsAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#containsAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.containsAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#containsAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.containsAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_containsAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#forEach(java.util.function.Consumer) public void
     * java.util.concurrent.CopyOnWriteArrayList.forEach(java.util.function.Consumer<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#forEach(java.util.function.Consumer) public void
     * java.util.concurrent.CopyOnWriteArrayList.forEach(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#forEach(java.util.function.Consumer) public void
     *      java.util.concurrent.CopyOnWriteArrayList.forEach(java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_forEach_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#spliterator() public java.util.Spliterator
     * <E> java.util.concurrent.CopyOnWriteArrayList.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#spliterator() public java.util.Spliterator
     * java.util.concurrent.CopyOnWriteArrayList.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#spliterator() public java.util.Spliterator
     *      java.util.concurrent.CopyOnWriteArrayList.spliterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#set(int, Object) public E
     * java.util.concurrent.CopyOnWriteArrayList.set(int,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#set(int, Object) public java.lang.Object
     * java.util.concurrent.CopyOnWriteArrayList.set(int,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#set(int, Object) public java.lang.Object
     *      java.util.concurrent.CopyOnWriteArrayList.set(int,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_set_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#subList(int, int) public java.util.List
     * <E> java.util.concurrent.CopyOnWriteArrayList.subList(int,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#subList(int, int) public java.util.List
     * java.util.concurrent.CopyOnWriteArrayList.subList(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#subList(int, int) public java.util.List
     *      java.util.concurrent.CopyOnWriteArrayList.subList(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_subList_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#add(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#add(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#add(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.add(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#add(int, Object) public void
     * java.util.concurrent.CopyOnWriteArrayList.add(int,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#add(int, Object) public void
     * java.util.concurrent.CopyOnWriteArrayList.add(int,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#add(int, Object) public void
     *      java.util.concurrent.CopyOnWriteArrayList.add(int,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_add_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#indexOf(Object, int) public int
     * java.util.concurrent.CopyOnWriteArrayList.indexOf(E,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#indexOf(Object, int) public int
     * java.util.concurrent.CopyOnWriteArrayList.indexOf(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#indexOf(Object, int) public int
     *      java.util.concurrent.CopyOnWriteArrayList.indexOf(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_indexOf_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#indexOf(Object) public int
     * java.util.concurrent.CopyOnWriteArrayList.indexOf(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#indexOf(Object) public int
     * java.util.concurrent.CopyOnWriteArrayList.indexOf(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#indexOf(Object) public int
     *      java.util.concurrent.CopyOnWriteArrayList.indexOf(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_indexOf_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#toArray() public java.lang.Object[]
     * java.util.concurrent.CopyOnWriteArrayList.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#toArray() public java.lang.Object[]
     * java.util.concurrent.CopyOnWriteArrayList.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#toArray() public java.lang.Object[]
     *      java.util.concurrent.CopyOnWriteArrayList.toArray() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#toArray(Object[]) public <T> T[]
     * java.util.concurrent.CopyOnWriteArrayList.toArray(T[])}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#toArray(Object[]) public java.lang.Object[]
     * java.util.concurrent.CopyOnWriteArrayList.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#toArray(Object[]) public java.lang.Object[]
     *      java.util.concurrent.CopyOnWriteArrayList.toArray(java.lang.Object[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toArray_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#get(int) public E
     * java.util.concurrent.CopyOnWriteArrayList.get(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#get(int) public java.lang.Object
     * java.util.concurrent.CopyOnWriteArrayList.get(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#get(int) public java.lang.Object
     *      java.util.concurrent.CopyOnWriteArrayList.get(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#hashCode() public int
     * java.util.concurrent.CopyOnWriteArrayList.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#hashCode() public int
     * java.util.concurrent.CopyOnWriteArrayList.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#hashCode() public int
     *      java.util.concurrent.CopyOnWriteArrayList.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#iterator() public java.util.Iterator
     * <E> java.util.concurrent.CopyOnWriteArrayList.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#iterator() public java.util.Iterator
     * java.util.concurrent.CopyOnWriteArrayList.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#iterator() public java.util.Iterator
     *      java.util.concurrent.CopyOnWriteArrayList.iterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#removeAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.removeAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#removeAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.removeAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#removeAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.removeAll(java.util.Collection) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#remove(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#remove(Object) public boolean
     * java.util.concurrent.CopyOnWriteArrayList.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#remove(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArrayList.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#remove(int) public E
     * java.util.concurrent.CopyOnWriteArrayList.remove(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#remove(int) public java.lang.Object
     * java.util.concurrent.CopyOnWriteArrayList.remove(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#remove(int) public java.lang.Object
     *      java.util.concurrent.CopyOnWriteArrayList.remove(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#replaceAll(java.util.function.UnaryOperator)
     * public void java.util.concurrent.CopyOnWriteArrayList.replaceAll(java.util.function.UnaryOperator<E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#replaceAll(java.util.function.UnaryOperator)
     * public void java.util.concurrent.CopyOnWriteArrayList.replaceAll(java.util.function.UnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#replaceAll(java.util.function.UnaryOperator) public void
     *      java.util.concurrent.CopyOnWriteArrayList.replaceAll(java.util.function.UnaryOperator) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_replaceAll_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addAllAbsent(java.util.Collection) public int
     * java.util.concurrent.CopyOnWriteArrayList.addAllAbsent(java.util.Collection<? extends E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArrayList#addAllAbsent(java.util.Collection) public int
     * java.util.concurrent.CopyOnWriteArrayList.addAllAbsent(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArrayList#addAllAbsent(java.util.Collection) public int
     *      java.util.concurrent.CopyOnWriteArrayList.addAllAbsent(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAllAbsent_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
