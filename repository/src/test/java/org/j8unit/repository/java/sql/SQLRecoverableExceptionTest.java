package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.sql.SQLRecoverableException;
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
public class SQLRecoverableExceptionTest
implements FactoryBasedJ8UnitTest<SQLRecoverableException>, SQLRecoverableExceptionTests<SQLRecoverableException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLRecoverableException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SQLRecoverableException::new);
    }

    @Parameter(0)
    public Callable<SQLRecoverableException> sutFactory;

    @Override
    public Callable<SQLRecoverableException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLRecoverableException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLRecoverableException]

}
