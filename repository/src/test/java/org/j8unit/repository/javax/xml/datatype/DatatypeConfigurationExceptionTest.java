package org.j8unit.repository.javax.xml.datatype;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.datatype.DatatypeConfigurationException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DatatypeConfigurationExceptionTest
implements FactoryBasedJ8UnitTest<DatatypeConfigurationException>,
org.j8unit.repository.javax.xml.datatype.DatatypeConfigurationExceptionTests<DatatypeConfigurationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConfigurationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DatatypeConfigurationException::new);
    }

    @Parameter(0)
    public Callable<DatatypeConfigurationException> sutFactory;

    @Override
    public Callable<DatatypeConfigurationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.DatatypeConfigurationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.DatatypeConfigurationException]

}
