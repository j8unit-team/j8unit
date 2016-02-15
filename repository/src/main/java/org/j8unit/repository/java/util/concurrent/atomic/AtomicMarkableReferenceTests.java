package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicMarkableReference class
 * java.util.concurrent.atomic.AtomicMarkableReference}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AtomicMarkableReferenceClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicMarkableReference class java.util.concurrent.atomic.AtomicMarkableReference
 *      (the hereby targeted class-under-test class)
 * @see AtomicMarkableReferenceClassTests AtomicMarkableReferenceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicMarkableReferenceTests<SUT extends java.util.concurrent.atomic.AtomicMarkableReference<V>, V>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#getReference() public V
     * java.util.concurrent.atomic.AtomicMarkableReference.getReference()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#getReference() public java.lang.Object
     * java.util.concurrent.atomic.AtomicMarkableReference.getReference()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicMarkableReference#getReference() public java.lang.Object
     *      java.util.concurrent.atomic.AtomicMarkableReference.getReference() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReference()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#isMarked() public boolean
     * java.util.concurrent.atomic.AtomicMarkableReference.isMarked()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#isMarked() public boolean
     * java.util.concurrent.atomic.AtomicMarkableReference.isMarked()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicMarkableReference#isMarked() public boolean
     *      java.util.concurrent.atomic.AtomicMarkableReference.isMarked() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMarked()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#attemptMark(Object, boolean) public
     * boolean java.util.concurrent.atomic.AtomicMarkableReference.attemptMark(V,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#attemptMark(Object, boolean) public
     * boolean java.util.concurrent.atomic.AtomicMarkableReference.attemptMark(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicMarkableReference#attemptMark(Object, boolean) public boolean
     *      java.util.concurrent.atomic.AtomicMarkableReference.attemptMark(java.lang.Object,boolean) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_attemptMark_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicMarkableReference#compareAndSet(Object, Object, boolean, boolean) public
     * boolean java.util.concurrent.atomic.AtomicMarkableReference.compareAndSet(V,V,boolean,boolean)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicMarkableReference#compareAndSet(Object, Object, boolean, boolean) public
     * boolean
     * java.util.concurrent.atomic.AtomicMarkableReference.compareAndSet(java.lang.Object,java.lang.Object,boolean,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicMarkableReference#compareAndSet(Object, Object, boolean, boolean) public
     *      boolean
     *      java.util.concurrent.atomic.AtomicMarkableReference.compareAndSet(java.lang.Object,java.lang.Object,boolean,
     *      boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_Object_Object_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicMarkableReference#weakCompareAndSet(Object, Object, boolean, boolean)
     * public boolean java.util.concurrent.atomic.AtomicMarkableReference.weakCompareAndSet(V,V,boolean,boolean)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicMarkableReference#weakCompareAndSet(Object, Object, boolean, boolean)
     * public boolean
     * java.util.concurrent.atomic.AtomicMarkableReference.weakCompareAndSet(java.lang.Object,java.lang.Object,boolean,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicMarkableReference#weakCompareAndSet(Object, Object, boolean, boolean)
     *      public boolean
     *      java.util.concurrent.atomic.AtomicMarkableReference.weakCompareAndSet(java.lang.Object,java.lang.Object,
     *      boolean,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_Object_Object_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#get(boolean[]) public V
     * java.util.concurrent.atomic.AtomicMarkableReference.get(boolean[])}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#get(boolean[]) public java.lang.Object
     * java.util.concurrent.atomic.AtomicMarkableReference.get(boolean[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicMarkableReference#get(boolean[]) public java.lang.Object
     *      java.util.concurrent.atomic.AtomicMarkableReference.get(boolean[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_booleanArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#set(Object, boolean) public void
     * java.util.concurrent.atomic.AtomicMarkableReference.set(V,boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicMarkableReference#set(Object, boolean) public void
     * java.util.concurrent.atomic.AtomicMarkableReference.set(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicMarkableReference#set(Object, boolean) public void
     *      java.util.concurrent.atomic.AtomicMarkableReference.set(java.lang.Object,boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
