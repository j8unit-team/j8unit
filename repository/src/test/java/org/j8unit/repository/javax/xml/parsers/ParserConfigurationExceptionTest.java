package org.j8unit.repository.javax.xml.parsers;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.parsers.ParserConfigurationException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ParserConfigurationExceptionTest
implements FactoryBasedJ8UnitTest<ParserConfigurationException>, ParserConfigurationExceptionTests<ParserConfigurationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.ParserConfigurationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ParserConfigurationException::new);
    }

    @Parameter(0)
    public Callable<ParserConfigurationException> sutFactory;

    @Override
    public Callable<ParserConfigurationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.parsers.ParserConfigurationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.parsers.ParserConfigurationException]

}
