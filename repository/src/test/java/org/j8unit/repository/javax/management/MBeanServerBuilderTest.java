package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.MBeanServerBuilder;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MBeanServerBuilderTest
implements FactoryBasedJ8UnitTest<MBeanServerBuilder>, MBeanServerBuilderTests<MBeanServerBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServerBuilder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MBeanServerBuilder::new);
    }

    @Parameter(0)
    public Callable<MBeanServerBuilder> sutFactory;

    @Override
    public Callable<MBeanServerBuilder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanServerBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanServerBuilder]

}
