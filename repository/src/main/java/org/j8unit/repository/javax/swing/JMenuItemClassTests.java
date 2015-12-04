package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JMenuItem class javax.swing.JMenuItem}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.JMenuItemTests}.
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
 * @see org.j8unit.repository.javax.swing.JMenuItemTests
 */
@Category(J8UnitRepository.class)
public abstract interface JMenuItemClassTests<SUT extends Class<? extends javax.swing.JMenuItem>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.MenuElementClassTests<SUT>,
org.j8unit.repository.javax.swing.AbstractButtonClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JMenuItem#JMenuItem() public javax.swing.JMenuItem()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JMenuItem()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JMenuItem sut = null; // = new JMenuItem();
    }

    /**
     * Test method for {@link javax.swing.JMenuItem#JMenuItem(javax.swing.Action) public
     * javax.swing.JMenuItem(javax.swing.Action)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JMenuItem_Action()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JMenuItem sut = null; // = new JMenuItem(javax.swing.Action);
    }

    /**
     * Test method for {@link javax.swing.JMenuItem#JMenuItem(javax.swing.Icon) public
     * javax.swing.JMenuItem(javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JMenuItem_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JMenuItem sut = null; // = new JMenuItem(javax.swing.Icon);
    }

    /**
     * Test method for {@link javax.swing.JMenuItem#JMenuItem(java.lang.String) public
     * javax.swing.JMenuItem(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JMenuItem_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JMenuItem sut = null; // = new JMenuItem(java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JMenuItem#JMenuItem(java.lang.String,javax.swing.Icon) public
     * javax.swing.JMenuItem(java.lang.String,javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JMenuItem_String_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JMenuItem sut = null; // = new JMenuItem(java.lang.String,javax.swing.Icon);
    }

    /**
     * Test method for {@link javax.swing.JMenuItem#JMenuItem(java.lang.String,int) public
     * javax.swing.JMenuItem(java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JMenuItem_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JMenuItem sut = null; // = new JMenuItem(java.lang.String,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JMenuItem> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JMenuItem.class.isAssignableFrom(sut));
    }

}
