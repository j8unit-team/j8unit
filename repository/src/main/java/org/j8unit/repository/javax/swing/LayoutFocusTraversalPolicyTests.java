package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.LayoutFocusTraversalPolicy class javax.swing.LayoutFocusTraversalPolicy},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.LayoutFocusTraversalPolicyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LayoutFocusTraversalPolicyTests<SUT extends javax.swing.LayoutFocusTraversalPolicy>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.javax.swing.SortingFocusTraversalPolicyTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.LayoutFocusTraversalPolicy#getComponentAfter(java.awt.Container,java.awt.Component) public
     * java.awt.Component
     * javax.swing.LayoutFocusTraversalPolicy.getComponentAfter(java.awt.Container,java.awt.Component)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getComponentAfter_Container_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.LayoutFocusTraversalPolicy#getComponentBefore(java.awt.Container,java.awt.Component) public
     * java.awt.Component
     * javax.swing.LayoutFocusTraversalPolicy.getComponentBefore(java.awt.Container,java.awt.Component)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getComponentBefore_Container_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.LayoutFocusTraversalPolicy#getFirstComponent(java.awt.Container) public
     * java.awt.Component javax.swing.LayoutFocusTraversalPolicy.getFirstComponent(java.awt.Container)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getFirstComponent_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.LayoutFocusTraversalPolicy#getLastComponent(java.awt.Container) public
     * java.awt.Component javax.swing.LayoutFocusTraversalPolicy.getLastComponent(java.awt.Container)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLastComponent_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
