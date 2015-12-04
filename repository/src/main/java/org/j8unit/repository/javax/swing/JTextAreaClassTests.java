package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JTextArea class javax.swing.JTextArea}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.JTextAreaTests}.
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
 * @see org.j8unit.repository.javax.swing.JTextAreaTests
 */
@Category(J8UnitRepository.class)
public abstract interface JTextAreaClassTests<SUT extends Class<? extends javax.swing.JTextArea>>
extends org.j8unit.repository.javax.swing.text.JTextComponentClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JTextArea#JTextArea() public javax.swing.JTextArea()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextArea()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTextArea sut = null; // = new JTextArea();
    }

    /**
     * Test method for {@link javax.swing.JTextArea#JTextArea(javax.swing.text.Document) public
     * javax.swing.JTextArea(javax.swing.text.Document)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextArea_Document()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTextArea sut = null; // = new JTextArea(javax.swing.text.Document);
    }

    /**
     * Test method for {@link javax.swing.JTextArea#JTextArea(javax.swing.text.Document,java.lang.String,int,int) public
     * javax.swing.JTextArea(javax.swing.text.Document,java.lang.String,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextArea_Document_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTextArea sut = null; // = new JTextArea(javax.swing.text.Document,java.lang.String,int,int);
    }

    /**
     * Test method for {@link javax.swing.JTextArea#JTextArea(int,int) public javax.swing.JTextArea(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextArea_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTextArea sut = null; // = new JTextArea(int,int);
    }

    /**
     * Test method for {@link javax.swing.JTextArea#JTextArea(java.lang.String) public
     * javax.swing.JTextArea(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextArea_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTextArea sut = null; // = new JTextArea(java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JTextArea#JTextArea(java.lang.String,int,int) public
     * javax.swing.JTextArea(java.lang.String,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTextArea_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTextArea sut = null; // = new JTextArea(java.lang.String,int,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JTextArea> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JTextArea.class.isAssignableFrom(sut));
    }

}
