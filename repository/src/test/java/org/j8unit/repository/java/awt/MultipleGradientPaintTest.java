package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.MultipleGradientPaint;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.MultipleGradientPaint.CycleMethod;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class MultipleGradientPaintTest
implements org.j8unit.repository.java.awt.MultipleGradientPaintTests<MultipleGradientPaint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MultipleGradientPaint]

    @Override
    public MultipleGradientPaint createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.MultipleGradientPaint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MultipleGradientPaint]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ColorSpaceTypeTest
    implements org.j8unit.repository.java.awt.MultipleGradientPaintTests.ColorSpaceTypeTests<ColorSpaceType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MultipleGradientPaint$ColorSpaceType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(ColorSpaceType.class);
        }

        @Parameter(0)
        public ColorSpaceType sut;

        @Override
        public ColorSpaceType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MultipleGradientPaint$ColorSpaceType]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CycleMethodTest
    implements org.j8unit.repository.java.awt.MultipleGradientPaintTests.CycleMethodTests<CycleMethod> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MultipleGradientPaint$CycleMethod]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOfEnumClass(CycleMethod.class);
        }

        @Parameter(0)
        public CycleMethod sut;

        @Override
        public CycleMethod createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MultipleGradientPaint$CycleMethod]

    }

}
