package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JInternalFrame class javax.swing.JInternalFrame}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JInternalFrameTests}.
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
 * @see org.j8unit.repository.javax.swing.JInternalFrameTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JInternalFrameClassTests<SUT extends Class<? extends javax.swing.JInternalFrame>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.WindowConstantsClassTests<SUT>,
org.j8unit.repository.javax.swing.RootPaneContainerClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.JInternalFrame$JDesktopIcon class javax.swing.JInternalFrame$JDesktopIcon},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JInternalFrameTests.JDesktopIconTests}.
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
     * @see org.j8unit.repository.javax.swing.JInternalFrameTests.JDesktopIconTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface JDesktopIconClassTests<SUT extends Class<? extends javax.swing.JInternalFrame.JDesktopIcon>>
    extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JInternalFrame.JDesktopIcon#JDesktopIcon(javax.swing.JInternalFrame)
         * public javax.swing.JInternalFrame$JDesktopIcon(javax.swing.JInternalFrame)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_JDesktopIcon_JInternalFrame()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JInternalFrame.JDesktopIcon sut = null; // = new JDesktopIcon(javax.swing.JInternalFrame);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.JInternalFrame.JDesktopIcon> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JInternalFrame.JDesktopIcon.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.JInternalFrame#JInternalFrame() public javax.swing.JInternalFrame()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JInternalFrame()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JInternalFrame sut = null; // = new JInternalFrame();
    }

    /**
     * Test method for {@link javax.swing.JInternalFrame#JInternalFrame(java.lang.String) public
     * javax.swing.JInternalFrame(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JInternalFrame_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JInternalFrame sut = null; // = new JInternalFrame(java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JInternalFrame#JInternalFrame(java.lang.String,boolean) public
     * javax.swing.JInternalFrame(java.lang.String,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JInternalFrame_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JInternalFrame sut = null; // = new JInternalFrame(java.lang.String,boolean);
    }

    /**
     * Test method for {@link javax.swing.JInternalFrame#JInternalFrame(java.lang.String,boolean,boolean) public
     * javax.swing.JInternalFrame(java.lang.String,boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JInternalFrame_String_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JInternalFrame sut = null; // = new JInternalFrame(java.lang.String,boolean,boolean);
    }

    /**
     * Test method for {@link javax.swing.JInternalFrame#JInternalFrame(java.lang.String,boolean,boolean,boolean) public
     * javax.swing.JInternalFrame(java.lang.String,boolean,boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JInternalFrame_String_boolean_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JInternalFrame sut = null; // = new JInternalFrame(java.lang.String,boolean,boolean,boolean);
    }

    /**
     * Test method for
     * {@link javax.swing.JInternalFrame#JInternalFrame(java.lang.String,boolean,boolean,boolean,boolean) public
     * javax.swing.JInternalFrame(java.lang.String,boolean,boolean,boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JInternalFrame_String_boolean_boolean_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JInternalFrame sut = null; // = new
                                                     // JInternalFrame(java.lang.String,boolean,boolean,boolean,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JInternalFrame> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JInternalFrame.class.isAssignableFrom(sut));
    }

}
