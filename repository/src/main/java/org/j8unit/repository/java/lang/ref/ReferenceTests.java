package org.j8unit.repository.java.lang.ref;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.ref.Reference class java.lang.ref.Reference}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ReferenceClassTests}.
 * </p>
 *
 * @see java.lang.ref.Reference class java.lang.ref.Reference (the hereby targeted class-under-test class)
 * @see ReferenceClassTests ReferenceClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReferenceTests<SUT extends java.lang.ref.Reference<T>, T>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.ref.Reference#enqueue() public boolean java.lang.ref.Reference.enqueue()}.
     *
     * <p>
     * Test method for {@link java.lang.ref.Reference#enqueue() public boolean java.lang.ref.Reference.enqueue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.Reference#enqueue() public boolean java.lang.ref.Reference.enqueue() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enqueue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.ref.Reference#get() public T java.lang.ref.Reference.get()}.
     *
     * <p>
     * Test method for {@link java.lang.ref.Reference#get() public java.lang.Object java.lang.ref.Reference.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.Reference#get() public java.lang.Object java.lang.ref.Reference.get() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.ref.Reference#clear() public void java.lang.ref.Reference.clear()}.
     *
     * <p>
     * Test method for {@link java.lang.ref.Reference#clear() public void java.lang.ref.Reference.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.Reference#clear() public void java.lang.ref.Reference.clear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.ref.Reference#isEnqueued() public boolean java.lang.ref.Reference.isEnqueued()}.
     *
     * <p>
     * Test method for {@link java.lang.ref.Reference#isEnqueued() public boolean java.lang.ref.Reference.isEnqueued()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.ref.Reference#isEnqueued() public boolean java.lang.ref.Reference.isEnqueued() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEnqueued()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
