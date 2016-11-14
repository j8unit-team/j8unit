package org.j8unit.repository.java.rmi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.RemoteException;
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
public class RemoteExceptionTest
implements FactoryBasedJ8UnitTest<RemoteException>, RemoteExceptionTests<RemoteException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.RemoteException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(RemoteException::new);
    }

    @Parameter(0)
    public Callable<RemoteException> sutFactory;

    @Override
    public Callable<RemoteException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.RemoteException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.RemoteException]

}
