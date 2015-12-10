package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateClassTest
implements org.j8unit.repository.java.security.CertificateClassTests<java.security.Certificate> {

    @Override
    public Class<java.security.Certificate> createNewSUT() {
        return java.security.Certificate.class;
    }

}
