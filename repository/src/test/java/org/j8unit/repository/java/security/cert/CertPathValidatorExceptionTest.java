package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CertPathValidatorExceptionTest
implements org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests<java.security.cert.CertPathValidatorException> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BasicReasonTest
    implements
    org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.BasicReasonTests<java.security.cert.CertPathValidatorException.BasicReason> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.security.cert.CertPathValidatorException.BasicReason.class);
        }

        @Parameter(0)
        public java.security.cert.CertPathValidatorException.BasicReason sut;

        @Override
        public java.security.cert.CertPathValidatorException.BasicReason createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.security.cert.CertPathValidatorException createNewSUT() {
        return new java.security.cert.CertPathValidatorException();
    }

}
