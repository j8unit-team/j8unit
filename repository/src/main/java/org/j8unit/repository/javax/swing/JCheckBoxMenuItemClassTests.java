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
 * Test class for {@link javax.swing.JCheckBoxMenuItem class javax.swing.JCheckBoxMenuItem},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.JCheckBoxMenuItemTests}.
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
 * @see org.j8unit.repository.javax.swing.JCheckBoxMenuItemTests
 */
@Category(J8UnitRepository.class)
public abstract interface JCheckBoxMenuItemClassTests<SUT extends Class<? extends javax.swing.JCheckBoxMenuItem>>
extends org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>,
        org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
        org.j8unit.repository.javax.swing.JMenuItemClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.JCheckBoxMenuItem#JCheckBoxMenuItem(javax.swing.Action) public javax.swing.JCheckBoxMenuItem(javax.swing.Action)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JCheckBoxMenuItem_Action() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JCheckBoxMenuItem sut = null; // = new JCheckBoxMenuItem(javax.swing.Action);
    }

    /**
     * Test method for {@link javax.swing.JCheckBoxMenuItem#JCheckBoxMenuItem(java.lang.String,javax.swing.Icon) public javax.swing.JCheckBoxMenuItem(java.lang.String,javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JCheckBoxMenuItem_String_Icon() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JCheckBoxMenuItem sut = null; // = new JCheckBoxMenuItem(java.lang.String,javax.swing.Icon);
    }

    /**
     * Test method for {@link javax.swing.JCheckBoxMenuItem#JCheckBoxMenuItem(java.lang.String,boolean) public javax.swing.JCheckBoxMenuItem(java.lang.String,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JCheckBoxMenuItem_String_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JCheckBoxMenuItem sut = null; // = new JCheckBoxMenuItem(java.lang.String,boolean);
    }

    /**
     * Test method for {@link javax.swing.JCheckBoxMenuItem#JCheckBoxMenuItem(java.lang.String,javax.swing.Icon,boolean) public javax.swing.JCheckBoxMenuItem(java.lang.String,javax.swing.Icon,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JCheckBoxMenuItem_String_Icon_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JCheckBoxMenuItem sut = null; // = new JCheckBoxMenuItem(java.lang.String,javax.swing.Icon,boolean);
    }

    /**
     * Test method for {@link javax.swing.JCheckBoxMenuItem#JCheckBoxMenuItem() public javax.swing.JCheckBoxMenuItem()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JCheckBoxMenuItem() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JCheckBoxMenuItem sut = null; // = new JCheckBoxMenuItem();
    }

    /**
     * Test method for {@link javax.swing.JCheckBoxMenuItem#JCheckBoxMenuItem(javax.swing.Icon) public javax.swing.JCheckBoxMenuItem(javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JCheckBoxMenuItem_Icon() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JCheckBoxMenuItem sut = null; // = new JCheckBoxMenuItem(javax.swing.Icon);
    }

    /**
     * Test method for {@link javax.swing.JCheckBoxMenuItem#JCheckBoxMenuItem(java.lang.String) public javax.swing.JCheckBoxMenuItem(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JCheckBoxMenuItem_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JCheckBoxMenuItem sut = null; // = new JCheckBoxMenuItem(java.lang.String);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.JCheckBoxMenuItem> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JCheckBoxMenuItem.class.isAssignableFrom(sut));
    }

}
