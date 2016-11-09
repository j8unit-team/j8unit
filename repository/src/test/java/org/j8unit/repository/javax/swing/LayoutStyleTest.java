package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LayoutStyle} (by simply reusing the
 * J8Unit test interface {@link LayoutStyleTests}).
 */

@RunWith(J8Unit4.class)
public class LayoutStyleTest
implements LayoutStyleTests<LayoutStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.LayoutStyle]

    @Override
    public LayoutStyle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.LayoutStyle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.LayoutStyle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.LayoutStyle]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ComponentPlacement} (by simply
     * reusing the J8Unit test interface {@link ComponentPlacementTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ComponentPlacementTest
    implements ComponentPlacementTests<ComponentPlacement> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.LayoutStyle$ComponentPlacement]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(ComponentPlacement.class);
        }

        @Parameter(0)
        public ComponentPlacement sut;

        @Override
        public ComponentPlacement createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.LayoutStyle$ComponentPlacement]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.LayoutStyle$ComponentPlacement]

    }

}
