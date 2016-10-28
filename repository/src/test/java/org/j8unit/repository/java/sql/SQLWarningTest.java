package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.sql.SQLWarning;
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
public class SQLWarningTest
implements FactoryBasedJ8UnitTest<SQLWarning>, org.j8unit.repository.java.sql.SQLWarningTests<SQLWarning> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLWarning]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SQLWarning::new);
    }

    @Parameter(0)
    public Callable<SQLWarning> sutFactory;

    @Override
    public Callable<SQLWarning> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLWarning]

}
