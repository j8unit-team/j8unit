package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.cert.CRLException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CRLExceptionTest
implements FactoryBasedJ8UnitTest<CRLException>, org.j8unit.repository.java.security.cert.CRLExceptionTests<CRLException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CRLException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CRLException::new);
    }

    @Parameter(0)
    public Callable<CRLException> sutFactory;

    @Override
    public Callable<CRLException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CRLException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CRLException]

}
