package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.file.ProviderNotFoundException;
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
public class ProviderNotFoundExceptionTest
implements FactoryBasedJ8UnitTest<ProviderNotFoundException>, ProviderNotFoundExceptionTests<ProviderNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.ProviderNotFoundException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ProviderNotFoundException::new);
    }

    @Parameter(0)
    public Callable<ProviderNotFoundException> sutFactory;

    @Override
    public Callable<ProviderNotFoundException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.ProviderNotFoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.ProviderNotFoundException]

}
