package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.Component;
import java.awt.Component.BaselineResizeBehavior;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Component} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.ComponentTests}).
 */

@RunWith(J8Unit4.class)
public class ComponentTest
implements ComponentTests<Component> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Component]

    @Override
    public Component createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Component], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Component]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Component]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link BaselineResizeBehavior} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.awt.ComponentTests.BaselineResizeBehaviorTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BaselineResizeBehaviorTest
    implements BaselineResizeBehaviorTests<BaselineResizeBehavior> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Component$BaselineResizeBehavior]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(BaselineResizeBehavior.class);
        }

        @Parameter(0)
        public BaselineResizeBehavior sut;

        @Override
        public BaselineResizeBehavior createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Component$BaselineResizeBehavior]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Component$BaselineResizeBehavior]

    }

}
