package org.j8unit.repository.javax.sql.rowset.spi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.sql.rowset.spi.SyncFactoryException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SyncFactoryExceptionTest
implements FactoryBasedJ8UnitTest<SyncFactoryException>, SyncFactoryExceptionTests<SyncFactoryException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncFactoryException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SyncFactoryException::new);
    }

    @Parameter(0)
    public Callable<SyncFactoryException> sutFactory;

    @Override
    public Callable<SyncFactoryException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.spi.SyncFactoryException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.spi.SyncFactoryException]

}
