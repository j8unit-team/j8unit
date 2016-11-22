package org.j8unit.repository.javax.activity;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.activity.ActivityCompletedException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ActivityCompletedExceptionTest
implements FactoryBasedJ8UnitTest<ActivityCompletedException>, ActivityCompletedExceptionTests<ActivityCompletedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activity.ActivityCompletedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ActivityCompletedException::new);
    }

    @Parameter(0)
    public Callable<ActivityCompletedException> sutFactory;

    @Override
    public Callable<ActivityCompletedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activity.ActivityCompletedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activity.ActivityCompletedException]

}
