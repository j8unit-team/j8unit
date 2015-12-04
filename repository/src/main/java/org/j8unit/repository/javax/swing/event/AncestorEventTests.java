package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.AncestorEvent class javax.swing.event.AncestorEvent}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.AncestorEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AncestorEventTests<SUT extends javax.swing.event.AncestorEvent>
extends org.j8unit.repository.java.awt.AWTEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.AncestorEvent#getComponent() public javax.swing.JComponent
     * javax.swing.event.AncestorEvent.getComponent()}.
     * </p>
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
     * </p>
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
     * </p>
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
