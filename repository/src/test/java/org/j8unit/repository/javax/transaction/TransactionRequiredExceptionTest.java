package org.j8unit.repository.javax.transaction;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.transaction.TransactionRequiredException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TransactionRequiredExceptionTest
implements FactoryBasedJ8UnitTest<TransactionRequiredException>,
org.j8unit.repository.javax.transaction.TransactionRequiredExceptionTests<TransactionRequiredException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.transaction.TransactionRequiredException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TransactionRequiredException::new);
    }

    @Parameter(0)
    public Callable<TransactionRequiredException> sutFactory;

    @Override
    public Callable<TransactionRequiredException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.transaction.TransactionRequiredException]

}
