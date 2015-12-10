package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestMethodClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.DigestMethodClassTests<javax.xml.crypto.dsig.DigestMethod> {

    @Override
    public Class<javax.xml.crypto.dsig.DigestMethod> createNewSUT() {
        return javax.xml.crypto.dsig.DigestMethod.class;
    }

}
