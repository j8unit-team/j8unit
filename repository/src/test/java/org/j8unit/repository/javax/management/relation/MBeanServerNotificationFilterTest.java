package org.j8unit.repository.javax.management.relation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.relation.MBeanServerNotificationFilter;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MBeanServerNotificationFilterTest
implements FactoryBasedJ8UnitTest<MBeanServerNotificationFilter>,
org.j8unit.repository.javax.management.relation.MBeanServerNotificationFilterTests<MBeanServerNotificationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.MBeanServerNotificationFilter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MBeanServerNotificationFilter::new);
    }

    @Parameter(0)
    public Callable<MBeanServerNotificationFilter> sutFactory;

    @Override
    public Callable<MBeanServerNotificationFilter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.MBeanServerNotificationFilter]

}
