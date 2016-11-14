package org.j8unit.repository.java.rmi.server;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.server.UID;
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
public class UIDTest
implements FactoryBasedJ8UnitTest<UID>, UIDTests<UID> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.UID]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UID::new);
    }

    @Parameter(0)
    public Callable<UID> sutFactory;

    @Override
    public Callable<UID> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.UID]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.UID]

}