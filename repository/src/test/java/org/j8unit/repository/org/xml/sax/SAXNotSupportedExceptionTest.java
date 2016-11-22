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
import org.xml.sax.SAXNotSupportedException;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SAXNotSupportedExceptionTest
implements FactoryBasedJ8UnitTest<SAXNotSupportedException>, SAXNotSupportedExceptionTests<SAXNotSupportedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.SAXNotSupportedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SAXNotSupportedException::new);
    }

    @Parameter(0)
    public Callable<SAXNotSupportedException> sutFactory;

    @Override
    public Callable<SAXNotSupportedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.SAXNotSupportedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.SAXNotSupportedException]

}
