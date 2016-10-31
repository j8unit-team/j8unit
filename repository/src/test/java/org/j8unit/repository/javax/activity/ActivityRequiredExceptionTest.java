package org.j8unit.repository.javax.activity;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.activity.ActivityRequiredException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ActivityRequiredExceptionTest
implements FactoryBasedJ8UnitTest<ActivityRequiredException>, org.j8unit.repository.javax.activity.ActivityRequiredExceptionTests<ActivityRequiredException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activity.ActivityRequiredException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ActivityRequiredException::new);
    }

    @Parameter(0)
    public Callable<ActivityRequiredException> sutFactory;

    @Override
    public Callable<ActivityRequiredException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activity.ActivityRequiredException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activity.ActivityRequiredException]

}
