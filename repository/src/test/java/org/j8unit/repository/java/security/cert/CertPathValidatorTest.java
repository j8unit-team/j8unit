package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathValidatorTest
implements org.j8unit.repository.java.security.cert.CertPathValidatorTests<java.security.cert.CertPathValidator> {

    @Override
    public java.security.cert.CertPathValidator createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.cert.CertPathValidator] available.");
    }

}
