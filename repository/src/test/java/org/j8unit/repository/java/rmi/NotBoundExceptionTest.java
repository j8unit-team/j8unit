package org.j8unit.repository.java.rmi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.NotBoundException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NotBoundExceptionTest
implements FactoryBasedJ8UnitTest<NotBoundException>, org.j8unit.repository.java.rmi.NotBoundExceptionTests<NotBoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.NotBoundException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NotBoundException::new);
    }

    @Parameter(0)
    public Callable<NotBoundException> sutFactory;

    @Override
    public Callable<NotBoundException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.NotBoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.NotBoundException]

}
