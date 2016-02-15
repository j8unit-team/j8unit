package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.JRadioButtonMenuItem class javax.swing.JRadioButtonMenuItem}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link JRadioButtonMenuItemClassTests}.
 * </p>
 *
 * @see javax.swing.JRadioButtonMenuItem class javax.swing.JRadioButtonMenuItem (the hereby targeted class-under-test
 *      class)
 * @see JRadioButtonMenuItemClassTests JRadioButtonMenuItemClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JRadioButtonMenuItemTests<SUT extends javax.swing.JRadioButtonMenuItem>
extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, JMenuItemTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JRadioButtonMenuItem#getUIClassID() public java.lang.String
     * javax.swing.JRadioButtonMenuItem.getUIClassID()}.
     *
     * <p>
     * Test method for {@link javax.swing.JRadioButtonMenuItem#getUIClassID() public java.lang.String
     * javax.swing.JRadioButtonMenuItem.getUIClassID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JRadioButtonMenuItem#getUIClassID() public java.lang.String
     *      javax.swing.JRadioButtonMenuItem.getUIClassID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getUIClassID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JRadioButtonMenuItem#getAccessibleContext() public
     * javax.accessibility.AccessibleContext javax.swing.JRadioButtonMenuItem.getAccessibleContext()}.
     *
     * <p>
     * Test method for {@link javax.swing.JRadioButtonMenuItem#getAccessibleContext() public
     * javax.accessibility.AccessibleContext javax.swing.JRadioButtonMenuItem.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JRadioButtonMenuItem#getAccessibleContext() public javax.accessibility.AccessibleContext
     *      javax.swing.JRadioButtonMenuItem.getAccessibleContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
