package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalIconFactory;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;
import javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon;
import javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon;
import javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.SerializableTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.javax.swing.IconTests;
import org.j8unit.repository.javax.swing.plaf.UIResourceTests;
import org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.FileIcon16ClassTests;
import org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.FolderIcon16ClassTests;
import org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.PaletteCloseIconClassTests;
import org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.TreeControlIconClassTests;
import org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.TreeFolderIconClassTests;
import org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.TreeLeafIconClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link MetalIconFactory public class javax.swing.plaf.metal.MetalIconFactory}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link MetalIconFactoryClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalIconFactoryTests<SUT extends MetalIconFactory>
extends SerializableTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link FileIcon16
     * public static class javax.swing.plaf.metal.MetalIconFactory$FileIcon16}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link FileIcon16ClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FileIcon16Tests<SUT extends FileIcon16>
    extends IconTests<SUT>, SerializableTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FileIcon16]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FileIcon16]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FileIcon16]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TreeFolderIcon public static class javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link TreeFolderIconClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeFolderIconTests<SUT extends TreeFolderIcon>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FolderIcon16Tests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link FolderIcon16 public static class javax.swing.plaf.metal.MetalIconFactory$FolderIcon16}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link FolderIcon16ClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FolderIcon16Tests<SUT extends FolderIcon16>
    extends IconTests<SUT>, SerializableTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FolderIcon16]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FolderIcon16]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FolderIcon16]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TreeLeafIcon public static class javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link TreeLeafIconClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeLeafIconTests<SUT extends TreeLeafIcon>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FileIcon16Tests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getAdditionalHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getAdditionalHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#getShift() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon.getShift()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link PaletteCloseIcon public static class javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link PaletteCloseIconClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteCloseIconTests<SUT extends PaletteCloseIcon>
    extends IconTests<SUT>, UIResourceTests<SUT>, SerializableTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TreeControlIcon public static class javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link TreeControlIconClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeControlIconTests<SUT extends TreeControlIcon>
    extends IconTests<SUT>, SerializableTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconHeight() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconHeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#getIconWidth() public int
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.getIconWidth()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintMe(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintMe(java.awt.Component,java.awt.Graphics,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         * public void
         * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon]
    }

}
