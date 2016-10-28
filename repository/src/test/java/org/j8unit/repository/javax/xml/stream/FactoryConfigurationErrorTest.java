package org.j8unit.repository.javax.xml.stream;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.stream.FactoryConfigurationError;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FactoryConfigurationErrorTest
implements FactoryBasedJ8UnitTest<FactoryConfigurationError>, org.j8unit.repository.javax.xml.stream.FactoryConfigurationErrorTests<FactoryConfigurationError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.FactoryConfigurationError]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(FactoryConfigurationError::new);
    }

    @Parameter(0)
    public Callable<FactoryConfigurationError> sutFactory;

    @Override
    public Callable<FactoryConfigurationError> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.FactoryConfigurationError]

}
