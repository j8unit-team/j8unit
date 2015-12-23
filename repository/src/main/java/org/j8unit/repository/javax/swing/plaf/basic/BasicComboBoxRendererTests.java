package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicComboBoxRenderer class
 * javax.swing.plaf.basic.BasicComboBoxRenderer}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicComboBoxRenderer
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicComboBoxRendererTests<SUT extends javax.swing.plaf.basic.BasicComboBoxRenderer>
extends org.j8unit.repository.javax.swing.ListCellRendererTests, org.j8unit.repository.java.io.SerializableTests,
org.j8unit.repository.javax.swing.JLabelTests {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource class
     * javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests.UIResourceTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererClassTests.UIResourceClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource
     */
    @SuppressWarnings("rawtypes")
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceTests<SUT extends javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests, org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests {

        // The definition of the SUT factory method must be repeated
        // because of the "rawtypes" nature of this 8Unit test interface
        // (caused by the "rawtypes" nature of the class-under-test).
        @Override
        public abstract SUT createNewSUT();

    }

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this 8Unit test interface
    // (caused by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicComboBoxRenderer#getListCellRendererComponent(javax.swing.JList, java.lang.Object, int, boolean, boolean)
     * public java.awt.Component
     * javax.swing.plaf.basic.BasicComboBoxRenderer.getListCellRendererComponent(javax.swing.JList,java.lang.Object,int,boolean,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboBoxRenderer#getListCellRendererComponent(javax.swing.JList,
     *             java.lang.Object, int, boolean, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getListCellRendererComponent_JList_Object_int_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboBoxRenderer#getPreferredSize() public java.awt.Dimension
     * javax.swing.plaf.basic.BasicComboBoxRenderer.getPreferredSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboBoxRenderer#getPreferredSize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getPreferredSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
