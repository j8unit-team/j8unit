package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.AWTEvent class java.awt.AWTEvent}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link AWTEventClassTests}.
 * </p>
 *
 * @see java.awt.AWTEvent class java.awt.AWTEvent (the hereby targeted class-under-test class)
 * @see AWTEventClassTests AWTEventClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTEventTests<SUT extends java.awt.AWTEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.AWTEvent#paramString() public java.lang.String java.awt.AWTEvent.paramString()}.
     *
     * <p>
     * Test method for {@link java.awt.AWTEvent#paramString() public java.lang.String java.awt.AWTEvent.paramString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.AWTEvent#paramString() public java.lang.String java.awt.AWTEvent.paramString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paramString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.AWTEvent#setSource(Object) public void
     * java.awt.AWTEvent.setSource(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.awt.AWTEvent#setSource(Object) public void
     * java.awt.AWTEvent.setSource(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.AWTEvent#setSource(Object) public void java.awt.AWTEvent.setSource(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSource_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.AWTEvent#toString() public java.lang.String java.awt.AWTEvent.toString()}.
     *
     * <p>
     * Test method for {@link java.awt.AWTEvent#toString() public java.lang.String java.awt.AWTEvent.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.AWTEvent#toString() public java.lang.String java.awt.AWTEvent.toString() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.awt.AWTEvent#getID() public int java.awt.AWTEvent.getID()}.
     *
     * <p>
     * Test method for {@link java.awt.AWTEvent#getID() public int java.awt.AWTEvent.getID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.AWTEvent#getID() public int java.awt.AWTEvent.getID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
