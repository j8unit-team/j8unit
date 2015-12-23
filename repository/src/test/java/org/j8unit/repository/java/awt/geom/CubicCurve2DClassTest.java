package org.j8unit.repository.java.awt.geom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CubicCurve2DClassTest
implements org.j8unit.repository.java.awt.geom.CubicCurve2DClassTests<java.awt.geom.CubicCurve2D> {

    @Override
    public Class<java.awt.geom.CubicCurve2D> createNewSUT() {
        return java.awt.geom.CubicCurve2D.class;
    }

    @RunWith(J8Unit4.class)
    public static class DoubleClassTest
    implements org.j8unit.repository.java.awt.geom.CubicCurve2DClassTests.DoubleClassTests<java.awt.geom.CubicCurve2D.Double> {

        @Override
        public Class<java.awt.geom.CubicCurve2D.Double> createNewSUT() {
            return java.awt.geom.CubicCurve2D.Double.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class FloatClassTest
    implements org.j8unit.repository.java.awt.geom.CubicCurve2DClassTests.FloatClassTests<java.awt.geom.CubicCurve2D.Float> {

        @Override
        public Class<java.awt.geom.CubicCurve2D.Float> createNewSUT() {
            return java.awt.geom.CubicCurve2D.Float.class;
        }

    }

}
