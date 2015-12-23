package org.j8unit.repository.java.awt.geom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QuadCurve2DClassTest
implements org.j8unit.repository.java.awt.geom.QuadCurve2DClassTests<java.awt.geom.QuadCurve2D> {

    @Override
    public Class<java.awt.geom.QuadCurve2D> createNewSUT() {
        return java.awt.geom.QuadCurve2D.class;
    }

    @RunWith(J8Unit4.class)
    public static class FloatClassTest
    implements org.j8unit.repository.java.awt.geom.QuadCurve2DClassTests.FloatClassTests<java.awt.geom.QuadCurve2D.Float> {

        @Override
        public Class<java.awt.geom.QuadCurve2D.Float> createNewSUT() {
            return java.awt.geom.QuadCurve2D.Float.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class DoubleClassTest
    implements org.j8unit.repository.java.awt.geom.QuadCurve2DClassTests.DoubleClassTests<java.awt.geom.QuadCurve2D.Double> {

        @Override
        public Class<java.awt.geom.QuadCurve2D.Double> createNewSUT() {
            return java.awt.geom.QuadCurve2D.Double.class;
        }

    }

}
