package org.j8unit.repository.javax.swing.plaf.metal;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalIconFactory class
 * javax.swing.plaf.metal.MetalIconFactory}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalIconFactoryClassTests<SUT extends javax.swing.plaf.metal.MetalIconFactory>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalIconFactory.FileIcon16 class
     * javax.swing.plaf.metal.MetalIconFactory$FileIcon16}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FileIcon16Tests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FileIcon16Tests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.FileIcon16
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FileIcon16ClassTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.FileIcon16>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#FileIcon16() public
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.FileIcon16#FileIcon16()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FileIcon16()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalIconFactory.FileIcon16 sut = null; // = new FileIcon16();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.FileIcon16#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.FileIcon16.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalIconFactory.FolderIcon16 class
     * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FolderIcon16Tests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FolderIcon16Tests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.FolderIcon16
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FolderIcon16ClassTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.FolderIcon16>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#FolderIcon16() public
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#FolderIcon16()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FolderIcon16()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalIconFactory.FolderIcon16 sut = null; // = new FolderIcon16();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.FolderIcon16.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon class
     * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.PaletteCloseIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.PaletteCloseIconTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteCloseIconClassTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>,
    org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#PaletteCloseIcon() public
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#PaletteCloseIcon()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PaletteCloseIcon()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon sut = null; // = new PaletteCloseIcon();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeControlIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeControlIconTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeControlIconClassTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#TreeControlIcon(boolean)
         * public javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon(boolean)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#TreeControlIcon(boolean)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeControlIcon_boolean()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon sut = null; // = new TreeControlIcon(boolean);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeFolderIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeFolderIconTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeFolderIconClassTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.FolderIcon16ClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#TreeFolderIcon() public
         * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#TreeFolderIcon()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeFolderIcon()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon sut = null; // = new TreeFolderIcon();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeLeafIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeLeafIconTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeLeafIconClassTests<SUT extends javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.FileIcon16ClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#TreeLeafIcon() public
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#TreeLeafIcon()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeLeafIcon()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon sut = null; // = new TreeLeafIcon();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#MetalIconFactory() public
     * javax.swing.plaf.metal.MetalIconFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#MetalIconFactory()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MetalIconFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.metal.MetalIconFactory sut = null; // = new MetalIconFactory();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getCheckBoxIcon() public static javax.swing.Icon
     * javax.swing.plaf.metal.MetalIconFactory.getCheckBoxIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getCheckBoxIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCheckBoxIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getCheckBoxMenuItemIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getCheckBoxMenuItemIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getCheckBoxMenuItemIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCheckBoxMenuItemIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserDetailViewIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserDetailViewIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getFileChooserDetailViewIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserDetailViewIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserHomeFolderIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserHomeFolderIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getFileChooserHomeFolderIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserHomeFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserListViewIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserListViewIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getFileChooserListViewIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserListViewIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserNewFolderIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserNewFolderIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getFileChooserNewFolderIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserNewFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserUpFolderIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserUpFolderIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getFileChooserUpFolderIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserUpFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getHorizontalSliderThumbIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getHorizontalSliderThumbIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getHorizontalSliderThumbIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHorizontalSliderThumbIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameAltMaximizeIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameAltMaximizeIcon(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getInternalFrameAltMaximizeIcon(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameAltMaximizeIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameCloseIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameCloseIcon(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getInternalFrameCloseIcon(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameCloseIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameDefaultMenuIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameDefaultMenuIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getInternalFrameDefaultMenuIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameDefaultMenuIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameMaximizeIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameMaximizeIcon(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getInternalFrameMaximizeIcon(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameMaximizeIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameMinimizeIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameMinimizeIcon(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getInternalFrameMinimizeIcon(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameMinimizeIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getMenuArrowIcon() public static javax.swing.Icon
     * javax.swing.plaf.metal.MetalIconFactory.getMenuArrowIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getMenuArrowIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuArrowIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getMenuItemArrowIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getMenuItemArrowIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getMenuItemArrowIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuItemArrowIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getMenuItemCheckIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getMenuItemCheckIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getMenuItemCheckIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuItemCheckIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getRadioButtonIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getRadioButtonIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getRadioButtonIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRadioButtonIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getRadioButtonMenuItemIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getRadioButtonMenuItemIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getRadioButtonMenuItemIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRadioButtonMenuItemIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeComputerIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeComputerIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getTreeComputerIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeComputerIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeControlIcon(boolean) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeControlIcon(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getTreeControlIcon(boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeControlIcon_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeFloppyDriveIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeFloppyDriveIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getTreeFloppyDriveIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeFloppyDriveIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeFolderIcon() public static javax.swing.Icon
     * javax.swing.plaf.metal.MetalIconFactory.getTreeFolderIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getTreeFolderIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeHardDriveIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeHardDriveIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getTreeHardDriveIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeHardDriveIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeLeafIcon() public static javax.swing.Icon
     * javax.swing.plaf.metal.MetalIconFactory.getTreeLeafIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getTreeLeafIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeLeafIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getVerticalSliderThumbIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getVerticalSliderThumbIcon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#getVerticalSliderThumbIcon()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVerticalSliderThumbIcon()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalIconFactory#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.metal.MetalIconFactory.class.isAssignableFrom(sut));
    }

}
