package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.font.TextLayout;
import java.awt.font.TextLayout.CaretPolicy;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextLayout} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.TextLayoutTests}).
 */

@RunWith(J8Unit4.class)
public class TextLayoutTest
implements TextLayoutTests<TextLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TextLayout]

    @Override
    public TextLayout createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.TextLayout], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.TextLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.TextLayout]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CaretPolicyTest
    implements FactoryBasedJ8UnitTest<CaretPolicy>, CaretPolicyTests<CaretPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TextLayout$CaretPolicy]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(CaretPolicy::new);
        }

        @Parameter(0)
        public Callable<CaretPolicy> sutFactory;

        @Override
        public Callable<CaretPolicy> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.TextLayout$CaretPolicy]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.TextLayout$CaretPolicy]

    }

}
