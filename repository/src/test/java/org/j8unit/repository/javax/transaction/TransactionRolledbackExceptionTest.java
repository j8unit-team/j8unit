package org.j8unit.repository.javax.transaction;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.transaction.TransactionRolledbackException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TransactionRolledbackExceptionTest
implements FactoryBasedJ8UnitTest<TransactionRolledbackException>, TransactionRolledbackExceptionTests<TransactionRolledbackException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.transaction.TransactionRolledbackException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TransactionRolledbackException::new);
    }

    @Parameter(0)
    public Callable<TransactionRolledbackException> sutFactory;

    @Override
    public Callable<TransactionRolledbackException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.transaction.TransactionRolledbackException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.transaction.TransactionRolledbackException]

}
