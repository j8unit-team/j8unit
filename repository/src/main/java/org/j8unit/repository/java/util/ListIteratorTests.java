package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.ListIterator interface java.util.ListIterator}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ListIteratorClassTests}.
 * </p>
 *
 * @see java.util.ListIterator interface java.util.ListIterator (the hereby targeted class-under-test class)
 * @see ListIteratorClassTests ListIteratorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListIteratorTests<SUT extends java.util.ListIterator<E>, E>
extends IteratorTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#previous() public abstract E java.util.ListIterator.previous()}.
     *
     * <p>
     * Test method for {@link java.util.ListIterator#previous() public abstract java.lang.Object
     * java.util.ListIterator.previous()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#previous() public abstract java.lang.Object java.util.ListIterator.previous() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previous()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#add(Object) public abstract void java.util.ListIterator.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.ListIterator#add(Object) public abstract void
     * java.util.ListIterator.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#add(Object) public abstract void java.util.ListIterator.add(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.ListIterator#next() public abstract E java.util.ListIterator.next()}.
     *
     * <p>
     * Test method for {@link java.util.ListIterator#next() public abstract java.lang.Object
     * java.util.ListIterator.next()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#next() public abstract java.lang.Object java.util.ListIterator.next() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_next()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#set(Object) public abstract void java.util.ListIterator.set(E)}.
     *
     * <p>
     * Test method for {@link java.util.ListIterator#set(Object) public abstract void
     * java.util.ListIterator.set(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#set(Object) public abstract void java.util.ListIterator.set(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#remove() public abstract void java.util.ListIterator.remove()}.
     *
     * <p>
     * Test method for {@link java.util.ListIterator#remove() public abstract void java.util.ListIterator.remove()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#remove() public abstract void java.util.ListIterator.remove() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#previousIndex() public abstract int
     * java.util.ListIterator.previousIndex()}.
     *
     * <p>
     * Test method for {@link java.util.ListIterator#previousIndex() public abstract int
     * java.util.ListIterator.previousIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#previousIndex() public abstract int java.util.ListIterator.previousIndex() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previousIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#hasPrevious() public abstract boolean
     * java.util.ListIterator.hasPrevious()}.
     *
     * <p>
     * Test method for {@link java.util.ListIterator#hasPrevious() public abstract boolean
     * java.util.ListIterator.hasPrevious()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#hasPrevious() public abstract boolean java.util.ListIterator.hasPrevious() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasPrevious()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#nextIndex() public abstract int java.util.ListIterator.nextIndex()}
     * .
     *
     * <p>
     * Test method for {@link java.util.ListIterator#nextIndex() public abstract int java.util.ListIterator.nextIndex()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#nextIndex() public abstract int java.util.ListIterator.nextIndex() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListIterator#hasNext() public abstract boolean java.util.ListIterator.hasNext()}
     * .
     *
     * <p>
     * Test method for {@link java.util.ListIterator#hasNext() public abstract boolean java.util.ListIterator.hasNext()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListIterator#hasNext() public abstract boolean java.util.ListIterator.hasNext() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hasNext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
