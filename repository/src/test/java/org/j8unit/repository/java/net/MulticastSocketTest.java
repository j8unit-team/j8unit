package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.net.MulticastSocket;
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
public class MulticastSocketTest
implements FactoryBasedJ8UnitTest<MulticastSocket>, MulticastSocketTests<MulticastSocket> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.MulticastSocket]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MulticastSocket::new);
    }

    @Parameter(0)
    public Callable<MulticastSocket> sutFactory;

    @Override
    public Callable<MulticastSocket> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.MulticastSocket]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.MulticastSocket]

}
