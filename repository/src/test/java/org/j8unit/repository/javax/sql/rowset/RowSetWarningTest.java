package org.j8unit.repository.javax.sql.rowset;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.sql.rowset.RowSetWarning;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RowSetWarningTest
implements FactoryBasedJ8UnitTest<RowSetWarning>, org.j8unit.repository.javax.sql.rowset.RowSetWarningTests<RowSetWarning> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.RowSetWarning]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(RowSetWarning::new);
    }

    @Parameter(0)
    public Callable<RowSetWarning> sutFactory;

    @Override
    public Callable<RowSetWarning> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.RowSetWarning]

}
