package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.BasicStroke class java.awt.BasicStroke}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.awt.BasicStrokeTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.BasicStrokeTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicStrokeClassTests<SUT extends java.awt.BasicStroke>
extends org.j8unit.repository.java.awt.StrokeClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.awt.BasicStroke#BasicStroke() public java.awt.BasicStroke()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke();
    }

    /**
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float) public java.awt.BasicStroke(float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke(float);
    }

    /**
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float,int,int) public
     * java.awt.BasicStroke(float,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke_float_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke(float,int,int);
    }

    /**
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float,int,int,float) public
     * java.awt.BasicStroke(float,int,int,float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke_float_int_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke(float,int,int,float);
    }

    /**
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float,int,int,float,float[],float) public
     * java.awt.BasicStroke(float,int,int,float,float[],float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke_float_int_int_float_floatArray_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke(float,int,int,float,float[],float);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.BasicStroke.class.isAssignableFrom(sut));
    }

}
