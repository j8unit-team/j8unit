package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JRadioButton class javax.swing.JRadioButton}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JRadioButtonTests}.
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
 * @see org.j8unit.repository.javax.swing.JRadioButtonTests
 */
@Category(J8UnitRepository.class)
public abstract interface JRadioButtonClassTests<SUT extends Class<? extends javax.swing.JRadioButton>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JToggleButtonClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton(java.lang.String) public
     * javax.swing.JRadioButton(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton(java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton(java.lang.String,boolean) public
     * javax.swing.JRadioButton(java.lang.String,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton(java.lang.String,boolean);
    }

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton(java.lang.String,javax.swing.Icon) public
     * javax.swing.JRadioButton(java.lang.String,javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton_String_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton(java.lang.String,javax.swing.Icon);
    }

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton(java.lang.String,javax.swing.Icon,boolean) public
     * javax.swing.JRadioButton(java.lang.String,javax.swing.Icon,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton_String_Icon_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton(java.lang.String,javax.swing.Icon,boolean);
    }

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton() public javax.swing.JRadioButton()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton();
    }

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton(javax.swing.Icon) public
     * javax.swing.JRadioButton(javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton(javax.swing.Icon);
    }

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton(javax.swing.Action) public
     * javax.swing.JRadioButton(javax.swing.Action)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton_Action()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton(javax.swing.Action);
    }

    /**
     * Test method for {@link javax.swing.JRadioButton#JRadioButton(javax.swing.Icon,boolean) public
     * javax.swing.JRadioButton(javax.swing.Icon,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JRadioButton_Icon_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JRadioButton sut = null; // = new JRadioButton(javax.swing.Icon,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JRadioButton> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JRadioButton.class.isAssignableFrom(sut));
    }

}
