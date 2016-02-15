package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.CopyOnWriteArraySet class
 * java.util.concurrent.CopyOnWriteArraySet}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CopyOnWriteArraySetClassTests}.
 * </p>
 *
 * @see java.util.concurrent.CopyOnWriteArraySet class java.util.concurrent.CopyOnWriteArraySet (the hereby targeted
 *      class-under-test class)
 * @see CopyOnWriteArraySetClassTests CopyOnWriteArraySetClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CopyOnWriteArraySetTests<SUT extends java.util.concurrent.CopyOnWriteArraySet<E>, E>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.util.AbstractSetTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#remove(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#remove(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#remove(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#removeIf(java.util.function.Predicate) public
     * boolean java.util.concurrent.CopyOnWriteArraySet.removeIf(java.util.function.Predicate<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#removeIf(java.util.function.Predicate) public
     * boolean java.util.concurrent.CopyOnWriteArraySet.removeIf(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#removeIf(java.util.function.Predicate) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.removeIf(java.util.function.Predicate) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#clear() public void
     * java.util.concurrent.CopyOnWriteArraySet.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#clear() public void
     * java.util.concurrent.CopyOnWriteArraySet.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#clear() public void
     *      java.util.concurrent.CopyOnWriteArraySet.clear() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#isEmpty() public boolean
     * java.util.concurrent.CopyOnWriteArraySet.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#isEmpty() public boolean
     * java.util.concurrent.CopyOnWriteArraySet.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#isEmpty() public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.isEmpty() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#spliterator() public java.util.Spliterator
     * <E> java.util.concurrent.CopyOnWriteArraySet.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#spliterator() public java.util.Spliterator
     * java.util.concurrent.CopyOnWriteArraySet.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#spliterator() public java.util.Spliterator
     *      java.util.concurrent.CopyOnWriteArraySet.spliterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#forEach(java.util.function.Consumer) public void
     * java.util.concurrent.CopyOnWriteArraySet.forEach(java.util.function.Consumer<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#forEach(java.util.function.Consumer) public void
     * java.util.concurrent.CopyOnWriteArraySet.forEach(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#forEach(java.util.function.Consumer) public void
     *      java.util.concurrent.CopyOnWriteArraySet.forEach(java.util.function.Consumer) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#containsAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.containsAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#containsAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.containsAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#containsAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.containsAll(java.util.Collection) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#add(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#add(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#add(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.add(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#retainAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.retainAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#retainAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.retainAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#retainAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.retainAll(java.util.Collection) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#toArray(Object[]) public <T> T[]
     * java.util.concurrent.CopyOnWriteArraySet.toArray(T[])}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#toArray(Object[]) public java.lang.Object[]
     * java.util.concurrent.CopyOnWriteArraySet.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#toArray(Object[]) public java.lang.Object[]
     *      java.util.concurrent.CopyOnWriteArraySet.toArray(java.lang.Object[]) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#toArray() public java.lang.Object[]
     * java.util.concurrent.CopyOnWriteArraySet.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#toArray() public java.lang.Object[]
     * java.util.concurrent.CopyOnWriteArraySet.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#toArray() public java.lang.Object[]
     *      java.util.concurrent.CopyOnWriteArraySet.toArray() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#size() public int
     * java.util.concurrent.CopyOnWriteArraySet.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#size() public int
     * java.util.concurrent.CopyOnWriteArraySet.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#size() public int java.util.concurrent.CopyOnWriteArraySet.size()
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#addAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.addAll(java.util.Collection<? extends E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#addAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.addAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#addAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.addAll(java.util.Collection) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#equals(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#equals(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#equals(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#contains(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#contains(Object) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#contains(Object) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.contains(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#iterator() public java.util.Iterator
     * <E> java.util.concurrent.CopyOnWriteArraySet.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#iterator() public java.util.Iterator
     * java.util.concurrent.CopyOnWriteArraySet.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#iterator() public java.util.Iterator
     *      java.util.concurrent.CopyOnWriteArraySet.iterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#removeAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.removeAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CopyOnWriteArraySet#removeAll(java.util.Collection) public boolean
     * java.util.concurrent.CopyOnWriteArraySet.removeAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CopyOnWriteArraySet#removeAll(java.util.Collection) public boolean
     *      java.util.concurrent.CopyOnWriteArraySet.removeAll(java.util.Collection) (the hereby targeted
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

}
