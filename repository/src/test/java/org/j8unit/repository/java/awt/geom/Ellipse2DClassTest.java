package org.j8unit.repository.java.awt.geom;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Ellipse2D.Float;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Ellipse2D} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.geom.Ellipse2DClassTests}).
 */

@RunWith(J8Unit4.class)
public class Ellipse2DClassTest
implements Ellipse2DClassTests<Ellipse2D> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.Ellipse2D]

    @Override
    public Class<Ellipse2D> createNewSUT() {
        return Ellipse2D.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.geom.Ellipse2D]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.Ellipse2D]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Double} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.awt.geom.Ellipse2DClassTests.DoubleClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DoubleClassTest
    implements DoubleClassTests<Double> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.Ellipse2D$Double]

        @Override
        public Class<Double> createNewSUT() {
            return Double.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link java.awt.geom.Ellipse2D.Double#Double()
         * public java.awt.geom.Ellipse2D$Double()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Double sut = new Double();
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.awt.geom.Ellipse2D.Double#Double(double, double, double, double) public
         * java.awt.geom.Ellipse2D$Double(double,double,double,double)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Double_double_double_double_double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Double sut = null; // = new Double(double, double, double, double);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.geom.Ellipse2D$Double]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.Ellipse2D$Double]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Float} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.awt.geom.Ellipse2DClassTests.FloatClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FloatClassTest
    implements FloatClassTests<Float> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.Ellipse2D$Float]

        @Override
        public Class<Float> createNewSUT() {
            return Float.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link java.awt.geom.Ellipse2D.Float#Float()
         * public java.awt.geom.Ellipse2D$Float()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Float sut = new Float();
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.awt.geom.Ellipse2D.Float#Float(float, float, float, float) public
         * java.awt.geom.Ellipse2D$Float(float,float,float,float)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Float_float_float_float_float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Float sut = null; // = new Float(float, float, float, float);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.geom.Ellipse2D$Float]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.Ellipse2D$Float]

    }

}
