package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.DefaultFocusTraversalPolicy;
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
public class DefaultFocusTraversalPolicyTest
implements FactoryBasedJ8UnitTest<DefaultFocusTraversalPolicy>, org.j8unit.repository.java.awt.DefaultFocusTraversalPolicyTests<DefaultFocusTraversalPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.DefaultFocusTraversalPolicy]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultFocusTraversalPolicy::new);
    }

    @Parameter(0)
    public Callable<DefaultFocusTraversalPolicy> sutFactory;

    @Override
    public Callable<DefaultFocusTraversalPolicy> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.DefaultFocusTraversalPolicy]

}
