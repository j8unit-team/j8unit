package org.j8unit.repository.javax.management.loading;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.loading.MLet;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MLetTest
implements FactoryBasedJ8UnitTest<MLet>, org.j8unit.repository.javax.management.loading.MLetTests<MLet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.MLet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MLet::new);
    }

    @Parameter(0)
    public Callable<MLet> sutFactory;

    @Override
    public Callable<MLet> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.MLet]

}
