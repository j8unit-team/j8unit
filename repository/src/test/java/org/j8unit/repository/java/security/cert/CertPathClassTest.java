package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPath;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathClassTest
implements org.j8unit.repository.java.security.cert.CertPathClassTests<CertPath> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPath]

    @Override
    public Class<CertPath> createNewSUT() {
        return CertPath.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPath]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPath]

}
