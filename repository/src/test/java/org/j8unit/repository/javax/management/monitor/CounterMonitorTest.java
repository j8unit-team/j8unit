package org.j8unit.repository.javax.management.monitor;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.monitor.CounterMonitor;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CounterMonitorTest
implements FactoryBasedJ8UnitTest<CounterMonitor>, org.j8unit.repository.javax.management.monitor.CounterMonitorTests<CounterMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.CounterMonitor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CounterMonitor::new);
    }

    @Parameter(0)
    public Callable<CounterMonitor> sutFactory;

    @Override
    public Callable<CounterMonitor> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.CounterMonitor]

}
