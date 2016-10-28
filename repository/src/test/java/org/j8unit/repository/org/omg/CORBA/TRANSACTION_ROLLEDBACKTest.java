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
import org.omg.CORBA.TRANSACTION_ROLLEDBACK;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TRANSACTION_ROLLEDBACKTest
implements FactoryBasedJ8UnitTest<TRANSACTION_ROLLEDBACK>, org.j8unit.repository.org.omg.CORBA.TRANSACTION_ROLLEDBACKTests<TRANSACTION_ROLLEDBACK> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.TRANSACTION_ROLLEDBACK]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TRANSACTION_ROLLEDBACK::new);
    }

    @Parameter(0)
    public Callable<TRANSACTION_ROLLEDBACK> sutFactory;

    @Override
    public Callable<TRANSACTION_ROLLEDBACK> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.TRANSACTION_ROLLEDBACK]

}
