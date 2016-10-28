package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.sql.SQLTransientException;
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
public class SQLTransientExceptionTest
implements FactoryBasedJ8UnitTest<SQLTransientException>, org.j8unit.repository.java.sql.SQLTransientExceptionTests<SQLTransientException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLTransientException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SQLTransientException::new);
    }

    @Parameter(0)
    public Callable<SQLTransientException> sutFactory;

    @Override
    public Callable<SQLTransientException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLTransientException]

}
