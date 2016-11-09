package org.j8unit.repository.javax.management.timer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.timer.Timer;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TimerTest
implements FactoryBasedJ8UnitTest<Timer>, TimerTests<Timer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.timer.Timer]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Timer::new);
    }

    @Parameter(0)
    public Callable<Timer> sutFactory;

    @Override
    public Callable<Timer> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.timer.Timer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.timer.Timer]

}
