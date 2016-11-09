package org.j8unit.repository.javax.management.monitor;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.monitor.MonitorSettingException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MonitorSettingExceptionTest
implements FactoryBasedJ8UnitTest<MonitorSettingException>, MonitorSettingExceptionTests<MonitorSettingException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.MonitorSettingException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MonitorSettingException::new);
    }

    @Parameter(0)
    public Callable<MonitorSettingException> sutFactory;

    @Override
    public Callable<MonitorSettingException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.monitor.MonitorSettingException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.monitor.MonitorSettingException]

}
