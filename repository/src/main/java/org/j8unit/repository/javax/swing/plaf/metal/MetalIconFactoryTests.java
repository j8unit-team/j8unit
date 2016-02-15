package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalIconFactory class
 * javax.swing.plaf.metal.MetalIconFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MetalIconFactoryClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalIconFactory class javax.swing.plaf.metal.MetalIconFactory (the hereby targeted
 *      class-under-test class)
 * @see MetalIconFactoryClassTests MetalIconFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalIconFactoryTests<SUT extends javax.swing.plaf.metal.MetalIconFactory>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalIconFactoryClassTests.TreeFolderIconClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon class
     *      javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon (the hereby targeted class-under-test class)
     * @see MetalIconFactoryClassTests.TreeFolderIconClassTests MetalIconFactoryClassTests.TreeFolderIconClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeFolderIconTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon>
    extends MetalIconFactoryTests.FolderIcon16Tests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getShift()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getShift() public int
         *      javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getShift() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getShift()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getAdditionalHeight() public
         * int javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getAdditionalHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getAdditionalHeight() public
         * int javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getAdditionalHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getAdditionalHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getAdditionalHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalIconFactoryClassTests.TreeControlIconClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon class
     *      javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon (the hereby targeted class-under-test class)
     * @see MetalIconFactoryClassTests.TreeControlIconClassTests MetalIconFactoryClassTests.TreeControlIconClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeControlIconTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon>
    extends org.j8unit.repository.javax.swing.IconTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconWidth()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconWidth() public int
         *      javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconWidth() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconWidth()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintMe(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintMe(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintMe(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintMe(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintMe(java.awt.Component, java.awt.Graphics,
         *      int, int) public void
         *      javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintMe(java.awt.Component,java.awt.Graphics,int
         *      ,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_paintMe_Component_Graphics_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintIcon(java.awt.Component, java.awt.Graphics,
         *      int, int) public void
         *      javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintIcon(java.awt.Component,java.awt.Graphics,
         *      int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintIcon_Component_Graphics_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalIconFactoryClassTests.TreeLeafIconClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon class
     *      javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon (the hereby targeted class-under-test class)
     * @see MetalIconFactoryClassTests.TreeLeafIconClassTests MetalIconFactoryClassTests.TreeLeafIconClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeLeafIconTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon>
    extends MetalIconFactoryTests.FileIcon16Tests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getAdditionalHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getAdditionalHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getAdditionalHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getAdditionalHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getShift()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getShift() public int
         *      javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getShift() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getShift()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon class
     * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalIconFactoryClassTests.PaletteCloseIconClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon class
     *      javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon (the hereby targeted class-under-test class)
     * @see MetalIconFactoryClassTests.PaletteCloseIconClassTests MetalIconFactoryClassTests.PaletteCloseIconClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteCloseIconTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon>
    extends org.j8unit.repository.javax.swing.IconTests<SUT>, org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
    org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#paintIcon(java.awt.Component,
         *      java.awt.Graphics, int, int) public void
         *      javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.paintIcon(java.awt.Component,java.awt.Graphics,
         *      int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintIcon_Component_Graphics_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconWidth()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconWidth() public int
         *      javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconWidth() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconWidth()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalIconFactory.FolderIcon16 class
     * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalIconFactoryClassTests.FolderIcon16ClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalIconFactory.FolderIcon16 class
     *      javax.swing.plaf.metal.MetalIconFactory$FolderIcon16 (the hereby targeted class-under-test class)
     * @see MetalIconFactoryClassTests.FolderIcon16ClassTests MetalIconFactoryClassTests.FolderIcon16ClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FolderIcon16Tests<SUT extends javax.swing.plaf.metal.MetalIconFactory.FolderIcon16>
    extends org.j8unit.repository.javax.swing.IconTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconWidth()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconWidth() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconWidth() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconWidth()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getAdditionalHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getAdditionalHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getAdditionalHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAdditionalHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#paintIcon(java.awt.Component, java.awt.Graphics,
         *      int, int) public void
         *      javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,
         *      int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintIcon_Component_Graphics_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getShift()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getShift() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getShift() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getShift()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalIconFactory.FileIcon16 class
     * javax.swing.plaf.metal.MetalIconFactory$FileIcon16}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link MetalIconFactoryClassTests.FileIcon16ClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalIconFactory.FileIcon16 class javax.swing.plaf.metal.MetalIconFactory$FileIcon16
     *      (the hereby targeted class-under-test class)
     * @see MetalIconFactoryClassTests.FileIcon16ClassTests MetalIconFactoryClassTests.FileIcon16ClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FileIcon16Tests<SUT extends javax.swing.plaf.metal.MetalIconFactory.FileIcon16>
    extends org.j8unit.repository.javax.swing.IconTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getAdditionalHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getAdditionalHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getAdditionalHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAdditionalHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FileIcon16#paintIcon(java.awt.Component, java.awt.Graphics, int,
         *      int) public void
         *      javax.swing.plaf.metal.MetalIconFactory$FileIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,
         *      int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintIcon_Component_Graphics_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getShift()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getShift() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getShift() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getShift()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconWidth()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconWidth() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconWidth() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconWidth()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconHeight()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconHeight() public int
         *      javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconHeight() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getIconHeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
