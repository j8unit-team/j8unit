package org.j8unit.repository.javax.activity;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.activity.InvalidActivityException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidActivityExceptionTest
implements FactoryBasedJ8UnitTest<InvalidActivityException>, org.j8unit.repository.javax.activity.InvalidActivityExceptionTests<InvalidActivityException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activity.InvalidActivityException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidActivityException::new);
    }

    @Parameter(0)
    public Callable<InvalidActivityException> sutFactory;

    @Override
    public Callable<InvalidActivityException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activity.InvalidActivityException]

}
