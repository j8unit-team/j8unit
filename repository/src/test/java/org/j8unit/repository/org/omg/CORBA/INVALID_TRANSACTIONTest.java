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
import org.omg.CORBA.INVALID_TRANSACTION;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class INVALID_TRANSACTIONTest
implements FactoryBasedJ8UnitTest<INVALID_TRANSACTION>, INVALID_TRANSACTIONTests<INVALID_TRANSACTION> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.INVALID_TRANSACTION]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(INVALID_TRANSACTION::new);
    }

    @Parameter(0)
    public Callable<INVALID_TRANSACTION> sutFactory;

    @Override
    public Callable<INVALID_TRANSACTION> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.INVALID_TRANSACTION]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.INVALID_TRANSACTION]

}
