package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultipleGradientPaintClassTest
implements org.j8unit.repository.java.awt.MultipleGradientPaintClassTests<java.awt.MultipleGradientPaint> {

    @Override
    public Class<java.awt.MultipleGradientPaint> createNewSUT() {
        return java.awt.MultipleGradientPaint.class;
    }

    @RunWith(J8Unit4.class)
    public static class ColorSpaceTypeClassTest
    implements org.j8unit.repository.java.awt.MultipleGradientPaintClassTests.ColorSpaceTypeClassTests<java.awt.MultipleGradientPaint.ColorSpaceType> {

        @Override
        public Class<java.awt.MultipleGradientPaint.ColorSpaceType> createNewSUT() {
            return java.awt.MultipleGradientPaint.ColorSpaceType.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class CycleMethodClassTest
    implements org.j8unit.repository.java.awt.MultipleGradientPaintClassTests.CycleMethodClassTests<java.awt.MultipleGradientPaint.CycleMethod> {

        @Override
        public Class<java.awt.MultipleGradientPaint.CycleMethod> createNewSUT() {
            return java.awt.MultipleGradientPaint.CycleMethod.class;
        }

    }

}
