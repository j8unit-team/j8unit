package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathValidatorExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests<java.security.cert.CertPathValidatorException> {

    @Override
    public Class<java.security.cert.CertPathValidatorException> createNewSUT() {
        return java.security.cert.CertPathValidatorException.class;
    }

    @RunWith(J8Unit4.class)
    public static class ReasonClassTest
    implements
    org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.ReasonClassTests<java.security.cert.CertPathValidatorException.Reason> {

        @Override
        public Class<java.security.cert.CertPathValidatorException.Reason> createNewSUT() {
            return java.security.cert.CertPathValidatorException.Reason.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class BasicReasonClassTest
    implements
    org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.BasicReasonClassTests<java.security.cert.CertPathValidatorException.BasicReason> {

        @Override
        public Class<java.security.cert.CertPathValidatorException.BasicReason> createNewSUT() {
            return java.security.cert.CertPathValidatorException.BasicReason.class;
        }

    }

}
