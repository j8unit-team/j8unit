package org.j8unit.repository.javax.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.cert.CertificateEncodingException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CertificateEncodingExceptionTest
implements FactoryBasedJ8UnitTest<CertificateEncodingException>, CertificateEncodingExceptionTests<CertificateEncodingException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.cert.CertificateEncodingException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CertificateEncodingException::new);
    }

    @Parameter(0)
    public Callable<CertificateEncodingException> sutFactory;

    @Override
    public Callable<CertificateEncodingException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.cert.CertificateEncodingException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.cert.CertificateEncodingException]

}
