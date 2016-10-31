package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.PERSIST_STORE;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PERSIST_STORETest
implements FactoryBasedJ8UnitTest<PERSIST_STORE>, org.j8unit.repository.org.omg.CORBA.PERSIST_STORETests<PERSIST_STORE> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.PERSIST_STORE]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PERSIST_STORE::new);
    }

    @Parameter(0)
    public Callable<PERSIST_STORE> sutFactory;

    @Override
    public Callable<PERSIST_STORE> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.PERSIST_STORE]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.PERSIST_STORE]

}
