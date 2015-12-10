package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignedInfoClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.SignedInfoClassTests<javax.xml.crypto.dsig.SignedInfo> {

    @Override
    public Class<javax.xml.crypto.dsig.SignedInfo> createNewSUT() {
        return javax.xml.crypto.dsig.SignedInfo.class;
    }

}
