package org.j8unit.repository.javax.swing.border;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.border.LineBorder class javax.swing.border.LineBorder}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.border.LineBorderTests}.
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
 * @see org.j8unit.repository.javax.swing.border.LineBorderTests
 */
@Category(J8UnitRepository.class)
public abstract interface LineBorderClassTests<SUT extends Class<? extends javax.swing.border.LineBorder>>
extends org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.border.LineBorder#LineBorder(java.awt.Color) public
     * javax.swing.border.LineBorder(java.awt.Color)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LineBorder_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.LineBorder sut = null; // = new LineBorder(java.awt.Color);
    }

    /**
     * Test method for {@link javax.swing.border.LineBorder#LineBorder(java.awt.Color,int) public
     * javax.swing.border.LineBorder(java.awt.Color,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LineBorder_Color_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.LineBorder sut = null; // = new LineBorder(java.awt.Color,int);
    }

    /**
     * Test method for {@link javax.swing.border.LineBorder#LineBorder(java.awt.Color,int,boolean) public
     * javax.swing.border.LineBorder(java.awt.Color,int,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LineBorder_Color_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.border.LineBorder sut = null; // = new LineBorder(java.awt.Color,int,boolean);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.LineBorder#createBlackLineBorder() public static
     * javax.swing.border.Border javax.swing.border.LineBorder.createBlackLineBorder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createBlackLineBorder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.LineBorder#createGrayLineBorder() public static
     * javax.swing.border.Border javax.swing.border.LineBorder.createGrayLineBorder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createGrayLineBorder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.border.LineBorder> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.border.LineBorder.class.isAssignableFrom(sut));
    }

}
