package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.BasicStroke class java.awt.BasicStroke}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.BasicStrokeTests}.
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
 * @see org.j8unit.repository.java.awt.BasicStrokeTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.BasicStroke
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicStrokeClassTests<SUT extends java.awt.BasicStroke>
extends org.j8unit.repository.java.awt.StrokeClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.BasicStroke#BasicStroke() public java.awt.BasicStroke()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.BasicStroke#BasicStroke()
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
     * <p>
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float) public java.awt.BasicStroke(float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.BasicStroke#BasicStroke(float)
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
     * <p>
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float, int, int) public
     * java.awt.BasicStroke(float,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.BasicStroke#BasicStroke(float, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke_float_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke(float, int, int);
    }

    /**
     * <p>
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float, int, int, float) public
     * java.awt.BasicStroke(float,int,int,float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.BasicStroke#BasicStroke(float, int, int, float)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke_float_int_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke(float, int, int, float);
    }

    /**
     * <p>
     * Test method for {@link java.awt.BasicStroke#BasicStroke(float, int, int, float, float[], float) public
     * java.awt.BasicStroke(float,int,int,float,float[],float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.BasicStroke#BasicStroke(float, int, int, float, float[], float)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicStroke_float_int_int_float_floatArray_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.BasicStroke sut = null; // = new BasicStroke(float, int, int, float, float[], float);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.awt.BasicStroke#isAssignableFrom(java.lang.Class)
     */
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
