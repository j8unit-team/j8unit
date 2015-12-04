package org.j8unit.repository.java.awt.geom;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.geom.Path2D class java.awt.geom.Path2D}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.awt.geom.Path2DTests}.
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
 * @see org.j8unit.repository.java.awt.geom.Path2DTests
 */
@Category(J8UnitRepository.class)
public abstract interface Path2DClassTests<SUT extends Class<? extends java.awt.geom.Path2D>>
extends org.j8unit.repository.java.awt.ShapeClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.geom.Path2D> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.geom.Path2D.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Path2D#intersects(java.awt.geom.PathIterator,double,double,double,double)
     * public static boolean java.awt.geom.Path2D.intersects(java.awt.geom.PathIterator,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_intersects_PathIterator_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Path2D#intersects(java.awt.geom.PathIterator,java.awt.geom.Rectangle2D)
     * public static boolean java.awt.geom.Path2D.intersects(java.awt.geom.PathIterator,java.awt.geom.Rectangle2D)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_intersects_PathIterator_Rectangle2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Path2D#contains(java.awt.geom.PathIterator,java.awt.geom.Rectangle2D) public
     * static boolean java.awt.geom.Path2D.contains(java.awt.geom.PathIterator,java.awt.geom.Rectangle2D)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_PathIterator_Rectangle2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Path2D#contains(java.awt.geom.PathIterator,java.awt.geom.Point2D) public
     * static boolean java.awt.geom.Path2D.contains(java.awt.geom.PathIterator,java.awt.geom.Point2D)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_PathIterator_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Path2D#contains(java.awt.geom.PathIterator,double,double,double,double)
     * public static boolean java.awt.geom.Path2D.contains(java.awt.geom.PathIterator,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_PathIterator_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Path2D#contains(java.awt.geom.PathIterator,double,double) public static
     * boolean java.awt.geom.Path2D.contains(java.awt.geom.PathIterator,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_PathIterator_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.awt.geom.Path2D$Double class java.awt.geom.Path2D$Double}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.geom.Path2DTests.DoubleTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.awt.geom.Path2DTests.DoubleTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DoubleClassTests<SUT extends Class<? extends java.awt.geom.Path2D.Double>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.Path2DClassTests<SUT> {

        /**
         * Test method for {@link java.awt.geom.Path2D.Double#Double(java.awt.Shape,java.awt.geom.AffineTransform)
         * public java.awt.geom.Path2D$Double(java.awt.Shape,java.awt.geom.AffineTransform)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_Shape_AffineTransform()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Double sut = null; // = new Double(java.awt.Shape,java.awt.geom.AffineTransform);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Double#Double(java.awt.Shape) public
         * java.awt.geom.Path2D$Double(java.awt.Shape)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_Shape()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Double sut = null; // = new Double(java.awt.Shape);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Double#Double(int,int) public
         * java.awt.geom.Path2D$Double(int,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Double sut = null; // = new Double(int,int);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Double#Double(int) public java.awt.geom.Path2D$Double(int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Double sut = null; // = new Double(int);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Double#Double() public java.awt.geom.Path2D$Double()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Double sut = null; // = new Double();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.geom.Path2D.Double> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Path2D.Double.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.geom.Path2D$Float class java.awt.geom.Path2D$Float}, containing all class relevant
     * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.geom.Path2DTests.FloatTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.awt.geom.Path2DTests.FloatTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FloatClassTests<SUT extends Class<? extends java.awt.geom.Path2D.Float>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.Path2DClassTests<SUT> {

        /**
         * Test method for {@link java.awt.geom.Path2D.Float#Float(java.awt.Shape,java.awt.geom.AffineTransform) public
         * java.awt.geom.Path2D$Float(java.awt.Shape,java.awt.geom.AffineTransform)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_Shape_AffineTransform()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Float sut = null; // = new Float(java.awt.Shape,java.awt.geom.AffineTransform);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Float#Float(java.awt.Shape) public
         * java.awt.geom.Path2D$Float(java.awt.Shape)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_Shape()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Float sut = null; // = new Float(java.awt.Shape);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Float#Float(int,int) public java.awt.geom.Path2D$Float(int,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Float sut = null; // = new Float(int,int);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Float#Float(int) public java.awt.geom.Path2D$Float(int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Float sut = null; // = new Float(int);
        }

        /**
         * Test method for {@link java.awt.geom.Path2D.Float#Float() public java.awt.geom.Path2D$Float()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Path2D.Float sut = null; // = new Float();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.geom.Path2D.Float> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Path2D.Float.class.isAssignableFrom(sut));
        }

    }

}
