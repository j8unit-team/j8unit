package org.j8unit.repository.java.awt.geom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Rectangle2DClassTest
implements org.j8unit.repository.java.awt.geom.Rectangle2DClassTests<java.awt.geom.Rectangle2D> {

    @Override
    public Class<java.awt.geom.Rectangle2D> createNewSUT() {
        return java.awt.geom.Rectangle2D.class;
    }

    @RunWith(J8Unit4.class)
    public static class FloatClassTest
    implements org.j8unit.repository.java.awt.geom.Rectangle2DClassTests.FloatClassTests<java.awt.geom.Rectangle2D.Float> {

        @Override
        public Class<java.awt.geom.Rectangle2D.Float> createNewSUT() {
            return java.awt.geom.Rectangle2D.Float.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class DoubleClassTest
    implements org.j8unit.repository.java.awt.geom.Rectangle2DClassTests.DoubleClassTests<java.awt.geom.Rectangle2D.Double> {

        @Override
        public Class<java.awt.geom.Rectangle2D.Double> createNewSUT() {
            return java.awt.geom.Rectangle2D.Double.class;
        }

    }

}
