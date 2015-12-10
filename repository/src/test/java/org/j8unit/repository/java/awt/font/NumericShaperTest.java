package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class NumericShaperTest
implements org.j8unit.repository.java.awt.font.NumericShaperTests<java.awt.font.NumericShaper> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class RangeTest
    implements org.j8unit.repository.java.awt.font.NumericShaperTests.RangeTests<java.awt.font.NumericShaper.Range> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.awt.font.NumericShaper.Range.class);
        }

        @Parameter(0)
        public java.awt.font.NumericShaper.Range sut;

        @Override
        public java.awt.font.NumericShaper.Range createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.awt.font.NumericShaper createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.font.NumericShaper] available.");
    }

}
