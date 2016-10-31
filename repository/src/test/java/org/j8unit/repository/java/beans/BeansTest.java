package org.j8unit.repository.java.beans;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.beans.Beans;
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
public class BeansTest
implements FactoryBasedJ8UnitTest<Beans>, org.j8unit.repository.java.beans.BeansTests<Beans> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Beans]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Beans::new);
    }

    @Parameter(0)
    public Callable<Beans> sutFactory;

    @Override
    public Callable<Beans> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.Beans]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.Beans]

}
