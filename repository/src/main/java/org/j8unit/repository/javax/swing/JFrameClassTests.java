package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JFrame class javax.swing.JFrame}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.JFrameTests}.
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
 * @see org.j8unit.repository.javax.swing.JFrameTests
 */
@Category(J8UnitRepository.class)
public abstract interface JFrameClassTests<SUT extends Class<? extends javax.swing.JFrame>>
extends org.j8unit.repository.javax.swing.WindowConstantsClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
org.j8unit.repository.javax.swing.RootPaneContainerClassTests<SUT>, org.j8unit.repository.java.awt.FrameClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JFrame#JFrame(java.lang.String,java.awt.GraphicsConfiguration) public
     * javax.swing.JFrame(java.lang.String,java.awt.GraphicsConfiguration)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFrame_String_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFrame sut = null; // = new JFrame(java.lang.String,java.awt.GraphicsConfiguration);
    }

    /**
     * Test method for {@link javax.swing.JFrame#JFrame(java.lang.String) public javax.swing.JFrame(java.lang.String)
     * throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFrame_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFrame sut = null; // = new JFrame(java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JFrame#JFrame(java.awt.GraphicsConfiguration) public
     * javax.swing.JFrame(java.awt.GraphicsConfiguration)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFrame_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFrame sut = null; // = new JFrame(java.awt.GraphicsConfiguration);
    }

    /**
     * Test method for {@link javax.swing.JFrame#JFrame() public javax.swing.JFrame() throws java.awt.HeadlessException}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFrame()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFrame sut = null; // = new JFrame();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JFrame> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JFrame.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JFrame#isDefaultLookAndFeelDecorated() public static boolean
     * javax.swing.JFrame.isDefaultLookAndFeelDecorated()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDefaultLookAndFeelDecorated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JFrame#setDefaultLookAndFeelDecorated(boolean) public static void
     * javax.swing.JFrame.setDefaultLookAndFeelDecorated(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultLookAndFeelDecorated_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
