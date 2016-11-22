package org.j8unit.repository.javax.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.cert.CertificateParsingException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CertificateParsingExceptionTest
implements FactoryBasedJ8UnitTest<CertificateParsingException>, CertificateParsingExceptionTests<CertificateParsingException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.cert.CertificateParsingException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CertificateParsingException::new);
    }

    @Parameter(0)
    public Callable<CertificateParsingException> sutFactory;

    @Override
    public Callable<CertificateParsingException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.cert.CertificateParsingException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.cert.CertificateParsingException]

}
