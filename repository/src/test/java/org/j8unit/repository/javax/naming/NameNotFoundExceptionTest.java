package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.NameNotFoundException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NameNotFoundExceptionTest
implements FactoryBasedJ8UnitTest<NameNotFoundException>, NameNotFoundExceptionTests<NameNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NameNotFoundException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NameNotFoundException::new);
    }

    @Parameter(0)
    public Callable<NameNotFoundException> sutFactory;

    @Override
    public Callable<NameNotFoundException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.NameNotFoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.NameNotFoundException]

}
