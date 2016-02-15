package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.PopupFactory class javax.swing.PopupFactory}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PopupFactoryClassTests}.
 * </p>
 *
 * @see javax.swing.PopupFactory class javax.swing.PopupFactory (the hereby targeted class-under-test class)
 * @see PopupFactoryClassTests PopupFactoryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PopupFactoryTests<SUT extends javax.swing.PopupFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.PopupFactory#getPopup(java.awt.Component, java.awt.Component, int, int) public
     * javax.swing.Popup javax.swing.PopupFactory.getPopup(java.awt.Component,java.awt.Component,int,int) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.swing.PopupFactory#getPopup(java.awt.Component, java.awt.Component, int, int) public
     * javax.swing.Popup javax.swing.PopupFactory.getPopup(java.awt.Component,java.awt.Component,int,int) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.PopupFactory#getPopup(java.awt.Component, java.awt.Component, int, int) public javax.swing.Popup
     *      javax.swing.PopupFactory.getPopup(java.awt.Component,java.awt.Component,int,int) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPopup_Component_Component_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
