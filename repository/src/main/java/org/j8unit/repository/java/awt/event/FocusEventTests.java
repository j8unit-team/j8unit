package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.event.FocusEvent class java.awt.event.FocusEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FocusEventClassTests}.
 * </p>
 *
 * @see java.awt.event.FocusEvent class java.awt.event.FocusEvent (the hereby targeted class-under-test class)
 * @see FocusEventClassTests FocusEventClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FocusEventTests<SUT extends java.awt.event.FocusEvent>
extends ComponentEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.FocusEvent#paramString() public java.lang.String
     * java.awt.event.FocusEvent.paramString()}.
     *
     * <p>
     * Test method for {@link java.awt.event.FocusEvent#paramString() public java.lang.String
     * java.awt.event.FocusEvent.paramString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.FocusEvent#paramString() public java.lang.String java.awt.event.FocusEvent.paramString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.awt.event.FocusEvent#getOppositeComponent() public java.awt.Component
     * java.awt.event.FocusEvent.getOppositeComponent()}.
     *
     * <p>
     * Test method for {@link java.awt.event.FocusEvent#getOppositeComponent() public java.awt.Component
     * java.awt.event.FocusEvent.getOppositeComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.FocusEvent#getOppositeComponent() public java.awt.Component
     *      java.awt.event.FocusEvent.getOppositeComponent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOppositeComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.FocusEvent#isTemporary() public boolean
     * java.awt.event.FocusEvent.isTemporary()}.
     *
     * <p>
     * Test method for {@link java.awt.event.FocusEvent#isTemporary() public boolean
     * java.awt.event.FocusEvent.isTemporary()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.FocusEvent#isTemporary() public boolean java.awt.event.FocusEvent.isTemporary() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTemporary()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
