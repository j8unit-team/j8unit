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

@RunWith(J8Unit4.class)
public class ComponentTest
implements org.j8unit.repository.java.awt.ComponentTests<Component> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Component]

    @Override
    public Component createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Component], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Component]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BaselineResizeBehaviorTest
    implements org.j8unit.repository.java.awt.ComponentTests.BaselineResizeBehaviorTests<BaselineResizeBehavior> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Component$BaselineResizeBehavior]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(BaselineResizeBehavior.class);
        }

        @Parameter(0)
        public BaselineResizeBehavior sut;

        @Override
        public BaselineResizeBehavior createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Component$BaselineResizeBehavior]

    }

}
