package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.JEditorPane class javax.swing.JEditorPane}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JEditorPaneTests}.
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
 * @see org.j8unit.repository.javax.swing.JEditorPaneTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.JEditorPane
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JEditorPaneClassTests<SUT extends javax.swing.JEditorPane>
extends org.j8unit.repository.javax.swing.text.JTextComponentClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#JEditorPane() public javax.swing.JEditorPane()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#JEditorPane()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JEditorPane sut = null; // = new JEditorPane();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#JEditorPane(java.lang.String) public
     * javax.swing.JEditorPane(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#JEditorPane(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JEditorPane sut = null; // = new JEditorPane(java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#JEditorPane(java.lang.String, java.lang.String) public
     * javax.swing.JEditorPane(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#JEditorPane(java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JEditorPane sut = null; // = new JEditorPane(java.lang.String, java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#JEditorPane(java.net.URL) public
     * javax.swing.JEditorPane(java.net.URL) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#JEditorPane(java.net.URL)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane_URL()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JEditorPane sut = null; // = new JEditorPane(java.net.URL);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#createEditorKitForContentType(java.lang.String) public static
     * javax.swing.text.EditorKit javax.swing.JEditorPane.createEditorKitForContentType(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#createEditorKitForContentType(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createEditorKitForContentType_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#getEditorKitClassNameForContentType(java.lang.String) public
     * static java.lang.String javax.swing.JEditorPane.getEditorKitClassNameForContentType(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#getEditorKitClassNameForContentType(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEditorKitClassNameForContentType_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JEditorPane#registerEditorKitForContentType(java.lang.String, java.lang.String) public static
     * void javax.swing.JEditorPane.registerEditorKitForContentType(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#registerEditorKitForContentType(java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerEditorKitForContentType_String_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JEditorPane#registerEditorKitForContentType(java.lang.String, java.lang.String, java.lang.ClassLoader)
     * public static void
     * javax.swing.JEditorPane.registerEditorKitForContentType(java.lang.String,java.lang.String,java.lang.ClassLoader)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JEditorPane#registerEditorKitForContentType(java.lang.String, java.lang.String,
     *             java.lang.ClassLoader)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerEditorKitForContentType_String_String_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.JEditorPane#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JEditorPane.class.isAssignableFrom(sut));
    }

}
