package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.PropertyChangeEvent class java.beans.PropertyChangeEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PropertyChangeEventClassTests}.
 * </p>
 *
 * @see java.beans.PropertyChangeEvent class java.beans.PropertyChangeEvent (the hereby targeted class-under-test class)
 * @see PropertyChangeEventClassTests PropertyChangeEventClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyChangeEventTests<SUT extends java.beans.PropertyChangeEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#getPropertyName() public java.lang.String
     * java.beans.PropertyChangeEvent.getPropertyName()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#getPropertyName() public java.lang.String
     * java.beans.PropertyChangeEvent.getPropertyName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeEvent#getPropertyName() public java.lang.String
     *      java.beans.PropertyChangeEvent.getPropertyName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#getNewValue() public java.lang.Object
     * java.beans.PropertyChangeEvent.getNewValue()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#getNewValue() public java.lang.Object
     * java.beans.PropertyChangeEvent.getNewValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeEvent#getNewValue() public java.lang.Object
     *      java.beans.PropertyChangeEvent.getNewValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNewValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#toString() public java.lang.String
     * java.beans.PropertyChangeEvent.toString()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#toString() public java.lang.String
     * java.beans.PropertyChangeEvent.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeEvent#toString() public java.lang.String java.beans.PropertyChangeEvent.toString()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.beans.PropertyChangeEvent#getPropagationId() public java.lang.Object
     * java.beans.PropertyChangeEvent.getPropagationId()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#getPropagationId() public java.lang.Object
     * java.beans.PropertyChangeEvent.getPropagationId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeEvent#getPropagationId() public java.lang.Object
     *      java.beans.PropertyChangeEvent.getPropagationId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropagationId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#getOldValue() public java.lang.Object
     * java.beans.PropertyChangeEvent.getOldValue()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#getOldValue() public java.lang.Object
     * java.beans.PropertyChangeEvent.getOldValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeEvent#getOldValue() public java.lang.Object
     *      java.beans.PropertyChangeEvent.getOldValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOldValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#setPropagationId(Object) public void
     * java.beans.PropertyChangeEvent.setPropagationId(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeEvent#setPropagationId(Object) public void
     * java.beans.PropertyChangeEvent.setPropagationId(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeEvent#setPropagationId(Object) public void
     *      java.beans.PropertyChangeEvent.setPropagationId(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPropagationId_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
