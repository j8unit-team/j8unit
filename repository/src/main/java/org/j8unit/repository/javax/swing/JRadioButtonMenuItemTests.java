package org.j8unit.repository.javax.swing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.JRadioButtonMenuItem class javax.swing.JRadioButtonMenuItem},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.JRadioButtonMenuItemClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface JRadioButtonMenuItemTests<SUT extends javax.swing.JRadioButtonMenuItem>
extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>,
        org.j8unit.repository.javax.swing.JMenuItemTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.JRadioButtonMenuItem#getUIClassID() public java.lang.String javax.swing.JRadioButtonMenuItem.getUIClassID()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getUIClassID() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JRadioButtonMenuItem#getAccessibleContext() public javax.accessibility.AccessibleContext javax.swing.JRadioButtonMenuItem.getAccessibleContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAccessibleContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
