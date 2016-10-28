package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.sql.SQLDataException;
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
public class SQLDataExceptionTest
implements FactoryBasedJ8UnitTest<SQLDataException>, org.j8unit.repository.java.sql.SQLDataExceptionTests<SQLDataException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLDataException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SQLDataException::new);
    }

    @Parameter(0)
    public Callable<SQLDataException> sutFactory;

    @Override
    public Callable<SQLDataException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLDataException]

}
