package org.j8unit.repository.javax.xml.transform;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.transform.TransformerConfigurationException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TransformerConfigurationExceptionTest
implements FactoryBasedJ8UnitTest<TransformerConfigurationException>,
org.j8unit.repository.javax.xml.transform.TransformerConfigurationExceptionTests<TransformerConfigurationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.TransformerConfigurationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TransformerConfigurationException::new);
    }

    @Parameter(0)
    public Callable<TransformerConfigurationException> sutFactory;

    @Override
    public Callable<TransformerConfigurationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.TransformerConfigurationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.TransformerConfigurationException]

}
