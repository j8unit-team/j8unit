package org.j8unit.repository.javax.management.modelmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.modelmbean.XMLParseException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class XMLParseExceptionTest
implements FactoryBasedJ8UnitTest<XMLParseException>, org.j8unit.repository.javax.management.modelmbean.XMLParseExceptionTests<XMLParseException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.XMLParseException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(XMLParseException::new);
    }

    @Parameter(0)
    public Callable<XMLParseException> sutFactory;

    @Override
    public Callable<XMLParseException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.modelmbean.XMLParseException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.modelmbean.XMLParseException]

}
