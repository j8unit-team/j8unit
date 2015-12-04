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
 * Test class for {@link javax.swing.JToolBar class javax.swing.JToolBar},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.JToolBarTests}.
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
 * @see org.j8unit.repository.javax.swing.JToolBarTests
 */
@Category(J8UnitRepository.class)
public abstract interface JToolBarClassTests<SUT extends Class<? extends javax.swing.JToolBar>>
extends org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>,
        org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
        org.j8unit.repository.javax.swing.JComponentClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.JToolBar#JToolBar(java.lang.String,int) public javax.swing.JToolBar(java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToolBar_String_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JToolBar sut = null; // = new JToolBar(java.lang.String,int);
    }

    /**
     * Test method for {@link javax.swing.JToolBar#JToolBar(java.lang.String) public javax.swing.JToolBar(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToolBar_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JToolBar sut = null; // = new JToolBar(java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JToolBar#JToolBar(int) public javax.swing.JToolBar(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToolBar_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JToolBar sut = null; // = new JToolBar(int);
    }

    /**
     * Test method for {@link javax.swing.JToolBar#JToolBar() public javax.swing.JToolBar()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToolBar() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JToolBar sut = null; // = new JToolBar();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.JToolBar> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JToolBar.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.JToolBar$Separator class javax.swing.JToolBar$Separator},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.JToolBarTests.SeparatorTests}.
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
     * @see org.j8unit.repository.javax.swing.JToolBarTests.SeparatorTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SeparatorClassTests<SUT extends Class<? extends javax.swing.JToolBar.Separator>>
    extends org.j8unit.repository.javax.swing.JSeparatorClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.JToolBar.Separator#Separator() public javax.swing.JToolBar$Separator()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Separator() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.JToolBar.Separator sut = null; // = new Separator();
        }

        /**
         * Test method for {@link javax.swing.JToolBar.Separator#Separator(java.awt.Dimension) public javax.swing.JToolBar$Separator(java.awt.Dimension)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Separator_Dimension() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.JToolBar.Separator sut = null; // = new Separator(java.awt.Dimension);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.JToolBar.Separator> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JToolBar.Separator.class.isAssignableFrom(sut));
        }

    }

}
