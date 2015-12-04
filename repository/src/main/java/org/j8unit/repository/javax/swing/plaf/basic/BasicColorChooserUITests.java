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
 * Test class for {@link javax.swing.plaf.basic.BasicColorChooserUI class javax.swing.plaf.basic.BasicColorChooserUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicColorChooserUITests<SUT extends javax.swing.plaf.basic.BasicColorChooserUI>
extends org.j8unit.repository.javax.swing.plaf.ColorChooserUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#installUI(javax.swing.JComponent) public void javax.swing.plaf.basic.BasicColorChooserUI.installUI(javax.swing.JComponent)}.
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
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#uninstallUI(javax.swing.JComponent) public void javax.swing.plaf.basic.BasicColorChooserUI.uninstallUI(javax.swing.JComponent)}.
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
     * Test class for {@link javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler class javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUIClassTests.PropertyHandlerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyHandlerTests<SUT extends javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>,
            org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler#propertyChange(java.beans.PropertyChangeEvent) public void javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler.propertyChange(java.beans.PropertyChangeEvent)}.
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

}
