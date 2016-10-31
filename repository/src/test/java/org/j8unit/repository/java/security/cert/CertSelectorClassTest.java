package org.j8unit.repository.java.security.cert;

import java.security.cert.CertSelector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertSelectorClassTest
implements org.j8unit.repository.java.security.cert.CertSelectorClassTests<CertSelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertSelector]

    @Override
    public Class<CertSelector> createNewSUT() {
        return CertSelector.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertSelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertSelector]

}
