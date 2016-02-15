package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource class javax.swing.plaf.BorderUIResource}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link BorderUIResourceClassTests}
 * .
 * </p>
 *
 * @see javax.swing.plaf.BorderUIResource class javax.swing.plaf.BorderUIResource (the hereby targeted class-under-test
 *      class)
 * @see BorderUIResourceClassTests BorderUIResourceClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource>
extends org.j8unit.repository.javax.swing.border.BorderTests<SUT>, UIResourceTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.BorderUIResource#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     * public void javax.swing.plaf.BorderUIResource.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.BorderUIResource#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     * public void javax.swing.plaf.BorderUIResource.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     *      public void
     *      javax.swing.plaf.BorderUIResource.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paintBorder_Component_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#getBorderInsets(java.awt.Component) public
     * java.awt.Insets javax.swing.plaf.BorderUIResource.getBorderInsets(java.awt.Component)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#getBorderInsets(java.awt.Component) public
     * java.awt.Insets javax.swing.plaf.BorderUIResource.getBorderInsets(java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource#getBorderInsets(java.awt.Component) public java.awt.Insets
     *      javax.swing.plaf.BorderUIResource.getBorderInsets(java.awt.Component) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBorderInsets_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#isBorderOpaque() public boolean
     * javax.swing.plaf.BorderUIResource.isBorderOpaque()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#isBorderOpaque() public boolean
     * javax.swing.plaf.BorderUIResource.isBorderOpaque()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource#isBorderOpaque() public boolean
     *      javax.swing.plaf.BorderUIResource.isBorderOpaque() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isBorderOpaque()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource.BevelBorderUIResource class
     * javax.swing.plaf.BorderUIResource$BevelBorderUIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BorderUIResourceClassTests.BevelBorderUIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource.BevelBorderUIResource class
     *      javax.swing.plaf.BorderUIResource$BevelBorderUIResource (the hereby targeted class-under-test class)
     * @see BorderUIResourceClassTests.BevelBorderUIResourceClassTests
     *      BorderUIResourceClassTests.BevelBorderUIResourceClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BevelBorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource.BevelBorderUIResource>
    extends UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.BevelBorderTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource.LineBorderUIResource class
     * javax.swing.plaf.BorderUIResource$LineBorderUIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BorderUIResourceClassTests.LineBorderUIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource.LineBorderUIResource class
     *      javax.swing.plaf.BorderUIResource$LineBorderUIResource (the hereby targeted class-under-test class)
     * @see BorderUIResourceClassTests.LineBorderUIResourceClassTests
     *      BorderUIResourceClassTests.LineBorderUIResourceClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LineBorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource.LineBorderUIResource>
    extends UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.LineBorderTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource.CompoundBorderUIResource class
     * javax.swing.plaf.BorderUIResource$CompoundBorderUIResource}. The complementary j8unit test interface containing
     * the class relevant aspects is {@link BorderUIResourceClassTests.CompoundBorderUIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource.CompoundBorderUIResource class
     *      javax.swing.plaf.BorderUIResource$CompoundBorderUIResource (the hereby targeted class-under-test class)
     * @see BorderUIResourceClassTests.CompoundBorderUIResourceClassTests
     *      BorderUIResourceClassTests.CompoundBorderUIResourceClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CompoundBorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource.CompoundBorderUIResource>
    extends UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.CompoundBorderTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource.EtchedBorderUIResource class
     * javax.swing.plaf.BorderUIResource$EtchedBorderUIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BorderUIResourceClassTests.EtchedBorderUIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource.EtchedBorderUIResource class
     *      javax.swing.plaf.BorderUIResource$EtchedBorderUIResource (the hereby targeted class-under-test class)
     * @see BorderUIResourceClassTests.EtchedBorderUIResourceClassTests
     *      BorderUIResourceClassTests.EtchedBorderUIResourceClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EtchedBorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource.EtchedBorderUIResource>
    extends UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.EtchedBorderTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource.EmptyBorderUIResource class
     * javax.swing.plaf.BorderUIResource$EmptyBorderUIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BorderUIResourceClassTests.EmptyBorderUIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource.EmptyBorderUIResource class
     *      javax.swing.plaf.BorderUIResource$EmptyBorderUIResource (the hereby targeted class-under-test class)
     * @see BorderUIResourceClassTests.EmptyBorderUIResourceClassTests
     *      BorderUIResourceClassTests.EmptyBorderUIResourceClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EmptyBorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource.EmptyBorderUIResource>
    extends UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.EmptyBorderTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource.MatteBorderUIResource class
     * javax.swing.plaf.BorderUIResource$MatteBorderUIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BorderUIResourceClassTests.MatteBorderUIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource.MatteBorderUIResource class
     *      javax.swing.plaf.BorderUIResource$MatteBorderUIResource (the hereby targeted class-under-test class)
     * @see BorderUIResourceClassTests.MatteBorderUIResourceClassTests
     *      BorderUIResourceClassTests.MatteBorderUIResourceClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MatteBorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource.MatteBorderUIResource>
    extends UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.MatteBorderTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.BorderUIResource.TitledBorderUIResource class
     * javax.swing.plaf.BorderUIResource$TitledBorderUIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BorderUIResourceClassTests.TitledBorderUIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.BorderUIResource.TitledBorderUIResource class
     *      javax.swing.plaf.BorderUIResource$TitledBorderUIResource (the hereby targeted class-under-test class)
     * @see BorderUIResourceClassTests.TitledBorderUIResourceClassTests
     *      BorderUIResourceClassTests.TitledBorderUIResourceClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TitledBorderUIResourceTests<SUT extends javax.swing.plaf.BorderUIResource.TitledBorderUIResource>
    extends UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.TitledBorderTests<SUT> {

    }

}
