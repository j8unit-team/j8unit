package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicStampedReference class
 * java.util.concurrent.atomic.AtomicStampedReference}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AtomicStampedReferenceClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicStampedReference class java.util.concurrent.atomic.AtomicStampedReference (the
 *      hereby targeted class-under-test class)
 * @see AtomicStampedReferenceClassTests AtomicStampedReferenceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicStampedReferenceTests<SUT extends java.util.concurrent.atomic.AtomicStampedReference<V>, V>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#set(Object, int) public void
     * java.util.concurrent.atomic.AtomicStampedReference.set(V,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#set(Object, int) public void
     * java.util.concurrent.atomic.AtomicStampedReference.set(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicStampedReference#set(Object, int) public void
     *      java.util.concurrent.atomic.AtomicStampedReference.set(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#compareAndSet(Object, Object, int, int)
     * public boolean java.util.concurrent.atomic.AtomicStampedReference.compareAndSet(V,V,int,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#compareAndSet(Object, Object, int, int)
     * public boolean
     * java.util.concurrent.atomic.AtomicStampedReference.compareAndSet(java.lang.Object,java.lang.Object,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicStampedReference#compareAndSet(Object, Object, int, int) public boolean
     *      java.util.concurrent.atomic.AtomicStampedReference.compareAndSet(java.lang.Object,java.lang.Object,int,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_Object_Object_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicStampedReference#weakCompareAndSet(Object, Object, int, int) public
     * boolean java.util.concurrent.atomic.AtomicStampedReference.weakCompareAndSet(V,V,int,int)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicStampedReference#weakCompareAndSet(Object, Object, int, int) public
     * boolean
     * java.util.concurrent.atomic.AtomicStampedReference.weakCompareAndSet(java.lang.Object,java.lang.Object,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicStampedReference#weakCompareAndSet(Object, Object, int, int) public
     *      boolean
     *      java.util.concurrent.atomic.AtomicStampedReference.weakCompareAndSet(java.lang.Object,java.lang.Object,int,
     *      int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_Object_Object_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#getStamp() public int
     * java.util.concurrent.atomic.AtomicStampedReference.getStamp()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#getStamp() public int
     * java.util.concurrent.atomic.AtomicStampedReference.getStamp()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicStampedReference#getStamp() public int
     *      java.util.concurrent.atomic.AtomicStampedReference.getStamp() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStamp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#get(int[]) public V
     * java.util.concurrent.atomic.AtomicStampedReference.get(int[])}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#get(int[]) public java.lang.Object
     * java.util.concurrent.atomic.AtomicStampedReference.get(int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicStampedReference#get(int[]) public java.lang.Object
     *      java.util.concurrent.atomic.AtomicStampedReference.get(int[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_intArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#getReference() public V
     * java.util.concurrent.atomic.AtomicStampedReference.getReference()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#getReference() public java.lang.Object
     * java.util.concurrent.atomic.AtomicStampedReference.getReference()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicStampedReference#getReference() public java.lang.Object
     *      java.util.concurrent.atomic.AtomicStampedReference.getReference() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#attemptStamp(Object, int) public
     * boolean java.util.concurrent.atomic.AtomicStampedReference.attemptStamp(V,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicStampedReference#attemptStamp(Object, int) public
     * boolean java.util.concurrent.atomic.AtomicStampedReference.attemptStamp(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicStampedReference#attemptStamp(Object, int) public boolean
     *      java.util.concurrent.atomic.AtomicStampedReference.attemptStamp(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_attemptStamp_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
