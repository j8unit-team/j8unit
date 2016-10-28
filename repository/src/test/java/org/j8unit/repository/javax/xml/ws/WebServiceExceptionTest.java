package org.j8unit.repository.javax.xml.ws;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.ws.WebServiceException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class WebServiceExceptionTest
implements FactoryBasedJ8UnitTest<WebServiceException>, org.j8unit.repository.javax.xml.ws.WebServiceExceptionTests<WebServiceException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(WebServiceException::new);
    }

    @Parameter(0)
    public Callable<WebServiceException> sutFactory;

    @Override
    public Callable<WebServiceException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceException]

}
