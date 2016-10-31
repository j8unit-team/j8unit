package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.sql.SQLNonTransientException;
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
public class SQLNonTransientExceptionTest
implements FactoryBasedJ8UnitTest<SQLNonTransientException>, org.j8unit.repository.java.sql.SQLNonTransientExceptionTests<SQLNonTransientException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLNonTransientException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SQLNonTransientException::new);
    }

    @Parameter(0)
    public Callable<SQLNonTransientException> sutFactory;

    @Override
    public Callable<SQLNonTransientException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLNonTransientException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLNonTransientException]

}
