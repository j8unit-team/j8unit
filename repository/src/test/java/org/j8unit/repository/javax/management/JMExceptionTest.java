package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.JMException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JMExceptionTest
implements FactoryBasedJ8UnitTest<JMException>, JMExceptionTests<JMException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.JMException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JMException::new);
    }

    @Parameter(0)
    public Callable<JMException> sutFactory;

    @Override
    public Callable<JMException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.JMException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.JMException]

}
