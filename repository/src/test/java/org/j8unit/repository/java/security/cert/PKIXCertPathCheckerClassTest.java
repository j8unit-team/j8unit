package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXCertPathChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXCertPathCheckerClassTest
implements org.j8unit.repository.java.security.cert.PKIXCertPathCheckerClassTests<PKIXCertPathChecker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXCertPathChecker]

    @Override
    public Class<PKIXCertPathChecker> createNewSUT() {
        return PKIXCertPathChecker.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXCertPathChecker]

}
