package org.j8unit.repository.java.lang.invoke;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.invoke.SwitchPoint;
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
public class SwitchPointTest
implements FactoryBasedJ8UnitTest<SwitchPoint>, org.j8unit.repository.java.lang.invoke.SwitchPointTests<SwitchPoint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.SwitchPoint]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SwitchPoint::new);
    }

    @Parameter(0)
    public Callable<SwitchPoint> sutFactory;

    @Override
    public Callable<SwitchPoint> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.SwitchPoint]

}
