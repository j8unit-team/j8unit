package org.j8unit.repository.javax.swing.border;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.border.TitledBorder class javax.swing.border.TitledBorder}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.border.TitledBorderTests}.
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
 * @see org.j8unit.repository.javax.swing.border.TitledBorderTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TitledBorderClassTests<SUT extends Class<? extends javax.swing.border.TitledBorder>>
extends org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.border.TitledBorder#TitledBorder(javax.swing.border.Border) public
     * javax.swing.border.TitledBorder(javax.swing.border.Border)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TitledBorder_Border()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.TitledBorder sut = null; // = new TitledBorder(javax.swing.border.Border);
    }

    /**
     * Test method for {@link javax.swing.border.TitledBorder#TitledBorder(javax.swing.border.Border,java.lang.String)
     * public javax.swing.border.TitledBorder(javax.swing.border.Border,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TitledBorder_Border_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.TitledBorder sut = null; // = new
                                                          // TitledBorder(javax.swing.border.Border,java.lang.String);
    }

    /**
     * Test method for
     * {@link javax.swing.border.TitledBorder#TitledBorder(javax.swing.border.Border,java.lang.String,int,int) public
     * javax.swing.border.TitledBorder(javax.swing.border.Border,java.lang.String,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TitledBorder_Border_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.TitledBorder sut = null; // = new
                                                          // TitledBorder(javax.swing.border.Border,java.lang.String,int,int);
    }

    /**
     * Test method for
     * {@link javax.swing.border.TitledBorder#TitledBorder(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font)
     * public javax.swing.border.TitledBorder(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TitledBorder_Border_String_int_int_Font()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.TitledBorder sut = null; // = new
                                                          // TitledBorder(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font);
    }

    /**
     * Test method for
     * {@link javax.swing.border.TitledBorder#TitledBorder(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font,java.awt.Color)
     * public
     * javax.swing.border.TitledBorder(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font,java.awt.Color)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TitledBorder_Border_String_int_int_Font_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.TitledBorder sut = null; // = new
                                                          // TitledBorder(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font,java.awt.Color);
    }

    /**
     * Test method for {@link javax.swing.border.TitledBorder#TitledBorder(java.lang.String) public
     * javax.swing.border.TitledBorder(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TitledBorder_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.TitledBorder sut = null; // = new TitledBorder(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.border.TitledBorder> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.border.TitledBorder.class.isAssignableFrom(sut));
    }

}
