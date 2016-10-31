package org.j8unit.repository.java.security;

import java.security.Certificate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateClassTest
implements org.j8unit.repository.java.security.CertificateClassTests<Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Certificate]

    @Override
    public Class<Certificate> createNewSUT() {
        return Certificate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Certificate]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Certificate]

}
