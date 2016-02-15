package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.AncestorEvent class javax.swing.event.AncestorEvent}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link AncestorEventClassTests}.
 * </p>
 *
 * @see javax.swing.event.AncestorEvent class javax.swing.event.AncestorEvent (the hereby targeted class-under-test
 *      class)
 * @see AncestorEventClassTests AncestorEventClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AncestorEventTests<SUT extends javax.swing.event.AncestorEvent>
extends org.j8unit.repository.java.awt.AWTEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.AncestorEvent#getComponent() public javax.swing.JComponent
     * javax.swing.event.AncestorEvent.getComponent()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.AncestorEvent#getComponent() public javax.swing.JComponent
     * javax.swing.event.AncestorEvent.getComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.AncestorEvent#getComponent() public javax.swing.JComponent
     *      javax.swing.event.AncestorEvent.getComponent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.AncestorEvent#getAncestor() public java.awt.Container
     * javax.swing.event.AncestorEvent.getAncestor()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.AncestorEvent#getAncestor() public java.awt.Container
     * javax.swing.event.AncestorEvent.getAncestor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.AncestorEvent#getAncestor() public java.awt.Container
     *      javax.swing.event.AncestorEvent.getAncestor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAncestor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.AncestorEvent#getAncestorParent() public java.awt.Container
     * javax.swing.event.AncestorEvent.getAncestorParent()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.AncestorEvent#getAncestorParent() public java.awt.Container
     * javax.swing.event.AncestorEvent.getAncestorParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.AncestorEvent#getAncestorParent() public java.awt.Container
     *      javax.swing.event.AncestorEvent.getAncestorParent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAncestorParent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
