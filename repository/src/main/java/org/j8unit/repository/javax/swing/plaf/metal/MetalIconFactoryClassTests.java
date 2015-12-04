package org.j8unit.repository.javax.swing.plaf.metal;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalIconFactory class javax.swing.plaf.metal.MetalIconFactory},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests
 */
@Category(J8UnitRepository.class)
public abstract interface MetalIconFactoryClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalIconFactory>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalIconFactory$FileIcon16 class
     * javax.swing.plaf.metal.MetalIconFactory$FileIcon16}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FileIcon16Tests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FileIcon16Tests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FileIcon16ClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalIconFactory.FileIcon16>>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FileIcon16#FileIcon16() public
         * javax.swing.plaf.metal.MetalIconFactory$FileIcon16()}.
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

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalIconFactory.FileIcon16> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.FileIcon16.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalIconFactory$FolderIcon16 class
     * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FolderIcon16Tests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FolderIcon16Tests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FolderIcon16ClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalIconFactory.FolderIcon16>>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.FolderIcon16#FolderIcon16() public
         * javax.swing.plaf.metal.MetalIconFactory$FolderIcon16()}.
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

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalIconFactory.FolderIcon16> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.FolderIcon16.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon class
     * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.PaletteCloseIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.PaletteCloseIconTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteCloseIconClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon>>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>,
    org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon#PaletteCloseIcon() public
         * javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon()}.
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

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeControlIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeControlIconTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeControlIconClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon>>
    extends org.j8unit.repository.javax.swing.IconClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon#TreeControlIcon(boolean)
         * public javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon(boolean)}.
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

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeFolderIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeFolderIconTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeFolderIconClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon>>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.FolderIcon16ClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon#TreeFolderIcon() public
         * javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon()}.
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

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon class
     * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeLeafIconTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeLeafIconTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeLeafIconClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon>>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryClassTests.FileIcon16ClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon#TreeLeafIcon() public
         * javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon()}.
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

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#MetalIconFactory() public
     * javax.swing.plaf.metal.MetalIconFactory()}.
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
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCheckBoxIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getCheckBoxMenuItemIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getCheckBoxMenuItemIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCheckBoxMenuItemIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserDetailViewIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserDetailViewIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserDetailViewIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserHomeFolderIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserHomeFolderIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserHomeFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserListViewIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserListViewIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserListViewIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserNewFolderIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserNewFolderIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserNewFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getFileChooserUpFolderIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getFileChooserUpFolderIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileChooserUpFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getHorizontalSliderThumbIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getHorizontalSliderThumbIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHorizontalSliderThumbIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameAltMaximizeIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameAltMaximizeIcon(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameAltMaximizeIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameCloseIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameCloseIcon(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameCloseIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameDefaultMenuIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameDefaultMenuIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameDefaultMenuIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameMaximizeIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameMaximizeIcon(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameMaximizeIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getInternalFrameMinimizeIcon(int) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getInternalFrameMinimizeIcon(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrameMinimizeIcon_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getMenuArrowIcon() public static javax.swing.Icon
     * javax.swing.plaf.metal.MetalIconFactory.getMenuArrowIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuArrowIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getMenuItemArrowIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getMenuItemArrowIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuItemArrowIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getMenuItemCheckIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getMenuItemCheckIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuItemCheckIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getRadioButtonIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getRadioButtonIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRadioButtonIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getRadioButtonMenuItemIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getRadioButtonMenuItemIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRadioButtonMenuItemIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeComputerIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeComputerIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeComputerIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeControlIcon(boolean) public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeControlIcon(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeControlIcon_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeFloppyDriveIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeFloppyDriveIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeFloppyDriveIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeFolderIcon() public static javax.swing.Icon
     * javax.swing.plaf.metal.MetalIconFactory.getTreeFolderIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeFolderIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeHardDriveIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getTreeHardDriveIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeHardDriveIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getTreeLeafIcon() public static javax.swing.Icon
     * javax.swing.plaf.metal.MetalIconFactory.getTreeLeafIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeLeafIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalIconFactory#getVerticalSliderThumbIcon() public static
     * javax.swing.Icon javax.swing.plaf.metal.MetalIconFactory.getVerticalSliderThumbIcon()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVerticalSliderThumbIcon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.metal.MetalIconFactory> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.metal.MetalIconFactory.class.isAssignableFrom(sut));
    }

}
