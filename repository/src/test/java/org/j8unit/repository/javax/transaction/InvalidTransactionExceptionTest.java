package org.j8unit.repository.javax.transaction;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.transaction.InvalidTransactionException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidTransactionExceptionTest
implements FactoryBasedJ8UnitTest<InvalidTransactionException>,
org.j8unit.repository.javax.transaction.InvalidTransactionExceptionTests<InvalidTransactionException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.transaction.InvalidTransactionException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidTransactionException::new);
    }

    @Parameter(0)
    public Callable<InvalidTransactionException> sutFactory;

    @Override
    public Callable<InvalidTransactionException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.transaction.InvalidTransactionException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.transaction.InvalidTransactionException]

}
