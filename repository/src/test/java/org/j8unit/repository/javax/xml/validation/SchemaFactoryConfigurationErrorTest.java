package org.j8unit.repository.javax.xml.validation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.validation.SchemaFactoryConfigurationError;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SchemaFactoryConfigurationErrorTest
implements FactoryBasedJ8UnitTest<SchemaFactoryConfigurationError>,
org.j8unit.repository.javax.xml.validation.SchemaFactoryConfigurationErrorTests<SchemaFactoryConfigurationError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.SchemaFactoryConfigurationError]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SchemaFactoryConfigurationError::new);
    }

    @Parameter(0)
    public Callable<SchemaFactoryConfigurationError> sutFactory;

    @Override
    public Callable<SchemaFactoryConfigurationError> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.SchemaFactoryConfigurationError]

}
