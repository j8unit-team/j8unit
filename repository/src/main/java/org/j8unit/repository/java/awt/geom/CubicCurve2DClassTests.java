package org.j8unit.repository.java.awt.geom;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.geom.CubicCurve2D class java.awt.geom.CubicCurve2D},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.geom.CubicCurve2DTests}.
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
 * @see org.j8unit.repository.java.awt.geom.CubicCurve2DTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.geom.CubicCurve2D
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CubicCurve2DClassTests<SUT extends java.awt.geom.CubicCurve2D>
extends org.j8unit.repository.java.awt.ShapeClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.awt.geom.CubicCurve2D.Double class
     * java.awt.geom.CubicCurve2D$Double}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.geom.CubicCurve2DTests.DoubleTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.java.awt.geom.CubicCurve2DTests.DoubleTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D.Double
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DoubleClassTests<SUT extends java.awt.geom.CubicCurve2D.Double>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.CubicCurve2DClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.awt.geom.CubicCurve2D.Double#Double() public java.awt.geom.CubicCurve2D$Double()}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.CubicCurve2D.Double#Double()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.CubicCurve2D.Double sut = null; // = new Double();
        }

        /**
         * <p>
         * Test method for
         * {@link java.awt.geom.CubicCurve2D.Double#Double(double, double, double, double, double, double, double, double)
         * public java.awt.geom.CubicCurve2D$Double(double,double,double,double,double,double,double,double)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.CubicCurve2D.Double#Double(double, double, double, double, double, double, double,
         *             double)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_double_double_double_double_double_double_double_double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.CubicCurve2D.Double sut = null; // = new Double(double, double, double, double, double,
                                                                // double, double, double);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.awt.geom.CubicCurve2D.Double#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.CubicCurve2D.Double.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.awt.geom.CubicCurve2D.Float class
     * java.awt.geom.CubicCurve2D$Float}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.geom.CubicCurve2DTests.FloatTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.java.awt.geom.CubicCurve2DTests.FloatTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D.Float
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FloatClassTests<SUT extends java.awt.geom.CubicCurve2D.Float>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.CubicCurve2DClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.awt.geom.CubicCurve2D.Float#Float() public java.awt.geom.CubicCurve2D$Float()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.CubicCurve2D.Float#Float()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.CubicCurve2D.Float sut = null; // = new Float();
        }

        /**
         * <p>
         * Test method for
         * {@link java.awt.geom.CubicCurve2D.Float#Float(float, float, float, float, float, float, float, float) public
         * java.awt.geom.CubicCurve2D$Float(float,float,float,float,float,float,float,float)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.CubicCurve2D.Float#Float(float, float, float, float, float, float, float, float)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_float_float_float_float_float_float_float_float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.CubicCurve2D.Float sut = null; // = new Float(float, float, float, float, float, float,
                                                               // float, float);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.awt.geom.CubicCurve2D.Float#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.CubicCurve2D.Float.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.geom.CubicCurve2D#getFlatness(double, double, double, double, double, double, double, double)
     * public static double
     * java.awt.geom.CubicCurve2D.getFlatness(double,double,double,double,double,double,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#getFlatness(double, double, double, double, double, double, double,
     *             double)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlatness_double_double_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.CubicCurve2D#getFlatness(double[], int) public static double
     * java.awt.geom.CubicCurve2D.getFlatness(double[],int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#getFlatness(double[], int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlatness_doubleArray_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.geom.CubicCurve2D#getFlatnessSq(double, double, double, double, double, double, double, double)
     * public static double
     * java.awt.geom.CubicCurve2D.getFlatnessSq(double,double,double,double,double,double,double,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#getFlatnessSq(double, double, double, double, double, double, double,
     *             double)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlatnessSq_double_double_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.CubicCurve2D#getFlatnessSq(double[], int) public static double
     * java.awt.geom.CubicCurve2D.getFlatnessSq(double[],int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#getFlatnessSq(double[], int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlatnessSq_doubleArray_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.CubicCurve2D#solveCubic(double[]) public static int
     * java.awt.geom.CubicCurve2D.solveCubic(double[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#solveCubic(double[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_solveCubic_doubleArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.CubicCurve2D#solveCubic(double[], double[]) public static int
     * java.awt.geom.CubicCurve2D.solveCubic(double[],double[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#solveCubic(double[], double[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_solveCubic_doubleArray_doubleArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.geom.CubicCurve2D#subdivide(java.awt.geom.CubicCurve2D, java.awt.geom.CubicCurve2D, java.awt.geom.CubicCurve2D)
     * public static void
     * java.awt.geom.CubicCurve2D.subdivide(java.awt.geom.CubicCurve2D,java.awt.geom.CubicCurve2D,java.awt.geom.CubicCurve2D)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#subdivide(java.awt.geom.CubicCurve2D, java.awt.geom.CubicCurve2D,
     *             java.awt.geom.CubicCurve2D)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_subdivide_CubicCurve2D_CubicCurve2D_CubicCurve2D()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.CubicCurve2D#subdivide(double[], int, double[], int, double[], int) public
     * static void java.awt.geom.CubicCurve2D.subdivide(double[],int,double[],int,double[],int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#subdivide(double[], int, double[], int, double[], int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_subdivide_doubleArray_int_doubleArray_int_doubleArray_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.awt.geom.CubicCurve2D#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.geom.CubicCurve2D.class.isAssignableFrom(sut));
    }

}
