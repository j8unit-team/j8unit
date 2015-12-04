package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicRootPaneUI class javax.swing.plaf.basic.BasicRootPaneUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicRootPaneUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicRootPaneUITests<SUT extends javax.swing.plaf.basic.BasicRootPaneUI>
extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>,
        org.j8unit.repository.javax.swing.plaf.RootPaneUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicRootPaneUI#installUI(javax.swing.JComponent) public void javax.swing.plaf.basic.BasicRootPaneUI.installUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_installUI_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicRootPaneUI#uninstallUI(javax.swing.JComponent) public void javax.swing.plaf.basic.BasicRootPaneUI.uninstallUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninstallUI_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicRootPaneUI#propertyChange(java.beans.PropertyChangeEvent) public void javax.swing.plaf.basic.BasicRootPaneUI.propertyChange(java.beans.PropertyChangeEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_propertyChange_PropertyChangeEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
