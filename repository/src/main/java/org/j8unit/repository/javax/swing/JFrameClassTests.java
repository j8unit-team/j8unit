package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.JFrame class javax.swing.JFrame}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JFrameTests}.
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
 * @see org.j8unit.repository.javax.swing.JFrameTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.JFrame
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JFrameClassTests<SUT extends javax.swing.JFrame>
extends org.j8unit.repository.javax.swing.WindowConstantsClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
org.j8unit.repository.javax.swing.RootPaneContainerClassTests<SUT>, org.j8unit.repository.java.awt.FrameClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JFrame#JFrame() public javax.swing.JFrame() throws java.awt.HeadlessException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JFrame#JFrame()
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

    /**
     * <p>
     * Test method for {@link javax.swing.JFrame#JFrame(java.awt.GraphicsConfiguration) public
     * javax.swing.JFrame(java.awt.GraphicsConfiguration)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JFrame#JFrame(java.awt.GraphicsConfiguration)
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
     * <p>
     * Test method for {@link javax.swing.JFrame#JFrame(java.lang.String) public javax.swing.JFrame(java.lang.String)
     * throws java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JFrame#JFrame(java.lang.String)
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
     * <p>
     * Test method for {@link javax.swing.JFrame#JFrame(java.lang.String, java.awt.GraphicsConfiguration) public
     * javax.swing.JFrame(java.lang.String,java.awt.GraphicsConfiguration)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JFrame#JFrame(java.lang.String, java.awt.GraphicsConfiguration)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFrame_String_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFrame sut = null; // = new JFrame(java.lang.String, java.awt.GraphicsConfiguration);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JFrame#isDefaultLookAndFeelDecorated() public static boolean
     * javax.swing.JFrame.isDefaultLookAndFeelDecorated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JFrame#isDefaultLookAndFeelDecorated()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDefaultLookAndFeelDecorated()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JFrame#setDefaultLookAndFeelDecorated(boolean) public static void
     * javax.swing.JFrame.setDefaultLookAndFeelDecorated(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JFrame#setDefaultLookAndFeelDecorated(boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultLookAndFeelDecorated_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.JFrame#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JFrame.class.isAssignableFrom(sut));
    }

}
