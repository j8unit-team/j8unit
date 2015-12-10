package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CRLEntryClassTest
implements org.j8unit.repository.java.security.cert.X509CRLEntryClassTests<java.security.cert.X509CRLEntry> {

    @Override
    public Class<java.security.cert.X509CRLEntry> createNewSUT() {
        return java.security.cert.X509CRLEntry.class;
    }

}
