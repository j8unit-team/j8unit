package org.j8unit.repository.javax.swing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.JLabel class javax.swing.JLabel},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.JLabelTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.JLabelTests
 */
@Category(J8UnitRepository.class)
public abstract interface JLabelClassTests<SUT extends Class<? extends javax.swing.JLabel>>
extends org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>,
        org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
        org.j8unit.repository.javax.swing.JComponentClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.JLabel#JLabel() public javax.swing.JLabel()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLabel() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JLabel sut = null; // = new JLabel();
    }

    /**
     * Test method for {@link javax.swing.JLabel#JLabel(javax.swing.Icon) public javax.swing.JLabel(javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLabel_Icon() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JLabel sut = null; // = new JLabel(javax.swing.Icon);
    }

    /**
     * Test method for {@link javax.swing.JLabel#JLabel(javax.swing.Icon,int) public javax.swing.JLabel(javax.swing.Icon,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLabel_Icon_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JLabel sut = null; // = new JLabel(javax.swing.Icon,int);
    }

    /**
     * Test method for {@link javax.swing.JLabel#JLabel(java.lang.String,javax.swing.Icon,int) public javax.swing.JLabel(java.lang.String,javax.swing.Icon,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLabel_String_Icon_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JLabel sut = null; // = new JLabel(java.lang.String,javax.swing.Icon,int);
    }

    /**
     * Test method for {@link javax.swing.JLabel#JLabel(java.lang.String,int) public javax.swing.JLabel(java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLabel_String_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JLabel sut = null; // = new JLabel(java.lang.String,int);
    }

    /**
     * Test method for {@link javax.swing.JLabel#JLabel(java.lang.String) public javax.swing.JLabel(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLabel_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JLabel sut = null; // = new JLabel(java.lang.String);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.JLabel> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JLabel.class.isAssignableFrom(sut));
    }

}
