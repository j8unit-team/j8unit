package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicComboBoxRenderer class
 * javax.swing.plaf.basic.BasicComboBoxRenderer}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BasicComboBoxRendererClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicComboBoxRenderer class javax.swing.plaf.basic.BasicComboBoxRenderer (the hereby
 *      targeted class-under-test class)
 * @see BasicComboBoxRendererClassTests BasicComboBoxRendererClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicComboBoxRendererTests<SUT extends javax.swing.plaf.basic.BasicComboBoxRenderer>
extends org.j8unit.repository.javax.swing.ListCellRendererTests, org.j8unit.repository.java.io.SerializableTests,
org.j8unit.repository.javax.swing.JLabelTests {

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this J8Unit test interface
    // (caused by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicComboBoxRenderer#getListCellRendererComponent(javax.swing.JList, Object, int, boolean, boolean)
     * public java.awt.Component
     * javax.swing.plaf.basic.BasicComboBoxRenderer.getListCellRendererComponent(javax.swing.JList,java.lang.Object,int,boolean,boolean)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicComboBoxRenderer#getListCellRendererComponent(javax.swing.JList, Object, int, boolean, boolean)
     * public java.awt.Component
     * javax.swing.plaf.basic.BasicComboBoxRenderer.getListCellRendererComponent(javax.swing.JList,java.lang.Object,int,boolean,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicComboBoxRenderer#getListCellRendererComponent(javax.swing.JList, Object, int,
     *      boolean, boolean) public java.awt.Component
     *      javax.swing.plaf.basic.BasicComboBoxRenderer.getListCellRendererComponent(javax.swing.JList,java.lang.Object
     *      ,int,boolean,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
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
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboBoxRenderer#getPreferredSize() public java.awt.Dimension
     * javax.swing.plaf.basic.BasicComboBoxRenderer.getPreferredSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicComboBoxRenderer#getPreferredSize() public java.awt.Dimension
     *      javax.swing.plaf.basic.BasicComboBoxRenderer.getPreferredSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPreferredSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource class
     * javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BasicComboBoxRendererClassTests.UIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource class
     *      javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource (the hereby targeted class-under-test class)
     * @see BasicComboBoxRendererClassTests.UIResourceClassTests BasicComboBoxRendererClassTests.UIResourceClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @SuppressWarnings("rawtypes")
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceTests<SUT extends javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests, BasicComboBoxRendererTests {

        // The definition of the SUT factory method must be repeated
        // because of the "rawtypes" nature of this J8Unit test interface
        // (caused by the "rawtypes" nature of the class-under-test).
        @Override
        public abstract SUT createNewSUT();

    }

}
