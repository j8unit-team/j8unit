package org.j8unit.repository.javax.xml.stream;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.stream.XMLStreamException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class XMLStreamExceptionTest
implements FactoryBasedJ8UnitTest<XMLStreamException>, XMLStreamExceptionTests<XMLStreamException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLStreamException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(XMLStreamException::new);
    }

    @Parameter(0)
    public Callable<XMLStreamException> sutFactory;

    @Override
    public Callable<XMLStreamException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLStreamException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLStreamException]

}
