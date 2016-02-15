package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.ref.ReferenceQueue class java.lang.ref.ReferenceQueue}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ReferenceQueueClassTests}.
 * </p>
 *
 * @see java.lang.ref.ReferenceQueue class java.lang.ref.ReferenceQueue (the hereby targeted class-under-test class)
 * @see ReferenceQueueClassTests ReferenceQueueClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReferenceQueueTests<SUT extends java.lang.ref.ReferenceQueue<T>, T>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.ref.ReferenceQueue#remove(long) public java.lang.ref.Reference<? extends T>
     * java.lang.ref.ReferenceQueue.remove(long) throws
     * java.lang.IllegalArgumentException,java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.lang.ref.ReferenceQueue#remove(long) public java.lang.ref.Reference
     * java.lang.ref.ReferenceQueue.remove(long) throws
     * java.lang.IllegalArgumentException,java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.ReferenceQueue#remove(long) public java.lang.ref.Reference
     *      java.lang.ref.ReferenceQueue.remove(long) throws
     *      java.lang.IllegalArgumentException,java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.ref.ReferenceQueue#remove() public java.lang.ref.Reference<? extends T>
     * java.lang.ref.ReferenceQueue.remove() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.lang.ref.ReferenceQueue#remove() public java.lang.ref.Reference
     * java.lang.ref.ReferenceQueue.remove() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.ReferenceQueue#remove() public java.lang.ref.Reference java.lang.ref.ReferenceQueue.remove()
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.ref.ReferenceQueue#poll() public java.lang.ref.Reference<? extends T>
     * java.lang.ref.ReferenceQueue.poll()}.
     *
     * <p>
     * Test method for {@link java.lang.ref.ReferenceQueue#poll() public java.lang.ref.Reference
     * java.lang.ref.ReferenceQueue.poll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.ReferenceQueue#poll() public java.lang.ref.Reference java.lang.ref.ReferenceQueue.poll() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_poll()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
