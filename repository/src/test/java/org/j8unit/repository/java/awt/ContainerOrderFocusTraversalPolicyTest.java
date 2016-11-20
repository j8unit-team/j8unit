package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.ContainerOrderFocusTraversalPolicy;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ContainerOrderFocusTraversalPolicyTest
implements FactoryBasedJ8UnitTest<ContainerOrderFocusTraversalPolicy>, ContainerOrderFocusTraversalPolicyTests<ContainerOrderFocusTraversalPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.ContainerOrderFocusTraversalPolicy]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ContainerOrderFocusTraversalPolicy::new);
    }

    @Parameter(0)
    public Callable<ContainerOrderFocusTraversalPolicy> sutFactory;

    @Override
    public Callable<ContainerOrderFocusTraversalPolicy> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.ContainerOrderFocusTraversalPolicy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.ContainerOrderFocusTraversalPolicy]

}
