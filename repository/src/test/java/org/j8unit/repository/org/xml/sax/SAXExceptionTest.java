package org.j8unit.repository.org.xml.sax;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.xml.sax.SAXException;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SAXExceptionTest
implements FactoryBasedJ8UnitTest<SAXException>, SAXExceptionTests<SAXException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.SAXException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SAXException::new);
    }

    @Parameter(0)
    public Callable<SAXException> sutFactory;

    @Override
    public Callable<SAXException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.SAXException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.SAXException]

}
