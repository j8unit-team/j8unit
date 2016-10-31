package org.j8unit.repository.javax.naming.ldap;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.ldap.StartTlsRequest;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StartTlsRequestTest
implements FactoryBasedJ8UnitTest<StartTlsRequest>, org.j8unit.repository.javax.naming.ldap.StartTlsRequestTests<StartTlsRequest> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.StartTlsRequest]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(StartTlsRequest::new);
    }

    @Parameter(0)
    public Callable<StartTlsRequest> sutFactory;

    @Override
    public Callable<StartTlsRequest> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.StartTlsRequest]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.StartTlsRequest]

}
